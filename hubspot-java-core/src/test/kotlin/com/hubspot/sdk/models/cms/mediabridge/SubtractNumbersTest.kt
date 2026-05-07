// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubtractNumbersTest {

    @Test
    fun create() {
        val subtractNumbers =
            SubtractNumbers.builder()
                .enclosedInParentheses(true)
                .operator(SubtractNumbers.Operator.SUBTRACT_NUMBERS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(subtractNumbers.enclosedInParentheses()).isEqualTo(true)
        assertThat(subtractNumbers.operator()).isEqualTo(SubtractNumbers.Operator.SUBTRACT_NUMBERS)
        assertThat(subtractNumbers.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(subtractNumbers.propertyName()).contains("propertyName")
        assertThat(subtractNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subtractNumbers =
            SubtractNumbers.builder()
                .enclosedInParentheses(true)
                .operator(SubtractNumbers.Operator.SUBTRACT_NUMBERS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedSubtractNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subtractNumbers),
                jacksonTypeRef<SubtractNumbers>(),
            )

        assertThat(roundtrippedSubtractNumbers).isEqualTo(subtractNumbers)
    }
}
