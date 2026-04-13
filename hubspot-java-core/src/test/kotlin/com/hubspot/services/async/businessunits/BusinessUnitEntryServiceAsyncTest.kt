// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.businessunits

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessUnitEntryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByUserId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
