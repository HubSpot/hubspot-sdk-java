// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.hubspot.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreateAttentionSpanEventParamsTest {

    @Test
    fun create() {
        MediaBridgeCreateAttentionSpanEventParams.builder()
            .attentionSpanEventRequest(
                AttentionSpanEventRequest.builder()
                    .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .rawDataMap(
                        AttentionSpanEventRequest.RawDataMap.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .derivedValues(
                        AttentionSpanCalculatedValues.builder()
                            .totalPercentPlayed(0.0)
                            .totalSecondsPlayed(0)
                            .build()
                    )
                    .externalId("externalId")
                    .externalPlayContext(AttentionSpanEventRequest.ExternalPlayContext.EMAIL)
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .rawDataString("rawDataString")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MediaBridgeCreateAttentionSpanEventParams.builder()
                .attentionSpanEventRequest(
                    AttentionSpanEventRequest.builder()
                        .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                        .occurredTimestamp(0L)
                        .rawDataMap(
                            AttentionSpanEventRequest.RawDataMap.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .sessionId("sessionId")
                        ._hsenc("_hsenc")
                        .contactId(0L)
                        .contactUtk("contactUtk")
                        .derivedValues(
                            AttentionSpanCalculatedValues.builder()
                                .totalPercentPlayed(0.0)
                                .totalSecondsPlayed(0)
                                .build()
                        )
                        .externalId("externalId")
                        .externalPlayContext(AttentionSpanEventRequest.ExternalPlayContext.EMAIL)
                        .mediaBridgeId(0L)
                        .mediaName("mediaName")
                        .mediaUrl("mediaUrl")
                        .pageId(0L)
                        .pageName("pageName")
                        .pageUrl("pageUrl")
                        .rawDataString("rawDataString")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AttentionSpanEventRequest.builder()
                    .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .rawDataMap(
                        AttentionSpanEventRequest.RawDataMap.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .derivedValues(
                        AttentionSpanCalculatedValues.builder()
                            .totalPercentPlayed(0.0)
                            .totalSecondsPlayed(0)
                            .build()
                    )
                    .externalId("externalId")
                    .externalPlayContext(AttentionSpanEventRequest.ExternalPlayContext.EMAIL)
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .rawDataString("rawDataString")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeCreateAttentionSpanEventParams.builder()
                .attentionSpanEventRequest(
                    AttentionSpanEventRequest.builder()
                        .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                        .occurredTimestamp(0L)
                        .rawDataMap(
                            AttentionSpanEventRequest.RawDataMap.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .sessionId("sessionId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AttentionSpanEventRequest.builder()
                    .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .rawDataMap(
                        AttentionSpanEventRequest.RawDataMap.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .sessionId("sessionId")
                    .build()
            )
    }
}
