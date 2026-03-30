// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStatePutRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeatureFlagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateResponse =
            featureFlagService.update(
                FeatureFlagUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .portalFlagStatePutRequest(
                        PortalFlagStatePutRequest.builder()
                            .flagState(PortalFlagStatePutRequest.FlagState.ABSENT)
                            .build()
                    )
                    .build()
            )

        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateResponse =
            featureFlagService.delete(
                FeatureFlagDeleteParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateResponse =
            featureFlagService.get(
                FeatureFlagGetParams.builder().appId(0).flagName("flagName").portalId(0).build()
            )

        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAll() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val featureFlagService = client.crm().featureFlags()

        val flagsForAppResponse = featureFlagService.listAll(0)

        flagsForAppResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPortals() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateBatchResponse =
            featureFlagService.listPortals(
                FeatureFlagListPortalsParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .limit(0)
                    .startPortalId(0)
                    .build()
            )

        portalFlagStateBatchResponse.validate()
    }
}
