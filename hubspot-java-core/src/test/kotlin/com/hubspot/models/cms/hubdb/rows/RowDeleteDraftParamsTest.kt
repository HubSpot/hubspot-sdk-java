// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.rows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowDeleteDraftParamsTest {

    @Test
    fun create() {
        RowDeleteDraftParams.builder().tableIdOrName("tableIdOrName").rowId("321669910225").build()
    }

    @Test
    fun pathParams() {
        val params =
            RowDeleteDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        assertThat(params._pathParam(1)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
