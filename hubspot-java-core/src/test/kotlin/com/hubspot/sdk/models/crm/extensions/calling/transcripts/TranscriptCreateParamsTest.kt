// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling.transcripts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptCreateParamsTest {

    @Test
    fun create() {
        TranscriptCreateParams.builder()
            .transcriptCreateRequest(
                TranscriptCreateRequest.builder()
                    .engagementId(0L)
                    .addTranscriptCreateUtterance(
                        TranscriptCreateUtterance.builder()
                            .endTimeMillis(0L)
                            .speaker(Speaker.builder().id("id").name("name").email("email").build())
                            .startTimeMillis(0L)
                            .text("text")
                            .languageCode("languageCode")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TranscriptCreateParams.builder()
                .transcriptCreateRequest(
                    TranscriptCreateRequest.builder()
                        .engagementId(0L)
                        .addTranscriptCreateUtterance(
                            TranscriptCreateUtterance.builder()
                                .endTimeMillis(0L)
                                .speaker(
                                    Speaker.builder().id("id").name("name").email("email").build()
                                )
                                .startTimeMillis(0L)
                                .text("text")
                                .languageCode("languageCode")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TranscriptCreateRequest.builder()
                    .engagementId(0L)
                    .addTranscriptCreateUtterance(
                        TranscriptCreateUtterance.builder()
                            .endTimeMillis(0L)
                            .speaker(Speaker.builder().id("id").name("name").email("email").build())
                            .startTimeMillis(0L)
                            .text("text")
                            .languageCode("languageCode")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TranscriptCreateParams.builder()
                .transcriptCreateRequest(
                    TranscriptCreateRequest.builder()
                        .engagementId(0L)
                        .addTranscriptCreateUtterance(
                            TranscriptCreateUtterance.builder()
                                .endTimeMillis(0L)
                                .speaker(Speaker.builder().id("id").name("name").build())
                                .startTimeMillis(0L)
                                .text("text")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TranscriptCreateRequest.builder()
                    .engagementId(0L)
                    .addTranscriptCreateUtterance(
                        TranscriptCreateUtterance.builder()
                            .endTimeMillis(0L)
                            .speaker(Speaker.builder().id("id").name("name").build())
                            .startTimeMillis(0L)
                            .text("text")
                            .build()
                    )
                    .build()
            )
    }
}
