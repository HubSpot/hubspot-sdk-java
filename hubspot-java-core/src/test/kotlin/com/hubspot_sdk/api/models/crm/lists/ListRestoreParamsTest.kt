// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRestoreParamsTest {

    @Test
    fun create() {
        ListRestoreParams.builder().listId("listId").build()
    }

    @Test
    fun pathParams() {
        val params = ListRestoreParams.builder().listId("listId").build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
