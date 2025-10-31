// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.campaigns.PublicSpendItemInput
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.spend.SpendUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpendServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val spendService = client.marketing().campaigns().spend()

        val publicSpendItem =
            spendService.create(
                SpendCreateParams.builder()
                    .campaignGuid("campaignGuid")
                    .publicSpendItemInput(
                        PublicSpendItemInput.builder()
                            .amount(0.0)
                            .name("name")
                            .order(0)
                            .description("description")
                            .build()
                    )
                    .build()
            )

        publicSpendItem.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val spendService = client.marketing().campaigns().spend()

        val publicSpendItem =
            spendService.update(
                SpendUpdateParams.builder()
                    .campaignGuid("campaignGuid")
                    .spendId(0L)
                    .publicSpendItemInput(
                        PublicSpendItemInput.builder()
                            .amount(0.0)
                            .name("name")
                            .order(0)
                            .description("description")
                            .build()
                    )
                    .build()
            )

        publicSpendItem.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val spendService = client.marketing().campaigns().spend()

        spendService.delete(
            SpendDeleteParams.builder().campaignGuid("campaignGuid").spendId(0L).build()
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
        val spendService = client.marketing().campaigns().spend()

        val publicSpendItem =
            spendService.get(
                SpendGetParams.builder().campaignGuid("campaignGuid").spendId(0L).build()
            )

        publicSpendItem.validate()
    }
}
