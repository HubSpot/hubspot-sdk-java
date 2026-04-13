// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaPlayedEventRequestTest {

    @Test
    fun create() {
        val mediaPlayedEventRequest =
            MediaPlayedEventRequest.builder()
                .mediaType(MediaPlayedEventRequest.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .sessionId("sessionId")
                .state(MediaPlayedEventRequest.State.STARTED)
                ._hsenc("_hsenc")
                .contactId(0L)
                .contactUtk("contactUtk")
                .externalId("externalId")
                .externalPlayContext(MediaPlayedEventRequest.ExternalPlayContext.EMAIL)
                .iframeUrl("iframeUrl")
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .build()

        assertThat(mediaPlayedEventRequest.mediaType())
            .isEqualTo(MediaPlayedEventRequest.MediaType.AUDIO)
        assertThat(mediaPlayedEventRequest.occurredTimestamp()).isEqualTo(0L)
        assertThat(mediaPlayedEventRequest.sessionId()).isEqualTo("sessionId")
        assertThat(mediaPlayedEventRequest.state()).isEqualTo(MediaPlayedEventRequest.State.STARTED)
        assertThat(mediaPlayedEventRequest._hsenc()).contains("_hsenc")
        assertThat(mediaPlayedEventRequest.contactId()).contains(0L)
        assertThat(mediaPlayedEventRequest.contactUtk()).contains("contactUtk")
        assertThat(mediaPlayedEventRequest.externalId()).contains("externalId")
        assertThat(mediaPlayedEventRequest.externalPlayContext())
            .contains(MediaPlayedEventRequest.ExternalPlayContext.EMAIL)
        assertThat(mediaPlayedEventRequest.iframeUrl()).contains("iframeUrl")
        assertThat(mediaPlayedEventRequest.mediaBridgeId()).contains(0L)
        assertThat(mediaPlayedEventRequest.mediaName()).contains("mediaName")
        assertThat(mediaPlayedEventRequest.mediaUrl()).contains("mediaUrl")
        assertThat(mediaPlayedEventRequest.pageId()).contains(0L)
        assertThat(mediaPlayedEventRequest.pageName()).contains("pageName")
        assertThat(mediaPlayedEventRequest.pageUrl()).contains("pageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaPlayedEventRequest =
            MediaPlayedEventRequest.builder()
                .mediaType(MediaPlayedEventRequest.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .sessionId("sessionId")
                .state(MediaPlayedEventRequest.State.STARTED)
                ._hsenc("_hsenc")
                .contactId(0L)
                .contactUtk("contactUtk")
                .externalId("externalId")
                .externalPlayContext(MediaPlayedEventRequest.ExternalPlayContext.EMAIL)
                .iframeUrl("iframeUrl")
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .build()

        val roundtrippedMediaPlayedEventRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaPlayedEventRequest),
                jacksonTypeRef<MediaPlayedEventRequest>(),
            )

        assertThat(roundtrippedMediaPlayedEventRequest).isEqualTo(mediaPlayedEventRequest)
    }
}
