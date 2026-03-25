// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicCampaignDeleteInputTest {

    @Test
    fun create() {
        val batchInputPublicCampaignDeleteInput =
            BatchInputPublicCampaignDeleteInput.builder()
                .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                .build()

        assertThat(batchInputPublicCampaignDeleteInput.inputs())
            .containsExactly(PublicCampaignDeleteInput.builder().id("id").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicCampaignDeleteInput =
            BatchInputPublicCampaignDeleteInput.builder()
                .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                .build()

        val roundtrippedBatchInputPublicCampaignDeleteInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicCampaignDeleteInput),
                jacksonTypeRef<BatchInputPublicCampaignDeleteInput>(),
            )

        assertThat(roundtrippedBatchInputPublicCampaignDeleteInput)
            .isEqualTo(batchInputPublicCampaignDeleteInput)
    }
}
