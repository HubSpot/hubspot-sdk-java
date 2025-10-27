// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicRelativeRangedTimestampRefineByTest {

    @Test
    fun create() {
        val publicRelativeRangedTimestampRefineBy =
            PublicRelativeRangedTimestampRefineBy.builder()
                .lowerBoundOffset(
                    PublicTimeOffset.builder()
                        .amount(0L)
                        .offsetDirection("offsetDirection")
                        .timeUnit("timeUnit")
                        .build()
                )
                .rangeType("rangeType")
                .type(PublicRelativeRangedTimestampRefineBy.Type.RELATIVE_RANGED)
                .upperBoundOffset(
                    PublicTimeOffset.builder()
                        .amount(0L)
                        .offsetDirection("offsetDirection")
                        .timeUnit("timeUnit")
                        .build()
                )
                .build()

        assertThat(publicRelativeRangedTimestampRefineBy.lowerBoundOffset())
            .isEqualTo(
                PublicTimeOffset.builder()
                    .amount(0L)
                    .offsetDirection("offsetDirection")
                    .timeUnit("timeUnit")
                    .build()
            )
        assertThat(publicRelativeRangedTimestampRefineBy.rangeType()).isEqualTo("rangeType")
        assertThat(publicRelativeRangedTimestampRefineBy.type())
            .isEqualTo(PublicRelativeRangedTimestampRefineBy.Type.RELATIVE_RANGED)
        assertThat(publicRelativeRangedTimestampRefineBy.upperBoundOffset())
            .isEqualTo(
                PublicTimeOffset.builder()
                    .amount(0L)
                    .offsetDirection("offsetDirection")
                    .timeUnit("timeUnit")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicRelativeRangedTimestampRefineBy =
            PublicRelativeRangedTimestampRefineBy.builder()
                .lowerBoundOffset(
                    PublicTimeOffset.builder()
                        .amount(0L)
                        .offsetDirection("offsetDirection")
                        .timeUnit("timeUnit")
                        .build()
                )
                .rangeType("rangeType")
                .type(PublicRelativeRangedTimestampRefineBy.Type.RELATIVE_RANGED)
                .upperBoundOffset(
                    PublicTimeOffset.builder()
                        .amount(0L)
                        .offsetDirection("offsetDirection")
                        .timeUnit("timeUnit")
                        .build()
                )
                .build()

        val roundtrippedPublicRelativeRangedTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicRelativeRangedTimestampRefineBy),
                jacksonTypeRef<PublicRelativeRangedTimestampRefineBy>(),
            )

        assertThat(roundtrippedPublicRelativeRangedTimestampRefineBy)
            .isEqualTo(publicRelativeRangedTimestampRefineBy)
    }
}
