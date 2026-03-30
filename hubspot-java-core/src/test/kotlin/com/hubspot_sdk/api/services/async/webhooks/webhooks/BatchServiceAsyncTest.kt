// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks.webhooks

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.webhooks.webhooks.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchCreateParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetNextParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchReadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseSubscriptionResponseFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .appId(0)
                    .batchInputSubscriptionBatchUpdateRequest(
                        BatchInputSubscriptionBatchUpdateRequest.builder()
                            .addInput(
                                SubscriptionBatchUpdateRequest.builder().id(0).active(true).build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseSubscriptionResponse = batchResponseSubscriptionResponseFuture.get()
        batchResponseSubscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getEarliest(
                BatchGetEarliestParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getLatest(
                BatchGetLatestParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNext() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getNext(
                BatchGetNextParams.builder().offset("offset").count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.read(
                BatchReadParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }
}
