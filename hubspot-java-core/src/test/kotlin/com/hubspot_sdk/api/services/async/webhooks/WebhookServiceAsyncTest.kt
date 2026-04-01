// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.webhooks

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.webhooks.webhooks.Condition
import com.hubspot_sdk.api.models.webhooks.webhooks.CrmObjectSnapshotBatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.CrmObjectSnapshotRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.Filter
import com.hubspot_sdk.api.models.webhooks.webhooks.FilterCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.ObjectSubscriptionUpsertRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SettingsChangeRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionPatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.ThrottlingSettings
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalEarliestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalLatestParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLocalJournalNextByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookUpdateSettingsParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookUpdateSubscriptionParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCrmSnapshot() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val crmObjectSnapshotBatchResponseFuture =
            webhookServiceAsync.createCrmSnapshot(
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val subscriptionResponse1Future =
            webhookServiceAsync.createJournalSubscription(
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val subscriptionResponseFuture =
            webhookServiceAsync.createSubscription(
                WebhookCreateSubscriptionParams.builder()
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val filterCreateResponseFuture =
            webhookServiceAsync.createSubscriptionFilter(
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deleteJournalSubscription(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortalSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deletePortalSubscriptions(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deleteSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future =
            webhookServiceAsync.deleteSubscription(
                WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscriptionFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deleteSubscriptionFilter(0L)

        val response = future.get()
    }

    @Test
    fun getJournalEarliest(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getJournalEarliest(
                WebhookGetJournalEarliestParams.builder().installPortalId(0).build()
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
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getJournalLatest(
                WebhookGetJournalLatestParams.builder().installPortalId(0).build()
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
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getJournalNextByOffset(
                WebhookGetJournalNextByOffsetParams.builder()
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val snapshotStatusResponseFuture =
            webhookServiceAsync.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

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
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLocalJournalEarliest(
                WebhookGetLocalJournalEarliestParams.builder().installPortalId(0).build()
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
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLocalJournalLatest(
                WebhookGetLocalJournalLatestParams.builder().installPortalId(0).build()
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
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLocalJournalNextByOffset(
                WebhookGetLocalJournalNextByOffsetParams.builder()
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val snapshotStatusResponseFuture =
            webhookServiceAsync.getLocalJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val settingsResponseFuture = webhookServiceAsync.getSettings(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val subscriptionResponseFuture =
            webhookServiceAsync.getSubscription(
                WebhookGetSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val filterResponseFuture = webhookServiceAsync.getSubscriptionFilter(0L)

        val filterResponse = filterResponseFuture.get()
        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilterForSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val filterResponsesFuture = webhookServiceAsync.getSubscriptionFilterForSubscription(0L)

        val filterResponses = filterResponsesFuture.get()
        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listJournalSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val collectionResponseSubscriptionResponseNoPagingFuture =
            webhookServiceAsync.listJournalSubscriptions()

        val collectionResponseSubscriptionResponseNoPaging =
            collectionResponseSubscriptionResponseNoPagingFuture.get()
        collectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val subscriptionListResponseFuture = webhookServiceAsync.listSubscriptions(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val settingsResponseFuture =
            webhookServiceAsync.updateSettings(
                WebhookUpdateSettingsParams.builder()
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
        val webhookServiceAsync = client.webhooks().webhooks()

        val subscriptionResponseFuture =
            webhookServiceAsync.updateSubscription(
                WebhookUpdateSubscriptionParams.builder()
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
