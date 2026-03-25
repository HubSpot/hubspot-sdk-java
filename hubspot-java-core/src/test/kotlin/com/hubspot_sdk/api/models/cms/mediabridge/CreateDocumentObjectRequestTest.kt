// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateDocumentObjectRequestTest {

    @Test
    fun create() {
        val createDocumentObjectRequest =
            CreateDocumentObjectRequest.builder()
                .mediaType(CreateDocumentObjectRequest.MediaType.DOCUMENT)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        assertThat(createDocumentObjectRequest.mediaType())
            .isEqualTo(CreateDocumentObjectRequest.MediaType.DOCUMENT)
        assertThat(createDocumentObjectRequest.title()).isEqualTo("title")
        assertThat(createDocumentObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(createDocumentObjectRequest.duration()).contains(0L)
        assertThat(createDocumentObjectRequest.externalId()).contains("externalId")
        assertThat(createDocumentObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(createDocumentObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(createDocumentObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(createDocumentObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createDocumentObjectRequest =
            CreateDocumentObjectRequest.builder()
                .mediaType(CreateDocumentObjectRequest.MediaType.DOCUMENT)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val roundtrippedCreateDocumentObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createDocumentObjectRequest),
                jacksonTypeRef<CreateDocumentObjectRequest>(),
            )

        assertThat(roundtrippedCreateDocumentObjectRequest).isEqualTo(createDocumentObjectRequest)
    }
}
