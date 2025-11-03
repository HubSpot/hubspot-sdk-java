// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertiesOptionInputTest {

    @Test
    fun create() {
        val propertiesOptionInput =
            PropertiesOptionInput.builder()
                .hidden(false)
                .label("Option A")
                .value("A")
                .description("Choice number one")
                .displayOrder(1)
                .build()

        assertThat(propertiesOptionInput.hidden()).isEqualTo(false)
        assertThat(propertiesOptionInput.label()).isEqualTo("Option A")
        assertThat(propertiesOptionInput.value()).isEqualTo("A")
        assertThat(propertiesOptionInput.description()).contains("Choice number one")
        assertThat(propertiesOptionInput.displayOrder()).contains(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertiesOptionInput =
            PropertiesOptionInput.builder()
                .hidden(false)
                .label("Option A")
                .value("A")
                .description("Choice number one")
                .displayOrder(1)
                .build()

        val roundtrippedPropertiesOptionInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertiesOptionInput),
                jacksonTypeRef<PropertiesOptionInput>(),
            )

        assertThat(roundtrippedPropertiesOptionInput).isEqualTo(propertiesOptionInput)
    }
}
