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
            BlogPostLanguageCloneRequestVNext.builder().id("id").language("language").build()

        assertThat(blogPostLanguageCloneRequestVNext.id()).isEqualTo("id")
        assertThat(blogPostLanguageCloneRequestVNext.language()).contains("language")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogPostLanguageCloneRequestVNext =
            BlogPostLanguageCloneRequestVNext.builder().id("id").language("language").build()

        val roundtrippedBlogPostLanguageCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogPostLanguageCloneRequestVNext),
                jacksonTypeRef<BlogPostLanguageCloneRequestVNext>(),
            )

        assertThat(roundtrippedBlogPostLanguageCloneRequestVNext)
            .isEqualTo(blogPostLanguageCloneRequestVNext)
    }
}
