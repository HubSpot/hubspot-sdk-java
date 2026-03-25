// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.businessunits

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.businessunits.businessunits.BusinessUnitGetByUserIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessUnitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByUserId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val businessUnitServiceAsync = client.businessUnits().businessUnits()

        val collectionResponsePublicBusinessUnitNoPagingFuture =
            businessUnitServiceAsync.getByUserId(
                BusinessUnitGetByUserIdParams.builder()
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
