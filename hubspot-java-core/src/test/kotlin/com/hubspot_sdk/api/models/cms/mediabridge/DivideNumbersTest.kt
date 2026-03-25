// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DivideNumbersTest {

    @Test
    fun create() {
        val divideNumbers =
            DivideNumbers.builder()
                .enclosedInParentheses(true)
                .operator(DivideNumbers.Operator.DIVIDE_NUMBERS)
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

        assertThat(divideNumbers.enclosedInParentheses()).isEqualTo(true)
        assertThat(divideNumbers.operator()).isEqualTo(DivideNumbers.Operator.DIVIDE_NUMBERS)
        assertThat(divideNumbers.inputs().getOrNull())
            .containsExactly(
                DivideNumbers.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(divideNumbers.propertyName()).contains("propertyName")
        assertThat(divideNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val divideNumbers =
            DivideNumbers.builder()
                .enclosedInParentheses(true)
                .operator(DivideNumbers.Operator.DIVIDE_NUMBERS)
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

        val roundtrippedDivideNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(divideNumbers),
                jacksonTypeRef<DivideNumbers>(),
            )

        assertThat(roundtrippedDivideNumbers).isEqualTo(divideNumbers)
    }
}
