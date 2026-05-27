// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal.journallocal

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.webhooksjournal.journallocal.batch.BatchGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.batch.BatchGetFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journallocal.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooksJournal().journalLocal().batch()

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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooksJournal().journalLocal().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getEarliest(
                BatchGetEarliestParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFromOffset() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val batchServiceAsync = client.webhooksJournal().journalLocal().batch()

        val batchResponseJournalFetchResponseFuture =
            batchServiceAsync.getFromOffset(
                BatchGetFromOffsetParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }
}
