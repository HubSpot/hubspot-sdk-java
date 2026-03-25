// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.hubspot_sdk.api.models.cms.blogs.AttachToLangPrimaryRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorAttachToLangGroupParamsTest {

    @Test
    fun create() {
        AuthorAttachToLangGroupParams.builder()
            .attachToLangPrimaryRequestVNext(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language(AttachToLangPrimaryRequestVNext.Language.AA)
                    .primaryId("primaryId")
                    .primaryLanguage(AttachToLangPrimaryRequestVNext.PrimaryLanguage.AA)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(
                    AttachToLangPrimaryRequestVNext.builder()
                        .id("id")
                        .language(AttachToLangPrimaryRequestVNext.Language.AA)
                        .primaryId("primaryId")
                        .primaryLanguage(AttachToLangPrimaryRequestVNext.PrimaryLanguage.AA)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language(AttachToLangPrimaryRequestVNext.Language.AA)
                    .primaryId("primaryId")
                    .primaryLanguage(AttachToLangPrimaryRequestVNext.PrimaryLanguage.AA)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthorAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(
                    AttachToLangPrimaryRequestVNext.builder()
                        .id("id")
                        .language(AttachToLangPrimaryRequestVNext.Language.AA)
                        .primaryId("primaryId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language(AttachToLangPrimaryRequestVNext.Language.AA)
                    .primaryId("primaryId")
                    .build()
            )
    }
}
