// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings.multilanguage

import com.hubspot_sdk.api.models.cms.blogs.SetNewLanguagePrimaryRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiLanguageSetNewLangPrimaryParamsTest {

    @Test
    fun create() {
        MultiLanguageSetNewLangPrimaryParams.builder()
            .setNewLanguagePrimaryRequestVNext(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MultiLanguageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(
                    SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SetNewLanguagePrimaryRequestVNext.builder().id("id").build())
    }
}
