// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.objects.tasks.TaskDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TaskServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val taskServiceAsync = client.crm().objects().tasks()

        val future =
            taskServiceAsync.delete(
                TaskDeleteParams.builder().objectType("objectType").objectId("objectId").build()
            )

        val response = future.get()
    }
}
