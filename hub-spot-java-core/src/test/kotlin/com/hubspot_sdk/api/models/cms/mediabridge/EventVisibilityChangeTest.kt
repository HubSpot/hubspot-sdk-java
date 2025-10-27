// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventVisibilityChangeTest {

    @Test
    fun create() {
        val eventVisibilityChange =
            EventVisibilityChange.builder()
                .eventType(EventVisibilityChange.EventType.ALL)
                .updatedAt(0L)
                .showInReporting(true)
                .showInTimeline(true)
                .showInWorkflows(true)
                .build()

        assertThat(eventVisibilityChange.eventType()).isEqualTo(EventVisibilityChange.EventType.ALL)
        assertThat(eventVisibilityChange.updatedAt()).isEqualTo(0L)
        assertThat(eventVisibilityChange.showInReporting()).contains(true)
        assertThat(eventVisibilityChange.showInTimeline()).contains(true)
        assertThat(eventVisibilityChange.showInWorkflows()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventVisibilityChange =
            EventVisibilityChange.builder()
                .eventType(EventVisibilityChange.EventType.ALL)
                .updatedAt(0L)
                .showInReporting(true)
                .showInTimeline(true)
                .showInWorkflows(true)
                .build()

        val roundtrippedEventVisibilityChange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventVisibilityChange),
                jacksonTypeRef<EventVisibilityChange>(),
            )

        assertThat(roundtrippedEventVisibilityChange).isEqualTo(eventVisibilityChange)
    }
}
