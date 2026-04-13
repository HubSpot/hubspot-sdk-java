// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMeetingBookingTest {

    @Test
    fun create() {
        val externalMeetingBooking =
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

        assertThat(externalMeetingBooking.duration()).isEqualTo(0L)
        assertThat(externalMeetingBooking.email()).isEqualTo("email")
        assertThat(externalMeetingBooking.firstName()).isEqualTo("firstName")
        assertThat(externalMeetingBooking.formFields())
            .containsExactly(ExternalBookingFormField.builder().name("name").value("value").build())
        assertThat(externalMeetingBooking.lastName()).isEqualTo("lastName")
        assertThat(externalMeetingBooking.legalConsentResponses())
            .containsExactly(
                ExternalLegalConsentResponse.builder()
                    .communicationTypeId("communicationTypeId")
                    .consented(true)
                    .build()
            )
        assertThat(externalMeetingBooking.likelyAvailableUserIds()).containsExactly("string")
        assertThat(externalMeetingBooking.slug()).isEqualTo("slug")
        assertThat(externalMeetingBooking.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(externalMeetingBooking.locale()).contains("locale")
        assertThat(externalMeetingBooking.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMeetingBooking =
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

        val roundtrippedExternalMeetingBooking =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMeetingBooking),
                jacksonTypeRef<ExternalMeetingBooking>(),
            )

        assertThat(roundtrippedExternalMeetingBooking).isEqualTo(externalMeetingBooking)
    }
}
