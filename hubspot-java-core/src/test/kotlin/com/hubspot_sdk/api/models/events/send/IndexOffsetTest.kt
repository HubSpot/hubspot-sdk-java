// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexOffsetTest {

    @Test
    fun create() {
        val indexOffset =
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

        assertThat(indexOffset.days()).contains(0)
        assertThat(indexOffset.hours()).contains(0)
        assertThat(indexOffset.milliseconds()).contains(0)
        assertThat(indexOffset.minutes()).contains(0)
        assertThat(indexOffset.months()).contains(0)
        assertThat(indexOffset.quarters()).contains(0)
        assertThat(indexOffset.seconds()).contains(0)
        assertThat(indexOffset.weeks()).contains(0)
        assertThat(indexOffset.years()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexOffset =
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

        val roundtrippedIndexOffset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexOffset),
                jacksonTypeRef<IndexOffset>(),
            )

        assertThat(roundtrippedIndexOffset).isEqualTo(indexOffset)
    }
}
