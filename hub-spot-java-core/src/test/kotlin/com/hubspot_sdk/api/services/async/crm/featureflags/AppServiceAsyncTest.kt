// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.featureflags.FlagPutRequest
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AppServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val flagResponseFuture =
            appServiceAsync.update(
                AppUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .flagPutRequest(
                        FlagPutRequest.builder()
                            .defaultState(FlagPutRequest.DefaultState.OFF)
                            .overrideState(FlagPutRequest.OverrideState.OFF)
                            .build()
                    )
                    .build()
            )

        val flagResponse = flagResponseFuture.get()
        flagResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val flagResponseFuture =
            appServiceAsync.delete(AppDeleteParams.builder().appId(0).flagName("flagName").build())

        val flagResponse = flagResponseFuture.get()
        flagResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val flagResponseFuture =
            appServiceAsync.get(AppGetParams.builder().appId(0).flagName("flagName").build())

        val flagResponse = flagResponseFuture.get()
        flagResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPortals() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val portalFlagStateBatchResponseFuture =
            appServiceAsync.listPortals(
                AppListPortalsParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .limit(0)
                    .startPortalId(0)
                    .build()
            )

        val portalFlagStateBatchResponse = portalFlagStateBatchResponseFuture.get()
        portalFlagStateBatchResponse.validate()
    }
}
