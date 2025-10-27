// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEventRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateMediaPlayedEventParamsTest {

    @Test
    fun create() {
        EventCreateMediaPlayedEventParams.builder()
            .mediaPlayedEventRequest(
                MediaPlayedEventRequest.builder()
                    .mediaType(MediaPlayedEventRequest.MediaType.VIDEO)
                    .occurredTimestamp(0L)
                    .sessionId("sessionId")
                    .state(MediaPlayedEventRequest.State.STARTED)
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
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
            EventCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(
                    MediaPlayedEventRequest.builder()
                        .mediaType(MediaPlayedEventRequest.MediaType.VIDEO)
                        .occurredTimestamp(0L)
                        .sessionId("sessionId")
                        .state(MediaPlayedEventRequest.State.STARTED)
                        ._hsenc("_hsenc")
                        .contactId(0L)
                        .contactUtk("contactUtk")
                        .externalId("externalId")
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
                    .mediaType(MediaPlayedEventRequest.MediaType.VIDEO)
                    .occurredTimestamp(0L)
                    .sessionId("sessionId")
                    .state(MediaPlayedEventRequest.State.STARTED)
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
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
            EventCreateMediaPlayedEventParams.builder()
                .mediaPlayedEventRequest(
                    MediaPlayedEventRequest.builder()
                        .mediaType(MediaPlayedEventRequest.MediaType.VIDEO)
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
                    .mediaType(MediaPlayedEventRequest.MediaType.VIDEO)
                    .occurredTimestamp(0L)
                    .sessionId("sessionId")
                    .state(MediaPlayedEventRequest.State.STARTED)
                    .build()
            )
    }
}
