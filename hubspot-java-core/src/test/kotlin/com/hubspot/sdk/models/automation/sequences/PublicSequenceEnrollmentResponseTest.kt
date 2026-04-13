// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceEnrollmentResponseTest {

    @Test
    fun create() {
        val publicSequenceEnrollmentResponse =
            PublicSequenceEnrollmentResponse.builder()
                .id("id")
                .enrolledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enrolledBy("enrolledBy")
                .enrolledByEmail("enrolledByEmail")
                .sequenceId("sequenceId")
                .sequenceName("sequenceName")
                .toEmail("toEmail")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicSequenceEnrollmentResponse.id()).isEqualTo("id")
        assertThat(publicSequenceEnrollmentResponse.enrolledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceEnrollmentResponse.enrolledBy()).isEqualTo("enrolledBy")
        assertThat(publicSequenceEnrollmentResponse.enrolledByEmail()).isEqualTo("enrolledByEmail")
        assertThat(publicSequenceEnrollmentResponse.sequenceId()).isEqualTo("sequenceId")
        assertThat(publicSequenceEnrollmentResponse.sequenceName()).isEqualTo("sequenceName")
        assertThat(publicSequenceEnrollmentResponse.toEmail()).isEqualTo("toEmail")
        assertThat(publicSequenceEnrollmentResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceEnrollmentResponse =
            PublicSequenceEnrollmentResponse.builder()
                .id("id")
                .enrolledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .enrolledBy("enrolledBy")
                .enrolledByEmail("enrolledByEmail")
                .sequenceId("sequenceId")
                .sequenceName("sequenceName")
                .toEmail("toEmail")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicSequenceEnrollmentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceEnrollmentResponse),
                jacksonTypeRef<PublicSequenceEnrollmentResponse>(),
            )

        assertThat(roundtrippedPublicSequenceEnrollmentResponse)
            .isEqualTo(publicSequenceEnrollmentResponse)
    }
}
