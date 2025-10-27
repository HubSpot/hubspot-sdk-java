// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ParticipationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getByExternalAccountAndEventId() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val collectionResponseWithTotalParticipationBreakdownForwardPagingFuture =
            participationServiceAsync.listBreakdownByContact(
                ParticipationListBreakdownByContactParams.builder()
                    .contactIdentifier("contactIdentifier")
                    .after("after")
                    .limit(0)
                    .state("state")
                    .build()
            )

        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            collectionResponseWithTotalParticipationBreakdownForwardPagingFuture.get()
        collectionResponseWithTotalParticipationBreakdownForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownByExternalAccountAndEventId() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val collectionResponseWithTotalParticipationBreakdownForwardPagingFuture =
            participationServiceAsync.listBreakdownByExternalAccountAndEventId(
                ParticipationListBreakdownByExternalAccountAndEventIdParams.builder()
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .after("after")
                    .contactIdentifier("contactIdentifier")
                    .limit(0)
                    .state("state")
                    .build()
            )

        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            collectionResponseWithTotalParticipationBreakdownForwardPagingFuture.get()
        collectionResponseWithTotalParticipationBreakdownForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBreakdownById() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val participationServiceAsync = client.marketing().events().participations()

        val collectionResponseWithTotalParticipationBreakdownForwardPagingFuture =
            participationServiceAsync.listBreakdownById(
                ParticipationListBreakdownByIdParams.builder()
                    .marketingEventId(0L)
                    .after("after")
                    .contactIdentifier("contactIdentifier")
                    .limit(0)
                    .state("state")
                    .build()
            )

        val collectionResponseWithTotalParticipationBreakdownForwardPaging =
            collectionResponseWithTotalParticipationBreakdownForwardPagingFuture.get()
        collectionResponseWithTotalParticipationBreakdownForwardPaging.validate()
    }
}
