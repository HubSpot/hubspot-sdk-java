// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BreakpointStylesTest {

    @Test
    fun create() {
        val breakpointStyles =
            BreakpointStyles.builder()
                .hidden(true)
                .margin(
                    Margin.builder()
                        .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .build()
                )
                .padding(
                    Padding.builder()
                        .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .left(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .right(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .build()
                )
                .build()

        assertThat(breakpointStyles.hidden()).isEqualTo(true)
        assertThat(breakpointStyles.margin())
            .isEqualTo(
                Margin.builder()
                    .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                    .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                    .build()
            )
        assertThat(breakpointStyles.padding())
            .isEqualTo(
                Padding.builder()
                    .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                    .left(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                    .right(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                    .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val breakpointStyles =
            BreakpointStyles.builder()
                .hidden(true)
                .margin(
                    Margin.builder()
                        .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .build()
                )
                .padding(
                    Padding.builder()
                        .bottom(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .left(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .right(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .top(Size.builder().units(Size.Units.PERCENT).value(0.0).build())
                        .build()
                )
                .build()

        val roundtrippedBreakpointStyles =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(breakpointStyles),
                jacksonTypeRef<BreakpointStyles>(),
            )

        assertThat(roundtrippedBreakpointStyles).isEqualTo(breakpointStyles)
    }
}
