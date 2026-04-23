// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubstringTest {

    @Test
    fun create() {
        val substring =
            Substring.builder()
                .operator(Substring.Operator.SUBSTRING)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
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

        assertThat(substring.operator()).isEqualTo(Substring.Operator.SUBSTRING)
        assertThat(substring._stringToCheck()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(substring.inputs().getOrNull())
            .containsExactly(
                Substring.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(substring.propertyName()).contains("propertyName")
        assertThat(substring.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val substring =
            Substring.builder()
                .operator(Substring.Operator.SUBSTRING)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
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

        val roundtrippedSubstring =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(substring),
                jacksonTypeRef<Substring>(),
            )

        assertThat(roundtrippedSubstring).isEqualTo(substring)
    }
}
