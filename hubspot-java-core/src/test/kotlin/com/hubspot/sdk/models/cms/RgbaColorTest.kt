// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RgbaColorTest {

    @Test
    fun create() {
        val rgbaColor = RgbaColor.builder().a(0.0).b(0).g(0).r(0).build()

        assertThat(rgbaColor.a()).isEqualTo(0.0)
        assertThat(rgbaColor.b()).isEqualTo(0)
        assertThat(rgbaColor.g()).isEqualTo(0)
        assertThat(rgbaColor.r()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rgbaColor = RgbaColor.builder().a(0.0).b(0).g(0).r(0).build()

        val roundtrippedRgbaColor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rgbaColor),
                jacksonTypeRef<RgbaColor>(),
            )

        assertThat(roundtrippedRgbaColor).isEqualTo(rgbaColor)
    }
}
