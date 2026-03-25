// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeUpdateParamsTest {

    @Test
    fun create() {
        MediaBridgeUpdateParams.builder()
            .objectId(0L)
            .updateMbObjectRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeUpdateParams.builder()
                .objectId(0L)
                .updateMbObjectRequest(
                    UpdateVideoObjectRequest.builder()
                        .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaBridgeUpdateParams.builder()
                .objectId(0L)
                .updateMbObjectRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateMbObjectRequest.ofVideo(
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
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeUpdateParams.builder()
                .objectId(0L)
                .updateMbObjectRequest(
                    UpdateVideoObjectRequest.builder()
                        .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateMbObjectRequest.ofVideo(
                    UpdateVideoObjectRequest.builder()
                        .mediaType(UpdateVideoObjectRequest.MediaType.VIDEO)
                        .build()
                )
            )
    }
}
