// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateImageObjectRequestTest {

    @Test
    fun create() {
        val updateImageObjectRequest =
            UpdateImageObjectRequest.builder()
                .mediaType(UpdateImageObjectRequest.MediaType.IMAGE)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        assertThat(updateImageObjectRequest.mediaType())
            .isEqualTo(UpdateImageObjectRequest.MediaType.IMAGE)
        assertThat(updateImageObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(updateImageObjectRequest.duration()).contains(0L)
        assertThat(updateImageObjectRequest.externalId()).contains("externalId")
        assertThat(updateImageObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(updateImageObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(updateImageObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(updateImageObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(updateImageObjectRequest.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateImageObjectRequest =
            UpdateImageObjectRequest.builder()
                .mediaType(UpdateImageObjectRequest.MediaType.IMAGE)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val roundtrippedUpdateImageObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateImageObjectRequest),
                jacksonTypeRef<UpdateImageObjectRequest>(),
            )

        assertThat(roundtrippedUpdateImageObjectRequest).isEqualTo(updateImageObjectRequest)
    }
}
