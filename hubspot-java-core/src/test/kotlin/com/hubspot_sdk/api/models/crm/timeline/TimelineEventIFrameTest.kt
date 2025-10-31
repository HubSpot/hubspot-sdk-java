// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimelineEventIFrameTest {

    @Test
    fun create() {
        val timelineEventIFrame =
            TimelineEventIFrame.builder()
                .headerLabel("Art3mis dog")
                .height(400)
                .linkLabel("View Art3mis")
                .url("https://my.petspot.com/pets/Art3mis")
                .width(600)
                .build()

        assertThat(timelineEventIFrame.headerLabel()).isEqualTo("Art3mis dog")
        assertThat(timelineEventIFrame.height()).isEqualTo(400)
        assertThat(timelineEventIFrame.linkLabel()).isEqualTo("View Art3mis")
        assertThat(timelineEventIFrame.url()).isEqualTo("https://my.petspot.com/pets/Art3mis")
        assertThat(timelineEventIFrame.width()).isEqualTo(600)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timelineEventIFrame =
            TimelineEventIFrame.builder()
                .headerLabel("Art3mis dog")
                .height(400)
                .linkLabel("View Art3mis")
                .url("https://my.petspot.com/pets/Art3mis")
                .width(600)
                .build()

        val roundtrippedTimelineEventIFrame =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timelineEventIFrame),
                jacksonTypeRef<TimelineEventIFrame>(),
            )

        assertThat(roundtrippedTimelineEventIFrame).isEqualTo(timelineEventIFrame)
    }
}
