// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateVideoObjectRequestTest {

    @Test
    fun create() {
        val createVideoObjectRequest =
            CreateVideoObjectRequest.builder()
                .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                .title("title")
                .bearerToken("bearerToken")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .transcriptUrl("transcriptUrl")
                .build()

        assertThat(createVideoObjectRequest.mediaType())
            .isEqualTo(CreateVideoObjectRequest.MediaType.VIDEO)
        assertThat(createVideoObjectRequest.title()).isEqualTo("title")
        assertThat(createVideoObjectRequest.bearerToken()).contains("bearerToken")
        assertThat(createVideoObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(createVideoObjectRequest.duration()).contains(0L)
        assertThat(createVideoObjectRequest.externalId()).contains("externalId")
        assertThat(createVideoObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(createVideoObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(createVideoObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(createVideoObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(createVideoObjectRequest.transcriptUrl()).contains("transcriptUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createVideoObjectRequest =
            CreateVideoObjectRequest.builder()
                .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                .title("title")
                .bearerToken("bearerToken")
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .transcriptUrl("transcriptUrl")
                .build()

        val roundtrippedCreateVideoObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createVideoObjectRequest),
                jacksonTypeRef<CreateVideoObjectRequest>(),
            )

        assertThat(roundtrippedCreateVideoObjectRequest).isEqualTo(createVideoObjectRequest)
    }
}
