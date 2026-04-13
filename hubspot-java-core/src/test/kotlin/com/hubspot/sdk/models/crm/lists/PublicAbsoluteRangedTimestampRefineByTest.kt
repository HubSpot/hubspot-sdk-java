// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAbsoluteRangedTimestampRefineByTest {

    @Test
    fun create() {
        val publicAbsoluteRangedTimestampRefineBy =
            PublicAbsoluteRangedTimestampRefineBy.builder()
                .lowerTimestamp(0L)
                .rangeType("rangeType")
                .type(PublicAbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED)
                .upperTimestamp(0L)
                .build()

        assertThat(publicAbsoluteRangedTimestampRefineBy.lowerTimestamp()).isEqualTo(0L)
        assertThat(publicAbsoluteRangedTimestampRefineBy.rangeType()).isEqualTo("rangeType")
        assertThat(publicAbsoluteRangedTimestampRefineBy.type())
            .isEqualTo(PublicAbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED)
        assertThat(publicAbsoluteRangedTimestampRefineBy.upperTimestamp()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAbsoluteRangedTimestampRefineBy =
            PublicAbsoluteRangedTimestampRefineBy.builder()
                .lowerTimestamp(0L)
                .rangeType("rangeType")
                .type(PublicAbsoluteRangedTimestampRefineBy.Type.ABSOLUTE_RANGED)
                .upperTimestamp(0L)
                .build()

        val roundtrippedPublicAbsoluteRangedTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAbsoluteRangedTimestampRefineBy),
                jacksonTypeRef<PublicAbsoluteRangedTimestampRefineBy>(),
            )

        assertThat(roundtrippedPublicAbsoluteRangedTimestampRefineBy)
            .isEqualTo(publicAbsoluteRangedTimestampRefineBy)
    }
}
