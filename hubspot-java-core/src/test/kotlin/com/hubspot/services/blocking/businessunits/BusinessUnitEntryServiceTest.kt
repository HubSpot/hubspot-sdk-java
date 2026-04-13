// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.businessunits

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessUnitEntryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByUserId() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val businessUnitEntryService = client.businessUnits().businessUnitEntries()

        val collectionResponsePublicBusinessUnitNoPaging =
            businessUnitEntryService.getByUserId(
                BusinessUnitEntryGetByUserIdParams.builder()
                    .userId("userId")
                    .addName("string")
                    .addProperty("string")
                    .build()
            )

        collectionResponsePublicBusinessUnitNoPaging.validate()
    }
}
