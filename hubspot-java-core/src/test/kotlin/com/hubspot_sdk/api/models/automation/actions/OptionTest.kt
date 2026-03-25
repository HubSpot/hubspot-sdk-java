// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionTest {

    @Test
    fun create() {
        val option =
            Option.builder()
                .description("description")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(true)
                .label("label")
                .readOnly(true)
                .value("value")
                .build()

        assertThat(option.description()).isEqualTo("description")
        assertThat(option.displayOrder()).isEqualTo(0)
        assertThat(option.doubleData()).isEqualTo(0.0)
        assertThat(option.hidden()).isEqualTo(true)
        assertThat(option.label()).isEqualTo("label")
        assertThat(option.readOnly()).isEqualTo(true)
        assertThat(option.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val option =
            Option.builder()
                .description("description")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(true)
                .label("label")
                .readOnly(true)
                .value("value")
                .build()

        val roundtrippedOption =
            jsonMapper.readValue(jsonMapper.writeValueAsString(option), jacksonTypeRef<Option>())

        assertThat(roundtrippedOption).isEqualTo(option)
    }
}
