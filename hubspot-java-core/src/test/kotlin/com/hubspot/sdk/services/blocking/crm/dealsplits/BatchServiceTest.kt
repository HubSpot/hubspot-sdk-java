// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.dealsplits

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.BatchInputPublicObjectId
import com.hubspot.sdk.models.PublicObjectId
import com.hubspot.sdk.models.crm.dealsplits.PublicDealSplitInput
import com.hubspot.sdk.models.crm.dealsplits.PublicDealSplitsBatchCreateRequest
import com.hubspot.sdk.models.crm.dealsplits.PublicDealSplitsCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().dealSplits().batch()

        val batchResponseDealToDealSplits =
            batchService.read(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("id").build())
                    .build()
            )

        batchResponseDealToDealSplits.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.crm().dealSplits().batch()

        val batchResponseDealToDealSplits =
            batchService.upsert(
                PublicDealSplitsBatchCreateRequest.builder()
                    .addInput(
                        PublicDealSplitsCreateRequest.builder()
                            .id(0L)
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
