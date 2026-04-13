// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Option1Test {

    @Test
    fun create() {
        val option1 =
            Option1.builder()
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        assertThat(option1.hidden()).isEqualTo(true)
        assertThat(option1.label()).isEqualTo("label")
        assertThat(option1.value()).isEqualTo("value")
        assertThat(option1.description()).contains("description")
        assertThat(option1.displayOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val option1 =
            Option1.builder()
                .hidden(true)
                .label("label")
                .value("value")
                .description("description")
                .displayOrder(0)
                .build()

        val roundtrippedOption1 =
            jsonMapper.readValue(jsonMapper.writeValueAsString(option1), jacksonTypeRef<Option1>())

        assertThat(roundtrippedOption1).isEqualTo(option1)
    }
}
