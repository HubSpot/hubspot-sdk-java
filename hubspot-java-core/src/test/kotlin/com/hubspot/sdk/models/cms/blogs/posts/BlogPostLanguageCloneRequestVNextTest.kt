// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogPostLanguageCloneRequestVNextTest {

    @Test
    fun create() {
        val blogPostLanguageCloneRequestVNext =
            BlogPostLanguageCloneRequestVNext.builder()
                .id("id")
                .language("language")
                .usePublished(true)
                .build()

        assertThat(blogPostLanguageCloneRequestVNext.id()).isEqualTo("id")
        assertThat(blogPostLanguageCloneRequestVNext.language()).contains("language")
        assertThat(blogPostLanguageCloneRequestVNext.usePublished()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogPostLanguageCloneRequestVNext =
            BlogPostLanguageCloneRequestVNext.builder()
                .id("id")
                .language("language")
                .usePublished(true)
                .build()

        val roundtrippedBlogPostLanguageCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogPostLanguageCloneRequestVNext),
                jacksonTypeRef<BlogPostLanguageCloneRequestVNext>(),
            )

        assertThat(roundtrippedBlogPostLanguageCloneRequestVNext)
            .isEqualTo(blogPostLanguageCloneRequestVNext)
    }
}
