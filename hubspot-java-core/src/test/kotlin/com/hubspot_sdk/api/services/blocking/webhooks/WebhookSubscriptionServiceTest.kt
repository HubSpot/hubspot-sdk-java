// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.Condition
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CrmObjectSnapshotBatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.CrmObjectSnapshotRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.Filter
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.FilterCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.ObjectSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SettingsChangeRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.SubscriptionPatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.ThrottlingSettings
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetLocalJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionGetSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionUpdateSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooksubscriptions.WebhookSubscriptionUpdateSubscriptionParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class WebhookSubscriptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCrmSnapshot() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val crmObjectSnapshotBatchResponse =
            webhookSubscriptionService.createCrmSnapshot(
                CrmObjectSnapshotBatchRequest.builder()
                    .addSnapshotRequest(
                        CrmObjectSnapshotRequest.builder()
                            .objectId(0)
                            .objectTypeId("objectTypeId")
                            .portalId(0)
                            .addProperty("string")
                            .build()
                    )
                    .build()
            )

        crmObjectSnapshotBatchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createJournalSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val subscriptionResponse1 =
            webhookSubscriptionService.createJournalSubscription(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        subscriptionResponse1.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val subscriptionResponse =
            webhookSubscriptionService.createSubscription(
                WebhookSubscriptionCreateSubscriptionParams.builder()
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
    fun createSubscriptionFilter() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val filterCreateResponse =
            webhookSubscriptionService.createSubscriptionFilter(
                FilterCreateRequest.builder()
                    .filter(
                        Filter.builder()
                            .addCondition(
                                Condition.builder()
                                    .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                    .operator(Condition.Operator.CONTAINS)
                                    .property("property")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .subscriptionId(0L)
                    .build()
            )

        filterCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJournalSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        webhookSubscriptionService.deleteJournalSubscription(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortalSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        webhookSubscriptionService.deletePortalSubscriptions(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        webhookSubscriptionService.deleteSettings(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        webhookSubscriptionService.deleteSubscription(
            WebhookSubscriptionDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscriptionFilter() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        webhookSubscriptionService.deleteSubscriptionFilter(0L)
    }

    @Test
    fun getJournalEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookSubscriptionService.getJournalEarliest(
                WebhookSubscriptionGetJournalEarliestParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getJournalLatest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookSubscriptionService.getJournalLatest(
                WebhookSubscriptionGetJournalLatestParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getJournalNextByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookSubscriptionService.getJournalNextByOffset(
                WebhookSubscriptionGetJournalNextByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalStatus() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val snapshotStatusResponse =
            webhookSubscriptionService.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }

    @Test
    fun getLocalJournalEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookSubscriptionService.getLocalJournalEarliest(
                WebhookSubscriptionGetLocalJournalEarliestParams.builder()
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getLocalJournalLatest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookSubscriptionService.getLocalJournalLatest(
                WebhookSubscriptionGetLocalJournalLatestParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getLocalJournalNextByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookSubscriptionService.getLocalJournalNextByOffset(
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalStatus() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val snapshotStatusResponse =
            webhookSubscriptionService.getLocalJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val settingsResponse = webhookSubscriptionService.getSettings(0)

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val subscriptionResponse =
            webhookSubscriptionService.getSubscription(
                WebhookSubscriptionGetSubscriptionParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilter() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val filterResponse = webhookSubscriptionService.getSubscriptionFilter(0L)

        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilterForSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val filterResponses = webhookSubscriptionService.getSubscriptionFilterForSubscription(0L)

        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listJournalSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val collectionResponseSubscriptionResponseNoPaging =
            webhookSubscriptionService.listJournalSubscriptions()

        collectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val subscriptionListResponse = webhookSubscriptionService.listSubscriptions(0)

        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val settingsResponse =
            webhookSubscriptionService.updateSettings(
                WebhookSubscriptionUpdateSettingsParams.builder()
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
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookSubscriptionService = client.webhooks().webhookSubscriptions()

        val subscriptionResponse =
            webhookSubscriptionService.updateSubscription(
                WebhookSubscriptionUpdateSubscriptionParams.builder()
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
