// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogLanguageCloneRequestVNextTest {

    @Test
    fun create() {
        val blogLanguageCloneRequestVNext =
            BlogLanguageCloneRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryLanguage("primaryLanguage")
                .slug("slug")
                .usePublished(true)
                .build()

        assertThat(blogLanguageCloneRequestVNext.id()).isEqualTo("id")
        assertThat(blogLanguageCloneRequestVNext.language()).contains("language")
        assertThat(blogLanguageCloneRequestVNext.primaryLanguage()).contains("primaryLanguage")
        assertThat(blogLanguageCloneRequestVNext.slug()).contains("slug")
        assertThat(blogLanguageCloneRequestVNext.usePublished()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogLanguageCloneRequestVNext =
            BlogLanguageCloneRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryLanguage("primaryLanguage")
                .slug("slug")
                .usePublished(true)
                .build()

        val roundtrippedBlogLanguageCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogLanguageCloneRequestVNext),
                jacksonTypeRef<BlogLanguageCloneRequestVNext>(),
            )

        assertThat(roundtrippedBlogLanguageCloneRequestVNext)
            .isEqualTo(blogLanguageCloneRequestVNext)
    }
}
