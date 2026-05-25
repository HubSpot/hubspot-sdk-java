// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal.journal

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetFromOffsetParams
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetLatestParams
import com.hubspot.sdk.models.webhooksjournal.journal.batch.BatchGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooksJournal().journal().batch()

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
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooksJournal().journal().batch()

        val batchResponseJournalFetchResponse =
            batchService.getEarliest(
                BatchGetEarliestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFromOffset() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooksJournal().journal().batch()

        val batchResponseJournalFetchResponse =
            batchService.getFromOffset(
                BatchGetFromOffsetParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.webhooksJournal().journal().batch()

        val batchResponseJournalFetchResponse =
            batchService.getLatest(
                BatchGetLatestParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }
}
