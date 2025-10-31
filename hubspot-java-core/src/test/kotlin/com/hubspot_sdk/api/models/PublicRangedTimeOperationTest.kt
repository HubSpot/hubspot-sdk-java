// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRangedTimeOperationTest {

    @Test
    fun create() {
        val publicRangedTimeOperation =
            PublicRangedTimeOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundTimePoint(
                    PublicDatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(PublicDatePoint.TimeType.DATE)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .timezoneSource("timezoneSource")
                        .build()
                )
                .operationType("operationType")
                .operator("operator")
                .type(PublicRangedTimeOperation.Type.TIME_RANGED)
                .upperBoundTimePoint(
                    PublicDatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(PublicDatePoint.TimeType.DATE)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .timezoneSource("timezoneSource")
                        .build()
                )
                .lowerBoundEndpointBehavior("lowerBoundEndpointBehavior")
                .propertyParser("propertyParser")
                .upperBoundEndpointBehavior("upperBoundEndpointBehavior")
                .build()

        assertThat(publicRangedTimeOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicRangedTimeOperation.lowerBoundTimePoint())
            .isEqualTo(
                PublicRangedTimeOperation.LowerBoundTimePoint.ofPublicDate(
                    PublicDatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(PublicDatePoint.TimeType.DATE)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .timezoneSource("timezoneSource")
                        .build()
                )
            )
        assertThat(publicRangedTimeOperation.operationType()).isEqualTo("operationType")
        assertThat(publicRangedTimeOperation.operator()).isEqualTo("operator")
        assertThat(publicRangedTimeOperation.type())
            .isEqualTo(PublicRangedTimeOperation.Type.TIME_RANGED)
        assertThat(publicRangedTimeOperation.upperBoundTimePoint())
            .isEqualTo(
                PublicRangedTimeOperation.UpperBoundTimePoint.ofPublicDate(
                    PublicDatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(PublicDatePoint.TimeType.DATE)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .timezoneSource("timezoneSource")
                        .build()
                )
            )
        assertThat(publicRangedTimeOperation.lowerBoundEndpointBehavior())
            .contains("lowerBoundEndpointBehavior")
        assertThat(publicRangedTimeOperation.propertyParser()).contains("propertyParser")
        assertThat(publicRangedTimeOperation.upperBoundEndpointBehavior())
            .contains("upperBoundEndpointBehavior")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRangedTimeOperation =
            PublicRangedTimeOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .lowerBoundTimePoint(
                    PublicDatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(PublicDatePoint.TimeType.DATE)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .timezoneSource("timezoneSource")
                        .build()
                )
                .operationType("operationType")
                .operator("operator")
                .type(PublicRangedTimeOperation.Type.TIME_RANGED)
                .upperBoundTimePoint(
                    PublicDatePoint.builder()
                        .day(0)
                        .month(0)
                        .timeType(PublicDatePoint.TimeType.DATE)
                        .year(0)
                        .zoneId("zoneId")
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .timezoneSource("timezoneSource")
                        .build()
                )
                .lowerBoundEndpointBehavior("lowerBoundEndpointBehavior")
                .propertyParser("propertyParser")
                .upperBoundEndpointBehavior("upperBoundEndpointBehavior")
                .build()

        val roundtrippedPublicRangedTimeOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRangedTimeOperation),
                jacksonTypeRef<PublicRangedTimeOperation>(),
            )

        assertThat(roundtrippedPublicRangedTimeOperation).isEqualTo(publicRangedTimeOperation)
    }
}
