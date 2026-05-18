// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentLanguageCloneRequestVNextTest {

    @Test
    fun create() {
        val contentLanguageCloneRequestVNext =
            ContentLanguageCloneRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryLanguage("primaryLanguage")
                .usePublished(true)
                .build()

        assertThat(contentLanguageCloneRequestVNext.id()).isEqualTo("id")
        assertThat(contentLanguageCloneRequestVNext.language()).contains("language")
        assertThat(contentLanguageCloneRequestVNext.primaryLanguage()).contains("primaryLanguage")
        assertThat(contentLanguageCloneRequestVNext.usePublished()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentLanguageCloneRequestVNext =
            ContentLanguageCloneRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryLanguage("primaryLanguage")
                .usePublished(true)
                .build()

        val roundtrippedContentLanguageCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentLanguageCloneRequestVNext),
                jacksonTypeRef<ContentLanguageCloneRequestVNext>(),
            )

        assertThat(roundtrippedContentLanguageCloneRequestVNext)
            .isEqualTo(contentLanguageCloneRequestVNext)
    }
}
