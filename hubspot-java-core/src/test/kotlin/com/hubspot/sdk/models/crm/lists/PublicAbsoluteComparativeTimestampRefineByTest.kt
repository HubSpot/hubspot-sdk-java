// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAbsoluteComparativeTimestampRefineByTest {

    @Test
    fun create() {
        val publicAbsoluteComparativeTimestampRefineBy =
            PublicAbsoluteComparativeTimestampRefineBy.builder()
                .comparison("comparison")
                .timestamp(0L)
                .type(PublicAbsoluteComparativeTimestampRefineBy.Type.ABSOLUTE_COMPARATIVE)
                .build()

        assertThat(publicAbsoluteComparativeTimestampRefineBy.comparison()).isEqualTo("comparison")
        assertThat(publicAbsoluteComparativeTimestampRefineBy.timestamp()).isEqualTo(0L)
        assertThat(publicAbsoluteComparativeTimestampRefineBy.type())
            .isEqualTo(PublicAbsoluteComparativeTimestampRefineBy.Type.ABSOLUTE_COMPARATIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAbsoluteComparativeTimestampRefineBy =
            PublicAbsoluteComparativeTimestampRefineBy.builder()
                .comparison("comparison")
                .timestamp(0L)
                .type(PublicAbsoluteComparativeTimestampRefineBy.Type.ABSOLUTE_COMPARATIVE)
                .build()

        val roundtrippedPublicAbsoluteComparativeTimestampRefineBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAbsoluteComparativeTimestampRefineBy),
                jacksonTypeRef<PublicAbsoluteComparativeTimestampRefineBy>(),
            )

        assertThat(roundtrippedPublicAbsoluteComparativeTimestampRefineBy)
            .isEqualTo(publicAbsoluteComparativeTimestampRefineBy)
    }
}
