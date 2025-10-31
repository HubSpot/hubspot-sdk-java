// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateMediaPlayedPercentEventParamsTest {

    @Test
    fun create() {
        EventCreateMediaPlayedPercentEventParams.builder()
            .mediaType(EventCreateMediaPlayedPercentEventParams.MediaType.VIDEO)
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
    }

    @Test
    fun body() {
        val params =
            EventCreateMediaPlayedPercentEventParams.builder()
                .mediaType(EventCreateMediaPlayedPercentEventParams.MediaType.VIDEO)
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

        val body = params._body()

        assertThat(body.mediaType())
            .isEqualTo(EventCreateMediaPlayedPercentEventParams.MediaType.VIDEO)
        assertThat(body.occurredTimestamp()).isEqualTo(0L)
        assertThat(body.playedPercent()).isEqualTo(0)
        assertThat(body.sessionId()).isEqualTo("sessionId")
        assertThat(body._hsenc()).contains("_hsenc")
        assertThat(body.contactId()).contains(0L)
        assertThat(body.contactUtk()).contains("contactUtk")
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.mediaBridgeId()).contains(0L)
        assertThat(body.mediaName()).contains("mediaName")
        assertThat(body.mediaUrl()).contains("mediaUrl")
        assertThat(body.pageId()).contains(0L)
        assertThat(body.pageName()).contains("pageName")
        assertThat(body.pageUrl()).contains("pageUrl")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventCreateMediaPlayedPercentEventParams.builder()
                .mediaType(EventCreateMediaPlayedPercentEventParams.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .playedPercent(0)
                .sessionId("sessionId")
                .build()

        val body = params._body()

        assertThat(body.mediaType())
            .isEqualTo(EventCreateMediaPlayedPercentEventParams.MediaType.VIDEO)
        assertThat(body.occurredTimestamp()).isEqualTo(0L)
        assertThat(body.playedPercent()).isEqualTo(0)
        assertThat(body.sessionId()).isEqualTo("sessionId")
    }
}
