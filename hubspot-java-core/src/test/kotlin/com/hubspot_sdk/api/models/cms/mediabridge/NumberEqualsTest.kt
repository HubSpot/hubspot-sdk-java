// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberEqualsTest {

    @Test
    fun create() {
        val numberEquals =
            NumberEquals.builder()
                .operator(NumberEquals.Operator.NUMBER_EQUALS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(numberEquals.operator()).isEqualTo(NumberEquals.Operator.NUMBER_EQUALS)
        assertThat(numberEquals.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(numberEquals.propertyName()).contains("propertyName")
        assertThat(numberEquals.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberEquals =
            NumberEquals.builder()
                .operator(NumberEquals.Operator.NUMBER_EQUALS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedNumberEquals =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberEquals),
                jacksonTypeRef<NumberEquals>(),
            )

        assertThat(roundtrippedNumberEquals).isEqualTo(numberEquals)
    }
}
