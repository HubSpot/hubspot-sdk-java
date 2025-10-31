// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateMediaPlayedEventResponseTest {

    @Test
    fun create() {
        val eventCreateMediaPlayedEventResponse =
            EventCreateMediaPlayedEventResponse.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(EventCreateMediaPlayedEventResponse.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .state(EventCreateMediaPlayedEventResponse.State.STARTED)
                .iframeUrl("iframeUrl")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        assertThat(eventCreateMediaPlayedEventResponse.contactId()).isEqualTo(0L)
        assertThat(eventCreateMediaPlayedEventResponse.mediaBridgeId()).isEqualTo(0L)
        assertThat(eventCreateMediaPlayedEventResponse.mediaBridgeObjectCoordinates())
            .isEqualTo("mediaBridgeObjectCoordinates")
        assertThat(eventCreateMediaPlayedEventResponse.mediaBridgeObjectTypeId())
            .isEqualTo("mediaBridgeObjectTypeId")
        assertThat(eventCreateMediaPlayedEventResponse.mediaName()).isEqualTo("mediaName")
        assertThat(eventCreateMediaPlayedEventResponse.mediaType())
            .isEqualTo(EventCreateMediaPlayedEventResponse.MediaType.VIDEO)
        assertThat(eventCreateMediaPlayedEventResponse.occurredTimestamp()).isEqualTo(0L)
        assertThat(eventCreateMediaPlayedEventResponse.portalId()).isEqualTo(0)
        assertThat(eventCreateMediaPlayedEventResponse.providerId()).isEqualTo(0)
        assertThat(eventCreateMediaPlayedEventResponse.sessionId()).isEqualTo("sessionId")
        assertThat(eventCreateMediaPlayedEventResponse.state())
            .isEqualTo(EventCreateMediaPlayedEventResponse.State.STARTED)
        assertThat(eventCreateMediaPlayedEventResponse.iframeUrl()).contains("iframeUrl")
        assertThat(eventCreateMediaPlayedEventResponse.mediaUrl()).contains("mediaUrl")
        assertThat(eventCreateMediaPlayedEventResponse.pageId()).contains(0L)
        assertThat(eventCreateMediaPlayedEventResponse.pageName()).contains("pageName")
        assertThat(eventCreateMediaPlayedEventResponse.pageObjectCoordinates())
            .contains("pageObjectCoordinates")
        assertThat(eventCreateMediaPlayedEventResponse.pageUrl()).contains("pageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventCreateMediaPlayedEventResponse =
            EventCreateMediaPlayedEventResponse.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(EventCreateMediaPlayedEventResponse.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .state(EventCreateMediaPlayedEventResponse.State.STARTED)
                .iframeUrl("iframeUrl")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        val roundtrippedEventCreateMediaPlayedEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventCreateMediaPlayedEventResponse),
                jacksonTypeRef<EventCreateMediaPlayedEventResponse>(),
            )

        assertThat(roundtrippedEventCreateMediaPlayedEventResponse)
            .isEqualTo(eventCreateMediaPlayedEventResponse)
    }
}
