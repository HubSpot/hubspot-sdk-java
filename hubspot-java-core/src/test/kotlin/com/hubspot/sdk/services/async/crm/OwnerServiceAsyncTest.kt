// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.crm.owners.OwnerGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OwnerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ownerServiceAsync = client.crm().owners()

        val pageFuture = ownerServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val ownerServiceAsync = client.crm().owners()

        val publicOwnerFuture =
            ownerServiceAsync.get(
                OwnerGetParams.builder()
                    .ownerId(0)
                    .archived(true)
                    .idProperty(OwnerGetParams.IdProperty.ID)
                    .build()
            )

        val publicOwner = publicOwnerFuture.get()
        publicOwner.validate()
    }
}
