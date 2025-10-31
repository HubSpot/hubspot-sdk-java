// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationPropertiesTest {

    @Test
    fun create() {
        val participationProperties =
            ParticipationProperties.builder()
                .attendanceState(ParticipationProperties.AttendanceState.REGISTERED)
                .occurredAt(0L)
                .attendanceDurationSeconds(0)
                .attendancePercentage("attendancePercentage")
                .build()

        assertThat(participationProperties.attendanceState())
            .isEqualTo(ParticipationProperties.AttendanceState.REGISTERED)
        assertThat(participationProperties.occurredAt()).isEqualTo(0L)
        assertThat(participationProperties.attendanceDurationSeconds()).contains(0)
        assertThat(participationProperties.attendancePercentage()).contains("attendancePercentage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participationProperties =
            ParticipationProperties.builder()
                .attendanceState(ParticipationProperties.AttendanceState.REGISTERED)
                .occurredAt(0L)
                .attendanceDurationSeconds(0)
                .attendancePercentage("attendancePercentage")
                .build()

        val roundtrippedParticipationProperties =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participationProperties),
                jacksonTypeRef<ParticipationProperties>(),
            )

        assertThat(roundtrippedParticipationProperties).isEqualTo(participationProperties)
    }
}
