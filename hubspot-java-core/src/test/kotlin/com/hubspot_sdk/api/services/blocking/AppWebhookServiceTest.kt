// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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

internal class AppWebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchUpdateSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val batchResponseSubscriptionResponse =
            appWebhookService.batchUpdateSubscriptions(
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

        batchResponseSubscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val subscriptionResponse =
            appWebhookService.createSubscription(
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

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        appWebhookService.deleteSettings(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        appWebhookService.deleteSubscription(
            AppWebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val settingsResponse = appWebhookService.getSettings(0)

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val subscriptionResponse =
            appWebhookService.getSubscription(
                AppWebhookGetSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val subscriptionListResponse = appWebhookService.listSubscriptions(0)

        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val settingsResponse =
            appWebhookService.updateSettings(
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

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val appWebhookService = client.appWebhooks()

        val subscriptionResponse =
            appWebhookService.updateSubscription(
                AppWebhookUpdateSubscriptionParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .subscriptionPatchRequest(
                        SubscriptionPatchRequest.builder().active(true).build()
                    )
                    .build()
            )

        subscriptionResponse.validate()
    }
}
