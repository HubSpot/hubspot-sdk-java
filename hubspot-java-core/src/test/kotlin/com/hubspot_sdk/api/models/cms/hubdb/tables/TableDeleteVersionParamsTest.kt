// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.tables

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableDeleteVersionParamsTest {

    @Test
    fun create() {
        TableDeleteVersionParams.builder().tableIdOrName("tableIdOrName").versionId(0L).build()
    }

    @Test
    fun pathParams() {
        val params =
            TableDeleteVersionParams.builder().tableIdOrName("tableIdOrName").versionId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
