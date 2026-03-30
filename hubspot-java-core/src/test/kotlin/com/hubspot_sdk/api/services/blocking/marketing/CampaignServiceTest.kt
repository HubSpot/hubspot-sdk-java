// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val campaignService = client.marketing().campaigns()

        val page = campaignService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val campaignService = client.marketing().campaigns()

        campaignService.delete("campaignGuid")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
