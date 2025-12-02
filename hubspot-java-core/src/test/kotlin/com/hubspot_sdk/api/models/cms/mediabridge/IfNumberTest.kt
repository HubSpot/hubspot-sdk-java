// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
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
                .ifExpression(JsonValue.from(mapOf<String, Any>()))
                .operator(IfNumber.Operator.IF_NUMBER)
                .elseExpression(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(ifNumber.enclosedInParentheses()).isEqualTo(true)
        assertThat(ifNumber._ifExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifNumber.operator()).isEqualTo(IfNumber.Operator.IF_NUMBER)
        assertThat(ifNumber._elseExpression()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(ifNumber.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
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
                .addInput(JsonValue.from(mapOf<String, Any>()))
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
