// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRemoveMembershipsParamsTest {

    @Test
    fun create() {
        ListRemoveMembershipsParams.builder().listId("listId").addBody("string").build()
    }

    @Test
    fun pathParams() {
        val params =
            ListRemoveMembershipsParams.builder().listId("listId").addBody("string").build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ListRemoveMembershipsParams.builder().listId("listId").addBody("string").build()

        val body = params._body()

        assertThat(body).containsExactly("string")
    }
}
