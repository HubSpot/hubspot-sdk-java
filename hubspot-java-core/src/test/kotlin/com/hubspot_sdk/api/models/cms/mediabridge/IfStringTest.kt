// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfStringTest {

    @Test
    fun create() {
        val ifString =
            IfString.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfString.Operator.IF_STRING)
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
                .value("value")
                .build()

        assertThat(ifString.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifString.ifExpression())
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
        assertThat(ifString.operator()).isEqualTo(IfString.Operator.IF_STRING)
        assertThat(ifString.elseExpression())
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
        assertThat(ifString.inputs().getOrNull()).containsExactly()
        assertThat(ifString.propertyName()).contains("propertyName")
        assertThat(ifString.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ifString =
            IfString.builder()
                .enclosedInParentheses(true)
                .ifExpression(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IfString.Operator.IF_STRING)
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
                .value("value")
                .build()

        val roundtrippedIfString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ifString),
                jacksonTypeRef<IfString>(),
            )

        assertThat(roundtrippedIfString).isEqualTo(ifString)
    }
}
