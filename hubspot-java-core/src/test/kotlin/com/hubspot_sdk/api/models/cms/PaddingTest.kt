// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaddingTest {

    @Test
    fun create() {
        val padding =
            Padding.builder()
                .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .left(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .right(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .build()

        assertThat(padding.bottom())
            .isEqualTo(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
        assertThat(padding.left())
            .isEqualTo(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
        assertThat(padding.right())
            .isEqualTo(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
        assertThat(padding.top())
            .isEqualTo(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val padding =
            Padding.builder()
                .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .left(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .right(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                .build()

        val roundtrippedPadding =
            jsonMapper.readValue(jsonMapper.writeValueAsString(padding), jacksonTypeRef<Padding>())

        assertThat(roundtrippedPadding).isEqualTo(padding)
    }
}
