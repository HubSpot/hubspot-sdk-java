// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSocialMediaEggTest {

    @Test
    fun create() {
        val publicSocialMediaEgg =
            PublicSocialMediaEgg.builder()
                .socialMetadata(
                    SocialMetadata.builder()
                        .mediaType("mediaType")
                        .id("id")
                        .description("description")
                        .mediaTitle("mediaTitle")
                        .mediaUrl("mediaUrl")
                        .mediaUrlString("mediaUrlString")
                        .thumbnailUrl("thumbnailUrl")
                        .build()
                )
                .type(PublicSocialMediaEgg.Type.SOCIAL_MEDIA_METADATA)
                .build()

        assertThat(publicSocialMediaEgg.socialMetadata())
            .isEqualTo(
                SocialMetadata.builder()
                    .mediaType("mediaType")
                    .id("id")
                    .description("description")
                    .mediaTitle("mediaTitle")
                    .mediaUrl("mediaUrl")
                    .mediaUrlString("mediaUrlString")
                    .thumbnailUrl("thumbnailUrl")
                    .build()
            )
        assertThat(publicSocialMediaEgg.type())
            .isEqualTo(PublicSocialMediaEgg.Type.SOCIAL_MEDIA_METADATA)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSocialMediaEgg =
            PublicSocialMediaEgg.builder()
                .socialMetadata(
                    SocialMetadata.builder()
                        .mediaType("mediaType")
                        .id("id")
                        .description("description")
                        .mediaTitle("mediaTitle")
                        .mediaUrl("mediaUrl")
                        .mediaUrlString("mediaUrlString")
                        .thumbnailUrl("thumbnailUrl")
                        .build()
                )
                .type(PublicSocialMediaEgg.Type.SOCIAL_MEDIA_METADATA)
                .build()

        val roundtrippedPublicSocialMediaEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSocialMediaEgg),
                jacksonTypeRef<PublicSocialMediaEgg>(),
            )

        assertThat(roundtrippedPublicSocialMediaEgg).isEqualTo(publicSocialMediaEgg)
    }
}
