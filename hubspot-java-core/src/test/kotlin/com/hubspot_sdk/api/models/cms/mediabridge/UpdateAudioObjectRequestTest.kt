// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateAudioObjectRequestTest {

    @Test
    fun create() {
        val updateAudioObjectRequest =
            UpdateAudioObjectRequest.builder()
                .mediaType(UpdateAudioObjectRequest.MediaType.AUDIO)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        assertThat(updateAudioObjectRequest.mediaType())
            .isEqualTo(UpdateAudioObjectRequest.MediaType.AUDIO)
        assertThat(updateAudioObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(updateAudioObjectRequest.duration()).contains(0L)
        assertThat(updateAudioObjectRequest.externalId()).contains("externalId")
        assertThat(updateAudioObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(updateAudioObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(updateAudioObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(updateAudioObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(updateAudioObjectRequest.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateAudioObjectRequest =
            UpdateAudioObjectRequest.builder()
                .mediaType(UpdateAudioObjectRequest.MediaType.AUDIO)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val roundtrippedUpdateAudioObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateAudioObjectRequest),
                jacksonTypeRef<UpdateAudioObjectRequest>(),
            )

        assertThat(roundtrippedUpdateAudioObjectRequest).isEqualTo(updateAudioObjectRequest)
    }
}
