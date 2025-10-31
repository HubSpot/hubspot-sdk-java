// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateAttentionSpanEventResponseTest {

    @Test
    fun create() {
        val eventCreateAttentionSpanEventResponse =
            EventCreateAttentionSpanEventResponse.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(EventCreateAttentionSpanEventResponse.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .percentRange("percentRange")
                .portalId(1234567)
                .providerId(0)
                .sessionId("sessionId")
                .totalPercentPlayed(0.0)
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .rawData("rawData")
                .totalSecondsPlayed(0)
                .build()

        assertThat(eventCreateAttentionSpanEventResponse.contactId()).isEqualTo(0L)
        assertThat(eventCreateAttentionSpanEventResponse.mediaBridgeId()).isEqualTo(0L)
        assertThat(eventCreateAttentionSpanEventResponse.mediaBridgeObjectCoordinates())
            .isEqualTo("mediaBridgeObjectCoordinates")
        assertThat(eventCreateAttentionSpanEventResponse.mediaBridgeObjectTypeId())
            .isEqualTo("mediaBridgeObjectTypeId")
        assertThat(eventCreateAttentionSpanEventResponse.mediaName()).isEqualTo("mediaName")
        assertThat(eventCreateAttentionSpanEventResponse.mediaType())
            .isEqualTo(EventCreateAttentionSpanEventResponse.MediaType.VIDEO)
        assertThat(eventCreateAttentionSpanEventResponse.occurredTimestamp()).isEqualTo(0L)
        assertThat(eventCreateAttentionSpanEventResponse.percentRange()).isEqualTo("percentRange")
        assertThat(eventCreateAttentionSpanEventResponse.portalId()).isEqualTo(1234567)
        assertThat(eventCreateAttentionSpanEventResponse.providerId()).isEqualTo(0)
        assertThat(eventCreateAttentionSpanEventResponse.sessionId()).isEqualTo("sessionId")
        assertThat(eventCreateAttentionSpanEventResponse.totalPercentPlayed()).isEqualTo(0.0)
        assertThat(eventCreateAttentionSpanEventResponse.mediaUrl()).contains("mediaUrl")
        assertThat(eventCreateAttentionSpanEventResponse.pageId()).contains(0L)
        assertThat(eventCreateAttentionSpanEventResponse.pageName()).contains("pageName")
        assertThat(eventCreateAttentionSpanEventResponse.pageObjectCoordinates())
            .contains("pageObjectCoordinates")
        assertThat(eventCreateAttentionSpanEventResponse.pageUrl()).contains("pageUrl")
        assertThat(eventCreateAttentionSpanEventResponse.rawData()).contains("rawData")
        assertThat(eventCreateAttentionSpanEventResponse.totalSecondsPlayed()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventCreateAttentionSpanEventResponse =
            EventCreateAttentionSpanEventResponse.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(EventCreateAttentionSpanEventResponse.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .percentRange("percentRange")
                .portalId(1234567)
                .providerId(0)
                .sessionId("sessionId")
                .totalPercentPlayed(0.0)
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .rawData("rawData")
                .totalSecondsPlayed(0)
                .build()

        val roundtrippedEventCreateAttentionSpanEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventCreateAttentionSpanEventResponse),
                jacksonTypeRef<EventCreateAttentionSpanEventResponse>(),
            )

        assertThat(roundtrippedEventCreateAttentionSpanEventResponse)
            .isEqualTo(eventCreateAttentionSpanEventResponse)
    }
}
