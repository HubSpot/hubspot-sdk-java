// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetEarliestParams
import com.hubspot.sdk.models.webhooksjournal.journal.JournalGetNextFromOffsetParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class JournalServiceTest {

    @Test
    fun getEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val journalService = client.webhooksJournal().journal()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            journalService.getEarliest(
                JournalGetEarliestParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextFromOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val journalService = client.webhooksJournal().journal()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            journalService.getNextFromOffset(
                JournalGetNextFromOffsetParams.builder().offset("offset").installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val journalService = client.webhooksJournal().journal()

        val snapshotStatusResponse =
            journalService.getStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }
}
