// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.webhooks.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.SubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.webhooks.SubscriptionCreateRequest
import com.hubspot_sdk.api.models.webhooks.SubscriptionPatchRequest
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionCreateParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionDeleteParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionGetParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionUpdateBatchParams
import com.hubspot_sdk.api.models.webhooks.subscriptions.SubscriptionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionServiceAsync = client.webhooks().subscriptions()

        val subscriptionResponseFuture =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .appId(0)
                    .subscriptionCreateRequest(
                        SubscriptionCreateRequest.builder()
                            .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                            .active(true)
                            .objectTypeId("objectTypeId")
                            .propertyName("email")
                            .build()
                    )
                    .build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionServiceAsync = client.webhooks().subscriptions()

        val subscriptionResponseFuture =
            subscriptionServiceAsync.update(
                SubscriptionUpdateParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .subscriptionPatchRequest(
                        SubscriptionPatchRequest.builder().active(true).build()
                    )
                    .build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionServiceAsync = client.webhooks().subscriptions()

        val subscriptionListResponseFuture = subscriptionServiceAsync.list(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionServiceAsync = client.webhooks().subscriptions()

        val future =
            subscriptionServiceAsync.delete(
                SubscriptionDeleteParams.builder().appId(0).subscriptionId(0).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionServiceAsync = client.webhooks().subscriptions()

        val subscriptionResponseFuture =
            subscriptionServiceAsync.get(
                SubscriptionGetParams.builder().appId(0).subscriptionId(0).build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionServiceAsync = client.webhooks().subscriptions()

        val batchResponseSubscriptionResponseFuture =
            subscriptionServiceAsync.updateBatch(
                SubscriptionUpdateBatchParams.builder()
                    .appId(0)
                    .batchInputSubscriptionBatchUpdateRequest(
                        BatchInputSubscriptionBatchUpdateRequest.builder()
                            .addInput(
                                SubscriptionBatchUpdateRequest.builder().id(0).active(true).build()
                            )
                            .build()
                    )
                    .build()
            )

        val batchResponseSubscriptionResponse = batchResponseSubscriptionResponseFuture.get()
        batchResponseSubscriptionResponse.validate()
    }
}
