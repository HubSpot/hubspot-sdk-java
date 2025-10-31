// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiUnEnrollmentSettingTest {

    @Test
    fun create() {
        val apiUnEnrollmentSetting =
            ApiUnEnrollmentSetting.builder()
                .addFlowId("string")
                .type(ApiUnEnrollmentSetting.Type.ALL)
                .build()

        assertThat(apiUnEnrollmentSetting.flowIds()).containsExactly("string")
        assertThat(apiUnEnrollmentSetting.type()).isEqualTo(ApiUnEnrollmentSetting.Type.ALL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiUnEnrollmentSetting =
            ApiUnEnrollmentSetting.builder()
                .addFlowId("string")
                .type(ApiUnEnrollmentSetting.Type.ALL)
                .build()

        val roundtrippedApiUnEnrollmentSetting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiUnEnrollmentSetting),
                jacksonTypeRef<ApiUnEnrollmentSetting>(),
            )

        assertThat(roundtrippedApiUnEnrollmentSetting).isEqualTo(apiUnEnrollmentSetting)
    }
}
