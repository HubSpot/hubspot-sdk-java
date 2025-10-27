// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler.meetings

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingFormField
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLegalConsentResponse
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MeetingsLinkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkService = client.scheduler().meetings().meetingsLinks()

        val collectionResponseWithTotalExternalLinkMetadataForwardPaging =
            meetingsLinkService.list()

        collectionResponseWithTotalExternalLinkMetadataForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun book() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkService = client.scheduler().meetings().meetingsLinks()

        val externalMeetingBookingResponse =
            meetingsLinkService.book(
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

        externalMeetingBookingResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAvailabilityBySlug() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkService = client.scheduler().meetings().meetingsLinks()

        val externalLinkAvailabilityAndBusyTimes = meetingsLinkService.getAvailabilityBySlug("slug")

        externalLinkAvailabilityAndBusyTimes.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBookingInfoBySlug() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val meetingsLinkService = client.scheduler().meetings().meetingsLinks()

        val externalBookingInfo = meetingsLinkService.getBookingInfoBySlug("slug")

        externalBookingInfo.validate()
    }
}
