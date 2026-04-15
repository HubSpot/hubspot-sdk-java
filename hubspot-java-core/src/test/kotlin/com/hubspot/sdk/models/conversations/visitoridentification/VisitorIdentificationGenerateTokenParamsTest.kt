// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.visitoridentification

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VisitorIdentificationGenerateTokenParamsTest {

    @Test
    fun create() {
        VisitorIdentificationGenerateTokenParams.builder()
            .identificationTokenGenerationRequest(
                IdentificationTokenGenerationRequest.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VisitorIdentificationGenerateTokenParams.builder()
                .identificationTokenGenerationRequest(
                    IdentificationTokenGenerationRequest.builder()
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                IdentificationTokenGenerationRequest.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VisitorIdentificationGenerateTokenParams.builder()
                .identificationTokenGenerationRequest(
                    IdentificationTokenGenerationRequest.builder().email("email").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(IdentificationTokenGenerationRequest.builder().email("email").build())
    }
}
