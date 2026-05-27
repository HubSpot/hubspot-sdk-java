// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetNextFromOffsetParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class JournalServiceAsyncTest {

    @Test
    fun getEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val journalServiceAsync = client.webhooksJournal().journal()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            journalServiceAsync.getEarliest(
                JournalGetEarliestParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextFromOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val journalServiceAsync = client.webhooksJournal().journal()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            journalServiceAsync.getNextFromOffset(
                JournalGetNextFromOffsetParams.builder().offset("offset").installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val journalServiceAsync = client.webhooksJournal().journal()

        val snapshotStatusResponseFuture =
            journalServiceAsync.getStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }
}
