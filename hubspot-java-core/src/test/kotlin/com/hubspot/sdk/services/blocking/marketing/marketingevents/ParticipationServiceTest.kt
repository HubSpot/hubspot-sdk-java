// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.marketingevents

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.marketing.marketingevents.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ParticipationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByExternalAccountAndEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val participationService = client.marketing().marketingEvents().participations()

        val attendanceCounters =
            participationService.getByExternalAccountAndEventId(
                ParticipationGetByExternalAccountAndEventIdParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        attendanceCounters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val participationService = client.marketing().marketingEvents().participations()

        val attendanceCounters = participationService.getById(0L)

        attendanceCounters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownByContact() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val participationService = client.marketing().marketingEvents().participations()

        val page = participationService.listBreakdownByContact("contactIdentifier")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownByExternalAccountAndEventId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val participationService = client.marketing().marketingEvents().participations()

        val page =
            participationService.listBreakdownByExternalAccountAndEventId(
                ParticipationListBreakdownByExternalAccountAndEventIdParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val participationService = client.marketing().marketingEvents().participations()

        val page = participationService.listBreakdownById(0L)

        page.response().validate()
    }
}
