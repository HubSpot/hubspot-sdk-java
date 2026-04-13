// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.campaigns

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.marketing.campaigns.PublicSpendItemInput
import com.hubspot.models.marketing.campaigns.spend.SpendCreateParams
import com.hubspot.models.marketing.campaigns.spend.SpendDeleteParams
import com.hubspot.models.marketing.campaigns.spend.SpendGetParams
import com.hubspot.models.marketing.campaigns.spend.SpendUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpendServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val spendService = client.marketing().campaigns().spend()

        spendService.delete(
            SpendDeleteParams.builder().campaignGuid("campaignGuid").spendId(0L).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val spendService = client.marketing().campaigns().spend()

        val publicSpendItem =
            spendService.get(
                SpendGetParams.builder().campaignGuid("campaignGuid").spendId(0L).build()
            )

        publicSpendItem.validate()
    }
}
