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
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfBoolean.Operator.IF_BOOLEAN)
                .elseExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(ifBoolean.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifBoolean.ifExpression())
            .isEqualTo(
                IfBoolean.IfExpression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(ifBoolean.operator()).isEqualTo(IfBoolean.Operator.IF_BOOLEAN)
        assertThat(ifBoolean.elseExpression())
            .contains(
                IfBoolean.ElseExpression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(ifBoolean.inputs().getOrNull())
            .containsExactly(
                IfBoolean.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
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
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfBoolean.Operator.IF_BOOLEAN)
                .elseExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
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
