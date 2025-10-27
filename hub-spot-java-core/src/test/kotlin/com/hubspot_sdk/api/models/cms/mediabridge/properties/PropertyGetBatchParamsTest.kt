// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.properties

import com.hubspot_sdk.api.models.PropertyName
import com.hubspot_sdk.api.models.crm.properties.BatchReadInputPropertyName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGetBatchParamsTest {

    @Test
    fun create() {
        PropertyGetBatchParams.builder()
            .appId("appId")
            .objectType("objectType")
            .batchReadInputPropertyName(
                BatchReadInputPropertyName.builder()
                    .archived(true)
                    .addInput(PropertyName.builder().name("name").build())
                    .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PropertyGetBatchParams.builder()
                .appId("appId")
                .objectType("objectType")
                .batchReadInputPropertyName(
                    BatchReadInputPropertyName.builder()
                        .archived(true)
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PropertyGetBatchParams.builder()
                .appId("appId")
                .objectType("objectType")
                .batchReadInputPropertyName(
                    BatchReadInputPropertyName.builder()
                        .archived(true)
                        .addInput(PropertyName.builder().name("name").build())
                        .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputPropertyName.builder()
                    .archived(true)
                    .addInput(PropertyName.builder().name("name").build())
                    .dataSensitivity(BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PropertyGetBatchParams.builder()
                .appId("appId")
                .objectType("objectType")
                .batchReadInputPropertyName(
                    BatchReadInputPropertyName.builder()
                        .archived(true)
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchReadInputPropertyName.builder()
                    .archived(true)
                    .addInput(PropertyName.builder().name("name").build())
                    .build()
            )
    }
}
