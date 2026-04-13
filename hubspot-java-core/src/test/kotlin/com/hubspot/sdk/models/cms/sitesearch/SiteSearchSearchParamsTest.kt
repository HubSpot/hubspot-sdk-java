// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.sitesearch

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteSearchSearchParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("analytics", "true")
                    .put("autocomplete", "true")
                    .put("boostLimit", "0.0")
                    .put("boostRecent", "boostRecent")
                    .put("domain", listOf("string").joinToString(","))
                    .put("groupId", listOf("0").joinToString(","))
                    .put("hubdbQuery", "hubdbQuery")
                    .put("language", "aa")
                    .put("length", "LONG")
                    .put("limit", "0")
                    .put("matchPrefix", "true")
                    .put("offset", "0")
                    .put("pathPrefix", listOf("string").joinToString(","))
                    .put("popularityBoost", "0.0")
                    .put("property", listOf("string").joinToString(","))
                    .put("q", "q")
                    .put("tableId", "0")
                    .put("type", listOf("string").joinToString(","))
                    .put("types", listOf("LANDING_PAGE").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SiteSearchSearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
