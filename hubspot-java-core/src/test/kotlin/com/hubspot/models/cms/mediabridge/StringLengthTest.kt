// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringLengthTest {

    @Test
    fun create() {
        val stringLength =
            StringLength.builder()
                .operator(StringLength.Operator.STRING_LENGTH)
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

        assertThat(stringLength.operator()).isEqualTo(StringLength.Operator.STRING_LENGTH)
        assertThat(stringLength.inputs().getOrNull())
            .containsExactly(
                StringLength.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(stringLength.propertyName()).contains("propertyName")
        assertThat(stringLength.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringLength =
            StringLength.builder()
                .operator(StringLength.Operator.STRING_LENGTH)
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

        val roundtrippedStringLength =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringLength),
                jacksonTypeRef<StringLength>(),
            )

        assertThat(roundtrippedStringLength).isEqualTo(stringLength)
    }
}
