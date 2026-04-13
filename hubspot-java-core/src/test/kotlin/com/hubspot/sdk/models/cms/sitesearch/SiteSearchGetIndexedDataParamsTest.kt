// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.sitesearch

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteSearchGetIndexedDataParamsTest {

    @Test
    fun create() {
        SiteSearchGetIndexedDataParams.builder().contentId("contentId").type("type").build()
    }

    @Test
    fun pathParams() {
        val params = SiteSearchGetIndexedDataParams.builder().contentId("contentId").build()

        assertThat(params._pathParam(0)).isEqualTo("contentId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SiteSearchGetIndexedDataParams.builder().contentId("contentId").type("type").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("type", "type").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SiteSearchGetIndexedDataParams.builder().contentId("contentId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
