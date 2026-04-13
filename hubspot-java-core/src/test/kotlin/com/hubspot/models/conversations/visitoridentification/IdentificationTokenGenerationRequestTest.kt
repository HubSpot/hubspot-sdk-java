// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.visitoridentification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationTokenGenerationRequestTest {

    @Test
    fun create() {
        val identificationTokenGenerationRequest =
            IdentificationTokenGenerationRequest.builder()
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .build()

        assertThat(identificationTokenGenerationRequest.email()).isEqualTo("email")
        assertThat(identificationTokenGenerationRequest.firstName()).contains("firstName")
        assertThat(identificationTokenGenerationRequest.lastName()).contains("lastName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identificationTokenGenerationRequest =
            IdentificationTokenGenerationRequest.builder()
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
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
