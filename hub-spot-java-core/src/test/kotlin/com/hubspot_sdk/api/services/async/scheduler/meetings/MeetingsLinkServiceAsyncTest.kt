// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingFormField
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLegalConsentResponse
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MeetingsLinkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val collectionResponseWithTotalExternalLinkMetadataForwardPagingFuture =
            meetingsLinkServiceAsync.list()

        val collectionResponseWithTotalExternalLinkMetadataForwardPaging =
            collectionResponseWithTotalExternalLinkMetadataForwardPagingFuture.get()
        collectionResponseWithTotalExternalLinkMetadataForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun book() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val externalMeetingBookingResponseFuture =
            meetingsLinkServiceAsync.book(
                ExternalMeetingBooking.builder()
                    .duration(0L)
                    .email("email")
                    .firstName("firstName")
                    .addFormField(
                        ExternalBookingFormField.builder().name("name").value("value").build()
                    )
                    .lastName("lastName")
                    .addLegalConsentResponse(
                        ExternalLegalConsentResponse.builder()
                            .communicationTypeId("communicationTypeId")
                            .consented(true)
                            .build()
                    )
                    .addLikelyAvailableUserId("string")
                    .slug("slug")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .locale("locale")
                    .timezone("timezone")
                    .build()
            )

        val externalMeetingBookingResponse = externalMeetingBookingResponseFuture.get()
        externalMeetingBookingResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAvailabilityBySlug() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val externalLinkAvailabilityAndBusyTimesFuture =
            meetingsLinkServiceAsync.getAvailabilityBySlug("slug")

        val externalLinkAvailabilityAndBusyTimes = externalLinkAvailabilityAndBusyTimesFuture.get()
        externalLinkAvailabilityAndBusyTimes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBookingInfoBySlug() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val externalBookingInfoFuture = meetingsLinkServiceAsync.getBookingInfoBySlug("slug")

        val externalBookingInfo = externalBookingInfoFuture.get()
        externalBookingInfo.validate()
    }
}
