// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaPlayedPercentageEventTest {

    @Test
    fun create() {
        val mediaPlayedPercentageEvent =
            MediaPlayedPercentageEvent.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(MediaPlayedPercentageEvent.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .externalPlayContext(MediaPlayedPercentageEvent.ExternalPlayContext.EMAIL)
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        assertThat(mediaPlayedPercentageEvent.contactId()).isEqualTo(0L)
        assertThat(mediaPlayedPercentageEvent.mediaBridgeId()).isEqualTo(0L)
        assertThat(mediaPlayedPercentageEvent.mediaBridgeObjectCoordinates())
            .isEqualTo("mediaBridgeObjectCoordinates")
        assertThat(mediaPlayedPercentageEvent.mediaBridgeObjectTypeId())
            .isEqualTo("mediaBridgeObjectTypeId")
        assertThat(mediaPlayedPercentageEvent.mediaName()).isEqualTo("mediaName")
        assertThat(mediaPlayedPercentageEvent.mediaType())
            .isEqualTo(MediaPlayedPercentageEvent.MediaType.AUDIO)
        assertThat(mediaPlayedPercentageEvent.occurredTimestamp()).isEqualTo(0L)
        assertThat(mediaPlayedPercentageEvent.playedPercent()).isEqualTo(0)
        assertThat(mediaPlayedPercentageEvent.portalId()).isEqualTo(0)
        assertThat(mediaPlayedPercentageEvent.providerId()).isEqualTo(0)
        assertThat(mediaPlayedPercentageEvent.sessionId()).isEqualTo("sessionId")
        assertThat(mediaPlayedPercentageEvent.externalPlayContext())
            .contains(MediaPlayedPercentageEvent.ExternalPlayContext.EMAIL)
        assertThat(mediaPlayedPercentageEvent.mediaUrl()).contains("mediaUrl")
        assertThat(mediaPlayedPercentageEvent.pageId()).contains(0L)
        assertThat(mediaPlayedPercentageEvent.pageName()).contains("pageName")
        assertThat(mediaPlayedPercentageEvent.pageObjectCoordinates())
            .contains("pageObjectCoordinates")
        assertThat(mediaPlayedPercentageEvent.pageUrl()).contains("pageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaPlayedPercentageEvent =
            MediaPlayedPercentageEvent.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(MediaPlayedPercentageEvent.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .externalPlayContext(MediaPlayedPercentageEvent.ExternalPlayContext.EMAIL)
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .build()

        val roundtrippedMediaPlayedPercentageEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaPlayedPercentageEvent),
                jacksonTypeRef<MediaPlayedPercentageEvent>(),
            )

        assertThat(roundtrippedMediaPlayedPercentageEvent).isEqualTo(mediaPlayedPercentageEvent)
    }
}
