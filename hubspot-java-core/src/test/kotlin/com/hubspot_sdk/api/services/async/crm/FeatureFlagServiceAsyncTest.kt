// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

internal class FeatureFlagServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val flagResponseFuture =
            featureFlagServiceAsync.update(
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

        val flagResponse = flagResponseFuture.get()
        flagResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val flagResponseFuture =
            featureFlagServiceAsync.delete(
                FeatureFlagDeleteParams.builder().appId(0).flagName("flagName").build()
            )

        val flagResponse = flagResponseFuture.get()
        flagResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deletePortalState() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val portalFlagStateResponseFuture =
            featureFlagServiceAsync.deletePortalState(
                FeatureFlagDeletePortalStateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .build()
            )

        val portalFlagStateResponse = portalFlagStateResponseFuture.get()
        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val flagResponseFuture =
            featureFlagServiceAsync.get(
                FeatureFlagGetParams.builder().appId(0).flagName("flagName").build()
            )

        val flagResponse = flagResponseFuture.get()
        flagResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPortalState() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val portalFlagStateResponseFuture =
            featureFlagServiceAsync.getPortalState(
                FeatureFlagGetPortalStateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .portalId(0)
                    .build()
            )

        val portalFlagStateResponse = portalFlagStateResponseFuture.get()
        portalFlagStateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAll() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val flagsForAppResponseFuture = featureFlagServiceAsync.listAll(0)

        val flagsForAppResponse = flagsForAppResponseFuture.get()
        flagsForAppResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPortals() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val portalFlagStateBatchResponseFuture =
            featureFlagServiceAsync.listPortals(
                FeatureFlagListPortalsParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .limit(0)
                    .startPortalId(0)
                    .build()
            )

        val portalFlagStateBatchResponse = portalFlagStateBatchResponseFuture.get()
        portalFlagStateBatchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updatePortalState() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val featureFlagServiceAsync = client.crm().featureFlags()

        val portalFlagStateResponseFuture =
            featureFlagServiceAsync.updatePortalState(
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

        val portalFlagStateResponse = portalFlagStateResponseFuture.get()
        portalFlagStateResponse.validate()
    }
}
