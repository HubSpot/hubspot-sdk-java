// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.conversations.visitoridentification.IdentificationTokenGenerationRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VisitorIdentificationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun generateToken() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val visitorIdentificationService = client.conversations().visitorIdentification()

        val identificationTokenResponse =
            visitorIdentificationService.generateToken(
                IdentificationTokenGenerationRequest.builder()
                    .email("visitor-email@example.com")
                    .firstName("Gob")
                    .lastName("Bluth")
                    .build()
            )

        identificationTokenResponse.validate()
    }
}
