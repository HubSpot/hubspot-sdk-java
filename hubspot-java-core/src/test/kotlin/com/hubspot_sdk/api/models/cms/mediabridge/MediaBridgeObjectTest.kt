// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeObjectTest {

    @Test
    fun create() {
        val mediaBridgeObject =
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

        assertThat(mediaBridgeObject.id()).isEqualTo("id")
        assertThat(mediaBridgeObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mediaBridgeObject.mediaType()).isEqualTo(MediaBridgeObject.MediaType.AUDIO)
        assertThat(mediaBridgeObject.title()).isEqualTo("title")
        assertThat(mediaBridgeObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mediaBridgeObject.detailsPageLink()).contains("detailsPageLink")
        assertThat(mediaBridgeObject.duration()).contains(0L)
        assertThat(mediaBridgeObject.externalId()).contains("externalId")
        assertThat(mediaBridgeObject.fileUrl()).contains("fileUrl")
        assertThat(mediaBridgeObject.oembedUrl()).contains("oembedUrl")
        assertThat(mediaBridgeObject.posterUrl()).contains("posterUrl")
        assertThat(mediaBridgeObject.thumbnailUrl()).contains("thumbnailUrl")
        assertThat(mediaBridgeObject.video())
            .contains(VideoObject.builder().id(0).deeplinkUrl("deeplinkUrl").fileId(0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaBridgeObject =
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

        val roundtrippedMediaBridgeObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaBridgeObject),
                jacksonTypeRef<MediaBridgeObject>(),
            )

        assertThat(roundtrippedMediaBridgeObject).isEqualTo(mediaBridgeObject)
    }
}
