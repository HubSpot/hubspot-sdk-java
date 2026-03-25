// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateOtherObjectRequestTest {

    @Test
    fun create() {
        val updateOtherObjectRequest =
            UpdateOtherObjectRequest.builder()
                .mediaType(UpdateOtherObjectRequest.MediaType.OTHER)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        assertThat(updateOtherObjectRequest.mediaType())
            .isEqualTo(UpdateOtherObjectRequest.MediaType.OTHER)
        assertThat(updateOtherObjectRequest.detailsPageLink()).contains("detailsPageLink")
        assertThat(updateOtherObjectRequest.duration()).contains(0L)
        assertThat(updateOtherObjectRequest.externalId()).contains("externalId")
        assertThat(updateOtherObjectRequest.fileUrl()).contains("fileUrl")
        assertThat(updateOtherObjectRequest.oembedUrl()).contains("oembedUrl")
        assertThat(updateOtherObjectRequest.posterUrl()).contains("posterUrl")
        assertThat(updateOtherObjectRequest.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(updateOtherObjectRequest.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateOtherObjectRequest =
            UpdateOtherObjectRequest.builder()
                .mediaType(UpdateOtherObjectRequest.MediaType.OTHER)
                .detailsPageLink("detailsPageLink")
                .duration(0L)
                .externalId("externalId")
                .fileUrl("fileUrl")
                .oembedUrl("oembedUrl")
                .posterUrl("posterUrl")
                .thumbnailUrl("thumbnailUrl")
                .title("title")
                .build()

        val roundtrippedUpdateOtherObjectRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateOtherObjectRequest),
                jacksonTypeRef<UpdateOtherObjectRequest>(),
            )

        assertThat(roundtrippedUpdateOtherObjectRequest).isEqualTo(updateOtherObjectRequest)
    }
}
