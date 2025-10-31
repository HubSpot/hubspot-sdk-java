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
                .description("")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(false)
                .label("")
                .readOnly(false)
                .value("")
                .build()

        assertThat(option.description()).isEqualTo("")
        assertThat(option.displayOrder()).isEqualTo(0)
        assertThat(option.doubleData()).isEqualTo(0.0)
        assertThat(option.hidden()).isEqualTo(false)
        assertThat(option.label()).isEqualTo("")
        assertThat(option.readOnly()).isEqualTo(false)
        assertThat(option.value()).isEqualTo("")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val option =
            Option.builder()
                .description("")
                .displayOrder(0)
                .doubleData(0.0)
                .hidden(false)
                .label("")
                .readOnly(false)
                .value("")
                .build()

        val roundtrippedOption =
            jsonMapper.readValue(jsonMapper.writeValueAsString(option), jacksonTypeRef<Option>())

        assertThat(roundtrippedOption).isEqualTo(option)
    }
}
