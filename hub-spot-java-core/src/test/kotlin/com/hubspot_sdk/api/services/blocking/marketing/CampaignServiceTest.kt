// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CampaignServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val campaignService = client.marketing().campaigns()

        val page = campaignService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val campaignService = client.marketing().campaigns()

        campaignService.delete("campaignGuid")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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
