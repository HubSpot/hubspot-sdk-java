// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.subscriptions.PublicUpdateSubscriptionStatusRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionServiceAsync = client.marketing().subscriptions()

        val subscriptionDefinitionsResponseFuture = subscriptionServiceAsync.list()

        val subscriptionDefinitionsResponse = subscriptionDefinitionsResponseFuture.get()
        subscriptionDefinitionsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getEmailStatus() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionServiceAsync = client.marketing().subscriptions()

        val publicSubscriptionStatusesResponseFuture =
            subscriptionServiceAsync.getEmailStatus("emailAddress")

        val publicSubscriptionStatusesResponse = publicSubscriptionStatusesResponseFuture.get()
        publicSubscriptionStatusesResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun subscribe() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionServiceAsync = client.marketing().subscriptions()

        val publicSubscriptionStatusFuture =
            subscriptionServiceAsync.subscribe(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .legalBasis(
                        PublicUpdateSubscriptionStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL
                    )
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )

        val publicSubscriptionStatus = publicSubscriptionStatusFuture.get()
        publicSubscriptionStatus.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unsubscribe() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val subscriptionServiceAsync = client.marketing().subscriptions()

        val publicSubscriptionStatusFuture =
            subscriptionServiceAsync.unsubscribe(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .legalBasis(
                        PublicUpdateSubscriptionStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL
                    )
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )

        val publicSubscriptionStatus = publicSubscriptionStatusFuture.get()
        publicSubscriptionStatus.validate()
    }
}
