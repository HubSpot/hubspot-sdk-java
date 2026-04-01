// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks.webhooks

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.webhooks.webhooks.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalNextParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetNextParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchGetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.batch.BatchUpdateSubscriptionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.get(
                BatchGetParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
    fun getLocal() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getLocal(
                BatchGetLocalParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalEarliest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getLocalEarliest(
                BatchGetLocalEarliestParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalLatest() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getLocalLatest(
                BatchGetLocalLatestParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalNext() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getLocalNext(
                BatchGetLocalNextParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNext() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
    fun updateSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooks().webhooks().batch()

        val batchResponseSubscriptionResponseFuture =
            batchServiceAsync.updateSubscriptions(
                BatchUpdateSubscriptionsParams.builder()
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
}
