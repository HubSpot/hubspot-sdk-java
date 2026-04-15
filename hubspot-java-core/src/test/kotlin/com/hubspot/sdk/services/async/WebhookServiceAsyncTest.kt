// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.webhooks.BatchInputSubscriptionBatchUpdateRequest
import com.hubspot.sdk.models.webhooks.Condition
import com.hubspot.sdk.models.webhooks.CrmObjectSnapshotBatchRequest
import com.hubspot.sdk.models.webhooks.CrmObjectSnapshotRequest
import com.hubspot.sdk.models.webhooks.Filter
import com.hubspot.sdk.models.webhooks.FilterCreateRequest
import com.hubspot.sdk.models.webhooks.ObjectSubscriptionUpsertRequest
import com.hubspot.sdk.models.webhooks.SettingsChangeRequest
import com.hubspot.sdk.models.webhooks.SubscriptionBatchUpdateRequest
import com.hubspot.sdk.models.webhooks.SubscriptionCreateRequest
import com.hubspot.sdk.models.webhooks.SubscriptionPatchRequest
import com.hubspot.sdk.models.webhooks.ThrottlingSettings
import com.hubspot.sdk.models.webhooks.WebhookCreateBatchEventSubscriptionsParams
import com.hubspot.sdk.models.webhooks.WebhookCreateEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchByRequestParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchFromOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalEntryParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchByRequestParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchFromOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextJournalEntriesParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextLocalJournalEntriesParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateEventSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSettingsParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBatchEventSubscriptions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseSubscriptionResponseFuture =
            webhookServiceAsync.createBatchEventSubscriptions(
                WebhookCreateBatchEventSubscriptionsParams.builder()
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
    fun createCrmSnapshots() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val crmObjectSnapshotBatchResponseFuture =
            webhookServiceAsync.createCrmSnapshots(
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
    fun createEventSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val subscriptionResponseFuture =
            webhookServiceAsync.createEventSubscription(
                WebhookCreateEventSubscriptionParams.builder()
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
    fun createJournalSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
    fun createSubscriptionFilter() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
    fun deleteEventSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future =
            webhookServiceAsync.deleteEventSubscription(
                WebhookDeleteEventSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJournalSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.deleteJournalSubscription(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJournalSubscriptionForPortal() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.deleteJournalSubscriptionForPortal(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.deleteSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscriptionFilter() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.deleteSubscriptionFilter(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliestJournalBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getEarliestJournalBatch(
                WebhookGetEarliestJournalBatchParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getEarliestJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getEarliestJournalEntry(
                WebhookGetEarliestJournalEntryParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliestLocalJournalBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getEarliestLocalJournalBatch(
                WebhookGetEarliestLocalJournalBatchParams.builder()
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getEarliestLocalJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getEarliestLocalJournalEntry(
                WebhookGetEarliestLocalJournalEntryParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val subscriptionResponseFuture =
            webhookServiceAsync.getEventSubscription(
                WebhookGetEventSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val subscriptionResponse = subscriptionResponseFuture.get()
        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatchByRequest() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getJournalBatchByRequest(
                WebhookGetJournalBatchByRequestParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatchFromOffset() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getJournalBatchFromOffset(
                WebhookGetJournalBatchFromOffsetParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val snapshotStatusResponseFuture =
            webhookServiceAsync.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val subscriptionResponse1Future = webhookServiceAsync.getJournalSubscription(0L)

        val subscriptionResponse1 = subscriptionResponse1Future.get()
        subscriptionResponse1.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatestJournalBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getLatestJournalBatch(
                WebhookGetLatestJournalBatchParams.builder().count(1).installPortalId(0).build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getLatestJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLatestJournalEntry(
                WebhookGetLatestJournalEntryParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatestLocalJournalBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getLatestLocalJournalBatch(
                WebhookGetLatestLocalJournalBatchParams.builder()
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getLatestLocalJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLatestLocalJournalEntry(
                WebhookGetLatestLocalJournalEntryParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatchByRequest() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getLocalJournalBatchByRequest(
                WebhookGetLocalJournalBatchByRequestParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatchFromOffset() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getLocalJournalBatchFromOffset(
                WebhookGetLocalJournalBatchFromOffsetParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val snapshotStatusResponseFuture =
            webhookServiceAsync.getLocalJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Test
    fun getNextJournalEntries(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getNextJournalEntries(
                WebhookGetNextJournalEntriesParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextLocalJournalEntries(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getNextLocalJournalEntries(
                WebhookGetNextLocalJournalEntriesParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val settingsResponseFuture = webhookServiceAsync.getSettings(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilter() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val filterResponseFuture = webhookServiceAsync.getSubscriptionFilter(0L)

        val filterResponse = filterResponseFuture.get()
        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventSubscriptions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val subscriptionListResponseFuture = webhookServiceAsync.listEventSubscriptions(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listJournalSubscriptions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val collectionResponseSubscriptionResponseNoPagingFuture =
            webhookServiceAsync.listJournalSubscriptions()

        val collectionResponseSubscriptionResponseNoPaging =
            collectionResponseSubscriptionResponseNoPagingFuture.get()
        collectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptionFilters() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val filterResponsesFuture = webhookServiceAsync.listSubscriptionFilters(0L)

        val filterResponses = filterResponsesFuture.get()
        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val subscriptionResponseFuture =
            webhookServiceAsync.updateEventSubscription(
                WebhookUpdateEventSubscriptionParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
}
