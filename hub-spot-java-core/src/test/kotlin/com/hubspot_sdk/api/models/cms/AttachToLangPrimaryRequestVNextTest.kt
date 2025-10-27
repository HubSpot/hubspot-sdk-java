// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachToLangPrimaryRequestVNextTest {

    @Test
    fun create() {
        val attachToLangPrimaryRequestVNext =
            AttachToLangPrimaryRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryId("primaryId")
                .primaryLanguage("primaryLanguage")
                .build()

        assertThat(attachToLangPrimaryRequestVNext.id()).isEqualTo("id")
        assertThat(attachToLangPrimaryRequestVNext.language()).isEqualTo("language")
        assertThat(attachToLangPrimaryRequestVNext.primaryId()).isEqualTo("primaryId")
        assertThat(attachToLangPrimaryRequestVNext.primaryLanguage()).contains("primaryLanguage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachToLangPrimaryRequestVNext =
            AttachToLangPrimaryRequestVNext.builder()
                .id("id")
                .language("language")
                .primaryId("primaryId")
                .primaryLanguage("primaryLanguage")
                .build()

        val roundtrippedAttachToLangPrimaryRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachToLangPrimaryRequestVNext),
                jacksonTypeRef<AttachToLangPrimaryRequestVNext>(),
            )

        assertThat(roundtrippedAttachToLangPrimaryRequestVNext)
            .isEqualTo(attachToLangPrimaryRequestVNext)
    }
}
