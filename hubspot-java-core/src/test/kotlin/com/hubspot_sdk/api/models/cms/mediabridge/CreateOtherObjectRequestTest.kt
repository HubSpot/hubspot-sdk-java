// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateOtherObjectRequestTest {

    @Test
    fun create() {
        val createOtherObjectRequest =
            CreateOtherObjectRequest.builder()
                .mediaType(CreateOtherObjectRequest.MediaType.OTHER)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        assertThat(createOtherObjectRequest.mediaType())
            .isEqualTo(CreateOtherObjectRequest.MediaType.OTHER)
        assertThat(createOtherObjectRequest.title()).isEqualTo("title")
        assertThat(createOtherObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(createOtherObjectRequest.duration()).contains(0L)
        assertThat(createOtherObjectRequest.externalId()).contains("externalId")
        assertThat(createOtherObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(createOtherObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(createOtherObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(createOtherObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createOtherObjectRequest =
            CreateOtherObjectRequest.builder()
                .mediaType(CreateOtherObjectRequest.MediaType.OTHER)
                .title("title")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val roundtrippedCreateOtherObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createOtherObjectRequest),
                jacksonTypeRef<CreateOtherObjectRequest>(),
            )

        assertThat(roundtrippedCreateOtherObjectRequest).isEqualTo(createOtherObjectRequest)
    }
}
