// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortalServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portal =
            portalService.update(
                PortalUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .flagState(PortalUpdateParams.FlagState.OFF)
                    .build()
            )

        portal.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portal =
            portalService.delete(
                PortalDeleteParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        portal.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDelete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val response =
            portalService.batchDelete(
                PortalBatchDeleteParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .addPortalId(0)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpsert() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val response =
            portalService.batchUpsert(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portal =
            portalService.get(
                PortalGetParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        portal.validate()
    }
}
