// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val app =
            appService.update(
                AppUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .defaultState(AppUpdateParams.DefaultState.OFF)
                    .overrideState(AppUpdateParams.OverrideState.OFF)
                    .build()
            )

        app.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val app = appService.delete(AppDeleteParams.builder().appId(0).flagName("flagName").build())

        app.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val app = appService.get(AppGetParams.builder().appId(0).flagName("flagName").build())

        app.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPortals() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val appService = client.crm().featureFlags().apps()

        val response =
            appService.listPortals(
                AppListPortalsParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .limit(0)
                    .startPortalId(0)
                    .build()
            )

        response.validate()
    }
}
