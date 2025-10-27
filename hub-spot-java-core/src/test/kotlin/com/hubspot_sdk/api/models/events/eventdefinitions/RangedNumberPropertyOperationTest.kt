// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RangedNumberPropertyOperationTest {

    @Test
    fun create() {
        val rangedNumberPropertyOperation =
            RangedNumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBound(0)
                .operationType("operationType")
                .operator(RangedNumberPropertyOperation.Operator.IS_BETWEEN)
                .operatorName("operatorName")
                .propertyType(RangedNumberPropertyOperation.PropertyType.NUMBER_RANGED)
                .upperBound(0)
                .defaultValue("defaultValue")
                .build()

        assertThat(rangedNumberPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(rangedNumberPropertyOperation.lowerBound()).isEqualTo(0)
        assertThat(rangedNumberPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(rangedNumberPropertyOperation.operator())
            .isEqualTo(RangedNumberPropertyOperation.Operator.IS_BETWEEN)
        assertThat(rangedNumberPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(rangedNumberPropertyOperation.propertyType())
            .isEqualTo(RangedNumberPropertyOperation.PropertyType.NUMBER_RANGED)
        assertThat(rangedNumberPropertyOperation.upperBound()).isEqualTo(0)
        assertThat(rangedNumberPropertyOperation.defaultValue()).contains("defaultValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rangedNumberPropertyOperation =
            RangedNumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBound(0)
                .operationType("operationType")
                .operator(RangedNumberPropertyOperation.Operator.IS_BETWEEN)
                .operatorName("operatorName")
                .propertyType(RangedNumberPropertyOperation.PropertyType.NUMBER_RANGED)
                .upperBound(0)
                .defaultValue("defaultValue")
                .build()

        val roundtrippedRangedNumberPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rangedNumberPropertyOperation),
                jacksonTypeRef<RangedNumberPropertyOperation>(),
            )

        assertThat(roundtrippedRangedNumberPropertyOperation)
            .isEqualTo(rangedNumberPropertyOperation)
    }
}
