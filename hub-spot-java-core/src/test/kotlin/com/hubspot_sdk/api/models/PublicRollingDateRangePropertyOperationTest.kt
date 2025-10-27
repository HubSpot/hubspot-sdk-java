// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRollingDateRangePropertyOperationTest {

    @Test
    fun create() {
        val publicRollingDateRangePropertyOperation =
            PublicRollingDateRangePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType(
                    PublicRollingDateRangePropertyOperation.OperationType.ROLLING_DATE_RANGE
                )
                .operator("operator")
                .requiresTimeZoneConversion(true)
                .build()

        assertThat(publicRollingDateRangePropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicRollingDateRangePropertyOperation.numberOfDays()).isEqualTo(0)
        assertThat(publicRollingDateRangePropertyOperation.operationType())
            .isEqualTo(PublicRollingDateRangePropertyOperation.OperationType.ROLLING_DATE_RANGE)
        assertThat(publicRollingDateRangePropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicRollingDateRangePropertyOperation.requiresTimeZoneConversion())
            .isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRollingDateRangePropertyOperation =
            PublicRollingDateRangePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .numberOfDays(0)
                .operationType(
                    PublicRollingDateRangePropertyOperation.OperationType.ROLLING_DATE_RANGE
                )
                .operator("operator")
                .requiresTimeZoneConversion(true)
                .build()

        val roundtrippedPublicRollingDateRangePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRollingDateRangePropertyOperation),
                jacksonTypeRef<PublicRollingDateRangePropertyOperation>(),
            )

        assertThat(roundtrippedPublicRollingDateRangePropertyOperation)
            .isEqualTo(publicRollingDateRangePropertyOperation)
    }
}
