// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbsoluteRangedTimestampRefineByTest {

    @Test
    fun create() {
        val absoluteRangedTimestampRefineBy =
            AbsoluteRangedTimestampRefineBy.builder()
                .lowerTimestamp(0)
                .rangeType(AbsoluteRangedTimestampRefineBy.RangeType.BETWEEN)
                .type(AbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY)
                .upperTimestamp(0)
                .build()

        assertThat(absoluteRangedTimestampRefineBy.lowerTimestamp()).isEqualTo(0)
        assertThat(absoluteRangedTimestampRefineBy.rangeType())
            .isEqualTo(AbsoluteRangedTimestampRefineBy.RangeType.BETWEEN)
        assertThat(absoluteRangedTimestampRefineBy.type())
            .isEqualTo(AbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY)
        assertThat(absoluteRangedTimestampRefineBy.upperTimestamp()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val absoluteRangedTimestampRefineBy =
            AbsoluteRangedTimestampRefineBy.builder()
                .lowerTimestamp(0)
                .rangeType(AbsoluteRangedTimestampRefineBy.RangeType.BETWEEN)
                .type(AbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED_TIMESTAMP_REFINE_BY)
                .upperTimestamp(0)
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
