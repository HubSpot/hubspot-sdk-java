// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorDeleteBatchParamsTest {

    @Test
    fun create() {
        AuthorDeleteBatchParams.builder()
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorDeleteBatchParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
