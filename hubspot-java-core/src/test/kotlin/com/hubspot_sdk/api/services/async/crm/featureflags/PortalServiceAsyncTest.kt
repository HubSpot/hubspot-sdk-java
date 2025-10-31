// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

        val portalFuture =
            portalServiceAsync.update(
                PortalUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .flagState(PortalUpdateParams.FlagState.OFF)
                    .build()
            )

        val portal = portalFuture.get()
        portal.validate()
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

        val portalFuture =
            portalServiceAsync.delete(
                PortalDeleteParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        val portal = portalFuture.get()
        portal.validate()
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

        val responseFuture =
            portalServiceAsync.batchDelete(
                PortalBatchDeleteParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .addPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
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

        val responseFuture =
            portalServiceAsync.batchUpsert(
                PortalBatchUpsertParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .addPortalState(
                        PortalBatchUpsertParams.PortalState.builder()
                            .flagState(PortalBatchUpsertParams.PortalState.FlagState.OFF)
                            .portalId(0)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
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

        val portalFuture =
            portalServiceAsync.get(
                PortalGetParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        val portal = portalFuture.get()
        portal.validate()
    }
}
