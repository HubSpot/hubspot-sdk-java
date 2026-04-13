// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.marketing.campaigns.CampaignGetParams
import com.hubspot.sdk.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot.sdk.models.marketing.campaigns.PublicCampaignInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val campaignService = client.marketing().campaigns()

        val publicCampaign =
            campaignService.create(
                PublicCampaignInput.builder()
                    .properties(
                        PublicCampaignInput.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        publicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val campaignService = client.marketing().campaigns()

        val publicCampaign =
            campaignService.update(
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

        publicCampaign.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val campaignService = client.marketing().campaigns()

        val page = campaignService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val campaignService = client.marketing().campaigns()

        campaignService.delete("campaignGuid")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val campaignService = client.marketing().campaigns()

        val publicCampaignWithAssets =
            campaignService.get(
                CampaignGetParams.builder()
                    .campaignGuid("campaignGuid")
                    .endDate("endDate")
                    .addProperty("string")
                    .startDate("startDate")
                    .build()
            )

        publicCampaignWithAssets.validate()
    }
}
