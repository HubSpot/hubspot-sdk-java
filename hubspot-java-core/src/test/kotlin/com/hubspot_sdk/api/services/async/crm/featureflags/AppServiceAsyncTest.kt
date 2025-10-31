// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val appFuture =
            appServiceAsync.update(
                AppUpdateParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .defaultState(AppUpdateParams.DefaultState.OFF)
                    .overrideState(AppUpdateParams.OverrideState.OFF)
                    .build()
            )

        val app = appFuture.get()
        app.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val appFuture =
            appServiceAsync.delete(AppDeleteParams.builder().appId(0).flagName("flagName").build())

        val app = appFuture.get()
        app.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val appFuture =
            appServiceAsync.get(AppGetParams.builder().appId(0).flagName("flagName").build())

        val app = appFuture.get()
        app.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPortals() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val appServiceAsync = client.crm().featureFlags().apps()

        val responseFuture =
            appServiceAsync.listPortals(
                AppListPortalsParams.builder()
                    .appId(0)
                    .flagName("flagName")
                    .limit(0)
                    .startPortalId(0)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
