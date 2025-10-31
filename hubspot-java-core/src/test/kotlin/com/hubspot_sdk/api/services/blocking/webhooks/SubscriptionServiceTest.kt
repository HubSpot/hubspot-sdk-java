// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class SubscriptionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionService = client.webhooks().subscriptions()

        val subscriptionResponse =
            subscriptionService.create(
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

        subscriptionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionService = client.webhooks().subscriptions()

        val subscriptionResponse =
            subscriptionService.update(
                SubscriptionUpdateParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .subscriptionPatchRequest(
                        SubscriptionPatchRequest.builder().active(true).build()
                    )
                    .build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionService = client.webhooks().subscriptions()

        val subscriptionListResponse = subscriptionService.list(0)

        subscriptionListResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionService = client.webhooks().subscriptions()

        subscriptionService.delete(
            SubscriptionDeleteParams.builder().appId(0).subscriptionId(0).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionService = client.webhooks().subscriptions()

        val subscriptionResponse =
            subscriptionService.get(
                SubscriptionGetParams.builder().appId(0).subscriptionId(0).build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val subscriptionService = client.webhooks().subscriptions()

        val batchResponseSubscriptionResponse =
            subscriptionService.updateBatch(
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

        batchResponseSubscriptionResponse.validate()
    }
}
