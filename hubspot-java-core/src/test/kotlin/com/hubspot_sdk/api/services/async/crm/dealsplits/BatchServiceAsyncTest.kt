// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.dealsplits

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.dealsplits.PublicDealSplitInput
import com.hubspot_sdk.api.models.crm.dealsplits.PublicDealSplitsBatchCreateRequest
import com.hubspot_sdk.api.models.crm.dealsplits.PublicDealSplitsCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.crm().dealSplits().batch()

        val batchResponseDealToDealSplitsFuture =
            batchServiceAsync.read(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("id").build())
                    .build()
            )

        val batchResponseDealToDealSplits = batchResponseDealToDealSplitsFuture.get()
        batchResponseDealToDealSplits.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.crm().dealSplits().batch()

        val batchResponseDealToDealSplitsFuture =
            batchServiceAsync.upsert(
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

        val batchResponseDealToDealSplits = batchResponseDealToDealSplitsFuture.get()
        batchResponseDealToDealSplits.validate()
    }
}
