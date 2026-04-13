// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventVisibilityResponseTest {

    @Test
    fun create() {
        val eventVisibilityResponse =
            EventVisibilityResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVisibilitySetting(
                    EventVisibilityChange.builder()
                        .eventType(EventVisibilityChange.EventType.ALL)
                        .updatedAt(0L)
                        .showInReporting(true)
                        .showInTimeline(true)
                        .showInWorkflows(true)
                        .build()
                )
                .build()

        assertThat(eventVisibilityResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventVisibilityResponse.visibilitySettings())
            .containsExactly(
                EventVisibilityChange.builder()
                    .eventType(EventVisibilityChange.EventType.ALL)
                    .updatedAt(0L)
                    .showInReporting(true)
                    .showInTimeline(true)
                    .showInWorkflows(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventVisibilityResponse =
            EventVisibilityResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVisibilitySetting(
                    EventVisibilityChange.builder()
                        .eventType(EventVisibilityChange.EventType.ALL)
                        .updatedAt(0L)
                        .showInReporting(true)
                        .showInTimeline(true)
                        .showInWorkflows(true)
                        .build()
                )
                .build()

        val roundtrippedEventVisibilityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventVisibilityResponse),
                jacksonTypeRef<EventVisibilityResponse>(),
            )

        assertThat(roundtrippedEventVisibilityResponse).isEqualTo(eventVisibilityResponse)
    }
}
