// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreateMediaPlayedEventParamsTest {

    @Test
    fun create() {
        MediaBridgeCreateMediaPlayedEventParams.builder()
            .mediaPlayedEventRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MediaBridgeCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(
                    MediaPlayedEventRequest.builder()
                        .mediaType(MediaPlayedEventRequest.MediaType.AUDIO)
                        .occurredTimestamp(0L)
                        .sessionId("sessionId")
                        .state(MediaPlayedEventRequest.State.STARTED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MediaPlayedEventRequest.builder()
                    .mediaType(MediaPlayedEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .sessionId("sessionId")
                    .state(MediaPlayedEventRequest.State.STARTED)
                    .build()
            )
    }
}
