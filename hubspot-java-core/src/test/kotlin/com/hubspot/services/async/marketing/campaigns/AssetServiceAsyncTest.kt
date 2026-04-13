// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.campaigns

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot.models.marketing.campaigns.assets.AssetListParams
import com.hubspot.models.marketing.campaigns.assets.AssetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
