// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCodeExtractAsyncParamsTest {

    @Test
    fun create() {
        SourceCodeExtractAsyncParams.builder().path("path").build()
    }

    @Test
    fun body() {
        val params = SourceCodeExtractAsyncParams.builder().path("path").build()

        val body = params._body()

        assertThat(body.path()).isEqualTo("path")
    }
}
