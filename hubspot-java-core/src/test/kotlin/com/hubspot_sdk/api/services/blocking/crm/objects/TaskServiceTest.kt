// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.objects.tasks.TaskDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TaskServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val taskService = client.crm().objects().tasks()

        taskService.delete(
            TaskDeleteParams.builder().objectType("objectType").objectId("objectId").build()
        )
    }
}
