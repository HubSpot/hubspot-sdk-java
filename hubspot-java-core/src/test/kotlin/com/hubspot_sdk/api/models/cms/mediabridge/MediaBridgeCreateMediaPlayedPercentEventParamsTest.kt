// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreateMediaPlayedPercentEventParamsTest {

    @Test
    fun create() {
        MediaBridgeCreateMediaPlayedPercentEventParams.builder()
            .mediaPlayedPercentageEventRequest(
                MediaPlayedPercentageEventRequest.builder()
                    .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .playedPercent(0)
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
                    .externalPlayContext(
                        MediaPlayedPercentageEventRequest.ExternalPlayContext.EMAIL
                    )
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
            MediaBridgeCreateMediaPlayedPercentEventParams.builder()
                .mediaPlayedPercentageEventRequest(
                    MediaPlayedPercentageEventRequest.builder()
                        .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                        .occurredTimestamp(0L)
                        .playedPercent(0)
                        .sessionId("sessionId")
                        ._hsenc("_hsenc")
                        .contactId(0L)
                        .contactUtk("contactUtk")
                        .externalId("externalId")
                        .externalPlayContext(
                            MediaPlayedPercentageEventRequest.ExternalPlayContext.EMAIL
                        )
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
                MediaPlayedPercentageEventRequest.builder()
                    .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .playedPercent(0)
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
                    .externalPlayContext(
                        MediaPlayedPercentageEventRequest.ExternalPlayContext.EMAIL
                    )
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
            MediaBridgeCreateMediaPlayedPercentEventParams.builder()
                .mediaPlayedPercentageEventRequest(
                    MediaPlayedPercentageEventRequest.builder()
                        .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                        .occurredTimestamp(0L)
                        .playedPercent(0)
                        .sessionId("sessionId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MediaPlayedPercentageEventRequest.builder()
                    .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .playedPercent(0)
                    .sessionId("sessionId")
                    .build()
            )
    }
}
