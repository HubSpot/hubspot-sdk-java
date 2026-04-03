// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks.webhooksubscriptions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalNextParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetNextParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchGetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.batch.BatchUpdateSubscriptionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.get(
                BatchGetParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getEarliest(
                BatchGetEarliestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLatest(
                BatchGetLatestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocal() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLocal(
                BatchGetLocalParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalEarliest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLocalEarliest(
                BatchGetLocalEarliestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalLatest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLocalLatest(
                BatchGetLocalLatestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalNext() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLocalNext(
                BatchGetLocalNextParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNext() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseJournalFetchResponse =
            batchService.getNext(
                BatchGetNextParams.builder().offset("offset").count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhookSubscriptions().batch()

        val batchResponseSubscriptionResponse =
            batchService.updateSubscriptions(
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

        batchResponseSubscriptionResponse.validate()
    }
}
