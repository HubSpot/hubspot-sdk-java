// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateVideoObjectRequestTest {

    @Test
    fun create() {
        val updateVideoObjectRequest =
            UpdateVideoObjectRequest.builder()
                .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                .bearerToken("bearerToken")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .transcriptUrl("transcriptUrl")
                .build()

        assertThat(updateVideoObjectRequest.mediaType())
            .isEqualTo(UpdateVideoObjectRequest.MediaType.VIDEO)
        assertThat(updateVideoObjectRequest.bearerToken()).contains("bearerToken")
        assertThat(updateVideoObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(updateVideoObjectRequest.duration()).contains(0L)
        assertThat(updateVideoObjectRequest.externalId()).contains("externalId")
        assertThat(updateVideoObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(updateVideoObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(updateVideoObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(updateVideoObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(updateVideoObjectRequest.title()).contains("title")
        assertThat(updateVideoObjectRequest.transcriptUrl()).contains("transcriptUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateVideoObjectRequest =
            UpdateVideoObjectRequest.builder()
                .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                .bearerToken("bearerToken")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .transcriptUrl("transcriptUrl")
                .build()

        val roundtrippedUpdateVideoObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateVideoObjectRequest),
                jacksonTypeRef<UpdateVideoObjectRequest>(),
            )

        assertThat(roundtrippedUpdateVideoObjectRequest).isEqualTo(updateVideoObjectRequest)
    }
}
