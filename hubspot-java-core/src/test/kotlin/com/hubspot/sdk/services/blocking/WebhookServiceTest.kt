// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
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
internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBatchEventSubscriptions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseSubscriptionResponse =
            webhookService.createBatchEventSubscriptions(
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

        batchResponseSubscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCrmSnapshots() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val crmObjectSnapshotBatchResponse =
            webhookService.createCrmSnapshots(
                CrmObjectSnapshotBatchRequest.builder()
                    .addSnapshotRequest(
                        CrmObjectSnapshotRequest.builder()
                            .objectId(0L)
                            .objectTypeId("objectTypeId")
                            .portalId(0L)
                            .addProperty("string")
                            .build()
                    )
                    .build()
            )

        crmObjectSnapshotBatchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEventSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse =
            webhookService.createEventSubscription(
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

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createJournalSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse1 =
            webhookService.createJournalSubscription(
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
    fun createSubscriptionFilter() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val filterCreateResponse =
            webhookService.createSubscriptionFilter(
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
    fun deleteEventSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteEventSubscription(
            WebhookDeleteEventSubscriptionParams.builder().appId(0).subscriptionId(0).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJournalSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteJournalSubscription(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteJournalSubscriptionForPortal() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteJournalSubscriptionForPortal(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteSettings(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscriptionFilter() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteSubscriptionFilter(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliestJournalBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getEarliestJournalBatch(
                WebhookGetEarliestJournalBatchParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getEarliestJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getEarliestJournalEntry(
                WebhookGetEarliestJournalEntryParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEarliestLocalJournalBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getEarliestLocalJournalBatch(
                WebhookGetEarliestLocalJournalBatchParams.builder()
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getEarliestLocalJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getEarliestLocalJournalEntry(
                WebhookGetEarliestLocalJournalEntryParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse =
            webhookService.getEventSubscription(
                WebhookGetEventSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatchByRequest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getJournalBatchByRequest(
                WebhookGetJournalBatchByRequestParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatchFromOffset() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getJournalBatchFromOffset(
                WebhookGetJournalBatchFromOffsetParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val snapshotStatusResponse =
            webhookService.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse1 = webhookService.getJournalSubscription(0L)

        subscriptionResponse1.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatestJournalBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getLatestJournalBatch(
                WebhookGetLatestJournalBatchParams.builder().count(1).installPortalId(0).build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getLatestJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getLatestJournalEntry(
                WebhookGetLatestJournalEntryParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLatestLocalJournalBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getLatestLocalJournalBatch(
                WebhookGetLatestLocalJournalBatchParams.builder()
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Test
    fun getLatestLocalJournalEntry(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getLatestLocalJournalEntry(
                WebhookGetLatestLocalJournalEntryParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatchByRequest() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getLocalJournalBatchByRequest(
                WebhookGetLocalJournalBatchByRequestParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatchFromOffset() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getLocalJournalBatchFromOffset(
                WebhookGetLocalJournalBatchFromOffsetParams.builder()
                    .offset("offset")
                    .count(1)
                    .installPortalId(0)
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val snapshotStatusResponse =
            webhookService.getLocalJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }

    @Test
    fun getNextJournalEntries(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getNextJournalEntries(
                WebhookGetNextJournalEntriesParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextLocalJournalEntries(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getNextLocalJournalEntries(
                WebhookGetNextLocalJournalEntriesParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val settingsResponse = webhookService.getSettings(0)

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscriptionFilter() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val filterResponse = webhookService.getSubscriptionFilter(0L)

        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventSubscriptions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionListResponse = webhookService.listEventSubscriptions(0)

        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listJournalSubscriptions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val collectionResponseSubscriptionResponseNoPaging =
            webhookService.listJournalSubscriptions()

        collectionResponseSubscriptionResponseNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptionFilters() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val filterResponses = webhookService.listSubscriptionFilters(0L)

        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse =
            webhookService.updateEventSubscription(
                WebhookUpdateEventSubscriptionParams.builder()
                    .appId(0)
                    .subscriptionId(0)
                    .subscriptionPatchRequest(
                        SubscriptionPatchRequest.builder().active(true).build()
                    )
                    .build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val settingsResponse =
            webhookService.updateSettings(
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

        settingsResponse.validate()
    }
}
