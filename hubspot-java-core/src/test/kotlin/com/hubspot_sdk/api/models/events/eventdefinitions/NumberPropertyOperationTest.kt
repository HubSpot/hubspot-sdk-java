// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberPropertyOperationTest {

    @Test
    fun create() {
        val numberPropertyOperation =
            NumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(NumberPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(NumberPropertyOperation.PropertyType.NUMBER)
                .value(0.0)
                .defaultValue("defaultValue")
                .build()

        assertThat(numberPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(numberPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(numberPropertyOperation.operator())
            .isEqualTo(NumberPropertyOperation.Operator.IS_EQUAL_TO)
        assertThat(numberPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(numberPropertyOperation.propertyType())
            .isEqualTo(NumberPropertyOperation.PropertyType.NUMBER)
        assertThat(numberPropertyOperation.value()).isEqualTo(0.0)
        assertThat(numberPropertyOperation.defaultValue()).contains("defaultValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberPropertyOperation =
            NumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(NumberPropertyOperation.Operator.IS_EQUAL_TO)
                .operatorName("operatorName")
                .propertyType(NumberPropertyOperation.PropertyType.NUMBER)
                .value(0.0)
                .defaultValue("defaultValue")
                .build()

        val roundtrippedNumberPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberPropertyOperation),
                jacksonTypeRef<NumberPropertyOperation>(),
            )

        assertThat(roundtrippedNumberPropertyOperation).isEqualTo(numberPropertyOperation)
    }
}
