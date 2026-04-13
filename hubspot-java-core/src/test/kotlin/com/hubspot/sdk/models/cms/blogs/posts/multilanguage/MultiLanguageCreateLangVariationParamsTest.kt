// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.posts.multilanguage

import com.hubspot.sdk.models.cms.blogs.posts.BlogPostLanguageCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiLanguageCreateLangVariationParamsTest {

    @Test
    fun create() {
        MultiLanguageCreateLangVariationParams.builder()
            .blogPostLanguageCloneRequestVNext(
                BlogPostLanguageCloneRequestVNext.builder().id("id").language("language").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MultiLanguageCreateLangVariationParams.builder()
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
            MultiLanguageCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(
                    BlogPostLanguageCloneRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlogPostLanguageCloneRequestVNext.builder().id("id").build())
    }
}
