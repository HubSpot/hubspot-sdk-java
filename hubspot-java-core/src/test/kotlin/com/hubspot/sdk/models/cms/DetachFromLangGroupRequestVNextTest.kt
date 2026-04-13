// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetachFromLangGroupRequestVNextTest {

    @Test
    fun create() {
        val detachFromLangGroupRequestVNext =
            DetachFromLangGroupRequestVNext.builder().id("id").build()

        assertThat(detachFromLangGroupRequestVNext.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detachFromLangGroupRequestVNext =
            DetachFromLangGroupRequestVNext.builder().id("id").build()

        val roundtrippedDetachFromLangGroupRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detachFromLangGroupRequestVNext),
                jacksonTypeRef<DetachFromLangGroupRequestVNext>(),
            )

        assertThat(roundtrippedDetachFromLangGroupRequestVNext)
            .isEqualTo(detachFromLangGroupRequestVNext)
    }
}
