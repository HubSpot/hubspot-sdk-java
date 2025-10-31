// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objectlibrary

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnablementServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val enablementServiceAsync = client.crm().objectLibrary().enablement()

        val portalObjectTypeEnablementPublicResponseFuture = enablementServiceAsync.list()

        val portalObjectTypeEnablementPublicResponse =
            portalObjectTypeEnablementPublicResponseFuture.get()
        portalObjectTypeEnablementPublicResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val enablementServiceAsync = client.crm().objectLibrary().enablement()

        val objectTypeEnablementPublicResponseFuture = enablementServiceAsync.get("objectTypeId")

        val objectTypeEnablementPublicResponse = objectTypeEnablementPublicResponseFuture.get()
        objectTypeEnablementPublicResponse.validate()
    }
}
