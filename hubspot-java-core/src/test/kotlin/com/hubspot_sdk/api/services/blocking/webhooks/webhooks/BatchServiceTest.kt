// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks.webhooks

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhooks().batch()

        val batchResponseSubscriptionResponse =
            batchService.create(
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

        batchResponseSubscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliest() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhooks().batch()

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
        val batchService = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLatest(
                BatchGetLatestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getNext() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponse =
            batchService.getNext(
                BatchGetNextParams.builder().offset("offset").count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun read() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooks().webhooks().batch()

        val batchResponseJournalFetchResponse =
            batchService.read(
                BatchReadParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }
}
