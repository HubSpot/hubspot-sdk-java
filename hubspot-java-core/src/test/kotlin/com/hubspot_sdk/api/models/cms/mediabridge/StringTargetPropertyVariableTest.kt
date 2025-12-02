// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringTargetPropertyVariableTest {

    @Test
    fun create() {
        val stringTargetPropertyVariable =
            StringTargetPropertyVariable.builder()
                .operator(StringTargetPropertyVariable.Operator.STRING_TARGET_PROPERTY_VARIABLE)
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

        assertThat(stringTargetPropertyVariable.operator())
            .isEqualTo(StringTargetPropertyVariable.Operator.STRING_TARGET_PROPERTY_VARIABLE)
        assertThat(stringTargetPropertyVariable.inputs().getOrNull())
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
        assertThat(stringTargetPropertyVariable.propertyName()).contains("propertyName")
        assertThat(stringTargetPropertyVariable.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringTargetPropertyVariable =
            StringTargetPropertyVariable.builder()
                .operator(StringTargetPropertyVariable.Operator.STRING_TARGET_PROPERTY_VARIABLE)
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

        val roundtrippedStringTargetPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringTargetPropertyVariable),
                jacksonTypeRef<StringTargetPropertyVariable>(),
            )

        assertThat(roundtrippedStringTargetPropertyVariable).isEqualTo(stringTargetPropertyVariable)
    }
}
