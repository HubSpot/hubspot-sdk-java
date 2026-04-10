// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.owners.OwnerGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OwnerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val ownerService = client.crm().owners()

        val page = ownerService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val ownerService = client.crm().owners()

        val publicOwner =
            ownerService.get(
                OwnerGetParams.builder()
                    .ownerId(0)
                    .archived(true)
                    .idProperty(OwnerGetParams.IdProperty.ID)
                    .build()
            )

        publicOwner.validate()
    }
}
