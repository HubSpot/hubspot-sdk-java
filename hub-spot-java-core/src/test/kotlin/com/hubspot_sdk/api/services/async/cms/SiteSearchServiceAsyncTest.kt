// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiteSearchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getIndexedData() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val siteSearchServiceAsync = client.cms().siteSearch()

        val indexedDataFuture =
            siteSearchServiceAsync.getIndexedData(
                SiteSearchGetIndexedDataParams.builder()
                    .contentId("contentId")
                    .type(SiteSearchGetIndexedDataParams.Type.LANDING_PAGE)
                    .build()
            )

        val indexedData = indexedDataFuture.get()
        indexedData.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val siteSearchServiceAsync = client.cms().siteSearch()

        val publicSearchResultsFuture =
            siteSearchServiceAsync.search(
                SiteSearchSearchParams.builder()
                    .autocomplete(true)
                    .boostLimit(0.0)
                    .boostRecent("boostRecent")
                    .addDomain("string")
                    .addGroupId(0L)
                    .hubdbQuery("hubdbQuery")
                    .language(SiteSearchSearchParams.Language.AF)
                    .length(SiteSearchSearchParams.Length.SHORT)
                    .limit(0)
                    .matchPrefix(true)
                    .offset(0)
                    .addPathPrefix("string")
                    .popularityBoost(0.0)
                    .addProperty("string")
                    .q("q")
                    .tableId(0L)
                    .addType(SiteSearchSearchParams.Type.LANDING_PAGE)
                    .build()
            )

        val publicSearchResults = publicSearchResultsFuture.get()
        publicSearchResults.validate()
    }
}
