// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberTargetPropertyVariableTest {

    @Test
    fun create() {
        val numberTargetPropertyVariable =
            NumberTargetPropertyVariable.builder()
                .operator(NumberTargetPropertyVariable.Operator.NUMBER_TARGET_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(numberTargetPropertyVariable.operator())
            .isEqualTo(NumberTargetPropertyVariable.Operator.NUMBER_TARGET_PROPERTY_VARIABLE)
        assertThat(numberTargetPropertyVariable.propertyName()).contains("propertyName")
        assertThat(numberTargetPropertyVariable.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberTargetPropertyVariable =
            NumberTargetPropertyVariable.builder()
                .operator(NumberTargetPropertyVariable.Operator.NUMBER_TARGET_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedNumberTargetPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberTargetPropertyVariable),
                jacksonTypeRef<NumberTargetPropertyVariable>(),
            )

        assertThat(roundtrippedNumberTargetPropertyVariable).isEqualTo(numberTargetPropertyVariable)
    }
}
