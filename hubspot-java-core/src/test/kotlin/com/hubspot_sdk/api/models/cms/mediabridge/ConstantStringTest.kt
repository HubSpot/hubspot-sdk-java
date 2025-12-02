// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConstantStringTest {

    @Test
    fun create() {
        val constantString =
            ConstantString.builder()
                .operator(ConstantString.Operator.CONSTANT_STRING)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(constantString.operator()).isEqualTo(ConstantString.Operator.CONSTANT_STRING)
        assertThat(constantString.inputs().getOrNull())
            .containsExactly(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(constantString.propertyName()).contains("propertyName")
        assertThat(constantString.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val constantString =
            ConstantString.builder()
                .operator(ConstantString.Operator.CONSTANT_STRING)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedConstantString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(constantString),
                jacksonTypeRef<ConstantString>(),
            )

        assertThat(roundtrippedConstantString).isEqualTo(constantString)
    }
}
