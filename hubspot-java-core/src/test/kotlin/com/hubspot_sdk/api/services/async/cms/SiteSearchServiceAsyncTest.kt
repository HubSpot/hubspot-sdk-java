// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val siteSearchServiceAsync = client.cms().siteSearch()

        val responseFuture =
            siteSearchServiceAsync.getIndexedData(
                SiteSearchGetIndexedDataParams.builder()
                    .contentId("contentId")
                    .type(SiteSearchGetIndexedDataParams.Type.LANDING_PAGE)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val siteSearchServiceAsync = client.cms().siteSearch()

        val responseFuture =
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

        val response = responseFuture.get()
        response.validate()
    }
}
