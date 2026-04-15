// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicObjectRequestOptionsTest {

    @Test
    fun create() {
        val publicObjectRequestOptions =
            PublicObjectRequestOptions.builder().addProperty("string").build()

        assertThat(publicObjectRequestOptions.properties()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicObjectRequestOptions =
            PublicObjectRequestOptions.builder().addProperty("string").build()

        val roundtrippedPublicObjectRequestOptions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicObjectRequestOptions),
                jacksonTypeRef<PublicObjectRequestOptions>(),
            )

        assertThat(roundtrippedPublicObjectRequestOptions).isEqualTo(publicObjectRequestOptions)
    }
}
