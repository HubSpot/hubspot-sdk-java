// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCodeGetParamsTest {

    @Test
    fun create() {
        SourceCodeGetParams.builder().environment("environment").filePath("file_path").build()
    }

    @Test
    fun pathParams() {
        val params =
            SourceCodeGetParams.builder().environment("environment").filePath("file_path").build()

        assertThat(params._pathParam(0)).isEqualTo("environment")
        assertThat(params._pathParam(1)).isEqualTo("file_path")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
