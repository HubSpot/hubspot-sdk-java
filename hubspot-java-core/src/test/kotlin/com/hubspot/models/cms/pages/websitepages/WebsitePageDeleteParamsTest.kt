// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages.websitepages

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebsitePageDeleteParamsTest {

    @Test
    fun create() {
        WebsitePageDeleteParams.builder().objectId("objectId").archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = WebsitePageDeleteParams.builder().objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = WebsitePageDeleteParams.builder().objectId("objectId").archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebsitePageDeleteParams.builder().objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
