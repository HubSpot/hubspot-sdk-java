// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BooleanPropertyVariableTest {

    @Test
    fun create() {
        val booleanPropertyVariable =
            BooleanPropertyVariable.builder()
                .operator(BooleanPropertyVariable.Operator.BOOLEAN_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(booleanPropertyVariable.operator())
            .isEqualTo(BooleanPropertyVariable.Operator.BOOLEAN_PROPERTY_VARIABLE)
        assertThat(booleanPropertyVariable.propertyName()).contains("propertyName")
        assertThat(booleanPropertyVariable.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val booleanPropertyVariable =
            BooleanPropertyVariable.builder()
                .operator(BooleanPropertyVariable.Operator.BOOLEAN_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedBooleanPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(booleanPropertyVariable),
                jacksonTypeRef<BooleanPropertyVariable>(),
            )

        assertThat(roundtrippedBooleanPropertyVariable).isEqualTo(booleanPropertyVariable)
    }
}
