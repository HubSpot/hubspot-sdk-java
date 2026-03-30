// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AbTestEndRequestVNextTest {

    @Test
    fun create() {
        val abTestEndRequestVNext =
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()

        assertThat(abTestEndRequestVNext.abTestId()).isEqualTo("abTestId")
        assertThat(abTestEndRequestVNext.winnerId()).isEqualTo("winnerId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val abTestEndRequestVNext =
            AbTestEndRequestVNext.builder().abTestId("abTestId").winnerId("winnerId").build()

        val roundtrippedAbTestEndRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(abTestEndRequestVNext),
                jacksonTypeRef<AbTestEndRequestVNext>(),
            )

        assertThat(roundtrippedAbTestEndRequestVNext).isEqualTo(abTestEndRequestVNext)
    }
}
