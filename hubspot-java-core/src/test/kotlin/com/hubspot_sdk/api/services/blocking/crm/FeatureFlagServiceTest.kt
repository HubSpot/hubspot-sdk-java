// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeletePortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetPortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdatePortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FlagPutRequest
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStatePutRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FeatureFlagServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val flagResponse =
            featureFlagService.update(
                FeatureFlagUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .flagPutRequest(
                        FlagPutRequest.builder()
                            .defaultState(FlagPutRequest.DefaultState.ABSENT)
                            .overrideState(FlagPutRequest.OverrideState.ABSENT)
                            .build()
                    )
                    .build()
            )

        flagResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val flagResponse =
            featureFlagService.delete(
                FeatureFlagDeleteParams.builder().appId(0).flagName("flagName").build()
            )

        flagResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortalState() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateResponse =
            featureFlagService.deletePortalState(
                FeatureFlagDeletePortalStateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .build()
            )

        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val flagResponse =
            featureFlagService.get(
                FeatureFlagGetParams.builder().appId(0).flagName("flagName").build()
            )

        flagResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPortalState() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateResponse =
            featureFlagService.getPortalState(
                FeatureFlagGetPortalStateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .build()
            )

        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAll() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val flagsForAppResponse = featureFlagService.listAll(0)

        flagsForAppResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPortals() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updatePortalState() {
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val featureFlagService = client.crm().featureFlags()

        val portalFlagStateResponse =
            featureFlagService.updatePortalState(
                FeatureFlagUpdatePortalStateParams.builder()
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
}
