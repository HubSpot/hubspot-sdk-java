// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberToStringTest {

    @Test
    fun create() {
        val numberToString =
            NumberToString.builder()
                .operator(NumberToString.Operator.NUMBER_TO_STRING)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(numberToString.operator()).isEqualTo(NumberToString.Operator.NUMBER_TO_STRING)
        assertThat(numberToString.inputs().getOrNull())
            .containsExactly(
                NumberToString.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(numberToString.propertyName()).contains("propertyName")
        assertThat(numberToString.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberToString =
            NumberToString.builder()
                .operator(NumberToString.Operator.NUMBER_TO_STRING)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedNumberToString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberToString),
                jacksonTypeRef<NumberToString>(),
            )

        assertThat(roundtrippedNumberToString).isEqualTo(numberToString)
    }
}
