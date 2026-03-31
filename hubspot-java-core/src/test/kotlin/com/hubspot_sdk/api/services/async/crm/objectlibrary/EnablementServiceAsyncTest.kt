// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objectlibrary

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EnablementServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAll() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val enablementServiceAsync = client.crm().objectLibrary().enablement()

        val portalObjectTypeEnablementPublicResponseFuture = enablementServiceAsync.getAll()

        val portalObjectTypeEnablementPublicResponse =
            portalObjectTypeEnablementPublicResponseFuture.get()
        portalObjectTypeEnablementPublicResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val enablementServiceAsync = client.crm().objectLibrary().enablement()

        val objectTypeEnablementPublicResponseFuture =
            enablementServiceAsync.getByObjectTypeId("objectTypeId")

        val objectTypeEnablementPublicResponse = objectTypeEnablementPublicResponseFuture.get()
        objectTypeEnablementPublicResponse.validate()
    }
}
