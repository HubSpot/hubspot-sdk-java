// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.conversations

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.conversations.visitoridentification.IdentificationTokenGenerationRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VisitorIdentificationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateToken() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val visitorIdentificationServiceAsync = client.conversations().visitorIdentification()

        val identificationTokenResponseFuture =
            visitorIdentificationServiceAsync.generateToken(
                IdentificationTokenGenerationRequest.builder()
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )

        val identificationTokenResponse = identificationTokenResponseFuture.get()
        identificationTokenResponse.validate()
    }
}
