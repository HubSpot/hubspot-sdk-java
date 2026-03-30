// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.objects.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectBatchInputUpsert
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpsertParamsTest {

    @Test
    fun create() {
        BatchUpsertParams.builder()
            .objectType("objectType")
            .batchInputSimplePublicObjectBatchInputUpsert(
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("idProperty")
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
            BatchUpsertParams.builder()
                .objectType("objectType")
                .batchInputSimplePublicObjectBatchInputUpsert(
                    BatchInputSimplePublicObjectBatchInputUpsert.builder()
                        .addInput(
                            SimplePublicObjectBatchInputUpsert.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInputUpsert.Properties.builder()
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
            BatchUpsertParams.builder()
                .objectType("objectType")
                .batchInputSimplePublicObjectBatchInputUpsert(
                    BatchInputSimplePublicObjectBatchInputUpsert.builder()
                        .addInput(
                            SimplePublicObjectBatchInputUpsert.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInputUpsert.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .idProperty("idProperty")
                                .objectWriteTraceId("objectWriteTraceId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .idProperty("idProperty")
                            .objectWriteTraceId("objectWriteTraceId")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchUpsertParams.builder()
                .objectType("objectType")
                .batchInputSimplePublicObjectBatchInputUpsert(
                    BatchInputSimplePublicObjectBatchInputUpsert.builder()
                        .addInput(
                            SimplePublicObjectBatchInputUpsert.builder()
                                .id("id")
                                .properties(
                                    SimplePublicObjectBatchInputUpsert.Properties.builder()
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
                BatchInputSimplePublicObjectBatchInputUpsert.builder()
                    .addInput(
                        SimplePublicObjectBatchInputUpsert.builder()
                            .id("id")
                            .properties(
                                SimplePublicObjectBatchInputUpsert.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
