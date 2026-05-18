// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SiteSearchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getIndexedData() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val siteSearchServiceAsync = client.cms().siteSearch()

        val indexedDataFuture =
            siteSearchServiceAsync.getIndexedData(
                SiteSearchGetIndexedDataParams.builder().contentId("contentId").type("type").build()
            )

        val indexedData = indexedDataFuture.get()
        indexedData.validate()
    }
}
