// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.visitoridentification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationTokenGenerationRequestTest {

    @Test
    fun create() {
        val identificationTokenGenerationRequest =
            IdentificationTokenGenerationRequest.builder()
                .email("visitor-email@example.com")
                .firstName("Gob")
                .lastName("Bluth")
                .build()

        assertThat(identificationTokenGenerationRequest.email())
            .isEqualTo("visitor-email@example.com")
        assertThat(identificationTokenGenerationRequest.firstName()).contains("Gob")
        assertThat(identificationTokenGenerationRequest.lastName()).contains("Bluth")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identificationTokenGenerationRequest =
            IdentificationTokenGenerationRequest.builder()
                .email("visitor-email@example.com")
                .firstName("Gob")
                .lastName("Bluth")
                .build()

        val roundtrippedIdentificationTokenGenerationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identificationTokenGenerationRequest),
                jacksonTypeRef<IdentificationTokenGenerationRequest>(),
            )

        assertThat(roundtrippedIdentificationTokenGenerationRequest)
            .isEqualTo(identificationTokenGenerationRequest)
    }
}
