// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.properties.batch

import com.hubspot.core.http.QueryParams
import com.hubspot.models.BatchReadInputPropertyName
import com.hubspot.models.PropertyName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetParamsTest {

    @Test
    fun create() {
        BatchGetParams.builder()
            .objectType("objectType")
            .locale("locale")
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

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BatchGetParams.builder()
                .objectType("objectType")
                .locale("locale")
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("locale", "locale").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BatchGetParams.builder()
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            BatchGetParams.builder()
                .objectType("objectType")
                .locale("locale")
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchGetParams.builder()
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
