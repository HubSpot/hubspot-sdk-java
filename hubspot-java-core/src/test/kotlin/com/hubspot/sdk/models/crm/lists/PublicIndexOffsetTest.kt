// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicIndexOffsetTest {

    @Test
    fun create() {
        val publicIndexOffset =
            PublicIndexOffset.builder()
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

        assertThat(publicIndexOffset.days()).contains(0)
        assertThat(publicIndexOffset.hours()).contains(0)
        assertThat(publicIndexOffset.milliseconds()).contains(0)
        assertThat(publicIndexOffset.minutes()).contains(0)
        assertThat(publicIndexOffset.months()).contains(0)
        assertThat(publicIndexOffset.quarters()).contains(0)
        assertThat(publicIndexOffset.seconds()).contains(0)
        assertThat(publicIndexOffset.weeks()).contains(0)
        assertThat(publicIndexOffset.years()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicIndexOffset =
            PublicIndexOffset.builder()
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

        val roundtrippedPublicIndexOffset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicIndexOffset),
                jacksonTypeRef<PublicIndexOffset>(),
            )

        assertThat(roundtrippedPublicIndexOffset).isEqualTo(publicIndexOffset)
    }
}
