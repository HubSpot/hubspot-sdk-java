// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarDatePropertyOperationTest {

    @Test
    fun create() {
        val calendarDatePropertyOperation =
            CalendarDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(CalendarDatePropertyOperation.Operator.IN_LAST_TIME_UNIT)
                .operatorName("operatorName")
                .propertyType(CalendarDatePropertyOperation.PropertyType.CALENDAR_DATE)
                .timeUnit(CalendarDatePropertyOperation.TimeUnit.DAY)
                .timeUnitCount(0)
                .useFiscalYear(true)
                .defaultValue("defaultValue")
                .fiscalYearStart(CalendarDatePropertyOperation.FiscalYearStart.APRIL)
                .renderSpec("renderSpec")
                .build()

        assertThat(calendarDatePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(calendarDatePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(calendarDatePropertyOperation.operator())
            .isEqualTo(CalendarDatePropertyOperation.Operator.IN_LAST_TIME_UNIT)
        assertThat(calendarDatePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(calendarDatePropertyOperation.propertyType())
            .isEqualTo(CalendarDatePropertyOperation.PropertyType.CALENDAR_DATE)
        assertThat(calendarDatePropertyOperation.timeUnit())
            .isEqualTo(CalendarDatePropertyOperation.TimeUnit.DAY)
        assertThat(calendarDatePropertyOperation.timeUnitCount()).isEqualTo(0)
        assertThat(calendarDatePropertyOperation.useFiscalYear()).isEqualTo(true)
        assertThat(calendarDatePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(calendarDatePropertyOperation.fiscalYearStart())
            .contains(CalendarDatePropertyOperation.FiscalYearStart.APRIL)
        assertThat(calendarDatePropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarDatePropertyOperation =
            CalendarDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(CalendarDatePropertyOperation.Operator.IN_LAST_TIME_UNIT)
                .operatorName("operatorName")
                .propertyType(CalendarDatePropertyOperation.PropertyType.CALENDAR_DATE)
                .timeUnit(CalendarDatePropertyOperation.TimeUnit.DAY)
                .timeUnitCount(0)
                .useFiscalYear(true)
                .defaultValue("defaultValue")
                .fiscalYearStart(CalendarDatePropertyOperation.FiscalYearStart.APRIL)
                .renderSpec("renderSpec")
                .build()

        val roundtrippedCalendarDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarDatePropertyOperation),
                jacksonTypeRef<CalendarDatePropertyOperation>(),
            )

        assertThat(roundtrippedCalendarDatePropertyOperation)
            .isEqualTo(calendarDatePropertyOperation)
    }
}
