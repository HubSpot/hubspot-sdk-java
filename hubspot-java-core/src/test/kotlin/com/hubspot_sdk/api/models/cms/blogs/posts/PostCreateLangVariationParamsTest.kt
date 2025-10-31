// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostCreateLangVariationParamsTest {

    @Test
    fun create() {
        PostCreateLangVariationParams.builder()
            .blogPostLanguageCloneRequestVNext(
                BlogPostLanguageCloneRequestVNext.builder().id("id").language("language").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PostCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(
                    BlogPostLanguageCloneRequestVNext.builder()
                        .id("id")
                        .language("language")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BlogPostLanguageCloneRequestVNext.builder().id("id").language("language").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PostCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(
                    BlogPostLanguageCloneRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlogPostLanguageCloneRequestVNext.builder().id("id").build())
    }
}
