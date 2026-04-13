// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexedTimePointTest {

    @Test
    fun create() {
        val indexedTimePoint =
            IndexedTimePoint.builder()
                .indexReference(
                    NowReference.builder()
                        .referenceType(NowReference.ReferenceType.NOW)
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
                .timeType(IndexedTimePoint.TimeType.INDEXED)
                .timezoneSource(IndexedTimePoint.TimezoneSource.CUSTOM)
                .zoneId("zoneId")
                .offset(
                    IndexOffset.builder()
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
                .shouldGenerateRefreshTime(true)
                .build()

        assertThat(indexedTimePoint.indexReference())
            .isEqualTo(
                IndexedTimePoint.IndexReference.ofNow(
                    NowReference.builder()
                        .referenceType(NowReference.ReferenceType.NOW)
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
            )
        assertThat(indexedTimePoint.timeType()).isEqualTo(IndexedTimePoint.TimeType.INDEXED)
        assertThat(indexedTimePoint.timezoneSource())
            .isEqualTo(IndexedTimePoint.TimezoneSource.CUSTOM)
        assertThat(indexedTimePoint.zoneId()).isEqualTo("zoneId")
        assertThat(indexedTimePoint.offset())
            .contains(
                IndexOffset.builder()
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
        assertThat(indexedTimePoint.shouldGenerateRefreshTime()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexedTimePoint =
            IndexedTimePoint.builder()
                .indexReference(
                    NowReference.builder()
                        .referenceType(NowReference.ReferenceType.NOW)
                        .hour(0)
                        .millisecond(0)
                        .minute(0)
                        .second(0)
                        .build()
                )
                .timeType(IndexedTimePoint.TimeType.INDEXED)
                .timezoneSource(IndexedTimePoint.TimezoneSource.CUSTOM)
                .zoneId("zoneId")
                .offset(
                    IndexOffset.builder()
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
                .shouldGenerateRefreshTime(true)
                .build()

        val roundtrippedIndexedTimePoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexedTimePoint),
                jacksonTypeRef<IndexedTimePoint>(),
            )

        assertThat(roundtrippedIndexedTimePoint).isEqualTo(indexedTimePoint)
    }
}
