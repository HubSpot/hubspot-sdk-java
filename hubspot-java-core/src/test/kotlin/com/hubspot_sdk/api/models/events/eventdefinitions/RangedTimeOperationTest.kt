// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RangedTimeOperationTest {

    @Test
    fun create() {
        val rangedTimeOperation =
            RangedTimeOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundEndpointBehavior(
                    RangedTimeOperation.LowerBoundEndpointBehavior.INCLUSIVE
                )
                .lowerBoundTimePoint(
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
                .operationType("operationType")
                .operator(RangedTimeOperation.Operator.IS_BETWEEN)
                .operatorName("operatorName")
                .propertyParser(RangedTimeOperation.PropertyParser.VALUE)
                .propertyType(RangedTimeOperation.PropertyType.RANGEDTIME)
                .type("type")
                .upperBoundEndpointBehavior(
                    RangedTimeOperation.UpperBoundEndpointBehavior.INCLUSIVE
                )
                .upperBoundTimePoint(
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
                .defaultValue("defaultValue")
                .build()

        assertThat(rangedTimeOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(rangedTimeOperation.lowerBoundEndpointBehavior())
            .isEqualTo(RangedTimeOperation.LowerBoundEndpointBehavior.INCLUSIVE)
        assertThat(rangedTimeOperation.lowerBoundTimePoint())
            .isEqualTo(
                RangedTimeOperation.LowerBoundTimePoint.ofDate(
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
        assertThat(rangedTimeOperation.operationType()).isEqualTo("operationType")
        assertThat(rangedTimeOperation.operator())
            .isEqualTo(RangedTimeOperation.Operator.IS_BETWEEN)
        assertThat(rangedTimeOperation.operatorName()).isEqualTo("operatorName")
        assertThat(rangedTimeOperation.propertyParser())
            .isEqualTo(RangedTimeOperation.PropertyParser.VALUE)
        assertThat(rangedTimeOperation.propertyType())
            .isEqualTo(RangedTimeOperation.PropertyType.RANGEDTIME)
        assertThat(rangedTimeOperation.type()).isEqualTo("type")
        assertThat(rangedTimeOperation.upperBoundEndpointBehavior())
            .isEqualTo(RangedTimeOperation.UpperBoundEndpointBehavior.INCLUSIVE)
        assertThat(rangedTimeOperation.upperBoundTimePoint())
            .isEqualTo(
                RangedTimeOperation.UpperBoundTimePoint.ofDate(
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
        assertThat(rangedTimeOperation.defaultValue()).contains("defaultValue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rangedTimeOperation =
            RangedTimeOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundEndpointBehavior(
                    RangedTimeOperation.LowerBoundEndpointBehavior.INCLUSIVE
                )
                .lowerBoundTimePoint(
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
                .operationType("operationType")
                .operator(RangedTimeOperation.Operator.IS_BETWEEN)
                .operatorName("operatorName")
                .propertyParser(RangedTimeOperation.PropertyParser.VALUE)
                .propertyType(RangedTimeOperation.PropertyType.RANGEDTIME)
                .type("type")
                .upperBoundEndpointBehavior(
                    RangedTimeOperation.UpperBoundEndpointBehavior.INCLUSIVE
                )
                .upperBoundTimePoint(
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
                .defaultValue("defaultValue")
                .build()

        val roundtrippedRangedTimeOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rangedTimeOperation),
                jacksonTypeRef<RangedTimeOperation>(),
            )

        assertThat(roundtrippedRangedTimeOperation).isEqualTo(rangedTimeOperation)
    }
}
