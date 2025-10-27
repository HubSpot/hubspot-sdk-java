// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaPlayedPercentageEventRequestTest {

    @Test
    fun create() {
        val mediaPlayedPercentageEventRequest =
            MediaPlayedPercentageEventRequest.builder()
                .mediaType(MediaPlayedPercentageEventRequest.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .sessionId("sessionId")
                ._hsenc("_hsenc")
                .contactId(0L)
                .contactUtk("contactUtk")
                .externalId("externalId")
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .build()

        assertThat(mediaPlayedPercentageEventRequest.mediaType())
            .isEqualTo(MediaPlayedPercentageEventRequest.MediaType.VIDEO)
        assertThat(mediaPlayedPercentageEventRequest.occurredTimestamp()).isEqualTo(0L)
        assertThat(mediaPlayedPercentageEventRequest.playedPercent()).isEqualTo(0)
        assertThat(mediaPlayedPercentageEventRequest.sessionId()).isEqualTo("sessionId")
        assertThat(mediaPlayedPercentageEventRequest._hsenc()).contains("_hsenc")
        assertThat(mediaPlayedPercentageEventRequest.contactId()).contains(0L)
        assertThat(mediaPlayedPercentageEventRequest.contactUtk()).contains("contactUtk")
        assertThat(mediaPlayedPercentageEventRequest.externalId()).contains("externalId")
        assertThat(mediaPlayedPercentageEventRequest.mediaBridgeId()).contains(0L)
        assertThat(mediaPlayedPercentageEventRequest.mediaName()).contains("mediaName")
        assertThat(mediaPlayedPercentageEventRequest.mediaUrl()).contains("mediaUrl")
        assertThat(mediaPlayedPercentageEventRequest.pageId()).contains(0L)
        assertThat(mediaPlayedPercentageEventRequest.pageName()).contains("pageName")
        assertThat(mediaPlayedPercentageEventRequest.pageUrl()).contains("pageUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaPlayedPercentageEventRequest =
            MediaPlayedPercentageEventRequest.builder()
                .mediaType(MediaPlayedPercentageEventRequest.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .sessionId("sessionId")
                ._hsenc("_hsenc")
                .contactId(0L)
                .contactUtk("contactUtk")
                .externalId("externalId")
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .build()

        val roundtrippedMediaPlayedPercentageEventRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaPlayedPercentageEventRequest),
                jacksonTypeRef<MediaPlayedPercentageEventRequest>(),
            )

        assertThat(roundtrippedMediaPlayedPercentageEventRequest)
            .isEqualTo(mediaPlayedPercentageEventRequest)
    }
}
