// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.marketing().campaigns().batch()

        val batchResponsePublicCampaignFuture =
            batchServiceAsync.create(
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

        val batchResponsePublicCampaign = batchResponsePublicCampaignFuture.get()
        batchResponsePublicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.marketing().campaigns().batch()

        val batchResponsePublicCampaignFuture =
            batchServiceAsync.update(
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

        val batchResponsePublicCampaign = batchResponsePublicCampaignFuture.get()
        batchResponsePublicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.marketing().campaigns().batch()

        val future =
            batchServiceAsync.delete(
                BatchInputPublicCampaignDeleteInput.builder()
                    .addInput(PublicCampaignDeleteInput.builder().id("id").build())
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.marketing().campaigns().batch()

        val batchResponsePublicCampaignWithAssetsFuture =
            batchServiceAsync.get(
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

        val batchResponsePublicCampaignWithAssets =
            batchResponsePublicCampaignWithAssetsFuture.get()
        batchResponsePublicCampaignWithAssets.validate()
    }
}
