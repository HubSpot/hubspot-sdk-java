// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbsoluteComparativeTimestampRefineByTest {

    @Test
    fun create() {
        val absoluteComparativeTimestampRefineBy =
            AbsoluteComparativeTimestampRefineBy.builder()
                .comparison(AbsoluteComparativeTimestampRefineBy.Comparison.AFTER)
                .timestamp(0)
                .type(
                    AbsoluteComparativeTimestampRefineBy.Type
                        .ABSOLUTE_COMPARATIVE_TIMESTAMP_REFINE_BY
                )
                .build()

        assertThat(absoluteComparativeTimestampRefineBy.comparison())
            .isEqualTo(AbsoluteComparativeTimestampRefineBy.Comparison.AFTER)
        assertThat(absoluteComparativeTimestampRefineBy.timestamp()).isEqualTo(0)
        assertThat(absoluteComparativeTimestampRefineBy.type())
            .isEqualTo(
                AbsoluteComparativeTimestampRefineBy.Type.ABSOLUTE_COMPARATIVE_TIMESTAMP_REFINE_BY
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val absoluteComparativeTimestampRefineBy =
            AbsoluteComparativeTimestampRefineBy.builder()
                .comparison(AbsoluteComparativeTimestampRefineBy.Comparison.AFTER)
                .timestamp(0)
                .type(
                    AbsoluteComparativeTimestampRefineBy.Type
                        .ABSOLUTE_COMPARATIVE_TIMESTAMP_REFINE_BY
                )
                .build()

        val roundtrippedAbsoluteComparativeTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(absoluteComparativeTimestampRefineBy),
                jacksonTypeRef<AbsoluteComparativeTimestampRefineBy>(),
            )

        assertThat(roundtrippedAbsoluteComparativeTimestampRefineBy)
            .isEqualTo(absoluteComparativeTimestampRefineBy)
    }
}
