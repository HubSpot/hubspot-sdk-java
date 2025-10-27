// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
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
internal class PortalServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portalFlagStateResponse =
            portalService.update(
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

        portalFlagStateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portalFlagStateResponse =
            portalService.delete(
                PortalDeleteParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        portalFlagStateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchDelete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portalFlagStateBatchResponse =
            portalService.batchDelete(
                PortalBatchDeleteParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalFlagStateBatchDeleteRequest(
                        PortalFlagStateBatchDeleteRequest.builder().addPortalId(0).build()
                    )
                    .build()
            )

        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun batchUpsert() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portalFlagStateBatchResponse =
            portalService.batchUpsert(
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

        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val portalService = client.crm().featureFlags().portals()

        val portalFlagStateResponse =
            portalService.get(
                PortalGetParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        portalFlagStateResponse.validate()
    }
}
