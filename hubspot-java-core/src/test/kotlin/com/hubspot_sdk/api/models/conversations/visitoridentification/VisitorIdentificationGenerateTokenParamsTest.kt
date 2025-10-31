// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.visitoridentification

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VisitorIdentificationGenerateTokenParamsTest {

    @Test
    fun create() {
        VisitorIdentificationGenerateTokenParams.builder()
            .email("visitor-email@example.com")
            .firstName("Gob")
            .lastName("Bluth")
            .build()
    }

    @Test
    fun body() {
        val params =
            VisitorIdentificationGenerateTokenParams.builder()
                .email("visitor-email@example.com")
                .firstName("Gob")
                .lastName("Bluth")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("visitor-email@example.com")
        assertThat(body.firstName()).contains("Gob")
        assertThat(body.lastName()).contains("Bluth")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VisitorIdentificationGenerateTokenParams.builder()
                .email("visitor-email@example.com")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("visitor-email@example.com")
    }
}
