// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingFormField
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLegalConsentResponse
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetAvailabilityBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetBookingInfoBySlugParams
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val pageFuture = meetingsLinkServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun book() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val externalLinkAvailabilityAndBusyTimesFuture =
            meetingsLinkServiceAsync.getAvailabilityBySlug(
                MeetingsLinkGetAvailabilityBySlugParams.builder()
                    .slug("slug")
                    .timezone("timezone")
                    .monthOffset(0)
                    .build()
            )

        val externalLinkAvailabilityAndBusyTimes = externalLinkAvailabilityAndBusyTimesFuture.get()
        externalLinkAvailabilityAndBusyTimes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBookingInfoBySlug() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val meetingsLinkServiceAsync = client.scheduler().meetings().meetingsLinks()

        val externalBookingInfoFuture =
            meetingsLinkServiceAsync.getBookingInfoBySlug(
                MeetingsLinkGetBookingInfoBySlugParams.builder()
                    .slug("slug")
                    .timezone("timezone")
                    .build()
            )

        val externalBookingInfo = externalBookingInfoFuture.get()
        externalBookingInfo.validate()
    }
}
