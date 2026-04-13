// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbsoluteValueTest {

    @Test
    fun create() {
        val absoluteValue =
            AbsoluteValue.builder()
                .operator(AbsoluteValue.Operator.ABSOLUTE_VALUE)
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

        assertThat(absoluteValue.operator()).isEqualTo(AbsoluteValue.Operator.ABSOLUTE_VALUE)
        assertThat(absoluteValue.inputs().getOrNull())
            .containsExactly(
                AbsoluteValue.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(absoluteValue.propertyName()).contains("propertyName")
        assertThat(absoluteValue.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val absoluteValue =
            AbsoluteValue.builder()
                .operator(AbsoluteValue.Operator.ABSOLUTE_VALUE)
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

        val roundtrippedAbsoluteValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(absoluteValue),
                jacksonTypeRef<AbsoluteValue>(),
            )

        assertThat(roundtrippedAbsoluteValue).isEqualTo(absoluteValue)
    }
}
