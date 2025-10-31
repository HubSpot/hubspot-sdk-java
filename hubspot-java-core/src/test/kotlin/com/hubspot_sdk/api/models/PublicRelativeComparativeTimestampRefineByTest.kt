// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRelativeComparativeTimestampRefineByTest {

    @Test
    fun create() {
        val publicRelativeComparativeTimestampRefineBy =
            PublicRelativeComparativeTimestampRefineBy.builder()
                .comparison("comparison")
                .timeOffset(
                    PublicTimeOffset.builder()
                        .amount(0L)
                        .offsetDirection("offsetDirection")
                        .timeUnit("timeUnit")
                        .build()
                )
                .type(PublicRelativeComparativeTimestampRefineBy.Type.RELATIVE_COMPARATIVE)
                .build()

        assertThat(publicRelativeComparativeTimestampRefineBy.comparison()).isEqualTo("comparison")
        assertThat(publicRelativeComparativeTimestampRefineBy.timeOffset())
            .isEqualTo(
                PublicTimeOffset.builder()
                    .amount(0L)
                    .offsetDirection("offsetDirection")
                    .timeUnit("timeUnit")
                    .build()
            )
        assertThat(publicRelativeComparativeTimestampRefineBy.type())
            .isEqualTo(PublicRelativeComparativeTimestampRefineBy.Type.RELATIVE_COMPARATIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRelativeComparativeTimestampRefineBy =
            PublicRelativeComparativeTimestampRefineBy.builder()
                .comparison("comparison")
                .timeOffset(
                    PublicTimeOffset.builder()
                        .amount(0L)
                        .offsetDirection("offsetDirection")
                        .timeUnit("timeUnit")
                        .build()
                )
                .type(PublicRelativeComparativeTimestampRefineBy.Type.RELATIVE_COMPARATIVE)
                .build()

        val roundtrippedPublicRelativeComparativeTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRelativeComparativeTimestampRefineBy),
                jacksonTypeRef<PublicRelativeComparativeTimestampRefineBy>(),
            )

        assertThat(roundtrippedPublicRelativeComparativeTimestampRefineBy)
            .isEqualTo(publicRelativeComparativeTimestampRefineBy)
    }
}
