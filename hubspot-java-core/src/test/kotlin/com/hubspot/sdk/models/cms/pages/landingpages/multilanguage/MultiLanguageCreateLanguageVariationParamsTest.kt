// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.landingpages.multilanguage

import com.hubspot.sdk.models.cms.pages.ContentLanguageCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiLanguageCreateLanguageVariationParamsTest {

    @Test
    fun create() {
        MultiLanguageCreateLanguageVariationParams.builder()
            .contentLanguageCloneRequestVNext(
                ContentLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .usePublished(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MultiLanguageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(
                    ContentLanguageCloneRequestVNext.builder()
                        .id("id")
                        .language("language")
                        .primaryLanguage("primaryLanguage")
                        .usePublished(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ContentLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .usePublished(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MultiLanguageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(
                    ContentLanguageCloneRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ContentLanguageCloneRequestVNext.builder().id("id").build())
    }
}
