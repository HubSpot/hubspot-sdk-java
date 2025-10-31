// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimePointOperationTest {

    @Test
    fun create() {
        val timePointOperation =
            TimePointOperation.builder()
                .endpointBehavior(TimePointOperation.EndpointBehavior.INCLUSIVE)
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(TimePointOperation.Operator.IS_BEFORE)
                .operatorName("operatorName")
                .propertyParser(TimePointOperation.PropertyParser.VALUE)
                .propertyType(TimePointOperation.PropertyType.TIMEPOINT)
                .timePoint(
                    DatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(DatePoint.TimeType.DATE)
                        .timezoneSource(DatePoint.TimezoneSource.CUSTOM)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
                .type("type")
                .defaultValue("defaultValue")
                .build()

        assertThat(timePointOperation.endpointBehavior())
            .isEqualTo(TimePointOperation.EndpointBehavior.INCLUSIVE)
        assertThat(timePointOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(timePointOperation.operationType()).isEqualTo("operationType")
        assertThat(timePointOperation.operator()).isEqualTo(TimePointOperation.Operator.IS_BEFORE)
        assertThat(timePointOperation.operatorName()).isEqualTo("operatorName")
        assertThat(timePointOperation.propertyParser())
            .isEqualTo(TimePointOperation.PropertyParser.VALUE)
        assertThat(timePointOperation.propertyType())
            .isEqualTo(TimePointOperation.PropertyType.TIMEPOINT)
        assertThat(timePointOperation.timePoint())
            .isEqualTo(
                TimePointOperation.TimePoint.ofDate(
                    DatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(DatePoint.TimeType.DATE)
                        .timezoneSource(DatePoint.TimezoneSource.CUSTOM)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
            )
        assertThat(timePointOperation.type()).isEqualTo("type")
        assertThat(timePointOperation.defaultValue()).contains("defaultValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timePointOperation =
            TimePointOperation.builder()
                .endpointBehavior(TimePointOperation.EndpointBehavior.INCLUSIVE)
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(TimePointOperation.Operator.IS_BEFORE)
                .operatorName("operatorName")
                .propertyParser(TimePointOperation.PropertyParser.VALUE)
                .propertyType(TimePointOperation.PropertyType.TIMEPOINT)
                .timePoint(
                    DatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(DatePoint.TimeType.DATE)
                        .timezoneSource(DatePoint.TimezoneSource.CUSTOM)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
                .type("type")
                .defaultValue("defaultValue")
                .build()

        val roundtrippedTimePointOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timePointOperation),
                jacksonTypeRef<TimePointOperation>(),
            )

        assertThat(roundtrippedTimePointOperation).isEqualTo(timePointOperation)
    }
}
