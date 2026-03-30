// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts.multilanguage

import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiLanguageAttachToLangGroupParamsTest {

    @Test
    fun create() {
        MultiLanguageAttachToLangGroupParams.builder()
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
            MultiLanguageAttachToLangGroupParams.builder()
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
            MultiLanguageAttachToLangGroupParams.builder()
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
