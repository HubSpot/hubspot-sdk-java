// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateMediaPlayedEventParamsTest {

    @Test
    fun create() {
        EventCreateMediaPlayedEventParams.builder()
            .mediaType(EventCreateMediaPlayedEventParams.MediaType.VIDEO)
            .occurredTimestamp(0L)
            .sessionId("sessionId")
            .state(EventCreateMediaPlayedEventParams.State.STARTED)
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
    }

    @Test
    fun body() {
        val params =
            EventCreateMediaPlayedEventParams.builder()
                .mediaType(EventCreateMediaPlayedEventParams.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .sessionId("sessionId")
                .state(EventCreateMediaPlayedEventParams.State.STARTED)
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

        val body = params._body()

        assertThat(body.mediaType()).isEqualTo(EventCreateMediaPlayedEventParams.MediaType.VIDEO)
        assertThat(body.occurredTimestamp()).isEqualTo(0L)
        assertThat(body.sessionId()).isEqualTo("sessionId")
        assertThat(body.state()).isEqualTo(EventCreateMediaPlayedEventParams.State.STARTED)
        assertThat(body._hsenc()).contains("_hsenc")
        assertThat(body.contactId()).contains(0L)
        assertThat(body.contactUtk()).contains("contactUtk")
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.iframeUrl()).contains("iframeUrl")
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
            EventCreateMediaPlayedEventParams.builder()
                .mediaType(EventCreateMediaPlayedEventParams.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .sessionId("sessionId")
                .state(EventCreateMediaPlayedEventParams.State.STARTED)
                .build()

        val body = params._body()

        assertThat(body.mediaType()).isEqualTo(EventCreateMediaPlayedEventParams.MediaType.VIDEO)
        assertThat(body.occurredTimestamp()).isEqualTo(0L)
        assertThat(body.sessionId()).isEqualTo("sessionId")
        assertThat(body.state()).isEqualTo(EventCreateMediaPlayedEventParams.State.STARTED)
    }
}
