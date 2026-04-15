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
internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCrmSnapshot() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val crmObjectSnapshotBatchResponse =
            webhookService.createCrmSnapshot(
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
    fun createSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse =
            webhookService.createSubscription(
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

        subscriptionResponse.validate()
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
    fun createSubscriptionsBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseSubscriptionResponse =
            webhookService.createSubscriptionsBatch(
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

        batchResponseSubscriptionResponse.validate()
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
    fun deletePortalSubscriptions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deletePortalSubscriptions(0L)
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
    fun deleteSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteSubscription(
            WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscriptionFilter() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        webhookService.deleteSubscriptionFilter(0L)
    }

    @Test
    fun getEarliestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getEarliestJournal(
                WebhookGetEarliestJournalParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
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
    fun getEarliestLocalJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getEarliestLocalJournal(
                WebhookGetEarliestLocalJournalParams.builder().installPortalId(0).build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getJournalBatch(
                WebhookGetJournalBatchParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalBatchAfterOffset() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getJournalBatchAfterOffset(
                WebhookGetJournalBatchAfterOffsetParams.builder()
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

    @Test
    fun getLatestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getLatestJournal(
                WebhookGetLatestJournalParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
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
    fun getLatestLocalJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getLatestLocalJournal(
                WebhookGetLatestLocalJournalParams.builder().installPortalId(0).build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getLocalJournalBatch(
                WebhookGetLocalJournalBatchParams.builder()
                    .installPortalId(0)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseJournalFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLocalJournalBatchAfterOffset() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val batchResponseJournalFetchResponse =
            webhookService.getLocalJournalBatchAfterOffset(
                WebhookGetLocalJournalBatchAfterOffsetParams.builder()
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
    fun getNextJournalAfterOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getNextJournalAfterOffset(
                WebhookGetNextJournalAfterOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextLocalJournalAfterOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val webhookService = client.webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getNextLocalJournalAfterOffset(
                WebhookGetNextLocalJournalAfterOffsetParams.builder()
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
    fun getSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse =
            webhookService.getSubscription(
                WebhookGetSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        subscriptionResponse.validate()
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
    fun getSubscriptionFilters() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val filterResponses = webhookService.getSubscriptionFilters(0L)

        filterResponses.forEach { it.validate() }
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
    fun listSubscriptions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionListResponse = webhookService.listSubscriptions(0)

        subscriptionListResponse.validate()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSubscription() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val webhookService = client.webhooks()

        val subscriptionResponse =
            webhookService.updateSubscription(
                WebhookUpdateSubscriptionParams.builder()
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
