// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptResponseTest {

    @Test
    fun create() {
        val transcriptResponse =
            TranscriptResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .engagementId(0L)
                .transcriptSource(TranscriptResponse.TranscriptSource.HUBSPOT_GENERATED)
                .addTranscriptUtterance(
                    TranscriptUtterance.builder()
                        .id("id")
                        .endTimeMillis(0L)
                        .startTimeMillis(0L)
                        .text("text")
                        .languageCode("languageCode")
                        .speaker(Speaker.builder().id("id").name("name").email("email").build())
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(transcriptResponse.id()).isEqualTo("id")
        assertThat(transcriptResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transcriptResponse.engagementId()).isEqualTo(0L)
        assertThat(transcriptResponse.transcriptSource())
            .isEqualTo(TranscriptResponse.TranscriptSource.HUBSPOT_GENERATED)
        assertThat(transcriptResponse.transcriptUtterances())
            .containsExactly(
                TranscriptUtterance.builder()
                    .id("id")
                    .endTimeMillis(0L)
                    .startTimeMillis(0L)
                    .text("text")
                    .languageCode("languageCode")
                    .speaker(Speaker.builder().id("id").name("name").email("email").build())
                    .build()
            )
        assertThat(transcriptResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptResponse =
            TranscriptResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .engagementId(0L)
                .transcriptSource(TranscriptResponse.TranscriptSource.HUBSPOT_GENERATED)
                .addTranscriptUtterance(
                    TranscriptUtterance.builder()
                        .id("id")
                        .endTimeMillis(0L)
                        .startTimeMillis(0L)
                        .text("text")
                        .languageCode("languageCode")
                        .speaker(Speaker.builder().id("id").name("name").email("email").build())
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTranscriptResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptResponse),
                jacksonTypeRef<TranscriptResponse>(),
            )

        assertThat(roundtrippedTranscriptResponse).isEqualTo(transcriptResponse)
    }
}
