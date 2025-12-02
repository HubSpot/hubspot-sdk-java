// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConstantBooleanTest {

    @Test
    fun create() {
        val constantBoolean =
            ConstantBoolean.builder()
                .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                .addInput(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(constantBoolean.operator()).isEqualTo(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
        assertThat(constantBoolean.inputs().getOrNull())
            .containsExactly(
                Expression.ofConstantNumber(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
            )
        assertThat(constantBoolean.propertyName()).contains("propertyName")
        assertThat(constantBoolean.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val constantBoolean =
            ConstantBoolean.builder()
                .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                .addInput(
                    ConstantNumber.builder()
                        .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(0.0)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedConstantBoolean =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(constantBoolean),
                jacksonTypeRef<ConstantBoolean>(),
            )

        assertThat(roundtrippedConstantBoolean).isEqualTo(constantBoolean)
    }
}
