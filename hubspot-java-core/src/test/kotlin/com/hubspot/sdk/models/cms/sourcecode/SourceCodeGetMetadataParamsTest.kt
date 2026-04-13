// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.sourcecode

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCodeGetMetadataParamsTest {

    @Test
    fun create() {
        SourceCodeGetMetadataParams.builder()
            .environment("environment")
            .path("path")
            .properties("properties")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SourceCodeGetMetadataParams.builder().environment("environment").path("path").build()

        assertThat(params._pathParam(0)).isEqualTo("environment")
        assertThat(params._pathParam(1)).isEqualTo("path")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SourceCodeGetMetadataParams.builder()
                .environment("environment")
                .path("path")
                .properties("properties")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("properties", "properties").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SourceCodeGetMetadataParams.builder().environment("environment").path("path").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
