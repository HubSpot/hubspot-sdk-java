// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreateParamsTest {

    @Test
    fun create() {
        MediaBridgeCreateParams.builder()
            .createMbObjectRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MediaBridgeCreateParams.builder()
                .createMbObjectRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateMbObjectRequest.ofVideo(
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
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeCreateParams.builder()
                .createMbObjectRequest(
                    CreateVideoObjectRequest.builder()
                        .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                        .title("title")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateMbObjectRequest.ofVideo(
                    CreateVideoObjectRequest.builder()
                        .mediaType(CreateVideoObjectRequest.MediaType.VIDEO)
                        .title("title")
                        .build()
                )
            )
    }
}
