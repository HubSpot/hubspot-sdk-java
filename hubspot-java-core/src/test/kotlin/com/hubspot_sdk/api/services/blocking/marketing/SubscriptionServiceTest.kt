// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicUpdateSubscriptionStatusRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.marketing().subscriptions()

        val subscriptionDefinitionsResponse = subscriptionService.list()

        subscriptionDefinitionsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEmailStatus() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.marketing().subscriptions()

        val publicSubscriptionStatusesResponse = subscriptionService.getEmailStatus("emailAddress")

        publicSubscriptionStatusesResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun subscribe() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.marketing().subscriptions()

        val publicSubscriptionStatus =
            subscriptionService.subscribe(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .legalBasis(
                        PublicUpdateSubscriptionStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL
                    )
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )

        publicSubscriptionStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unsubscribe() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionService = client.marketing().subscriptions()

        val publicSubscriptionStatus =
            subscriptionService.unsubscribe(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .legalBasis(
                        PublicUpdateSubscriptionStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL
                    )
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )

        publicSubscriptionStatus.validate()
    }
}
