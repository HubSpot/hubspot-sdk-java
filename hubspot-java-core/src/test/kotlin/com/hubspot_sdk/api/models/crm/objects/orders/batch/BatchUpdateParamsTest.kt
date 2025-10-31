// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.orders.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.BatchInputSimplePublicObjectBatchInput
import com.hubspot_sdk.api.models.crm.SimplePublicObjectBatchInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpdateParamsTest {

    @Test
    fun create() {
        BatchUpdateParams.builder()
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
    fun body() {
        val params =
            BatchUpdateParams.builder()
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
            BatchUpdateParams.builder()
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
