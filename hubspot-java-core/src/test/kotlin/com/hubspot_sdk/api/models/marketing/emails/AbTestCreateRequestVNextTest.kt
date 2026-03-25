// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbTestCreateRequestVNextTest {

    @Test
    fun create() {
        val abTestCreateRequestVNext =
            AbTestCreateRequestVNext.builder()
                .contentId("contentId")
                .variationName("variationName")
                .build()

        assertThat(abTestCreateRequestVNext.contentId()).isEqualTo("contentId")
        assertThat(abTestCreateRequestVNext.variationName()).isEqualTo("variationName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val abTestCreateRequestVNext =
            AbTestCreateRequestVNext.builder()
                .contentId("contentId")
                .variationName("variationName")
                .build()

        val roundtrippedAbTestCreateRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(abTestCreateRequestVNext),
                jacksonTypeRef<AbTestCreateRequestVNext>(),
            )

        assertThat(roundtrippedAbTestCreateRequestVNext).isEqualTo(abTestCreateRequestVNext)
    }
}
