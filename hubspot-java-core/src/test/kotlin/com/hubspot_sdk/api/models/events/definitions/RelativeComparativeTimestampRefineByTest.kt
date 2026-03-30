// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RelativeComparativeTimestampRefineByTest {

    @Test
    fun create() {
        val relativeComparativeTimestampRefineBy =
            RelativeComparativeTimestampRefineBy.builder()
                .comparison(RelativeComparativeTimestampRefineBy.Comparison.AFTER)
                .timeOffset(
                    TimeOffset.builder()
                        .amount(0)
                        .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                        .timeUnit(TimeOffset.TimeUnit.DAYS)
                        .build()
                )
                .type(
                    RelativeComparativeTimestampRefineBy.Type
                        .RELATIVE_COMPARATIVE_TIMESTAMP_REFINE_BY
                )
                .build()

        assertThat(relativeComparativeTimestampRefineBy.comparison())
            .isEqualTo(RelativeComparativeTimestampRefineBy.Comparison.AFTER)
        assertThat(relativeComparativeTimestampRefineBy.timeOffset())
            .isEqualTo(
                TimeOffset.builder()
                    .amount(0)
                    .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                    .timeUnit(TimeOffset.TimeUnit.DAYS)
                    .build()
            )
        assertThat(relativeComparativeTimestampRefineBy.type())
            .isEqualTo(
                RelativeComparativeTimestampRefineBy.Type.RELATIVE_COMPARATIVE_TIMESTAMP_REFINE_BY
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val relativeComparativeTimestampRefineBy =
            RelativeComparativeTimestampRefineBy.builder()
                .comparison(RelativeComparativeTimestampRefineBy.Comparison.AFTER)
                .timeOffset(
                    TimeOffset.builder()
                        .amount(0)
                        .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                        .timeUnit(TimeOffset.TimeUnit.DAYS)
                        .build()
                )
                .type(
                    RelativeComparativeTimestampRefineBy.Type
                        .RELATIVE_COMPARATIVE_TIMESTAMP_REFINE_BY
                )
                .build()

        val roundtrippedRelativeComparativeTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(relativeComparativeTimestampRefineBy),
                jacksonTypeRef<RelativeComparativeTimestampRefineBy>(),
            )

        assertThat(roundtrippedRelativeComparativeTimestampRefineBy)
            .isEqualTo(relativeComparativeTimestampRefineBy)
    }
}
