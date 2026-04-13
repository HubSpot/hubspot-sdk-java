// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SocialMetadataIntegrationAttachmentTest {

    @Test
    fun create() {
        val socialMetadataIntegrationAttachment =
            SocialMetadataIntegrationAttachment.builder()
                .socialMetadata(
                    SocialMetadata.builder()
                        .mediaType(SocialMetadata.MediaType.ARTICLE)
                        .id("id")
                        .description("description")
                        .mediaTitle("mediaTitle")
                        .mediaUrl("mediaUrl")
                        .mediaUrlString("mediaUrlString")
                        .thumbnailUrl("thumbnailUrl")
                        .build()
                )
                .type(SocialMetadataIntegrationAttachment.Type.SOCIAL_MEDIA_METADATA)
                .build()

        assertThat(socialMetadataIntegrationAttachment.socialMetadata())
            .isEqualTo(
                SocialMetadata.builder()
                    .mediaType(SocialMetadata.MediaType.ARTICLE)
                    .id("id")
                    .description("description")
                    .mediaTitle("mediaTitle")
                    .mediaUrl("mediaUrl")
                    .mediaUrlString("mediaUrlString")
                    .thumbnailUrl("thumbnailUrl")
                    .build()
            )
        assertThat(socialMetadataIntegrationAttachment.type())
            .isEqualTo(SocialMetadataIntegrationAttachment.Type.SOCIAL_MEDIA_METADATA)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val socialMetadataIntegrationAttachment =
            SocialMetadataIntegrationAttachment.builder()
                .socialMetadata(
                    SocialMetadata.builder()
                        .mediaType(SocialMetadata.MediaType.ARTICLE)
                        .id("id")
                        .description("description")
                        .mediaTitle("mediaTitle")
                        .mediaUrl("mediaUrl")
                        .mediaUrlString("mediaUrlString")
                        .thumbnailUrl("thumbnailUrl")
                        .build()
                )
                .type(SocialMetadataIntegrationAttachment.Type.SOCIAL_MEDIA_METADATA)
                .build()

        val roundtrippedSocialMetadataIntegrationAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(socialMetadataIntegrationAttachment),
                jacksonTypeRef<SocialMetadataIntegrationAttachment>(),
            )

        assertThat(roundtrippedSocialMetadataIntegrationAttachment)
            .isEqualTo(socialMetadataIntegrationAttachment)
    }
}
