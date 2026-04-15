// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge.batch

import com.hubspot.sdk.models.BatchInputPropertyName
import com.hubspot.sdk.models.PropertyName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchDeleteParamsTest {

    @Test
    fun create() {
        BatchDeleteParams.builder()
            .appId(0)
            .objectType("objectType")
            .batchInputPropertyName(
                BatchInputPropertyName.builder()
                    .addInput(PropertyName.builder().name("name").build())
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchDeleteParams.builder()
                .appId(0)
                .objectType("objectType")
                .batchInputPropertyName(
                    BatchInputPropertyName.builder()
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BatchDeleteParams.builder()
                .appId(0)
                .objectType("objectType")
                .batchInputPropertyName(
                    BatchInputPropertyName.builder()
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPropertyName.builder()
                    .addInput(PropertyName.builder().name("name").build())
                    .build()
            )
    }
}
