// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberPropertyVariableTest {

    @Test
    fun create() {
        val numberPropertyVariable =
            NumberPropertyVariable.builder()
                .operator(NumberPropertyVariable.Operator.NUMBER_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(numberPropertyVariable.operator())
            .isEqualTo(NumberPropertyVariable.Operator.NUMBER_PROPERTY_VARIABLE)
        assertThat(numberPropertyVariable.propertyName()).contains("propertyName")
        assertThat(numberPropertyVariable.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberPropertyVariable =
            NumberPropertyVariable.builder()
                .operator(NumberPropertyVariable.Operator.NUMBER_PROPERTY_VARIABLE)
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedNumberPropertyVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberPropertyVariable),
                jacksonTypeRef<NumberPropertyVariable>(),
            )

        assertThat(roundtrippedNumberPropertyVariable).isEqualTo(numberPropertyVariable)
    }
}
