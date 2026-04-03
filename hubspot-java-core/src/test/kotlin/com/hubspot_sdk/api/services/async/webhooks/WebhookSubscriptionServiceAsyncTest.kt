// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class WebhookSubscriptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCrmSnapshot() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val crmObjectSnapshotBatchResponseFuture =
            webhookSubscriptionServiceAsync.createCrmSnapshot(
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

        val crmObjectSnapshotBatchResponse = crmObjectSnapshotBatchResponseFuture.get()
        crmObjectSnapshotBatchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createJournalSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val subscriptionResponse1Future =
            webhookSubscriptionServiceAsync.createJournalSubscription(
                ObjectSubscriptionUpsertRequest.builder()
                    .addAction(ObjectSubscriptionUpsertRequest.Action.CREATE)
                    .addObjectId(0L)
                    .objectTypeId("objectTypeId")
                    .portalId(0L)
                    .addProperty("string")
                    .subscriptionType(ObjectSubscriptionUpsertRequest.SubscriptionType.OBJECT)
                    .build()
            )

        val subscriptionResponse1 = subscriptionResponse1Future.get()
        subscriptionResponse1.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val subscriptionResponseFuture =
            webhookSubscriptionServiceAsync.createSubscription(
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

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSubscriptionFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val filterCreateResponseFuture =
            webhookSubscriptionServiceAsync.createSubscriptionFilter(
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

        val filterCreateResponse = filterCreateResponseFuture.get()
        filterCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJournalSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val future = webhookSubscriptionServiceAsync.deleteJournalSubscription(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortalSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val future = webhookSubscriptionServiceAsync.deletePortalSubscriptions(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val future = webhookSubscriptionServiceAsync.deleteSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val future =
            webhookSubscriptionServiceAsync.deleteSubscription(
                WebhookSubscriptionDeleteSubscriptionParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscriptionFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val future = webhookSubscriptionServiceAsync.deleteSubscriptionFilter(0L)

        val response = future.get()
    }

    @Test
    fun getJournalEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookSubscriptionServiceAsync.getJournalEarliest(
                WebhookSubscriptionGetJournalEarliestParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getJournalLatest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookSubscriptionServiceAsync.getJournalLatest(
                WebhookSubscriptionGetJournalLatestParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getJournalNextByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookSubscriptionServiceAsync.getJournalNextByOffset(
                WebhookSubscriptionGetJournalNextByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalStatus() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val snapshotStatusResponseFuture =
            webhookSubscriptionServiceAsync.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Test
    fun getLocalJournalEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookSubscriptionServiceAsync.getLocalJournalEarliest(
                WebhookSubscriptionGetLocalJournalEarliestParams.builder()
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getLocalJournalLatest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookSubscriptionServiceAsync.getLocalJournalLatest(
                WebhookSubscriptionGetLocalJournalLatestParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getLocalJournalNextByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookSubscriptionServiceAsync.getLocalJournalNextByOffset(
                WebhookSubscriptionGetLocalJournalNextByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalStatus() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val snapshotStatusResponseFuture =
            webhookSubscriptionServiceAsync.getLocalJournalStatus(
                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
            )

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val settingsResponseFuture = webhookSubscriptionServiceAsync.getSettings(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val subscriptionResponseFuture =
            webhookSubscriptionServiceAsync.getSubscription(
                WebhookSubscriptionGetSubscriptionParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val filterResponseFuture = webhookSubscriptionServiceAsync.getSubscriptionFilter(0L)

        val filterResponse = filterResponseFuture.get()
        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilterForSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val filterResponsesFuture =
            webhookSubscriptionServiceAsync.getSubscriptionFilterForSubscription(0L)

        val filterResponses = filterResponsesFuture.get()
        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listJournalSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val collectionResponseSubscriptionResponseNoPagingFuture =
            webhookSubscriptionServiceAsync.listJournalSubscriptions()

        val collectionResponseSubscriptionResponseNoPaging =
            collectionResponseSubscriptionResponseNoPagingFuture.get()
        collectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val subscriptionListResponseFuture = webhookSubscriptionServiceAsync.listSubscriptions(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val settingsResponseFuture =
            webhookSubscriptionServiceAsync.updateSettings(
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

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookSubscriptionServiceAsync = client.webhooks().webhookSubscriptions()

        val subscriptionResponseFuture =
            webhookSubscriptionServiceAsync.updateSubscription(
                WebhookSubscriptionUpdateSubscriptionParams.builder()
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
