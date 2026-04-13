// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventIFrameTest {

    @Test
    fun create() {
        val timelineEventIFrame =
            TimelineEventIFrame.builder()
                .headerLabel("headerLabel")
                .height(0)
                .linkLabel("linkLabel")
                .url("url")
                .width(0)
                .build()

        assertThat(timelineEventIFrame.headerLabel()).isEqualTo("headerLabel")
        assertThat(timelineEventIFrame.height()).isEqualTo(0)
        assertThat(timelineEventIFrame.linkLabel()).isEqualTo("linkLabel")
        assertThat(timelineEventIFrame.url()).isEqualTo("url")
        assertThat(timelineEventIFrame.width()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventIFrame =
            TimelineEventIFrame.builder()
                .headerLabel("headerLabel")
                .height(0)
                .linkLabel("linkLabel")
                .url("url")
                .width(0)
                .build()

        val roundtrippedTimelineEventIFrame =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventIFrame),
                jacksonTypeRef<TimelineEventIFrame>(),
            )

        assertThat(roundtrippedTimelineEventIFrame).isEqualTo(timelineEventIFrame)
    }
}
