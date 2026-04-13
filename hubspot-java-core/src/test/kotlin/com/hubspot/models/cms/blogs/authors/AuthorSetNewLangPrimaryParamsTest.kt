// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors

import com.hubspot.models.cms.SetNewLanguagePrimaryRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorSetNewLangPrimaryParamsTest {

    @Test
    fun create() {
        AuthorSetNewLangPrimaryParams.builder()
            .setNewLanguagePrimaryRequestVNext(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(
                    SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(SetNewLanguagePrimaryRequestVNext.builder().id("id").build())
    }
}
