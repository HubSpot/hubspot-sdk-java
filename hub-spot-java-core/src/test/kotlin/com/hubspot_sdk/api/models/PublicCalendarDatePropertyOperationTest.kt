// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCalendarDatePropertyOperationTest {

    @Test
    fun create() {
        val publicCalendarDatePropertyOperation =
            PublicCalendarDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicCalendarDatePropertyOperation.OperationType.CALENDAR_DATE)
                .operator("operator")
                .timeUnit("timeUnit")
                .fiscalYearStart(PublicCalendarDatePropertyOperation.FiscalYearStart.JANUARY)
                .timeUnitCount(0)
                .useFiscalYear(true)
                .build()

        assertThat(publicCalendarDatePropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicCalendarDatePropertyOperation.operationType())
            .isEqualTo(PublicCalendarDatePropertyOperation.OperationType.CALENDAR_DATE)
        assertThat(publicCalendarDatePropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicCalendarDatePropertyOperation.timeUnit()).isEqualTo("timeUnit")
        assertThat(publicCalendarDatePropertyOperation.fiscalYearStart())
            .contains(PublicCalendarDatePropertyOperation.FiscalYearStart.JANUARY)
        assertThat(publicCalendarDatePropertyOperation.timeUnitCount()).contains(0)
        assertThat(publicCalendarDatePropertyOperation.useFiscalYear()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCalendarDatePropertyOperation =
            PublicCalendarDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicCalendarDatePropertyOperation.OperationType.CALENDAR_DATE)
                .operator("operator")
                .timeUnit("timeUnit")
                .fiscalYearStart(PublicCalendarDatePropertyOperation.FiscalYearStart.JANUARY)
                .timeUnitCount(0)
                .useFiscalYear(true)
                .build()

        val roundtrippedPublicCalendarDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCalendarDatePropertyOperation),
                jacksonTypeRef<PublicCalendarDatePropertyOperation>(),
            )

        assertThat(roundtrippedPublicCalendarDatePropertyOperation)
            .isEqualTo(publicCalendarDatePropertyOperation)
    }
}
