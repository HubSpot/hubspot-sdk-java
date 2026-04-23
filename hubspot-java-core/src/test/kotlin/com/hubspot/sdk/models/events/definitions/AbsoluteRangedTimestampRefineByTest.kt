// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbsoluteRangedTimestampRefineByTest {

    @Test
    fun create() {
        val absoluteRangedTimestampRefineBy =
            AbsoluteRangedTimestampRefineBy.builder()
                .lowerTimestamp(0L)
                .rangeType(AbsoluteRangedTimestampRefineBy.RangeType.BETWEEN)
                .type(AbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY)
                .upperTimestamp(0L)
                .build()

        assertThat(absoluteRangedTimestampRefineBy.lowerTimestamp()).isEqualTo(0L)
        assertThat(absoluteRangedTimestampRefineBy.rangeType())
            .isEqualTo(AbsoluteRangedTimestampRefineBy.RangeType.BETWEEN)
        assertThat(absoluteRangedTimestampRefineBy.type())
            .isEqualTo(AbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY)
        assertThat(absoluteRangedTimestampRefineBy.upperTimestamp()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val absoluteRangedTimestampRefineBy =
            AbsoluteRangedTimestampRefineBy.builder()
                .lowerTimestamp(0L)
                .rangeType(AbsoluteRangedTimestampRefineBy.RangeType.BETWEEN)
                .type(AbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY)
                .upperTimestamp(0L)
                .build()

        val roundtrippedAbsoluteRangedTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(absoluteRangedTimestampRefineBy),
                jacksonTypeRef<AbsoluteRangedTimestampRefineBy>(),
            )

        assertThat(roundtrippedAbsoluteRangedTimestampRefineBy)
            .isEqualTo(absoluteRangedTimestampRefineBy)
    }
}
