// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.campaigns

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot.sdk.models.marketing.campaigns.assets.AssetListParams
import com.hubspot.sdk.models.marketing.campaigns.assets.AssetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AssetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val assetService = client.marketing().campaigns().assets()

        assetService.update(
            AssetUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .assetType("assetType")
                .assetId("assetId")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val assetService = client.marketing().campaigns().assets()

        val collectionResponsePublicCampaignAssetForwardPaging =
            assetService.list(
                AssetListParams.builder()
                    .campaignGuid("campaignGuid")
                    .assetType("assetType")
                    .after("after")
                    .endDate("endDate")
                    .limit("limit")
                    .startDate("startDate")
                    .build()
            )

        collectionResponsePublicCampaignAssetForwardPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val assetService = client.marketing().campaigns().assets()

        assetService.delete(
            AssetDeleteParams.builder()
                .campaignGuid("campaignGuid")
                .assetType("assetType")
                .assetId("assetId")
                .build()
        )
    }
}
