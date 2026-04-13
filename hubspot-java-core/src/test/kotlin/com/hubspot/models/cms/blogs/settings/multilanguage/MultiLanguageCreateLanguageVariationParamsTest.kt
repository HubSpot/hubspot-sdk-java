// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.settings.multilanguage

import com.hubspot.models.cms.blogs.settings.BlogLanguageCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiLanguageCreateLanguageVariationParamsTest {

    @Test
    fun create() {
        MultiLanguageCreateLanguageVariationParams.builder()
            .blogLanguageCloneRequestVNext(
                BlogLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .slug("slug")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MultiLanguageCreateLanguageVariationParams.builder()
                .blogLanguageCloneRequestVNext(
                    BlogLanguageCloneRequestVNext.builder()
                        .id("id")
                        .language("language")
                        .primaryLanguage("primaryLanguage")
                        .slug("slug")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BlogLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .slug("slug")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MultiLanguageCreateLanguageVariationParams.builder()
                .blogLanguageCloneRequestVNext(
                    BlogLanguageCloneRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlogLanguageCloneRequestVNext.builder().id("id").build())
    }
}
