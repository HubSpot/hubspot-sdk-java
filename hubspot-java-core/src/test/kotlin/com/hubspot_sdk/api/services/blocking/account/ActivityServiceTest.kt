// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActivityServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listAuditLogs() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val activityService = client.account().activity()

        val page = activityService.listAuditLogs()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listLoginActivities() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val activityService = client.account().activity()

        val page = activityService.listLoginActivities()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSecurityActivities() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val activityService = client.account().activity()

        val page = activityService.listSecurityActivities()

        page.response().validate()
    }
}
