// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.webhooks

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createCrmSnapshot() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

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
    fun createFilter() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val filterCreateResponse =
            webhookService.createFilter(
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
    fun createSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

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
    fun deleteFilter() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        webhookService.deleteFilter(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortal() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        webhookService.deletePortal(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        webhookService.deleteSettings(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        webhookService.deleteSubscription(
            WebhookDeleteSubscriptionParams.builder().appId(0).subscriptionId(0).build()
        )
    }

    @Test
    fun getEarliestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookService = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getEarliestJournal(
                WebhookGetEarliestJournalParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getEarliestJournalLocal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookService = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getEarliestJournalLocal(
                WebhookGetEarliestJournalLocalParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFilter() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val filterResponse = webhookService.getFilter(0L)

        filterResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFilterBySubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val filterResponses = webhookService.getFilterBySubscription(0L)

        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalLocalStatus() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val snapshotStatusResponse =
            webhookService.getJournalLocalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getJournalStatus() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val snapshotStatusResponse =
            webhookService.getJournalStatus("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        snapshotStatusResponse.validate()
    }

    @Test
    fun getLatestJournal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookService = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getLatestJournal(
                WebhookGetLatestJournalParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getLatestJournalLocal(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookService = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getLatestJournalLocal(
                WebhookGetLatestJournalLocalParams.builder().installPortalId(0).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextJournalByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookService = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getNextJournalByOffset(
                WebhookGetNextJournalByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getNextJournalLocalByOffset(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val webhookService = client.webhooks().webhooks()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            webhookService.getNextJournalLocalByOffset(
                WebhookGetNextJournalLocalByOffsetParams.builder()
                    .offset("offset")
                    .installPortalId(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val settingsResponse = webhookService.getSettings(0)

        settingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSubscription() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val subscriptionResponse =
            webhookService.getSubscription(
                WebhookGetSubscriptionParams.builder().appId(0).subscriptionId(0).build()
            )

        subscriptionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

        val subscriptionListResponse = webhookService.listSubscriptions(0)

        subscriptionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSettings() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val webhookService = client.webhooks().webhooks()

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
