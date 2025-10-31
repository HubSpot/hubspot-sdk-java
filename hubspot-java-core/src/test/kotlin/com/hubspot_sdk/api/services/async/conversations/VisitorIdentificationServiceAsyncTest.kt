// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.visitoridentification.IdentificationTokenGenerationRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VisitorIdentificationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun generateToken() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val visitorIdentificationServiceAsync = client.conversations().visitorIdentification()

        val identificationTokenResponseFuture =
            visitorIdentificationServiceAsync.generateToken(
                IdentificationTokenGenerationRequest.builder()
                    .email("visitor-email@example.com")
                    .firstName("Gob")
                    .lastName("Bluth")
                    .build()
            )

        val identificationTokenResponse = identificationTokenResponseFuture.get()
        identificationTokenResponse.validate()
    }
}
