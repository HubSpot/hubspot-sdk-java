// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.businessunits

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.businessunits.businessunits.BusinessUnitGetByUserIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessUnitServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByUserId() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val businessUnitService = client.businessUnits().businessUnits()

        val collectionResponsePublicBusinessUnitNoPaging =
            businessUnitService.getByUserId(
                BusinessUnitGetByUserIdParams.builder()
                    .userId("userId")
                    .addName("string")
                    .addProperty("string")
                    .build()
            )

        collectionResponsePublicBusinessUnitNoPaging.validate()
    }
}
