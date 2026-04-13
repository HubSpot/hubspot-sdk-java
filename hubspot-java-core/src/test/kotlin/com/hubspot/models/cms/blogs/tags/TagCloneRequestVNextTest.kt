// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCloneRequestVNextTest {

    @Test
    fun create() {
        val tagCloneRequestVNext =
            TagCloneRequestVNext.builder()
                .id("id")
                .name("name")
                .language("language")
                .primaryLanguage("primaryLanguage")
                .build()

        assertThat(tagCloneRequestVNext.id()).isEqualTo("id")
        assertThat(tagCloneRequestVNext.name()).isEqualTo("name")
        assertThat(tagCloneRequestVNext.language()).contains("language")
        assertThat(tagCloneRequestVNext.primaryLanguage()).contains("primaryLanguage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tagCloneRequestVNext =
            TagCloneRequestVNext.builder()
                .id("id")
                .name("name")
                .language("language")
                .primaryLanguage("primaryLanguage")
                .build()

        val roundtrippedTagCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tagCloneRequestVNext),
                jacksonTypeRef<TagCloneRequestVNext>(),
            )

        assertThat(roundtrippedTagCloneRequestVNext).isEqualTo(tagCloneRequestVNext)
    }
}
