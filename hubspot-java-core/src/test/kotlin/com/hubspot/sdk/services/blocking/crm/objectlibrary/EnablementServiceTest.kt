// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.objectlibrary

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EnablementServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAll() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val enablementService = client.crm().objectLibrary().enablement()

        val portalObjectTypeEnablementPublicResponse = enablementService.getAll()

        portalObjectTypeEnablementPublicResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val enablementService = client.crm().objectLibrary().enablement()

        val objectTypeEnablementPublicResponse = enablementService.getByObjectTypeId("objectTypeId")

        objectTypeEnablementPublicResponse.validate()
    }
}
