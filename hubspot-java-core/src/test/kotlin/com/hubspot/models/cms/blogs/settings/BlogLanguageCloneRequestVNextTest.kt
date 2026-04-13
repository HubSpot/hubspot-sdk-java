// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
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
                .build()

        assertThat(blogLanguageCloneRequestVNext.id()).isEqualTo("id")
        assertThat(blogLanguageCloneRequestVNext.language()).contains("language")
        assertThat(blogLanguageCloneRequestVNext.primaryLanguage()).contains("primaryLanguage")
        assertThat(blogLanguageCloneRequestVNext.slug()).contains("slug")
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
