// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimestampOfTargetPropertyVariableTest {

    @Test
    fun create() {
        val timestampOfTargetPropertyVariable =
            TimestampOfTargetPropertyVariable.builder()
                .operator(
                    TimestampOfTargetPropertyVariable.Operator.TIMESTAMP_OF_TARGET_PROPERTY_VARIABLE
                )
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

        assertThat(timestampOfTargetPropertyVariable.operator())
            .isEqualTo(
                TimestampOfTargetPropertyVariable.Operator.TIMESTAMP_OF_TARGET_PROPERTY_VARIABLE
            )
        assertThat(timestampOfTargetPropertyVariable.inputs().getOrNull())
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
        assertThat(timestampOfTargetPropertyVariable.propertyName()).contains("propertyName")
        assertThat(timestampOfTargetPropertyVariable.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timestampOfTargetPropertyVariable =
            TimestampOfTargetPropertyVariable.builder()
                .operator(
                    TimestampOfTargetPropertyVariable.Operator.TIMESTAMP_OF_TARGET_PROPERTY_VARIABLE
                )
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

        val roundtrippedTimestampOfTargetPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timestampOfTargetPropertyVariable),
                jacksonTypeRef<TimestampOfTargetPropertyVariable>(),
            )

        assertThat(roundtrippedTimestampOfTargetPropertyVariable)
            .isEqualTo(timestampOfTargetPropertyVariable)
    }
}
