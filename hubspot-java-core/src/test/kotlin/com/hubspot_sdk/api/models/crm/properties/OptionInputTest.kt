// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionInputTest {

    @Test
    fun create() {
        val optionInput =
            OptionInput.builder()
                .hidden(false)
                .label("Option A")
                .value("A")
                .description("Choice number one")
                .displayOrder(1)
                .build()

        assertThat(optionInput.hidden()).isEqualTo(false)
        assertThat(optionInput.label()).isEqualTo("Option A")
        assertThat(optionInput.value()).isEqualTo("A")
        assertThat(optionInput.description()).contains("Choice number one")
        assertThat(optionInput.displayOrder()).contains(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionInput =
            OptionInput.builder()
                .hidden(false)
                .label("Option A")
                .value("A")
                .description("Choice number one")
                .displayOrder(1)
                .build()

        val roundtrippedOptionInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionInput),
                jacksonTypeRef<OptionInput>(),
            )

        assertThat(roundtrippedOptionInput).isEqualTo(optionInput)
    }
}
