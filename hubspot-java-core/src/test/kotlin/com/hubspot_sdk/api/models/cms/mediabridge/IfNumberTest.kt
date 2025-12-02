// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfNumberTest {

    @Test
    fun create() {
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(ifNumber.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifNumber.ifExpression())
            .isEqualTo(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(ifNumber.operator()).isEqualTo(IfNumber.Operator.IF_NUMBER)
        assertThat(ifNumber.elseExpression())
            .contains(
                Expression.ofConstantNumber(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
            )
        assertThat(ifNumber.inputs().getOrNull()).containsExactly()
        assertThat(ifNumber.propertyName()).contains("propertyName")
        assertThat(ifNumber.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedIfNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ifNumber),
                jacksonTypeRef<IfNumber>(),
            )

        assertThat(roundtrippedIfNumber).isEqualTo(ifNumber)
    }
}
