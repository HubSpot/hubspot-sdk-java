// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseMediaBridgeObjectForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseMediaBridgeObjectForwardPaging =
            CollectionResponseMediaBridgeObjectForwardPaging.builder()
                .addResult(
                    MediaBridgeObject.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .mediaType(MediaBridgeObject.MediaType.AUDIO)
                        .title("title")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .detailsPageLink("detailsPageLink")
                        .duration(0L)
                        .externalId("externalId")
                        .fileUrl("fileUrl")
                        .oembedUrl("oembedUrl")
                        .posterUrl("posterUrl")
                        .thumbnailUrl("thumbnailUrl")
                        .video(
                            VideoObject.builder().id(0).deeplinkUrl("deeplinkUrl").fileId(0).build()
                        )
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseMediaBridgeObjectForwardPaging.results())
            .containsExactly(
                MediaBridgeObject.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .mediaType(MediaBridgeObject.MediaType.AUDIO)
                    .title("title")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .detailsPageLink("detailsPageLink")
                    .duration(0L)
                    .externalId("externalId")
                    .fileUrl("fileUrl")
                    .oembedUrl("oembedUrl")
                    .posterUrl("posterUrl")
                    .thumbnailUrl("thumbnailUrl")
                    .video(VideoObject.builder().id(0).deeplinkUrl("deeplinkUrl").fileId(0).build())
                    .build()
            )
        assertThat(collectionResponseMediaBridgeObjectForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseMediaBridgeObjectForwardPaging =
            CollectionResponseMediaBridgeObjectForwardPaging.builder()
                .addResult(
                    MediaBridgeObject.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .mediaType(MediaBridgeObject.MediaType.AUDIO)
                        .title("title")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .detailsPageLink("detailsPageLink")
                        .duration(0L)
                        .externalId("externalId")
                        .fileUrl("fileUrl")
                        .oembedUrl("oembedUrl")
                        .posterUrl("posterUrl")
                        .thumbnailUrl("thumbnailUrl")
                        .video(
                            VideoObject.builder().id(0).deeplinkUrl("deeplinkUrl").fileId(0).build()
                        )
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseMediaBridgeObjectForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseMediaBridgeObjectForwardPaging),
                jacksonTypeRef<CollectionResponseMediaBridgeObjectForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseMediaBridgeObjectForwardPaging)
            .isEqualTo(collectionResponseMediaBridgeObjectForwardPaging)
    }
}
