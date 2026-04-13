// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.campaigns

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignBatchUpdateItem
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignDeleteInput
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignInput
import com.hubspot.models.marketing.campaigns.BatchInputPublicCampaignReadInput
import com.hubspot.models.marketing.campaigns.PublicCampaignBatchUpdateItem
import com.hubspot.models.marketing.campaigns.PublicCampaignDeleteInput
import com.hubspot.models.marketing.campaigns.PublicCampaignInput
import com.hubspot.models.marketing.campaigns.PublicCampaignReadInput
import com.hubspot.models.marketing.campaigns.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.marketing().campaigns().batch()

        val batchResponsePublicCampaign =
            batchService.create(
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
            )

        batchResponsePublicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.marketing().campaigns().batch()

        val batchResponsePublicCampaign =
            batchService.update(
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

        batchResponsePublicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.marketing().campaigns().batch()

        batchService.delete(
            BatchInputPublicCampaignDeleteInput.builder()
                .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.marketing().campaigns().batch()

        val batchResponsePublicCampaignWithAssets =
            batchService.get(
                BatchGetParams.builder()
                    .endDate("endDate")
                    .addProperty("string")
                    .startDate("startDate")
                    .batchInputPublicCampaignReadInput(
                        BatchInputPublicCampaignReadInput.builder()
                            .addInput(PublicCampaignReadInput.builder().id("id").build())
                            .build()
                    )
                    .build()
            )

        batchResponsePublicCampaignWithAssets.validate()
    }
}
