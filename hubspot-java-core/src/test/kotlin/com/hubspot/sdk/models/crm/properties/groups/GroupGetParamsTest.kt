// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.properties.groups

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupGetParamsTest {

    @Test
    fun create() {
        GroupGetParams.builder()
            .objectType("objectType")
            .groupName("groupName")
            .locale("locale")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GroupGetParams.builder().objectType("objectType").groupName("groupName").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("groupName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            GroupGetParams.builder()
                .objectType("objectType")
                .groupName("groupName")
                .locale("locale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            GroupGetParams.builder().objectType("objectType").groupName("groupName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
