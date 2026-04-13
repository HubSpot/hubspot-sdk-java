// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicCampaignBatchUpdateItemTest {

    @Test
    fun create() {
        val batchInputPublicCampaignBatchUpdateItem =
            BatchInputPublicCampaignBatchUpdateItem.builder()
                .addInput(
                    PublicCampaignBatchUpdateItem.builder()
                        .id("id")
                        .properties(
                            PublicCampaignBatchUpdateItem.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(batchInputPublicCampaignBatchUpdateItem.inputs())
            .containsExactly(
                PublicCampaignBatchUpdateItem.builder()
                    .id("id")
                    .properties(
                        PublicCampaignBatchUpdateItem.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicCampaignBatchUpdateItem =
            BatchInputPublicCampaignBatchUpdateItem.builder()
                .addInput(
                    PublicCampaignBatchUpdateItem.builder()
                        .id("id")
                        .properties(
                            PublicCampaignBatchUpdateItem.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedBatchInputPublicCampaignBatchUpdateItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicCampaignBatchUpdateItem),
                jacksonTypeRef<BatchInputPublicCampaignBatchUpdateItem>(),
            )

        assertThat(roundtrippedBatchInputPublicCampaignBatchUpdateItem)
            .isEqualTo(batchInputPublicCampaignBatchUpdateItem)
    }
}
