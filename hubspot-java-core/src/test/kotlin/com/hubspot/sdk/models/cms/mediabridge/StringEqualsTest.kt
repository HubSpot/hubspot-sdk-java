// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringEqualsTest {

    @Test
    fun create() {
        val stringEquals =
            StringEquals.builder()
                .operator(StringEquals.Operator.STRING_EQUALS)
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

        assertThat(stringEquals.operator()).isEqualTo(StringEquals.Operator.STRING_EQUALS)
        assertThat(stringEquals.inputs().getOrNull())
            .containsExactly(
                StringEquals.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(stringEquals.propertyName()).contains("propertyName")
        assertThat(stringEquals.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringEquals =
            StringEquals.builder()
                .operator(StringEquals.Operator.STRING_EQUALS)
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

        val roundtrippedStringEquals =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringEquals),
                jacksonTypeRef<StringEquals>(),
            )

        assertThat(roundtrippedStringEquals).isEqualTo(stringEquals)
    }
}
