// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.properties.groups

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupListParamsTest {

    @Test
    fun create() {
        GroupListParams.builder().objectType("objectType").locale("locale").build()
    }

    @Test
    fun pathParams() {
        val params = GroupListParams.builder().objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = GroupListParams.builder().objectType("objectType").locale("locale").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GroupListParams.builder().objectType("objectType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
