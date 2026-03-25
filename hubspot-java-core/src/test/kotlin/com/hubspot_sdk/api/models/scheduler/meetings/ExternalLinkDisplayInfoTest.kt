// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkDisplayInfoTest {

    @Test
    fun create() {
        val externalLinkDisplayInfo =
            ExternalLinkDisplayInfo.builder()
                .avatar("avatar")
                .companyAvatar("companyAvatar")
                .headline("headline")
                .publicDisplayAvatarOption(
                    ExternalLinkDisplayInfo.PublicDisplayAvatarOption.COMPANY_LOGO
                )
                .build()

        assertThat(externalLinkDisplayInfo.avatar()).contains("avatar")
        assertThat(externalLinkDisplayInfo.companyAvatar()).contains("companyAvatar")
        assertThat(externalLinkDisplayInfo.headline()).contains("headline")
        assertThat(externalLinkDisplayInfo.publicDisplayAvatarOption())
            .contains(ExternalLinkDisplayInfo.PublicDisplayAvatarOption.COMPANY_LOGO)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkDisplayInfo =
            ExternalLinkDisplayInfo.builder()
                .avatar("avatar")
                .companyAvatar("companyAvatar")
                .headline("headline")
                .publicDisplayAvatarOption(
                    ExternalLinkDisplayInfo.PublicDisplayAvatarOption.COMPANY_LOGO
                )
                .build()

        val roundtrippedExternalLinkDisplayInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLinkDisplayInfo),
                jacksonTypeRef<ExternalLinkDisplayInfo>(),
            )

        assertThat(roundtrippedExternalLinkDisplayInfo).isEqualTo(externalLinkDisplayInfo)
    }
}
