// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.visitoridentification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationTokenResponseTest {

    @Test
    fun create() {
        val identificationTokenResponse =
            IdentificationTokenResponse.builder()
                .token(
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
                )
                .build()

        assertThat(identificationTokenResponse.token())
            .isEqualTo(
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identificationTokenResponse =
            IdentificationTokenResponse.builder()
                .token(
                    "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
                )
                .build()

        val roundtrippedIdentificationTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identificationTokenResponse),
                jacksonTypeRef<IdentificationTokenResponse>(),
            )

        assertThat(roundtrippedIdentificationTokenResponse).isEqualTo(identificationTokenResponse)
    }
}
