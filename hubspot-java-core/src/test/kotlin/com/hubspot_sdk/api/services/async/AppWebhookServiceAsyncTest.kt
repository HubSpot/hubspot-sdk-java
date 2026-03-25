// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookBatchUpdateSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.appwebhooks.SettingsChangeRequest
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionBatchUpdateRequest
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionCreateRequest
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionPatchRequest
import com.hubspot_sdk.api.models.appwebhooks.ThrottlingSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AppWebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchUpdateSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val batchResponseSubscriptionResponseFuture =
            appWebhookServiceAsync.batchUpdateSubscriptions(
                AppWebhookBatchUpdateSubscriptionsParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val subscriptionResponseFuture =
            appWebhookServiceAsync.createSubscription(
                AppWebhookCreateSubscriptionParams.builder()
                    .appId(0)
                    .subscriptionCreateRequest(
                        SubscriptionCreateRequest.builder()
                            .active(true)
                            .eventType(
                                SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE
                            )
                            .eventTypeName("eventTypeName")
                            .objectTypeId("objectTypeId")
                            .propertyName("propertyName")
                            .build()
                    )
                    .build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val future = appWebhookServiceAsync.deleteSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val future =
            appWebhookServiceAsync.deleteSubscription(
                AppWebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val settingsResponseFuture = appWebhookServiceAsync.getSettings(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val subscriptionResponseFuture =
            appWebhookServiceAsync.getSubscription(
                AppWebhookGetSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val subscriptionListResponseFuture = appWebhookServiceAsync.listSubscriptions(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val settingsResponseFuture =
            appWebhookServiceAsync.updateSettings(
                AppWebhookUpdateSettingsParams.builder()
                    .appId(0)
                    .settingsChangeRequest(
                        SettingsChangeRequest.builder()
                            .targetUrl("targetUrl")
                            .throttling(
                                ThrottlingSettings.builder().maxConcurrentRequests(0).build()
                            )
                            .build()
                    )
                    .build()
            )

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookServiceAsync = client.appWebhooks()

        val subscriptionResponseFuture =
            appWebhookServiceAsync.updateSubscription(
                AppWebhookUpdateSubscriptionParams.builder()
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
}
