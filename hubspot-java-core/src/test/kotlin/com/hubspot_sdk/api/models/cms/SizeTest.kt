// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SizeTest {

    @Test
    fun create() {
        val size = Size.builder().units(Size.Units.PERCENT).value(0.0).build()

        assertThat(size.units()).isEqualTo(Size.Units.PERCENT)
        assertThat(size.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val size = Size.builder().units(Size.Units.PERCENT).value(0.0).build()

        val roundtrippedSize =
            jsonMapper.readValue(jsonMapper.writeValueAsString(size), jacksonTypeRef<Size>())

        assertThat(roundtrippedSize).isEqualTo(size)
    }
}
