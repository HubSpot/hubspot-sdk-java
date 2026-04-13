// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.tables

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableDeleteParamsTest {

    @Test
    fun create() {
        TableDeleteParams.builder().tableIdOrName("tableIdOrName").build()
    }

    @Test
    fun pathParams() {
        val params = TableDeleteParams.builder().tableIdOrName("tableIdOrName").build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
