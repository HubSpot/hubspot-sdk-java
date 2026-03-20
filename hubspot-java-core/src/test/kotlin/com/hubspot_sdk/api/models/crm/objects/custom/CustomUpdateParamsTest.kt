// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.custom

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectBatchInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomUpdateParamsTest {

    @Test
    fun create() {
        CustomUpdateParams.builder()
            .objectType("objectType")
            .batchInputSimplePublicObjectBatchInput(
                BatchInputSimplePublicObjectBatchInput.builder()
                    .addInput(
                        SimplePublicObjectBatchInput.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("my_unique_property_name")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomUpdateParams.builder()
                .objectType("objectType")
                .batchInputSimplePublicObjectBatchInput(
                    BatchInputSimplePublicObjectBatchInput.builder()
                        .addInput(
                            SimplePublicObjectBatchInput.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInput.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomUpdateParams.builder()
                .objectType("objectType")
                .batchInputSimplePublicObjectBatchInput(
                    BatchInputSimplePublicObjectBatchInput.builder()
                        .addInput(
                            SimplePublicObjectBatchInput.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInput.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .idProperty("my_unique_property_name")
                                .objectWriteTraceId("objectWriteTraceId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInput.builder()
                    .addInput(
                        SimplePublicObjectBatchInput.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("my_unique_property_name")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomUpdateParams.builder()
                .objectType("objectType")
                .batchInputSimplePublicObjectBatchInput(
                    BatchInputSimplePublicObjectBatchInput.builder()
                        .addInput(
                            SimplePublicObjectBatchInput.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInput.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInput.builder()
                    .addInput(
                        SimplePublicObjectBatchInput.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInput.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
