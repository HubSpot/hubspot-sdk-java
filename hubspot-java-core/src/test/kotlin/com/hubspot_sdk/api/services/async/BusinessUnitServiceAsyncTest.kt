// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.businessunits.BusinessUnitGetByUserIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BusinessUnitServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getByUserId() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val businessUnitServiceAsync = client.businessUnits()

        val responseFuture =
            businessUnitServiceAsync.getByUserId(
                BusinessUnitGetByUserIdParams.builder()
                    .userId("userId")
                    .addName("string")
                    .addProperty("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
