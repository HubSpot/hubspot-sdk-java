// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks

import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingFormField
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLegalConsentResponse
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingsLinkBookParamsTest {

    @Test
    fun create() {
        MeetingsLinkBookParams.builder()
            .externalMeetingBooking(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            MeetingsLinkBookParams.builder()
                .externalMeetingBooking(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MeetingsLinkBookParams.builder()
                .externalMeetingBooking(
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .build()
            )
    }
}
