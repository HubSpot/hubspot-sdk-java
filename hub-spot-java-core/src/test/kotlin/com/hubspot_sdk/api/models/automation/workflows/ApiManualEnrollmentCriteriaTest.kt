// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiManualEnrollmentCriteriaTest {

    @Test
    fun create() {
        val apiManualEnrollmentCriteria =
            ApiManualEnrollmentCriteria.builder()
                .shouldReEnroll(false)
                .type(ApiManualEnrollmentCriteria.Type.MANUAL)
                .build()

        assertThat(apiManualEnrollmentCriteria.shouldReEnroll()).isEqualTo(false)
        assertThat(apiManualEnrollmentCriteria.type())
            .isEqualTo(ApiManualEnrollmentCriteria.Type.MANUAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiManualEnrollmentCriteria =
            ApiManualEnrollmentCriteria.builder()
                .shouldReEnroll(false)
                .type(ApiManualEnrollmentCriteria.Type.MANUAL)
                .build()

        val roundtrippedApiManualEnrollmentCriteria =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiManualEnrollmentCriteria),
                jacksonTypeRef<ApiManualEnrollmentCriteria>(),
            )

        assertThat(roundtrippedApiManualEnrollmentCriteria).isEqualTo(apiManualEnrollmentCriteria)
    }
}
