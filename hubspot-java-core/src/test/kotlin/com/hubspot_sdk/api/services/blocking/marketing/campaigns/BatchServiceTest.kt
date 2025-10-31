// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignBatchUpdateItem
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignDeleteInput
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignInput
import com.hubspot_sdk.api.models.marketing.campaigns.BatchInputPublicCampaignReadInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignBatchUpdateItem
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignDeleteInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignInput
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignReadInput
import com.hubspot_sdk.api.models.marketing.campaigns.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val batchService = client.marketing().campaigns().batch()

        batchService.delete(
            BatchInputPublicCampaignDeleteInput.builder()
                .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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
