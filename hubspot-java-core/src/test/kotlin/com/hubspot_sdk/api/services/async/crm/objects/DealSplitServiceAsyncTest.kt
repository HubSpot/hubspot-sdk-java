// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPublicObjectId
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.objects.dealsplits.DealSplitBatchUpsertParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DealSplitServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchRead() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val dealSplitServiceAsync = client.crm().objects().dealSplits()

        val responseFuture =
            dealSplitServiceAsync.batchRead(
                BatchInputPublicObjectId.builder()
                    .addInput(PublicObjectId.builder().id("37295").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpsert() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val dealSplitServiceAsync = client.crm().objects().dealSplits()

        val responseFuture =
            dealSplitServiceAsync.batchUpsert(
                DealSplitBatchUpsertParams.builder()
                    .addInput(
                        DealSplitBatchUpsertParams.Input.builder()
                            .id(0)
                            .addSplit(
                                DealSplitBatchUpsertParams.Input.Split.builder()
                                    .ownerId(0)
                                    .percentage(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
