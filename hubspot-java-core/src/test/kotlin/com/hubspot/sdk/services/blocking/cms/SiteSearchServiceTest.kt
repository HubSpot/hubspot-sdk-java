// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot.sdk.models.cms.sitesearch.SiteSearchSearchParams
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val siteSearchService = client.cms().siteSearch()

        val publicSearchResults =
            siteSearchService.search(
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

        publicSearchResults.validate()
    }
}
