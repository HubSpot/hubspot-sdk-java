// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetListParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val assetServiceAsync = client.marketing().campaigns().assets()

        val future =
            assetServiceAsync.update(
                AssetUpdateParams.builder()
                    .campaignGuid("campaignGuid")
                    .assetType("assetType")
                    .assetId("assetId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val assetServiceAsync = client.marketing().campaigns().assets()

        val collectionResponsePublicCampaignAssetForwardPagingFuture =
            assetServiceAsync.list(
                AssetListParams.builder()
                    .campaignGuid("campaignGuid")
                    .assetType("assetType")
                    .after("after")
                    .endDate("endDate")
                    .limit("limit")
                    .startDate("startDate")
                    .build()
            )

        val collectionResponsePublicCampaignAssetForwardPaging =
            collectionResponsePublicCampaignAssetForwardPagingFuture.get()
        collectionResponsePublicCampaignAssetForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val assetServiceAsync = client.marketing().campaigns().assets()

        val future =
            assetServiceAsync.delete(
                AssetDeleteParams.builder()
                    .campaignGuid("campaignGuid")
                    .assetType("assetType")
                    .assetId("assetId")
                    .build()
            )

        val response = future.get()
    }
}
