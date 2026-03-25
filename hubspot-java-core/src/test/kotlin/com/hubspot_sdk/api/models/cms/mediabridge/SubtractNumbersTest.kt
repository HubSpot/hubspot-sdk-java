// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
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
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(subtractNumbers.enclosedInParentheses()).isEqualTo(true)
        assertThat(subtractNumbers.operator()).isEqualTo(SubtractNumbers.Operator.SUBTRACT_NUMBERS)
        assertThat(subtractNumbers.inputs().getOrNull())
            .containsExactly(
                SubtractNumbers.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
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
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
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
