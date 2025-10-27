// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageCreateLanguageVariationParamsTest {

    @Test
    fun create() {
        LandingPageCreateLanguageVariationParams.builder()
            .contentLanguageCloneRequestVNext(
                ContentLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(
                    ContentLanguageCloneRequestVNext.builder()
                        .id("id")
                        .language("language")
                        .primaryLanguage("primaryLanguage")
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
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LandingPageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(
                    ContentLanguageCloneRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ContentLanguageCloneRequestVNext.builder().id("id").build())
    }
}
