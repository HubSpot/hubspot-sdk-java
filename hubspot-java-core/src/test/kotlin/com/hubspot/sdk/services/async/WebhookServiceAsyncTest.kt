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
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookCreateSubscriptionsBatchParams
import com.hubspot.sdk.models.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetEarliestLocalJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetLatestLocalJournalParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetLocalJournalBatchParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextJournalAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetNextLocalJournalAfterOffsetParams
import com.hubspot.sdk.models.webhooks.WebhookGetSubscriptionParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSettingsParams
import com.hubspot.sdk.models.webhooks.WebhookUpdateSubscriptionParams
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
    fun createSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
    fun createSubscriptionsBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseSubscriptionResponseFuture =
            webhookServiceAsync.createSubscriptionsBatch(
                WebhookCreateSubscriptionsBatchParams.builder()
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
    fun deleteJournalSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.deleteJournalSubscription(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortalSubscriptions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future = webhookServiceAsync.deletePortalSubscriptions(0L)

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
    fun deleteSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val future =
            webhookServiceAsync.deleteSubscription(
                WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

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

    @Test
    fun getEarliestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getEarliestJournal(
                WebhookGetEarliestJournalParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
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
    fun getEarliestLocalJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getEarliestLocalJournal(
                WebhookGetEarliestLocalJournalParams.builder().installPortalId(0).build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getJournalBatch(
                WebhookGetJournalBatchParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatchAfterOffset() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getJournalBatchAfterOffset(
                WebhookGetJournalBatchAfterOffsetParams.builder()
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

    @Test
    fun getLatestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLatestJournal(
                WebhookGetLatestJournalParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
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
    fun getLatestLocalJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLatestLocalJournal(
                WebhookGetLatestLocalJournalParams.builder().installPortalId(0).build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getLocalJournalBatch(
                WebhookGetLocalJournalBatchParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseJournalFetchResponse = batchResponseJournalFetchResponseFuture.get()
        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatchAfterOffset() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val batchResponseJournalFetchResponseFuture =
            webhookServiceAsync.getLocalJournalBatchAfterOffset(
                WebhookGetLocalJournalBatchAfterOffsetParams.builder()
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
    fun getNextJournalAfterOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getNextJournalAfterOffset(
                WebhookGetNextJournalAfterOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextLocalJournalAfterOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookServiceAsync = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getNextLocalJournalAfterOffset(
                WebhookGetNextLocalJournalAfterOffsetParams.builder()
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
    fun getSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val filterResponseFuture = webhookServiceAsync.getSubscriptionFilter(0L)

        val filterResponse = filterResponseFuture.get()
        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilters() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val filterResponsesFuture = webhookServiceAsync.getSubscriptionFilters(0L)

        val filterResponses = filterResponsesFuture.get()
        filterResponses.forEach { it.validate() }
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
    fun listSubscriptions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

        val subscriptionListResponseFuture = webhookServiceAsync.listSubscriptions(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSubscription() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val webhookServiceAsync = client.webhooks()

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
