// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMeetingBookingResponseTest {

    @Test
    fun create() {
        val externalMeetingBookingResponse =
            ExternalMeetingBookingResponse.builder()
                .bookingTimezone("bookingTimezone")
                .calendarEventId("calendarEventId")
                .contactId("contactId")
                .duration(0L)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFormField(
                    ExternalValidatedFormField.builder()
                        .isCustom(true)
                        .label("label")
                        .name("name")
                        .value("value")
                        .fieldType("fieldType")
                        .translatedLabel("translatedLabel")
                        .valueLabel("valueLabel")
                        .build()
                )
                .addGuestEmail("string")
                .isOffline(true)
                .addLegalConsentResponse(
                    ExternalLegalConsentResponse.builder()
                        .communicationTypeId("communicationTypeId")
                        .consented(true)
                        .build()
                )
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subject("subject")
                .locale("locale")
                .location("location")
                .webConferenceMeetingId("webConferenceMeetingId")
                .webConferenceUrl("webConferenceUrl")
                .build()

        assertThat(externalMeetingBookingResponse.bookingTimezone()).isEqualTo("bookingTimezone")
        assertThat(externalMeetingBookingResponse.calendarEventId()).isEqualTo("calendarEventId")
        assertThat(externalMeetingBookingResponse.contactId()).isEqualTo("contactId")
        assertThat(externalMeetingBookingResponse.duration()).isEqualTo(0L)
        assertThat(externalMeetingBookingResponse.end())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMeetingBookingResponse.formFields())
            .containsExactly(
                ExternalValidatedFormField.builder()
                    .isCustom(true)
                    .label("label")
                    .name("name")
                    .value("value")
                    .fieldType("fieldType")
                    .translatedLabel("translatedLabel")
                    .valueLabel("valueLabel")
                    .build()
            )
        assertThat(externalMeetingBookingResponse.guestEmails()).containsExactly("string")
        assertThat(externalMeetingBookingResponse.isOffline()).isEqualTo(true)
        assertThat(externalMeetingBookingResponse.legalConsentResponses())
            .containsExactly(
                ExternalLegalConsentResponse.builder()
                    .communicationTypeId("communicationTypeId")
                    .consented(true)
                    .build()
            )
        assertThat(externalMeetingBookingResponse.start())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMeetingBookingResponse.subject()).isEqualTo("subject")
        assertThat(externalMeetingBookingResponse.locale()).contains("locale")
        assertThat(externalMeetingBookingResponse.location()).contains("location")
        assertThat(externalMeetingBookingResponse.webConferenceMeetingId())
            .contains("webConferenceMeetingId")
        assertThat(externalMeetingBookingResponse.webConferenceUrl()).contains("webConferenceUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMeetingBookingResponse =
            ExternalMeetingBookingResponse.builder()
                .bookingTimezone("bookingTimezone")
                .calendarEventId("calendarEventId")
                .contactId("contactId")
                .duration(0L)
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFormField(
                    ExternalValidatedFormField.builder()
                        .isCustom(true)
                        .label("label")
                        .name("name")
                        .value("value")
                        .fieldType("fieldType")
                        .translatedLabel("translatedLabel")
                        .valueLabel("valueLabel")
                        .build()
                )
                .addGuestEmail("string")
                .isOffline(true)
                .addLegalConsentResponse(
                    ExternalLegalConsentResponse.builder()
                        .communicationTypeId("communicationTypeId")
                        .consented(true)
                        .build()
                )
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subject("subject")
                .locale("locale")
                .location("location")
                .webConferenceMeetingId("webConferenceMeetingId")
                .webConferenceUrl("webConferenceUrl")
                .build()

        val roundtrippedExternalMeetingBookingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMeetingBookingResponse),
                jacksonTypeRef<ExternalMeetingBookingResponse>(),
            )

        assertThat(roundtrippedExternalMeetingBookingResponse)
            .isEqualTo(externalMeetingBookingResponse)
    }
}
