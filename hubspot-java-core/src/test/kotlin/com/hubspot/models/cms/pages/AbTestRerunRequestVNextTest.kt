// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbTestRerunRequestVNextTest {

    @Test
    fun create() {
        val abTestRerunRequestVNext =
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()

        assertThat(abTestRerunRequestVNext.abTestId()).isEqualTo("abTestId")
        assertThat(abTestRerunRequestVNext.variationId()).isEqualTo("variationId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val abTestRerunRequestVNext =
            AbTestRerunRequestVNext.builder()
                .abTestId("abTestId")
                .variationId("variationId")
                .build()

        val roundtrippedAbTestRerunRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(abTestRerunRequestVNext),
                jacksonTypeRef<AbTestRerunRequestVNext>(),
            )

        assertThat(roundtrippedAbTestRerunRequestVNext).isEqualTo(abTestRerunRequestVNext)
    }
}
