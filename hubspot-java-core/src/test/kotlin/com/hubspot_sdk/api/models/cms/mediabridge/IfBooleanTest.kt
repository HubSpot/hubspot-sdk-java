// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfBooleanTest {

    @Test
    fun create() {
        val ifBoolean =
            IfBoolean.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfBoolean.Operator.IF_BOOLEAN)
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
                .value(true)
                .build()

        assertThat(ifBoolean.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifBoolean.ifExpression())
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
        assertThat(ifBoolean.operator()).isEqualTo(IfBoolean.Operator.IF_BOOLEAN)
        assertThat(ifBoolean.elseExpression())
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
        assertThat(ifBoolean.inputs().getOrNull()).containsExactly()
        assertThat(ifBoolean.propertyName()).contains("propertyName")
        assertThat(ifBoolean.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ifBoolean =
            IfBoolean.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfBoolean.Operator.IF_BOOLEAN)
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
                .value(true)
                .build()

        val roundtrippedIfBoolean =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ifBoolean),
                jacksonTypeRef<IfBoolean>(),
            )

        assertThat(roundtrippedIfBoolean).isEqualTo(ifBoolean)
    }
}
