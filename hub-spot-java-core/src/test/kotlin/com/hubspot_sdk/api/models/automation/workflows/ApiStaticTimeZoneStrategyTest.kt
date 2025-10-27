// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticTimeZoneStrategyTest {

    @Test
    fun create() {
        val apiStaticTimeZoneStrategy =
            ApiStaticTimeZoneStrategy.builder()
                .timeZoneId("timeZoneId")
                .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                .build()

        assertThat(apiStaticTimeZoneStrategy.timeZoneId()).isEqualTo("timeZoneId")
        assertThat(apiStaticTimeZoneStrategy.type())
            .isEqualTo(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticTimeZoneStrategy =
            ApiStaticTimeZoneStrategy.builder()
                .timeZoneId("timeZoneId")
                .type(ApiStaticTimeZoneStrategy.Type.STATIC_TIME_ZONE)
                .build()

        val roundtrippedApiStaticTimeZoneStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticTimeZoneStrategy),
                jacksonTypeRef<ApiStaticTimeZoneStrategy>(),
            )

        assertThat(roundtrippedApiStaticTimeZoneStrategy).isEqualTo(apiStaticTimeZoneStrategy)
    }
}
