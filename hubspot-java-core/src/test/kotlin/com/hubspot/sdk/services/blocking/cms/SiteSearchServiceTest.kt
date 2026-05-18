// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SiteSearchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getIndexedData() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val siteSearchService = client.cms().siteSearch()

        val indexedData =
            siteSearchService.getIndexedData(
                SiteSearchGetIndexedDataParams.builder().contentId("contentId").type("type").build()
            )

        indexedData.validate()
    }
}
