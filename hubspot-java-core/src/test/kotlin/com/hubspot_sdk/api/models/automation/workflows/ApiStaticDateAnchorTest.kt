// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticDateAnchorTest {

    @Test
    fun create() {
        val apiStaticDateAnchor =
            ApiStaticDateAnchor.builder()
                .dayOfMonth(0)
                .month(ApiStaticDateAnchor.Month.JANUARY)
                .type(ApiStaticDateAnchor.Type.STATIC_DATE_ANCHOR)
                .year(0)
                .build()

        assertThat(apiStaticDateAnchor.dayOfMonth()).isEqualTo(0)
        assertThat(apiStaticDateAnchor.month()).isEqualTo(ApiStaticDateAnchor.Month.JANUARY)
        assertThat(apiStaticDateAnchor.type())
            .isEqualTo(ApiStaticDateAnchor.Type.STATIC_DATE_ANCHOR)
        assertThat(apiStaticDateAnchor.year()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticDateAnchor =
            ApiStaticDateAnchor.builder()
                .dayOfMonth(0)
                .month(ApiStaticDateAnchor.Month.JANUARY)
                .type(ApiStaticDateAnchor.Type.STATIC_DATE_ANCHOR)
                .year(0)
                .build()

        val roundtrippedApiStaticDateAnchor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticDateAnchor),
                jacksonTypeRef<ApiStaticDateAnchor>(),
            )

        assertThat(roundtrippedApiStaticDateAnchor).isEqualTo(apiStaticDateAnchor)
    }
}
