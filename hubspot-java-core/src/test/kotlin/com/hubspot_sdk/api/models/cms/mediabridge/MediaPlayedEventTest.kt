// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaPlayedEventTest {

    @Test
    fun create() {
        val mediaPlayedEvent =
            MediaPlayedEvent.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(MediaPlayedEvent.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .state(MediaPlayedEvent.State.STARTED)
                .iframeUrl("iframeUrl")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        assertThat(mediaPlayedEvent.contactId()).isEqualTo(0L)
        assertThat(mediaPlayedEvent.mediaBridgeId()).isEqualTo(0L)
        assertThat(mediaPlayedEvent.mediaBridgeObjectCoordinates())
            .isEqualTo("mediaBridgeObjectCoordinates")
        assertThat(mediaPlayedEvent.mediaBridgeObjectTypeId()).isEqualTo("mediaBridgeObjectTypeId")
        assertThat(mediaPlayedEvent.mediaName()).isEqualTo("mediaName")
        assertThat(mediaPlayedEvent.mediaType()).isEqualTo(MediaPlayedEvent.MediaType.AUDIO)
        assertThat(mediaPlayedEvent.occurredTimestamp()).isEqualTo(0L)
        assertThat(mediaPlayedEvent.portalId()).isEqualTo(0)
        assertThat(mediaPlayedEvent.providerId()).isEqualTo(0)
        assertThat(mediaPlayedEvent.sessionId()).isEqualTo("sessionId")
        assertThat(mediaPlayedEvent.state()).isEqualTo(MediaPlayedEvent.State.STARTED)
        assertThat(mediaPlayedEvent.iframeUrl()).contains("iframeUrl")
        assertThat(mediaPlayedEvent.mediaUrl()).contains("mediaUrl")
        assertThat(mediaPlayedEvent.pageId()).contains(0L)
        assertThat(mediaPlayedEvent.pageName()).contains("pageName")
        assertThat(mediaPlayedEvent.pageObjectCoordinates()).contains("pageObjectCoordinates")
        assertThat(mediaPlayedEvent.pageUrl()).contains("pageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaPlayedEvent =
            MediaPlayedEvent.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(MediaPlayedEvent.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .state(MediaPlayedEvent.State.STARTED)
                .iframeUrl("iframeUrl")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        val roundtrippedMediaPlayedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaPlayedEvent),
                jacksonTypeRef<MediaPlayedEvent>(),
            )

        assertThat(roundtrippedMediaPlayedEvent).isEqualTo(mediaPlayedEvent)
    }
}
