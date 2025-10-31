// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.events

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventCreateAttentionSpanEventParamsTest {

    @Test
    fun create() {
        EventCreateAttentionSpanEventParams.builder()
            .mediaType(EventCreateAttentionSpanEventParams.MediaType.VIDEO)
            .occurredTimestamp(0L)
            .rawDataMap(
                EventCreateAttentionSpanEventParams.RawDataMap.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .sessionId("sessionId")
            ._hsenc("_hsenc")
            .contactId(0L)
            .contactUtk("contactUtk")
            .derivedValues(
                EventCreateAttentionSpanEventParams.DerivedValues.builder()
                    .totalPercentPlayed(0.0)
                    .totalSecondsPlayed(0)
                    .build()
            )
            .externalId("externalId")
            .mediaBridgeId(0L)
            .mediaName("mediaName")
            .mediaUrl("mediaUrl")
            .pageId(0L)
            .pageName("pageName")
            .pageUrl("pageUrl")
            .rawDataString("rawDataString")
            .build()
    }

    @Test
    fun body() {
        val params =
            EventCreateAttentionSpanEventParams.builder()
                .mediaType(EventCreateAttentionSpanEventParams.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .rawDataMap(
                    EventCreateAttentionSpanEventParams.RawDataMap.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .sessionId("sessionId")
                ._hsenc("_hsenc")
                .contactId(0L)
                .contactUtk("contactUtk")
                .derivedValues(
                    EventCreateAttentionSpanEventParams.DerivedValues.builder()
                        .totalPercentPlayed(0.0)
                        .totalSecondsPlayed(0)
                        .build()
                )
                .externalId("externalId")
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .rawDataString("rawDataString")
                .build()

        val body = params._body()

        assertThat(body.mediaType()).isEqualTo(EventCreateAttentionSpanEventParams.MediaType.VIDEO)
        assertThat(body.occurredTimestamp()).isEqualTo(0L)
        assertThat(body.rawDataMap())
            .isEqualTo(
                EventCreateAttentionSpanEventParams.RawDataMap.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.sessionId()).isEqualTo("sessionId")
        assertThat(body._hsenc()).contains("_hsenc")
        assertThat(body.contactId()).contains(0L)
        assertThat(body.contactUtk()).contains("contactUtk")
        assertThat(body.derivedValues())
            .contains(
                EventCreateAttentionSpanEventParams.DerivedValues.builder()
                    .totalPercentPlayed(0.0)
                    .totalSecondsPlayed(0)
                    .build()
            )
        assertThat(body.externalId()).contains("externalId")
        assertThat(body.mediaBridgeId()).contains(0L)
        assertThat(body.mediaName()).contains("mediaName")
        assertThat(body.mediaUrl()).contains("mediaUrl")
        assertThat(body.pageId()).contains(0L)
        assertThat(body.pageName()).contains("pageName")
        assertThat(body.pageUrl()).contains("pageUrl")
        assertThat(body.rawDataString()).contains("rawDataString")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventCreateAttentionSpanEventParams.builder()
                .mediaType(EventCreateAttentionSpanEventParams.MediaType.VIDEO)
                .occurredTimestamp(0L)
                .rawDataMap(
                    EventCreateAttentionSpanEventParams.RawDataMap.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .sessionId("sessionId")
                .build()

        val body = params._body()

        assertThat(body.mediaType()).isEqualTo(EventCreateAttentionSpanEventParams.MediaType.VIDEO)
        assertThat(body.occurredTimestamp()).isEqualTo(0L)
        assertThat(body.rawDataMap())
            .isEqualTo(
                EventCreateAttentionSpanEventParams.RawDataMap.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.sessionId()).isEqualTo("sessionId")
    }
}
