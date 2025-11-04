// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ParticipationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getByExternalAccountAndEventId() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val attendanceCountersFuture =
            participationServiceAsync.getByExternalAccountAndEventId(
                ParticipationGetByExternalAccountAndEventIdParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        val attendanceCounters = attendanceCountersFuture.get()
        attendanceCounters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getById() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val attendanceCountersFuture = participationServiceAsync.getById(0L)

        val attendanceCounters = attendanceCountersFuture.get()
        attendanceCounters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownByContact() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val pageFuture = participationServiceAsync.listBreakdownByContact("contactIdentifier")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownByExternalAccountAndEventId() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val pageFuture =
            participationServiceAsync.listBreakdownByExternalAccountAndEventId(
                ParticipationListBreakdownByExternalAccountAndEventIdParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownById() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val pageFuture = participationServiceAsync.listBreakdownById(0L)

        val page = pageFuture.get()
        page.response().validate()
    }
}
