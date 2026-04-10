// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActivityServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAuditLogs() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val activityService = client.account().activity()

        val page = activityService.listAuditLogs()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLoginActivities() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val activityService = client.account().activity()

        val page = activityService.listLoginActivities()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSecurityActivities() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val activityService = client.account().activity()

        val page = activityService.listSecurityActivities()

        page.response().validate()
    }
}
