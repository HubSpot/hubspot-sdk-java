// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.marketingevents

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.marketing.marketingevents.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot.models.marketing.marketingevents.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ParticipationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByExternalAccountAndEventId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val participationServiceAsync = client.marketing().marketingEvents().participations()

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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getById() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val participationServiceAsync = client.marketing().marketingEvents().participations()

        val attendanceCountersFuture = participationServiceAsync.getById(0L)

        val attendanceCounters = attendanceCountersFuture.get()
        attendanceCounters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownByContact() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val participationServiceAsync = client.marketing().marketingEvents().participations()

        val pageFuture = participationServiceAsync.listBreakdownByContact("contactIdentifier")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownByExternalAccountAndEventId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val participationServiceAsync = client.marketing().marketingEvents().participations()

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

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownById() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val participationServiceAsync = client.marketing().marketingEvents().participations()

        val pageFuture = participationServiceAsync.listBreakdownById(0L)

        val page = pageFuture.get()
        page.response().validate()
    }
}
