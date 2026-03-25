// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateImageObjectRequestTest {

    @Test
    fun create() {
        val createImageObjectRequest =
            CreateImageObjectRequest.builder()
                .mediaType(CreateImageObjectRequest.MediaType.IMAGE)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        assertThat(createImageObjectRequest.mediaType())
            .isEqualTo(CreateImageObjectRequest.MediaType.IMAGE)
        assertThat(createImageObjectRequest.title()).isEqualTo("title")
        assertThat(createImageObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(createImageObjectRequest.duration()).contains(0L)
        assertThat(createImageObjectRequest.externalId()).contains("externalId")
        assertThat(createImageObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(createImageObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(createImageObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(createImageObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createImageObjectRequest =
            CreateImageObjectRequest.builder()
                .mediaType(CreateImageObjectRequest.MediaType.IMAGE)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val roundtrippedCreateImageObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createImageObjectRequest),
                jacksonTypeRef<CreateImageObjectRequest>(),
            )

        assertThat(roundtrippedCreateImageObjectRequest).isEqualTo(createImageObjectRequest)
    }
}
