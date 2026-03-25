// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateAudioObjectRequestTest {

    @Test
    fun create() {
        val createAudioObjectRequest =
            CreateAudioObjectRequest.builder()
                .mediaType(CreateAudioObjectRequest.MediaType.AUDIO)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        assertThat(createAudioObjectRequest.mediaType())
            .isEqualTo(CreateAudioObjectRequest.MediaType.AUDIO)
        assertThat(createAudioObjectRequest.title()).isEqualTo("title")
        assertThat(createAudioObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(createAudioObjectRequest.duration()).contains(0L)
        assertThat(createAudioObjectRequest.externalId()).contains("externalId")
        assertThat(createAudioObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(createAudioObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(createAudioObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(createAudioObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAudioObjectRequest =
            CreateAudioObjectRequest.builder()
                .mediaType(CreateAudioObjectRequest.MediaType.AUDIO)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val roundtrippedCreateAudioObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createAudioObjectRequest),
                jacksonTypeRef<CreateAudioObjectRequest>(),
            )

        assertThat(roundtrippedCreateAudioObjectRequest).isEqualTo(createAudioObjectRequest)
    }
}
