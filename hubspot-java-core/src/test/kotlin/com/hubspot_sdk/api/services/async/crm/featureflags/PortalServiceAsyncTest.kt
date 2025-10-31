// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.featureflags.BatchPortalEntry
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchDeleteRequest
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchPutRequest
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStatePutRequest
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortalServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalServiceAsync = client.crm().featureFlags().portals()

        val portalFlagStateResponseFuture =
            portalServiceAsync.update(
                PortalUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .portalFlagStatePutRequest(
                        PortalFlagStatePutRequest.builder()
                            .flagState(PortalFlagStatePutRequest.FlagState.OFF)
                            .build()
                    )
                    .build()
            )

        val portalFlagStateResponse = portalFlagStateResponseFuture.get()
        portalFlagStateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalServiceAsync = client.crm().featureFlags().portals()

        val portalFlagStateResponseFuture =
            portalServiceAsync.delete(
                PortalDeleteParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        val portalFlagStateResponse = portalFlagStateResponseFuture.get()
        portalFlagStateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDelete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalServiceAsync = client.crm().featureFlags().portals()

        val portalFlagStateBatchResponseFuture =
            portalServiceAsync.batchDelete(
                PortalBatchDeleteParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalFlagStateBatchDeleteRequest(
                        PortalFlagStateBatchDeleteRequest.builder().addPortalId(0).build()
                    )
                    .build()
            )

        val portalFlagStateBatchResponse = portalFlagStateBatchResponseFuture.get()
        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpsert() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalServiceAsync = client.crm().featureFlags().portals()

        val portalFlagStateBatchResponseFuture =
            portalServiceAsync.batchUpsert(
                PortalBatchUpsertParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalFlagStateBatchPutRequest(
                        PortalFlagStateBatchPutRequest.builder()
                            .addPortalState(
                                BatchPortalEntry.builder()
                                    .flagState(BatchPortalEntry.FlagState.OFF)
                                    .portalId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val portalFlagStateBatchResponse = portalFlagStateBatchResponseFuture.get()
        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalServiceAsync = client.crm().featureFlags().portals()

        val portalFlagStateResponseFuture =
            portalServiceAsync.get(
                PortalGetParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        val portalFlagStateResponse = portalFlagStateResponseFuture.get()
        portalFlagStateResponse.validate()
    }
}
