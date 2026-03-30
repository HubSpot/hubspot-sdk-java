// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginTest {

    @Test
    fun create() {
        val margin =
            Margin.builder()
                .bottom(Size.builder().units(Size.Units.Unknown0).value(0.0).build())
                .top(Size.builder().units(Size.Units.Unknown0).value(0.0).build())
                .build()

        assertThat(margin.bottom())
            .isEqualTo(Size.builder().units(Size.Units.Unknown0).value(0.0).build())
        assertThat(margin.top())
            .isEqualTo(Size.builder().units(Size.Units.Unknown0).value(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val margin =
            Margin.builder()
                .bottom(Size.builder().units(Size.Units.Unknown0).value(0.0).build())
                .top(Size.builder().units(Size.Units.Unknown0).value(0.0).build())
                .build()

        val roundtrippedMargin =
            jsonMapper.readValue(jsonMapper.writeValueAsString(margin), jacksonTypeRef<Margin>())

        assertThat(roundtrippedMargin).isEqualTo(margin)
    }
}
