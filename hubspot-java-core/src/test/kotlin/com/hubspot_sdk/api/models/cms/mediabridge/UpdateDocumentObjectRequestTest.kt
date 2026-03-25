// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateDocumentObjectRequestTest {

    @Test
    fun create() {
        val updateDocumentObjectRequest =
            UpdateDocumentObjectRequest.builder()
                .mediaType(UpdateDocumentObjectRequest.MediaType.DOCUMENT)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        assertThat(updateDocumentObjectRequest.mediaType())
            .isEqualTo(UpdateDocumentObjectRequest.MediaType.DOCUMENT)
        assertThat(updateDocumentObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(updateDocumentObjectRequest.duration()).contains(0L)
        assertThat(updateDocumentObjectRequest.externalId()).contains("externalId")
        assertThat(updateDocumentObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(updateDocumentObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(updateDocumentObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(updateDocumentObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(updateDocumentObjectRequest.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateDocumentObjectRequest =
            UpdateDocumentObjectRequest.builder()
                .mediaType(UpdateDocumentObjectRequest.MediaType.DOCUMENT)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val roundtrippedUpdateDocumentObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateDocumentObjectRequest),
                jacksonTypeRef<UpdateDocumentObjectRequest>(),
            )

        assertThat(roundtrippedUpdateDocumentObjectRequest).isEqualTo(updateDocumentObjectRequest)
    }
}
