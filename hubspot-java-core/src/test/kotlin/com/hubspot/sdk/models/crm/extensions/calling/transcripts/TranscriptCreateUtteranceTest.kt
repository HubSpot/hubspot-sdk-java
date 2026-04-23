// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptCreateUtteranceTest {

    @Test
    fun create() {
        val transcriptCreateUtterance =
            TranscriptCreateUtterance.builder()
                .endTimeMillis(0L)
                .speaker(Speaker.builder().id("id").name("name").email("email").build())
                .startTimeMillis(0L)
                .text("text")
                .languageCode("languageCode")
                .build()

        assertThat(transcriptCreateUtterance.endTimeMillis()).isEqualTo(0L)
        assertThat(transcriptCreateUtterance.speaker())
            .isEqualTo(Speaker.builder().id("id").name("name").email("email").build())
        assertThat(transcriptCreateUtterance.startTimeMillis()).isEqualTo(0L)
        assertThat(transcriptCreateUtterance.text()).isEqualTo("text")
        assertThat(transcriptCreateUtterance.languageCode()).contains("languageCode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptCreateUtterance =
            TranscriptCreateUtterance.builder()
                .endTimeMillis(0L)
                .speaker(Speaker.builder().id("id").name("name").email("email").build())
                .startTimeMillis(0L)
                .text("text")
                .languageCode("languageCode")
                .build()

        val roundtrippedTranscriptCreateUtterance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptCreateUtterance),
                jacksonTypeRef<TranscriptCreateUtterance>(),
            )

        assertThat(roundtrippedTranscriptCreateUtterance).isEqualTo(transcriptCreateUtterance)
    }
}
