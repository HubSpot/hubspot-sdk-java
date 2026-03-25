// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XorTest {

    @Test
    fun create() {
        val xor =
            Xor.builder()
                .enclosedInParentheses(true)
                .operator(Xor.Operator.XOR)
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

        assertThat(xor.enclosedInParentheses()).isEqualTo(true)
        assertThat(xor.operator()).isEqualTo(Xor.Operator.XOR)
        assertThat(xor.inputs().getOrNull())
            .containsExactly(
                Xor.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(xor.propertyName()).contains("propertyName")
        assertThat(xor.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xor =
            Xor.builder()
                .enclosedInParentheses(true)
                .operator(Xor.Operator.XOR)
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

        val roundtrippedXor =
            jsonMapper.readValue(jsonMapper.writeValueAsString(xor), jacksonTypeRef<Xor>())

        assertThat(roundtrippedXor).isEqualTo(xor)
    }
}
