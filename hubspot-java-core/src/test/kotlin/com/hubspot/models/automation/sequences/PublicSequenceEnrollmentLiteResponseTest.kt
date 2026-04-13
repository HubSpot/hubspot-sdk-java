// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceEnrollmentLiteResponseTest {

    @Test
    fun create() {
        val publicSequenceEnrollmentLiteResponse =
            PublicSequenceEnrollmentLiteResponse.builder()
                .id("id")
                .enrolledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .toEmail("toEmail")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicSequenceEnrollmentLiteResponse.id()).isEqualTo("id")
        assertThat(publicSequenceEnrollmentLiteResponse.enrolledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceEnrollmentLiteResponse.toEmail()).isEqualTo("toEmail")
        assertThat(publicSequenceEnrollmentLiteResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceEnrollmentLiteResponse =
            PublicSequenceEnrollmentLiteResponse.builder()
                .id("id")
                .enrolledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .toEmail("toEmail")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicSequenceEnrollmentLiteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceEnrollmentLiteResponse),
                jacksonTypeRef<PublicSequenceEnrollmentLiteResponse>(),
            )

        assertThat(roundtrippedPublicSequenceEnrollmentLiteResponse)
            .isEqualTo(publicSequenceEnrollmentLiteResponse)
    }
}
