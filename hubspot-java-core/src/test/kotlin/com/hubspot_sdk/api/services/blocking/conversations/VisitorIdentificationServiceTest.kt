// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.conversations.visitoridentification.IdentificationTokenGenerationRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VisitorIdentificationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateToken() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val visitorIdentificationService = client.conversations().visitorIdentification()

        val identificationTokenResponse =
            visitorIdentificationService.generateToken(
                IdentificationTokenGenerationRequest.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )

        identificationTokenResponse.validate()
    }
}
