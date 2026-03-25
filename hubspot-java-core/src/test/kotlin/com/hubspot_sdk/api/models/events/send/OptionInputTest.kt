// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionInputTest {

    @Test
    fun create() {
        val optionInput =
            OptionInput.builder()
                .displayOrder(0)
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .build()

        assertThat(optionInput.displayOrder()).isEqualTo(0)
        assertThat(optionInput.hidden()).isEqualTo(true)
        assertThat(optionInput.label()).isEqualTo("label")
        assertThat(optionInput.value()).isEqualTo("value")
        assertThat(optionInput.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionInput =
            OptionInput.builder()
                .displayOrder(0)
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .build()

        val roundtrippedOptionInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionInput),
                jacksonTypeRef<OptionInput>(),
            )

        assertThat(roundtrippedOptionInput).isEqualTo(optionInput)
    }
}
