// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchParams
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val siteSearchServiceAsync = client.cms().siteSearch()

        val publicSearchResultsFuture =
            siteSearchServiceAsync.search(
                SiteSearchSearchParams.builder()
                    .analytics(true)
                    .autocomplete(true)
                    .boostLimit(0.0)
                    .boostRecent("boostRecent")
                    .addDomain("string")
                    .addGroupId(0L)
                    .hubdbQuery("hubdbQuery")
                    .language(SiteSearchSearchParams.Language.AA)
                    .length(SiteSearchSearchParams.Length.LONG)
                    .limit(0)
                    .matchPrefix(true)
                    .offset(0)
                    .addPathPrefix("string")
                    .popularityBoost(0.0)
                    .addProperty("string")
                    .q("q")
                    .tableId(0L)
                    .addType("string")
                    .addType(SiteSearchSearchParams.Type.LANDING_PAGE)
                    .build()
            )

        val publicSearchResults = publicSearchResultsFuture.get()
        publicSearchResults.validate()
    }
}
