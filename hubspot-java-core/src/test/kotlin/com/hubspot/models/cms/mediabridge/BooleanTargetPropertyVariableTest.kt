// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BooleanTargetPropertyVariableTest {

    @Test
    fun create() {
        val booleanTargetPropertyVariable =
            BooleanTargetPropertyVariable.builder()
                .operator(BooleanTargetPropertyVariable.Operator.BOOLEAN_TARGET_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(booleanTargetPropertyVariable.operator())
            .isEqualTo(BooleanTargetPropertyVariable.Operator.BOOLEAN_TARGET_PROPERTY_VARIABLE)
        assertThat(booleanTargetPropertyVariable.propertyName()).contains("propertyName")
        assertThat(booleanTargetPropertyVariable.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val booleanTargetPropertyVariable =
            BooleanTargetPropertyVariable.builder()
                .operator(BooleanTargetPropertyVariable.Operator.BOOLEAN_TARGET_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedBooleanTargetPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(booleanTargetPropertyVariable),
                jacksonTypeRef<BooleanTargetPropertyVariable>(),
            )

        assertThat(roundtrippedBooleanTargetPropertyVariable)
            .isEqualTo(booleanTargetPropertyVariable)
    }
}
