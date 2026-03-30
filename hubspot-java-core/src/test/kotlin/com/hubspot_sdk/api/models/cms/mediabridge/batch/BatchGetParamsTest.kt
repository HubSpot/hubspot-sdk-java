// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.batch

import com.hubspot_sdk.api.models.BatchReadInputPropertyName
import com.hubspot_sdk.api.models.PropertyName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetParamsTest {

    @Test
    fun create() {
        BatchGetParams.builder()
            .appId(0)
            .objectType("objectType")
            .batchReadInputPropertyName(
                BatchReadInputPropertyName.builder()
                    .archived(true)
                    .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.HIGHLY_SENSITIVE)
                    .addInput(PropertyName.builder().name("name").build())
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchGetParams.builder()
                .appId(0)
                .objectType("objectType")
                .batchReadInputPropertyName(
                    BatchReadInputPropertyName.builder()
                        .archived(true)
                        .dataSensitivity(
                            BatchReadInputPropertyName.DataSensitivity.HIGHLY_SENSITIVE
                        )
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
            BatchGetParams.builder()
                .appId(0)
                .objectType("objectType")
                .batchReadInputPropertyName(
                    BatchReadInputPropertyName.builder()
                        .archived(true)
                        .dataSensitivity(
                            BatchReadInputPropertyName.DataSensitivity.HIGHLY_SENSITIVE
                        )
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputPropertyName.builder()
                    .archived(true)
                    .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.HIGHLY_SENSITIVE)
                    .addInput(PropertyName.builder().name("name").build())
                    .build()
            )
    }
}
