// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSocialMetadataAttachmentTest {

    @Test
    fun create() {
        val publicSocialMetadataAttachment =
            PublicSocialMetadataAttachment.builder()
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
                .type(PublicSocialMetadataAttachment.Type.SOCIAL_MEDIA_METADATA)
                .build()

        assertThat(publicSocialMetadataAttachment.socialMetadata())
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
        assertThat(publicSocialMetadataAttachment.type())
            .isEqualTo(PublicSocialMetadataAttachment.Type.SOCIAL_MEDIA_METADATA)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSocialMetadataAttachment =
            PublicSocialMetadataAttachment.builder()
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
                .type(PublicSocialMetadataAttachment.Type.SOCIAL_MEDIA_METADATA)
                .build()

        val roundtrippedPublicSocialMetadataAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSocialMetadataAttachment),
                jacksonTypeRef<PublicSocialMetadataAttachment>(),
            )

        assertThat(roundtrippedPublicSocialMetadataAttachment)
            .isEqualTo(publicSocialMetadataAttachment)
    }
}
