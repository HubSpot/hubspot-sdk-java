// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptCreateRequestTest {

    @Test
    fun create() {
        val transcriptCreateRequest =
            TranscriptCreateRequest.builder()
                .engagementId(0L)
                .addTranscriptCreateUtterance(
                    TranscriptCreateUtterance.builder()
                        .endTimeMillis(0)
                        .speaker(Speaker.builder().id("id").name("name").email("email").build())
                        .startTimeMillis(0)
                        .text("text")
                        .languageCode("languageCode")
                        .build()
                )
                .build()

        assertThat(transcriptCreateRequest.engagementId()).isEqualTo(0L)
        assertThat(transcriptCreateRequest.transcriptCreateUtterances())
            .containsExactly(
                TranscriptCreateUtterance.builder()
                    .endTimeMillis(0)
                    .speaker(Speaker.builder().id("id").name("name").email("email").build())
                    .startTimeMillis(0)
                    .text("text")
                    .languageCode("languageCode")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptCreateRequest =
            TranscriptCreateRequest.builder()
                .engagementId(0L)
                .addTranscriptCreateUtterance(
                    TranscriptCreateUtterance.builder()
                        .endTimeMillis(0)
                        .speaker(Speaker.builder().id("id").name("name").email("email").build())
                        .startTimeMillis(0)
                        .text("text")
                        .languageCode("languageCode")
                        .build()
                )
                .build()

        val roundtrippedTranscriptCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptCreateRequest),
                jacksonTypeRef<TranscriptCreateRequest>(),
            )

        assertThat(roundtrippedTranscriptCreateRequest).isEqualTo(transcriptCreateRequest)
    }
}
