// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicIndexedTimePointTest {

    @Test
    fun create() {
        val publicIndexedTimePoint =
            PublicIndexedTimePoint.builder()
                .indexReference(
                    PublicNowReference.builder()
                        .referenceType(PublicNowReference.ReferenceType.NOW)
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
                .timeType(PublicIndexedTimePoint.TimeType.INDEXED)
                .zoneId("zoneId")
                .offset(
                    PublicIndexOffset.builder()
                        .days(0)
                        .hours(0)
                        .milliseconds(0)
                        .minutes(0)
                        .months(0)
                        .quarters(0)
                        .seconds(0)
                        .weeks(0)
                        .years(0)
                        .build()
                )
                .timezoneSource("timezoneSource")
                .build()

        assertThat(publicIndexedTimePoint.indexReference())
            .isEqualTo(
                PublicIndexedTimePoint.IndexReference.ofPublicNow(
                    PublicNowReference.builder()
                        .referenceType(PublicNowReference.ReferenceType.NOW)
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
            )
        assertThat(publicIndexedTimePoint.timeType())
            .isEqualTo(PublicIndexedTimePoint.TimeType.INDEXED)
        assertThat(publicIndexedTimePoint.zoneId()).isEqualTo("zoneId")
        assertThat(publicIndexedTimePoint.offset())
            .contains(
                PublicIndexOffset.builder()
                    .days(0)
                    .hours(0)
                    .milliseconds(0)
                    .minutes(0)
                    .months(0)
                    .quarters(0)
                    .seconds(0)
                    .weeks(0)
                    .years(0)
                    .build()
            )
        assertThat(publicIndexedTimePoint.timezoneSource()).contains("timezoneSource")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicIndexedTimePoint =
            PublicIndexedTimePoint.builder()
                .indexReference(
                    PublicNowReference.builder()
                        .referenceType(PublicNowReference.ReferenceType.NOW)
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
                .timeType(PublicIndexedTimePoint.TimeType.INDEXED)
                .zoneId("zoneId")
                .offset(
                    PublicIndexOffset.builder()
                        .days(0)
                        .hours(0)
                        .milliseconds(0)
                        .minutes(0)
                        .months(0)
                        .quarters(0)
                        .seconds(0)
                        .weeks(0)
                        .years(0)
                        .build()
                )
                .timezoneSource("timezoneSource")
                .build()

        val roundtrippedPublicIndexedTimePoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicIndexedTimePoint),
                jacksonTypeRef<PublicIndexedTimePoint>(),
            )

        assertThat(roundtrippedPublicIndexedTimePoint).isEqualTo(publicIndexedTimePoint)
    }
}
