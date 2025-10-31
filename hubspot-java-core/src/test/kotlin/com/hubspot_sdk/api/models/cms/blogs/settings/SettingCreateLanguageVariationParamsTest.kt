// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingCreateLanguageVariationParamsTest {

    @Test
    fun create() {
        SettingCreateLanguageVariationParams.builder()
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
            SettingCreateLanguageVariationParams.builder()
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
            SettingCreateLanguageVariationParams.builder()
                .blogLanguageCloneRequestVNext(
                    BlogLanguageCloneRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BlogLanguageCloneRequestVNext.builder().id("id").build())
    }
}
