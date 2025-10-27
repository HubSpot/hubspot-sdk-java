// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttentionSpanEventRequestTest {

    @Test
    fun create() {
        val attentionSpanEventRequest =
            AttentionSpanEventRequest.builder()
                .mediaType(AttentionSpanEventRequest.MediaType.VIDEO)
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
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .rawDataString("rawDataString")
                .build()

        assertThat(attentionSpanEventRequest.mediaType())
            .isEqualTo(AttentionSpanEventRequest.MediaType.VIDEO)
        assertThat(attentionSpanEventRequest.occurredTimestamp()).isEqualTo(0L)
        assertThat(attentionSpanEventRequest.rawDataMap())
            .isEqualTo(
                AttentionSpanEventRequest.RawDataMap.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(attentionSpanEventRequest.sessionId()).isEqualTo("sessionId")
        assertThat(attentionSpanEventRequest._hsenc()).contains("_hsenc")
        assertThat(attentionSpanEventRequest.contactId()).contains(0L)
        assertThat(attentionSpanEventRequest.contactUtk()).contains("contactUtk")
        assertThat(attentionSpanEventRequest.derivedValues())
            .contains(
                AttentionSpanCalculatedValues.builder()
                    .totalPercentPlayed(0.0)
                    .totalSecondsPlayed(0)
                    .build()
            )
        assertThat(attentionSpanEventRequest.externalId()).contains("externalId")
        assertThat(attentionSpanEventRequest.mediaBridgeId()).contains(0L)
        assertThat(attentionSpanEventRequest.mediaName()).contains("mediaName")
        assertThat(attentionSpanEventRequest.mediaUrl()).contains("mediaUrl")
        assertThat(attentionSpanEventRequest.pageId()).contains(0L)
        assertThat(attentionSpanEventRequest.pageName()).contains("pageName")
        assertThat(attentionSpanEventRequest.pageUrl()).contains("pageUrl")
        assertThat(attentionSpanEventRequest.rawDataString()).contains("rawDataString")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attentionSpanEventRequest =
            AttentionSpanEventRequest.builder()
                .mediaType(AttentionSpanEventRequest.MediaType.VIDEO)
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
                .mediaBridgeId(0L)
                .mediaName("mediaName")
                .mediaUrl("mediaUrl")
                .pageId(0L)
                .pageName("pageName")
                .pageUrl("pageUrl")
                .rawDataString("rawDataString")
                .build()

        val roundtrippedAttentionSpanEventRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attentionSpanEventRequest),
                jacksonTypeRef<AttentionSpanEventRequest>(),
            )

        assertThat(roundtrippedAttentionSpanEventRequest).isEqualTo(attentionSpanEventRequest)
    }
}
