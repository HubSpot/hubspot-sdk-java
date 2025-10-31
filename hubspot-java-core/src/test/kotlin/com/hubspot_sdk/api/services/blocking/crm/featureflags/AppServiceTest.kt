// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.featureflags.FlagPutRequest
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AppServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val flagResponse =
            appService.update(
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

        flagResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val flagResponse =
            appService.delete(AppDeleteParams.builder().appId(0).flagName("flagName").build())

        flagResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val flagResponse =
            appService.get(AppGetParams.builder().appId(0).flagName("flagName").build())

        flagResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPortals() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val portalFlagStateBatchResponse =
            appService.listPortals(
                AppListPortalsParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .limit(0)
                    .startPortalId(0)
                    .build()
            )

        portalFlagStateBatchResponse.validate()
    }
}
