// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrTest {

    @Test
    fun create() {
        val or =
            Or.builder()
                .enclosedInParentheses(true)
                .operator(Or.Operator.OR)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(or.enclosedInParentheses()).isEqualTo(true)
        assertThat(or.operator()).isEqualTo(Or.Operator.OR)
        assertThat(or.inputs().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(or.propertyName()).contains("propertyName")
        assertThat(or.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val or =
            Or.builder()
                .enclosedInParentheses(true)
                .operator(Or.Operator.OR)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedOr =
            jsonMapper.readValue(jsonMapper.writeValueAsString(or), jacksonTypeRef<Or>())

        assertThat(roundtrippedOr).isEqualTo(or)
    }
}
