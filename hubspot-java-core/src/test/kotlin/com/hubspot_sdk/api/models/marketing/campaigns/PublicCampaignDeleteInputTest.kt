// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignDeleteInputTest {

    @Test
    fun create() {
        val publicCampaignDeleteInput = PublicCampaignDeleteInput.builder().id("id").build()

        assertThat(publicCampaignDeleteInput.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignDeleteInput = PublicCampaignDeleteInput.builder().id("id").build()

        val roundtrippedPublicCampaignDeleteInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignDeleteInput),
                jacksonTypeRef<PublicCampaignDeleteInput>(),
            )

        assertThat(roundtrippedPublicCampaignDeleteInput).isEqualTo(publicCampaignDeleteInput)
    }
}
