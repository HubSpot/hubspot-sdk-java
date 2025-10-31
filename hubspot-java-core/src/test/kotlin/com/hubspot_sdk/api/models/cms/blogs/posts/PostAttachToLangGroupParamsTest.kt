// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.posts

import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostAttachToLangGroupParamsTest {

    @Test
    fun create() {
        PostAttachToLangGroupParams.builder()
            .attachToLangPrimaryRequestVNext(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryId("primaryId")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PostAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(
                    AttachToLangPrimaryRequestVNext.builder()
                        .id("id")
                        .language("language")
                        .primaryId("primaryId")
                        .primaryLanguage("primaryLanguage")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryId("primaryId")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PostAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(
                    AttachToLangPrimaryRequestVNext.builder()
                        .id("id")
                        .language("language")
                        .primaryId("primaryId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryId("primaryId")
                    .build()
            )
    }
}
