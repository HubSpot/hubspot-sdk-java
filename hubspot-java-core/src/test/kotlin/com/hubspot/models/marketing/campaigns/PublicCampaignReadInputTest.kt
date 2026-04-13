// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignReadInputTest {

    @Test
    fun create() {
        val publicCampaignReadInput = PublicCampaignReadInput.builder().id("id").build()

        assertThat(publicCampaignReadInput.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignReadInput = PublicCampaignReadInput.builder().id("id").build()

        val roundtrippedPublicCampaignReadInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignReadInput),
                jacksonTypeRef<PublicCampaignReadInput>(),
            )

        assertThat(roundtrippedPublicCampaignReadInput).isEqualTo(publicCampaignReadInput)
    }
}
