// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ParticipationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByExternalAccountAndEventId() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val participationService = client.marketing().events().participations()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val participationService = client.marketing().events().participations()

        val attendanceCounters = participationService.getById(0L)

        attendanceCounters.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownByContact() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val participationService = client.marketing().events().participations()

        val page = participationService.listBreakdownByContact("contactIdentifier")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBreakdownByExternalAccountAndEventId() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val participationService = client.marketing().events().participations()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val participationService = client.marketing().events().participations()

        val page = participationService.listBreakdownById(0L)

        page.response().validate()
    }
}
