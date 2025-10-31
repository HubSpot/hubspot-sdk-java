// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicTimePointOperationTest {

    @Test
    fun create() {
        val publicTimePointOperation =
            PublicTimePointOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicTimePointOperation.OperationType.TIME_POINT)
                .operator("operator")
                .timePoint(
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
                .type("type")
                .endpointBehavior("endpointBehavior")
                .propertyParser("propertyParser")
                .build()

        assertThat(publicTimePointOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicTimePointOperation.operationType())
            .isEqualTo(PublicTimePointOperation.OperationType.TIME_POINT)
        assertThat(publicTimePointOperation.operator()).isEqualTo("operator")
        assertThat(publicTimePointOperation.timePoint())
            .isEqualTo(
                PublicTimePointOperation.TimePoint.ofPublicDate(
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
        assertThat(publicTimePointOperation.type()).isEqualTo("type")
        assertThat(publicTimePointOperation.endpointBehavior()).contains("endpointBehavior")
        assertThat(publicTimePointOperation.propertyParser()).contains("propertyParser")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicTimePointOperation =
            PublicTimePointOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicTimePointOperation.OperationType.TIME_POINT)
                .operator("operator")
                .timePoint(
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
                .type("type")
                .endpointBehavior("endpointBehavior")
                .propertyParser("propertyParser")
                .build()

        val roundtrippedPublicTimePointOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicTimePointOperation),
                jacksonTypeRef<PublicTimePointOperation>(),
            )

        assertThat(roundtrippedPublicTimePointOperation).isEqualTo(publicTimePointOperation)
    }
}
