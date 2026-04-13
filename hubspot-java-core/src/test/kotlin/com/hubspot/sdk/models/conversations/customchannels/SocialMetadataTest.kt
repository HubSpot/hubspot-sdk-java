// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialMetadataTest {

    @Test
    fun create() {
        val socialMetadata =
            SocialMetadata.builder()
                .mediaType(SocialMetadata.MediaType.ARTICLE)
                .id("id")
                .description("description")
                .mediaTitle("mediaTitle")
                .mediaUrl("mediaUrl")
                .mediaUrlString("mediaUrlString")
                .thumbnailUrl("thumbnailUrl")
                .build()

        assertThat(socialMetadata.mediaType()).isEqualTo(SocialMetadata.MediaType.ARTICLE)
        assertThat(socialMetadata.id()).contains("id")
        assertThat(socialMetadata.description()).contains("description")
        assertThat(socialMetadata.mediaTitle()).contains("mediaTitle")
        assertThat(socialMetadata.mediaUrl()).contains("mediaUrl")
        assertThat(socialMetadata.mediaUrlString()).contains("mediaUrlString")
        assertThat(socialMetadata.thumbnailUrl()).contains("thumbnailUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialMetadata =
            SocialMetadata.builder()
                .mediaType(SocialMetadata.MediaType.ARTICLE)
                .id("id")
                .description("description")
                .mediaTitle("mediaTitle")
                .mediaUrl("mediaUrl")
                .mediaUrlString("mediaUrlString")
                .thumbnailUrl("thumbnailUrl")
                .build()

        val roundtrippedSocialMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialMetadata),
                jacksonTypeRef<SocialMetadata>(),
            )

        assertThat(roundtrippedSocialMetadata).isEqualTo(socialMetadata)
    }
}
