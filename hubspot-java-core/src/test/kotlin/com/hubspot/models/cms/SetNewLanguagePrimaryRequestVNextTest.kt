// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetNewLanguagePrimaryRequestVNextTest {

    @Test
    fun create() {
        val setNewLanguagePrimaryRequestVNext =
            SetNewLanguagePrimaryRequestVNext.builder().id("id").build()

        assertThat(setNewLanguagePrimaryRequestVNext.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setNewLanguagePrimaryRequestVNext =
            SetNewLanguagePrimaryRequestVNext.builder().id("id").build()

        val roundtrippedSetNewLanguagePrimaryRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setNewLanguagePrimaryRequestVNext),
                jacksonTypeRef<SetNewLanguagePrimaryRequestVNext>(),
            )

        assertThat(roundtrippedSetNewLanguagePrimaryRequestVNext)
            .isEqualTo(setNewLanguagePrimaryRequestVNext)
    }
}
