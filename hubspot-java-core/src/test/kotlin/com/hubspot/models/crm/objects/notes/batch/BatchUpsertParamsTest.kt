// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.notes.batch

import com.hubspot.core.JsonValue
import com.hubspot.models.crm.objects.BatchInputSimplePublicObjectBatchInputUpsert
import com.hubspot.models.crm.objects.SimplePublicObjectBatchInputUpsert
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpsertParamsTest {

    @Test
    fun create() {
        BatchUpsertParams.builder()
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
    fun body() {
        val params =
            BatchUpsertParams.builder()
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
