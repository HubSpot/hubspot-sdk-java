// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ParticipationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getByExternalAccountAndEventId() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun getById() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationService = client.marketing().events().participations()

        val attendanceCounters = participationService.getById(0L)

        attendanceCounters.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownByContact() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationService = client.marketing().events().participations()

        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            participationService.listBreakdownByContact(
                ParticipationListBreakdownByContactParams.builder()
                    .contactIdentifier("contactIdentifier")
                    .after("after")
                    .limit(0)
                    .state("state")
                    .build()
            )

        collectionResponseWithTotalParticipationBreakdownForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownByExternalAccountAndEventId() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationService = client.marketing().events().participations()

        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            participationService.listBreakdownByExternalAccountAndEventId(
                ParticipationListBreakdownByExternalAccountAndEventIdParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .after("after")
                    .contactIdentifier("contactIdentifier")
                    .limit(0)
                    .state("state")
                    .build()
            )

        collectionResponseWithTotalParticipationBreakdownForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownById() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationService = client.marketing().events().participations()

        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            participationService.listBreakdownById(
                ParticipationListBreakdownByIdParams.builder()
                    .marketingEventId(0L)
                    .after("after")
                    .contactIdentifier("contactIdentifier")
                    .limit(0)
                    .state("state")
                    .build()
            )

        collectionResponseWithTotalParticipationBreakdownForwardPaging.validate()
    }
}
