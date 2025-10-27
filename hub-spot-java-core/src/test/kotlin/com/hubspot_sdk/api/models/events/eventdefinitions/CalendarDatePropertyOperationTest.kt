// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarDatePropertyOperationTest {

    @Test
    fun create() {
        val calendarDatePropertyOperation =
            CalendarDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(CalendarDatePropertyOperation.Operator.IN_THIS_TIME_UNIT)
                .operatorName("operatorName")
                .propertyType(CalendarDatePropertyOperation.PropertyType.CALENDAR_DATE)
                .timeUnit(CalendarDatePropertyOperation.TimeUnit.DAY)
                .timeUnitCount(0)
                .useFiscalYear(true)
                .defaultValue("defaultValue")
                .fiscalYearStart(CalendarDatePropertyOperation.FiscalYearStart.JANUARY)
                .build()

        assertThat(calendarDatePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(calendarDatePropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(calendarDatePropertyOperation.operator())
            .isEqualTo(CalendarDatePropertyOperation.Operator.IN_THIS_TIME_UNIT)
        assertThat(calendarDatePropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(calendarDatePropertyOperation.propertyType())
            .isEqualTo(CalendarDatePropertyOperation.PropertyType.CALENDAR_DATE)
        assertThat(calendarDatePropertyOperation.timeUnit())
            .isEqualTo(CalendarDatePropertyOperation.TimeUnit.DAY)
        assertThat(calendarDatePropertyOperation.timeUnitCount()).isEqualTo(0)
        assertThat(calendarDatePropertyOperation.useFiscalYear()).isEqualTo(true)
        assertThat(calendarDatePropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(calendarDatePropertyOperation.fiscalYearStart())
            .contains(CalendarDatePropertyOperation.FiscalYearStart.JANUARY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarDatePropertyOperation =
            CalendarDatePropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(CalendarDatePropertyOperation.Operator.IN_THIS_TIME_UNIT)
                .operatorName("operatorName")
                .propertyType(CalendarDatePropertyOperation.PropertyType.CALENDAR_DATE)
                .timeUnit(CalendarDatePropertyOperation.TimeUnit.DAY)
                .timeUnitCount(0)
                .useFiscalYear(true)
                .defaultValue("defaultValue")
                .fiscalYearStart(CalendarDatePropertyOperation.FiscalYearStart.JANUARY)
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
