// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RollingDateRangePropertyOperationTest {

    @Test
    fun create() {
        val rollingDateRangePropertyOperation =
            RollingDateRangePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType("operationType")
                .operator(RollingDateRangePropertyOperation.Operator.IS_LESS_THAN_X_DAYS_AGO)
                .operatorName("operatorName")
                .propertyType(RollingDateRangePropertyOperation.PropertyType.DATETIME_ROLLING)
                .requiresTimeZoneConversion(true)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        assertThat(rollingDateRangePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(rollingDateRangePropertyOperation.numberOfDays()).isEqualTo(0)
        assertThat(rollingDateRangePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(rollingDateRangePropertyOperation.operator())
            .isEqualTo(RollingDateRangePropertyOperation.Operator.IS_LESS_THAN_X_DAYS_AGO)
        assertThat(rollingDateRangePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(rollingDateRangePropertyOperation.propertyType())
            .isEqualTo(RollingDateRangePropertyOperation.PropertyType.DATETIME_ROLLING)
        assertThat(rollingDateRangePropertyOperation.requiresTimeZoneConversion()).isEqualTo(true)
        assertThat(rollingDateRangePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(rollingDateRangePropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rollingDateRangePropertyOperation =
            RollingDateRangePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType("operationType")
                .operator(RollingDateRangePropertyOperation.Operator.IS_LESS_THAN_X_DAYS_AGO)
                .operatorName("operatorName")
                .propertyType(RollingDateRangePropertyOperation.PropertyType.DATETIME_ROLLING)
                .requiresTimeZoneConversion(true)
                .defaultValue("defaultValue")
                .renderSpec("renderSpec")
                .build()

        val roundtrippedRollingDateRangePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rollingDateRangePropertyOperation),
                jacksonTypeRef<RollingDateRangePropertyOperation>(),
            )

        assertThat(roundtrippedRollingDateRangePropertyOperation)
            .isEqualTo(rollingDateRangePropertyOperation)
    }
}
