// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RelativeRangedTimestampRefineByTest {

    @Test
    fun create() {
        val relativeRangedTimestampRefineBy =
            RelativeRangedTimestampRefineBy.builder()
                .lowerBoundOffset(
                    TimeOffset.builder()
                        .amount(0)
                        .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                        .timeUnit(TimeOffset.TimeUnit.DAYS)
                        .build()
                )
                .rangeType(RelativeRangedTimestampRefineBy.RangeType.BETWEEN)
                .type(RelativeRangedTimestampRefineBy.Type.RELATIVE_RANGED_TIMESTAMP_REFINE_BY)
                .upperBoundOffset(
                    TimeOffset.builder()
                        .amount(0)
                        .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                        .timeUnit(TimeOffset.TimeUnit.DAYS)
                        .build()
                )
                .build()

        assertThat(relativeRangedTimestampRefineBy.lowerBoundOffset())
            .isEqualTo(
                TimeOffset.builder()
                    .amount(0)
                    .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                    .timeUnit(TimeOffset.TimeUnit.DAYS)
                    .build()
            )
        assertThat(relativeRangedTimestampRefineBy.rangeType())
            .isEqualTo(RelativeRangedTimestampRefineBy.RangeType.BETWEEN)
        assertThat(relativeRangedTimestampRefineBy.type())
            .isEqualTo(RelativeRangedTimestampRefineBy.Type.RELATIVE_RANGED_TIMESTAMP_REFINE_BY)
        assertThat(relativeRangedTimestampRefineBy.upperBoundOffset())
            .isEqualTo(
                TimeOffset.builder()
                    .amount(0)
                    .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                    .timeUnit(TimeOffset.TimeUnit.DAYS)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val relativeRangedTimestampRefineBy =
            RelativeRangedTimestampRefineBy.builder()
                .lowerBoundOffset(
                    TimeOffset.builder()
                        .amount(0)
                        .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                        .timeUnit(TimeOffset.TimeUnit.DAYS)
                        .build()
                )
                .rangeType(RelativeRangedTimestampRefineBy.RangeType.BETWEEN)
                .type(RelativeRangedTimestampRefineBy.Type.RELATIVE_RANGED_TIMESTAMP_REFINE_BY)
                .upperBoundOffset(
                    TimeOffset.builder()
                        .amount(0)
                        .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                        .timeUnit(TimeOffset.TimeUnit.DAYS)
                        .build()
                )
                .build()

        val roundtrippedRelativeRangedTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(relativeRangedTimestampRefineBy),
                jacksonTypeRef<RelativeRangedTimestampRefineBy>(),
            )

        assertThat(roundtrippedRelativeRangedTimestampRefineBy)
            .isEqualTo(relativeRangedTimestampRefineBy)
    }
}
