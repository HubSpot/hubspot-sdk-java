// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateMediaPlayedPercentEventResponseTest {

    @Test
    fun create() {
        val eventCreateMediaPlayedPercentEventResponse =
            EventCreateMediaPlayedPercentEventResponse.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(EventCreateMediaPlayedPercentEventResponse.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        assertThat(eventCreateMediaPlayedPercentEventResponse.contactId()).isEqualTo(0L)
        assertThat(eventCreateMediaPlayedPercentEventResponse.mediaBridgeId()).isEqualTo(0L)
        assertThat(eventCreateMediaPlayedPercentEventResponse.mediaBridgeObjectCoordinates())
            .isEqualTo("mediaBridgeObjectCoordinates")
        assertThat(eventCreateMediaPlayedPercentEventResponse.mediaBridgeObjectTypeId())
            .isEqualTo("mediaBridgeObjectTypeId")
        assertThat(eventCreateMediaPlayedPercentEventResponse.mediaName()).isEqualTo("mediaName")
        assertThat(eventCreateMediaPlayedPercentEventResponse.mediaType())
            .isEqualTo(EventCreateMediaPlayedPercentEventResponse.MediaType.VIDEO)
        assertThat(eventCreateMediaPlayedPercentEventResponse.occurredTimestamp()).isEqualTo(0L)
        assertThat(eventCreateMediaPlayedPercentEventResponse.playedPercent()).isEqualTo(0)
        assertThat(eventCreateMediaPlayedPercentEventResponse.portalId()).isEqualTo(0)
        assertThat(eventCreateMediaPlayedPercentEventResponse.providerId()).isEqualTo(0)
        assertThat(eventCreateMediaPlayedPercentEventResponse.sessionId()).isEqualTo("sessionId")
        assertThat(eventCreateMediaPlayedPercentEventResponse.mediaUrl()).contains("mediaUrl")
        assertThat(eventCreateMediaPlayedPercentEventResponse.pageId()).contains(0L)
        assertThat(eventCreateMediaPlayedPercentEventResponse.pageName()).contains("pageName")
        assertThat(eventCreateMediaPlayedPercentEventResponse.pageObjectCoordinates())
            .contains("pageObjectCoordinates")
        assertThat(eventCreateMediaPlayedPercentEventResponse.pageUrl()).contains("pageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventCreateMediaPlayedPercentEventResponse =
            EventCreateMediaPlayedPercentEventResponse.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(EventCreateMediaPlayedPercentEventResponse.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        val roundtrippedEventCreateMediaPlayedPercentEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventCreateMediaPlayedPercentEventResponse),
                jacksonTypeRef<EventCreateMediaPlayedPercentEventResponse>(),
            )

        assertThat(roundtrippedEventCreateMediaPlayedPercentEventResponse)
            .isEqualTo(eventCreateMediaPlayedPercentEventResponse)
    }
}
