// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

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
                    RangedTimeOperation.LowerBoundEndpointBehavior.EXCLUSIVE
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
                .propertyParser(RangedTimeOperation.PropertyParser.ANNIVERSARY)
                .propertyType(RangedTimeOperation.PropertyType.RANGEDTIME)
                .type("type")
                .upperBoundEndpointBehavior(
                    RangedTimeOperation.UpperBoundEndpointBehavior.EXCLUSIVE
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
                .renderSpec("renderSpec")
                .build()

        assertThat(rangedTimeOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(rangedTimeOperation.lowerBoundEndpointBehavior())
            .isEqualTo(RangedTimeOperation.LowerBoundEndpointBehavior.EXCLUSIVE)
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
            .isEqualTo(RangedTimeOperation.PropertyParser.ANNIVERSARY)
        assertThat(rangedTimeOperation.propertyType())
            .isEqualTo(RangedTimeOperation.PropertyType.RANGEDTIME)
        assertThat(rangedTimeOperation.type()).isEqualTo("type")
        assertThat(rangedTimeOperation.upperBoundEndpointBehavior())
            .isEqualTo(RangedTimeOperation.UpperBoundEndpointBehavior.EXCLUSIVE)
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
        assertThat(rangedTimeOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rangedTimeOperation =
            RangedTimeOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundEndpointBehavior(
                    RangedTimeOperation.LowerBoundEndpointBehavior.EXCLUSIVE
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
                .propertyParser(RangedTimeOperation.PropertyParser.ANNIVERSARY)
                .propertyType(RangedTimeOperation.PropertyType.RANGEDTIME)
                .type("type")
                .upperBoundEndpointBehavior(
                    RangedTimeOperation.UpperBoundEndpointBehavior.EXCLUSIVE
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
                .renderSpec("renderSpec")
                .build()

        val roundtrippedRangedTimeOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rangedTimeOperation),
                jacksonTypeRef<RangedTimeOperation>(),
            )

        assertThat(roundtrippedRangedTimeOperation).isEqualTo(rangedTimeOperation)
    }
}
