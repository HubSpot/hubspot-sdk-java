// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionTest {

    @Test
    fun create() {
        val option =
            Option.builder()
                .hidden(false)
                .label("Option A")
                .value("A")
                .description("Choice number one")
                .displayOrder(1)
                .build()

        assertThat(option.hidden()).isEqualTo(false)
        assertThat(option.label()).isEqualTo("Option A")
        assertThat(option.value()).isEqualTo("A")
        assertThat(option.description()).contains("Choice number one")
        assertThat(option.displayOrder()).contains(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val option =
            Option.builder()
                .hidden(false)
                .label("Option A")
                .value("A")
                .description("Choice number one")
                .displayOrder(1)
                .build()

        val roundtrippedOption =
            jsonMapper.readValue(jsonMapper.writeValueAsString(option), jacksonTypeRef<Option>())

        assertThat(roundtrippedOption).isEqualTo(option)
    }
}
