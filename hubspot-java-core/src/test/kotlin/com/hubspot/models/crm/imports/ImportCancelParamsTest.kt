// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.imports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportCancelParamsTest {

    @Test
    fun create() {
        ImportCancelParams.builder().importId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ImportCancelParams.builder().importId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
