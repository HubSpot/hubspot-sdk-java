// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.objects.dealsplits.PublicDealSplitInput
import com.hubspot_sdk.api.models.crm.objects.dealsplits.PublicDealSplitsBatchCreateRequest
import com.hubspot_sdk.api.models.crm.objects.dealsplits.PublicDealSplitsCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DealSplitServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchRead() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val dealSplitService = client.crm().objects().dealSplits()

        val batchResponseDealToDealSplits =
            dealSplitService.batchRead(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("37295").build())
                    .build()
            )

        batchResponseDealToDealSplits.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpsert() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val dealSplitService = client.crm().objects().dealSplits()

        val batchResponseDealToDealSplits =
            dealSplitService.batchUpsert(
                PublicDealSplitsBatchCreateRequest.builder()
                    .addInput(
                        PublicDealSplitsCreateRequest.builder()
                            .id(0)
                            .addSplit(
                                PublicDealSplitInput.builder().ownerId(0).percentage(0.0).build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseDealToDealSplits.validate()
    }
}
