// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RangedDatePropertyOperationTest {

    @Test
    fun create() {
        val rangedDatePropertyOperation =
            RangedDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundTimestamp(0L)
                .operationType("operationType")
                .operator(RangedDatePropertyOperation.Operator.IS_BETWEEN)
                .operatorName("operatorName")
                .propertyType(RangedDatePropertyOperation.PropertyType.DATETIME_RANGED)
                .requiresTimeZoneConversion(true)
                .upperBoundTimestamp(0L)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(rangedDatePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(rangedDatePropertyOperation.lowerBoundTimestamp()).isEqualTo(0L)
        assertThat(rangedDatePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(rangedDatePropertyOperation.operator())
            .isEqualTo(RangedDatePropertyOperation.Operator.IS_BETWEEN)
        assertThat(rangedDatePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(rangedDatePropertyOperation.propertyType())
            .isEqualTo(RangedDatePropertyOperation.PropertyType.DATETIME_RANGED)
        assertThat(rangedDatePropertyOperation.requiresTimeZoneConversion()).isEqualTo(true)
        assertThat(rangedDatePropertyOperation.upperBoundTimestamp()).isEqualTo(0L)
        assertThat(rangedDatePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(rangedDatePropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rangedDatePropertyOperation =
            RangedDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundTimestamp(0L)
                .operationType("operationType")
                .operator(RangedDatePropertyOperation.Operator.IS_BETWEEN)
                .operatorName("operatorName")
                .propertyType(RangedDatePropertyOperation.PropertyType.DATETIME_RANGED)
                .requiresTimeZoneConversion(true)
                .upperBoundTimestamp(0L)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedRangedDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rangedDatePropertyOperation),
                jacksonTypeRef<RangedDatePropertyOperation>(),
            )

        assertThat(roundtrippedRangedDatePropertyOperation).isEqualTo(rangedDatePropertyOperation)
    }
}
