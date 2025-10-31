// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiEnrollmentEventPropertyValueTest {

    @Test
    fun create() {
        val apiEnrollmentEventPropertyValue =
            ApiEnrollmentEventPropertyValue.builder()
                .enrollmentEventPropertyToken("enrollmentEventPropertyToken")
                .type(ApiEnrollmentEventPropertyValue.Type.ENROLLMENT_EVENT_PROPERTY)
                .build()

        assertThat(apiEnrollmentEventPropertyValue.enrollmentEventPropertyToken())
            .isEqualTo("enrollmentEventPropertyToken")
        assertThat(apiEnrollmentEventPropertyValue.type())
            .isEqualTo(ApiEnrollmentEventPropertyValue.Type.ENROLLMENT_EVENT_PROPERTY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiEnrollmentEventPropertyValue =
            ApiEnrollmentEventPropertyValue.builder()
                .enrollmentEventPropertyToken("enrollmentEventPropertyToken")
                .type(ApiEnrollmentEventPropertyValue.Type.ENROLLMENT_EVENT_PROPERTY)
                .build()

        val roundtrippedApiEnrollmentEventPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiEnrollmentEventPropertyValue),
                jacksonTypeRef<ApiEnrollmentEventPropertyValue>(),
            )

        assertThat(roundtrippedApiEnrollmentEventPropertyValue)
            .isEqualTo(apiEnrollmentEventPropertyValue)
    }
}
