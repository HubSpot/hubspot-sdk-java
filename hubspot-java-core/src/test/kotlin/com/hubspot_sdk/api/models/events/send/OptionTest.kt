// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionTest {

    @Test
    fun create() {
        val option =
            Option.builder()
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        assertThat(option.hidden()).isEqualTo(true)
        assertThat(option.label()).isEqualTo("label")
        assertThat(option.value()).isEqualTo("value")
        assertThat(option.description()).contains("description")
        assertThat(option.displayOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val option =
            Option.builder()
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        val roundtrippedOption =
            jsonMapper.readValue(jsonMapper.writeValueAsString(option), jacksonTypeRef<Option>())

        assertThat(roundtrippedOption).isEqualTo(option)
    }
}
