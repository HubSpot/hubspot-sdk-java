// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlagsForAppResponseTest {

    @Test
    fun create() {
        val flagsForAppResponse = FlagsForAppResponse.builder().addFlagsForApp("string").build()

        assertThat(flagsForAppResponse.flagsForApp()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flagsForAppResponse = FlagsForAppResponse.builder().addFlagsForApp("string").build()

        val roundtrippedFlagsForAppResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flagsForAppResponse),
                jacksonTypeRef<FlagsForAppResponse>(),
            )

        assertThat(roundtrippedFlagsForAppResponse).isEqualTo(flagsForAppResponse)
    }
}
