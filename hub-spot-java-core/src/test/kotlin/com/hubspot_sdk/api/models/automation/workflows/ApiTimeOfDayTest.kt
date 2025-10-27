// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiTimeOfDayTest {

    @Test
    fun create() {
        val apiTimeOfDay = ApiTimeOfDay.builder().hour(0).minute(0).build()

        assertThat(apiTimeOfDay.hour()).isEqualTo(0)
        assertThat(apiTimeOfDay.minute()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiTimeOfDay = ApiTimeOfDay.builder().hour(0).minute(0).build()

        val roundtrippedApiTimeOfDay =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiTimeOfDay),
                jacksonTypeRef<ApiTimeOfDay>(),
            )

        assertThat(roundtrippedApiTimeOfDay).isEqualTo(apiTimeOfDay)
    }
}
