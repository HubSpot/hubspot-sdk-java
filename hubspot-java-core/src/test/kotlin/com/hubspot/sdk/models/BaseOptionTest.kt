// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseOptionTest {

    @Test
    fun create() {
        val baseOption =
            BaseOption.builder()
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        assertThat(baseOption.hidden()).isEqualTo(true)
        assertThat(baseOption.label()).isEqualTo("label")
        assertThat(baseOption.value()).isEqualTo("value")
        assertThat(baseOption.description()).contains("description")
        assertThat(baseOption.displayOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseOption =
            BaseOption.builder()
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        val roundtrippedBaseOption =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseOption),
                jacksonTypeRef<BaseOption>(),
            )

        assertThat(roundtrippedBaseOption).isEqualTo(baseOption)
    }
}
