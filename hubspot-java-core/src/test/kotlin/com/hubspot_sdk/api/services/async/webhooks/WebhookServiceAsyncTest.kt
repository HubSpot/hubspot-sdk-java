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
import com.hubspot_sdk.api.models.webhooks.webhooks.SettingsChangeRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionCreateRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.SubscriptionPatchRequest
import com.hubspot_sdk.api.models.webhooks.webhooks.ThrottlingSettings
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetEarliestJournalLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetEarliestJournalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLatestJournalLocalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetLatestJournalParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetNextJournalByOffsetParams
import com.hubspot_sdk.api.models.webhooks.webhooks.WebhookGetNextJournalLocalByOffsetParams
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
    fun createFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val filterCreateResponseFuture =
            webhookServiceAsync.createFilter(
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
    fun createSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
    fun deleteFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deleteFilter(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortal() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deletePortal(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future = webhookServiceAsync.deleteSettings(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val future =
            webhookServiceAsync.deleteSubscription(
                WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        val response = future.get()
    }

    @Test
    fun getEarliestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getEarliestJournal(
                WebhookGetEarliestJournalParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getEarliestJournalLocal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getEarliestJournalLocal(
                WebhookGetEarliestJournalLocalParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFilter() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val filterResponseFuture = webhookServiceAsync.getFilter(0L)

        val filterResponse = filterResponseFuture.get()
        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFilterBySubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val filterResponsesFuture = webhookServiceAsync.getFilterBySubscription(0L)

        val filterResponses = filterResponsesFuture.get()
        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalLocalStatus() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val snapshotStatusResponseFuture =
            webhookServiceAsync.getJournalLocalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalStatus() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val snapshotStatusResponseFuture =
            webhookServiceAsync.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val snapshotStatusResponse = snapshotStatusResponseFuture.get()
        snapshotStatusResponse.validate()
    }

    @Test
    fun getLatestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLatestJournal(
                WebhookGetLatestJournalParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getLatestJournalLocal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getLatestJournalLocal(
                WebhookGetLatestJournalLocalParams.builder().installPortalId(0).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextJournalByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getNextJournalByOffset(
                WebhookGetNextJournalByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextJournalLocalByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookServiceAsync = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            webhookServiceAsync.getNextJournalLocalByOffset(
                WebhookGetNextJournalLocalByOffsetParams.builder()
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val settingsResponseFuture = webhookServiceAsync.getSettings(0)

        val settingsResponse = settingsResponseFuture.get()
        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
    fun listSubscriptions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookServiceAsync = client.webhooks().webhooks()

        val subscriptionListResponseFuture = webhookServiceAsync.listSubscriptions(0)

        val subscriptionListResponse = subscriptionListResponseFuture.get()
        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
