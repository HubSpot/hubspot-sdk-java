// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectlibrary

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EnablementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAll() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val enablementService = client.crm().objectLibrary().enablement()

        val portalObjectTypeEnablementPublicResponse = enablementService.getAll()

        portalObjectTypeEnablementPublicResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeId() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val enablementService = client.crm().objectLibrary().enablement()

        val objectTypeEnablementPublicResponse = enablementService.getByObjectTypeId("objectTypeId")

        objectTypeEnablementPublicResponse.validate()
    }
}
