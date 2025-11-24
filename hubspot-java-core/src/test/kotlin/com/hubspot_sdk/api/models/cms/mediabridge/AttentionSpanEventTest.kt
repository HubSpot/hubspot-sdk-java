// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttentionSpanEventTest {

    @Test
    fun create() {
        val attentionSpanEvent =
            AttentionSpanEvent.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(AttentionSpanEvent.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .percentRange("percentRange")
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .totalPercentPlayed(0.0)
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .rawData("rawData")
                .totalSecondsPlayed(0)
                .build()

        assertThat(attentionSpanEvent.contactId()).isEqualTo(0L)
        assertThat(attentionSpanEvent.mediaBridgeId()).isEqualTo(0L)
        assertThat(attentionSpanEvent.mediaBridgeObjectCoordinates())
            .isEqualTo("mediaBridgeObjectCoordinates")
        assertThat(attentionSpanEvent.mediaBridgeObjectTypeId())
            .isEqualTo("mediaBridgeObjectTypeId")
        assertThat(attentionSpanEvent.mediaName()).isEqualTo("mediaName")
        assertThat(attentionSpanEvent.mediaType()).isEqualTo(AttentionSpanEvent.MediaType.AUDIO)
        assertThat(attentionSpanEvent.occurredTimestamp()).isEqualTo(0L)
        assertThat(attentionSpanEvent.percentRange()).isEqualTo("percentRange")
        assertThat(attentionSpanEvent.portalId()).isEqualTo(0)
        assertThat(attentionSpanEvent.providerId()).isEqualTo(0)
        assertThat(attentionSpanEvent.sessionId()).isEqualTo("sessionId")
        assertThat(attentionSpanEvent.totalPercentPlayed()).isEqualTo(0.0)
        assertThat(attentionSpanEvent.mediaUrl()).contains("mediaUrl")
        assertThat(attentionSpanEvent.pageId()).contains(0L)
        assertThat(attentionSpanEvent.pageName()).contains("pageName")
        assertThat(attentionSpanEvent.pageObjectCoordinates()).contains("pageObjectCoordinates")
        assertThat(attentionSpanEvent.pageUrl()).contains("pageUrl")
        assertThat(attentionSpanEvent.rawData()).contains("rawData")
        assertThat(attentionSpanEvent.totalSecondsPlayed()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attentionSpanEvent =
            AttentionSpanEvent.builder()
                .contactId(0L)
                .mediaBridgeId(0L)
                .mediaBridgeObjectCoordinates("mediaBridgeObjectCoordinates")
                .mediaBridgeObjectTypeId("mediaBridgeObjectTypeId")
                .mediaName("mediaName")
                .mediaType(AttentionSpanEvent.MediaType.AUDIO)
                .occurredTimestamp(0L)
                .percentRange("percentRange")
                .portalId(0)
                .providerId(0)
                .sessionId("sessionId")
                .totalPercentPlayed(0.0)
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageObjectCoordinates("pageObjectCoordinates")
                .pageUrl("pageUrl")
                .rawData("rawData")
                .totalSecondsPlayed(0)
                .build()

        val roundtrippedAttentionSpanEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attentionSpanEvent),
                jacksonTypeRef<AttentionSpanEvent>(),
            )

        assertThat(roundtrippedAttentionSpanEvent).isEqualTo(attentionSpanEvent)
    }
}
