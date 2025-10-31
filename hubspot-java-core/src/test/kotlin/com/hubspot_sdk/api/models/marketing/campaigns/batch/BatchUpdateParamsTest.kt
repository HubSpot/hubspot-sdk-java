// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignBatchUpdateItem
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignBatchUpdateItem
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpdateParamsTest {

    @Test
    fun create() {
        BatchUpdateParams.builder()
            .batchInputPublicCampaignBatchUpdateItem(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchUpdateParams.builder()
                .batchInputPublicCampaignBatchUpdateItem(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }
}
