// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetListParams
import com.hubspot_sdk.api.models.marketing.campaigns.assets.AssetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AssetServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val assetService = client.marketing().campaigns().assets()

        assetService.update(
            AssetUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .assetType("assetType")
                .assetId("assetId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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
