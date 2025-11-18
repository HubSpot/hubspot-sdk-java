// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReportServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun requestHighUsageReport() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val reportServiceAsync = client.crm().associations().v4().report()

        val reportCreationResponseFuture = reportServiceAsync.requestHighUsageReport(0)

        val reportCreationResponse = reportCreationResponseFuture.get()
        reportCreationResponse.validate()
    }
}
