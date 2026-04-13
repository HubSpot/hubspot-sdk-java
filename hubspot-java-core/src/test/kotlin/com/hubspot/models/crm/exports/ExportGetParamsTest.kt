// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.exports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportGetParamsTest {

    @Test
    fun create() {
        ExportGetParams.builder().exportId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ExportGetParams.builder().exportId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
