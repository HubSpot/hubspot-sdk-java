// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val campaignServiceAsync = client.marketing().campaigns()

        val publicCampaignFuture =
            campaignServiceAsync.create(
                PublicCampaignInput.builder()
                    .properties(
                        PublicCampaignInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val publicCampaign = publicCampaignFuture.get()
        publicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val campaignServiceAsync = client.marketing().campaigns()

        val publicCampaignFuture =
            campaignServiceAsync.update(
                CampaignUpdateParams.builder()
                    .campaignGuid("campaignGuid")
                    .publicCampaignInput(
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

        val publicCampaign = publicCampaignFuture.get()
        publicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val campaignServiceAsync = client.marketing().campaigns()

        val pageFuture = campaignServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val campaignServiceAsync = client.marketing().campaigns()

        val future = campaignServiceAsync.delete("campaignGuid")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val campaignServiceAsync = client.marketing().campaigns()

        val publicCampaignWithAssetsFuture =
            campaignServiceAsync.get(
                CampaignGetParams.builder()
                    .campaignGuid("campaignGuid")
                    .endDate("endDate")
                    .addProperty("string")
                    .startDate("startDate")
                    .build()
            )

        val publicCampaignWithAssets = publicCampaignWithAssetsFuture.get()
        publicCampaignWithAssets.validate()
    }
}
