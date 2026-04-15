// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.tags

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCreateLangVariationParamsTest {

    @Test
    fun create() {
        TagCreateLangVariationParams.builder()
            .tagCloneRequestVNext(
                TagCloneRequestVNext.builder()
                    .id("id")
                    .name("name")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TagCreateLangVariationParams.builder()
                .tagCloneRequestVNext(
                    TagCloneRequestVNext.builder()
                        .id("id")
                        .name("name")
                        .language("language")
                        .primaryLanguage("primaryLanguage")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TagCloneRequestVNext.builder()
                    .id("id")
                    .name("name")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TagCreateLangVariationParams.builder()
                .tagCloneRequestVNext(TagCloneRequestVNext.builder().id("id").name("name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(TagCloneRequestVNext.builder().id("id").name("name").build())
    }
}
