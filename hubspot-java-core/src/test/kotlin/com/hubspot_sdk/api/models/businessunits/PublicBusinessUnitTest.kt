// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.businessunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBusinessUnitTest {

    @Test
    fun create() {
        val publicBusinessUnit =
            PublicBusinessUnit.builder()
                .id("101")
                .name("sample business unit name")
                .logoMetadata(
                    PublicBusinessUnitLogoMetadata.builder()
                        .logoAltText("logo sample text")
                        .logoUrl("examplelogourl.com")
                        .resizedUrl("sillystring")
                        .build()
                )
                .build()

        assertThat(publicBusinessUnit.id()).isEqualTo("101")
        assertThat(publicBusinessUnit.name()).isEqualTo("sample business unit name")
        assertThat(publicBusinessUnit.logoMetadata())
            .contains(
                PublicBusinessUnitLogoMetadata.builder()
                    .logoAltText("logo sample text")
                    .logoUrl("examplelogourl.com")
                    .resizedUrl("sillystring")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBusinessUnit =
            PublicBusinessUnit.builder()
                .id("101")
                .name("sample business unit name")
                .logoMetadata(
                    PublicBusinessUnitLogoMetadata.builder()
                        .logoAltText("logo sample text")
                        .logoUrl("examplelogourl.com")
                        .resizedUrl("sillystring")
                        .build()
                )
                .build()

        val roundtrippedPublicBusinessUnit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBusinessUnit),
                jacksonTypeRef<PublicBusinessUnit>(),
            )

        assertThat(roundtrippedPublicBusinessUnit).isEqualTo(publicBusinessUnit)
    }
}
