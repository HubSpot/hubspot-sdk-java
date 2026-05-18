// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginTest {

    @Test
    fun create() {
        val margin =
            Margin.builder()
                .bottom(Size.builder().units(Size.Units.CH).value(0.0).build())
                .top(Size.builder().units(Size.Units.CH).value(0.0).build())
                .build()

        assertThat(margin.bottom())
            .isEqualTo(Size.builder().units(Size.Units.CH).value(0.0).build())
        assertThat(margin.top()).isEqualTo(Size.builder().units(Size.Units.CH).value(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val margin =
            Margin.builder()
                .bottom(Size.builder().units(Size.Units.CH).value(0.0).build())
                .top(Size.builder().units(Size.Units.CH).value(0.0).build())
                .build()

        val roundtrippedMargin =
            jsonMapper.readValue(jsonMapper.writeValueAsString(margin), jacksonTypeRef<Margin>())

        assertThat(roundtrippedMargin).isEqualTo(margin)
    }
}
