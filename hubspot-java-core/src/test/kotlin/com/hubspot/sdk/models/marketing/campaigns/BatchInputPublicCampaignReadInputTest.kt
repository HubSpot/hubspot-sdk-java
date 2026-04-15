// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicCampaignReadInputTest {

    @Test
    fun create() {
        val batchInputPublicCampaignReadInput =
            BatchInputPublicCampaignReadInput.builder()
                .addInput(PublicCampaignReadInput.builder().id("id").build())
                .build()

        assertThat(batchInputPublicCampaignReadInput.inputs())
            .containsExactly(PublicCampaignReadInput.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicCampaignReadInput =
            BatchInputPublicCampaignReadInput.builder()
                .addInput(PublicCampaignReadInput.builder().id("id").build())
                .build()

        val roundtrippedBatchInputPublicCampaignReadInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicCampaignReadInput),
                jacksonTypeRef<BatchInputPublicCampaignReadInput>(),
            )

        assertThat(roundtrippedBatchInputPublicCampaignReadInput)
            .isEqualTo(batchInputPublicCampaignReadInput)
    }
}
