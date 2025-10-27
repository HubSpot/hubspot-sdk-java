// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiBlockedDateTest {

    @Test
    fun create() {
        val apiBlockedDate =
            ApiBlockedDate.builder()
                .dayOfMonth(0)
                .month(ApiBlockedDate.Month.JANUARY)
                .year(0)
                .build()

        assertThat(apiBlockedDate.dayOfMonth()).isEqualTo(0)
        assertThat(apiBlockedDate.month()).isEqualTo(ApiBlockedDate.Month.JANUARY)
        assertThat(apiBlockedDate.year()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiBlockedDate =
            ApiBlockedDate.builder()
                .dayOfMonth(0)
                .month(ApiBlockedDate.Month.JANUARY)
                .year(0)
                .build()

        val roundtrippedApiBlockedDate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiBlockedDate),
                jacksonTypeRef<ApiBlockedDate>(),
            )

        assertThat(roundtrippedApiBlockedDate).isEqualTo(apiBlockedDate)
    }
}
