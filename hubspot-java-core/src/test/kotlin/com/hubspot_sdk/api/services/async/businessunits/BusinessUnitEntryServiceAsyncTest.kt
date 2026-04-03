// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.businessunits

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessUnitEntryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByUserId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val businessUnitEntryServiceAsync = client.businessUnits().businessUnitEntries()

        val collectionResponsePublicBusinessUnitNoPagingFuture =
            businessUnitEntryServiceAsync.getByUserId(
                BusinessUnitEntryGetByUserIdParams.builder()
                    .userId("userId")
                    .addName("string")
                    .addProperty("string")
                    .build()
            )

        val collectionResponsePublicBusinessUnitNoPaging =
            collectionResponsePublicBusinessUnitNoPagingFuture.get()
        collectionResponsePublicBusinessUnitNoPaging.validate()
    }
}
