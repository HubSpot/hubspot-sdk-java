// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActivityServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAuditLogs() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val activityServiceAsync = client.account().activity()

        val pageFuture = activityServiceAsync.listAuditLogs()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLoginActivities() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val activityServiceAsync = client.account().activity()

        val pageFuture = activityServiceAsync.listLoginActivities()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSecurityActivities() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val activityServiceAsync = client.account().activity()

        val pageFuture = activityServiceAsync.listSecurityActivities()

        val page = pageFuture.get()
        page.response().validate()
    }
}
