// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.visitoridentification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationTokenResponseTest {

    @Test
    fun create() {
        val identificationTokenResponse =
            IdentificationTokenResponse.builder().token("token").build()

        assertThat(identificationTokenResponse.token()).isEqualTo("token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identificationTokenResponse =
            IdentificationTokenResponse.builder().token("token").build()

        val roundtrippedIdentificationTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identificationTokenResponse),
                jacksonTypeRef<IdentificationTokenResponse>(),
            )

        assertThat(roundtrippedIdentificationTokenResponse).isEqualTo(identificationTokenResponse)
    }
}
