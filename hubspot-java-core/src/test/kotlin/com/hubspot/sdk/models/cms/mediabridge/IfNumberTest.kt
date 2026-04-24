// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfNumberTest {

    @Test
    fun create() {
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
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

        assertThat(ifNumber.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifNumber._ifExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifNumber.operator()).isEqualTo(IfNumber.Operator.IF_NUMBER)
        assertThat(ifNumber._elseExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifNumber.inputs().getOrNull())
            .containsExactly(
                IfNumber.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(ifNumber.propertyName()).contains("propertyName")
        assertThat(ifNumber.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ifNumber =
            IfNumber.builder()
                .enclosedInParentheses(true)
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
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

        val roundtrippedIfNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ifNumber),
                jacksonTypeRef<IfNumber>(),
            )

        assertThat(roundtrippedIfNumber).isEqualTo(ifNumber)
    }
}
