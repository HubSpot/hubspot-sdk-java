// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IfBooleanTest {

    @Test
    fun create() {
        val ifBoolean =
            IfBoolean.builder()
                .enclosedInParentheses(true)
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfBoolean.Operator.IF_BOOLEAN)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
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
        assertThat(ifBoolean._ifExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifBoolean.operator()).isEqualTo(IfBoolean.Operator.IF_BOOLEAN)
        assertThat(ifBoolean._elseExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
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
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfBoolean.Operator.IF_BOOLEAN)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
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
