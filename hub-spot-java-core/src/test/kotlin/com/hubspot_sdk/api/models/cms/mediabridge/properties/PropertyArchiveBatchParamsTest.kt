// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.properties

import com.hubspot_sdk.api.models.BatchInputPropertyName
import com.hubspot_sdk.api.models.PropertyName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyArchiveBatchParamsTest {

    @Test
    fun create() {
        PropertyArchiveBatchParams.builder()
            .appId("appId")
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
            PropertyArchiveBatchParams.builder()
                .appId("appId")
                .objectType("objectType")
                .batchInputPropertyName(
                    BatchInputPropertyName.builder()
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
            PropertyArchiveBatchParams.builder()
                .appId("appId")
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
