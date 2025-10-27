// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationBreakdownTest {

    @Test
    fun create() {
        val participationBreakdown =
            ParticipationBreakdown.builder()
                .id("id")
                .associations(
                    ParticipationAssociations.builder()
                        .contact(
                            ContactAssociation.builder()
                                .contactId("contactId")
                                .email("email")
                                .firstname("firstname")
                                .lastname("lastname")
                                .build()
                        )
                        .marketingEvent(
                            MarketingEventAssociation.builder()
                                .marketingEventId("marketingEventId")
                                .name("name")
                                .externalAccountId("externalAccountId")
                                .externalEventId("externalEventId")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ParticipationProperties.builder()
                        .attendanceState(ParticipationProperties.AttendanceState.REGISTERED)
                        .occurredAt(0L)
                        .attendanceDurationSeconds(0)
                        .attendancePercentage("attendancePercentage")
                        .build()
                )
                .build()

        assertThat(participationBreakdown.id()).isEqualTo("id")
        assertThat(participationBreakdown.associations())
            .isEqualTo(
                ParticipationAssociations.builder()
                    .contact(
                        ContactAssociation.builder()
                            .contactId("contactId")
                            .email("email")
                            .firstname("firstname")
                            .lastname("lastname")
                            .build()
                    )
                    .marketingEvent(
                        MarketingEventAssociation.builder()
                            .marketingEventId("marketingEventId")
                            .name("name")
                            .externalAccountId("externalAccountId")
                            .externalEventId("externalEventId")
                            .build()
                    )
                    .build()
            )
        assertThat(participationBreakdown.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(participationBreakdown.properties())
            .isEqualTo(
                ParticipationProperties.builder()
                    .attendanceState(ParticipationProperties.AttendanceState.REGISTERED)
                    .occurredAt(0L)
                    .attendanceDurationSeconds(0)
                    .attendancePercentage("attendancePercentage")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participationBreakdown =
            ParticipationBreakdown.builder()
                .id("id")
                .associations(
                    ParticipationAssociations.builder()
                        .contact(
                            ContactAssociation.builder()
                                .contactId("contactId")
                                .email("email")
                                .firstname("firstname")
                                .lastname("lastname")
                                .build()
                        )
                        .marketingEvent(
                            MarketingEventAssociation.builder()
                                .marketingEventId("marketingEventId")
                                .name("name")
                                .externalAccountId("externalAccountId")
                                .externalEventId("externalEventId")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    ParticipationProperties.builder()
                        .attendanceState(ParticipationProperties.AttendanceState.REGISTERED)
                        .occurredAt(0L)
                        .attendanceDurationSeconds(0)
                        .attendancePercentage("attendancePercentage")
                        .build()
                )
                .build()

        val roundtrippedParticipationBreakdown =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participationBreakdown),
                jacksonTypeRef<ParticipationBreakdown>(),
            )

        assertThat(roundtrippedParticipationBreakdown).isEqualTo(participationBreakdown)
    }
}
