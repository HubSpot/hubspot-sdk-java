// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ColorStopTest {

    @Test
    fun create() {
        val colorStop =
            ColorStop.builder().color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build()).build()

        assertThat(colorStop.color()).isEqualTo(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val colorStop =
            ColorStop.builder().color(RgbaColor.builder().a(0.0).b(0).g(0).r(0).build()).build()

        val roundtrippedColorStop =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(colorStop),
                jacksonTypeRef<ColorStop>(),
            )

        assertThat(roundtrippedColorStop).isEqualTo(colorStop)
    }
}
