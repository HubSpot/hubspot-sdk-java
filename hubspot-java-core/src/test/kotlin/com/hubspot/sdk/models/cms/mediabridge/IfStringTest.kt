// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfStringTest {

    @Test
    fun create() {
        val ifString =
            IfString.builder()
                .enclosedInParentheses(true)
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfString.Operator.IF_STRING)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
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

        assertThat(ifString.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifString._ifExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifString.operator()).isEqualTo(IfString.Operator.IF_STRING)
        assertThat(ifString._elseExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifString.inputs().getOrNull())
            .containsExactly(
                IfString.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(ifString.propertyName()).contains("propertyName")
        assertThat(ifString.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ifString =
            IfString.builder()
                .enclosedInParentheses(true)
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfString.Operator.IF_STRING)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
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

        val roundtrippedIfString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ifString),
                jacksonTypeRef<IfString>(),
            )

        assertThat(roundtrippedIfString).isEqualTo(ifString)
    }
}
