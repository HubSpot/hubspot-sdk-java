// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicCampaignInputTest {

    @Test
    fun create() {
        val batchInputPublicCampaignInput =
            BatchInputPublicCampaignInput.builder()
                .addInput(
                    PublicCampaignInput.builder()
                        .properties(
                            PublicCampaignInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(batchInputPublicCampaignInput.inputs())
            .containsExactly(
                PublicCampaignInput.builder()
                    .properties(
                        PublicCampaignInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicCampaignInput =
            BatchInputPublicCampaignInput.builder()
                .addInput(
                    PublicCampaignInput.builder()
                        .properties(
                            PublicCampaignInput.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBatchInputPublicCampaignInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicCampaignInput),
                jacksonTypeRef<BatchInputPublicCampaignInput>(),
            )

        assertThat(roundtrippedBatchInputPublicCampaignInput)
            .isEqualTo(batchInputPublicCampaignInput)
    }
}
