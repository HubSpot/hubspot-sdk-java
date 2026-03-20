// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputSimplePublicObjectBatchInputUpsertTest {

    @Test
    fun create() {
        val batchInputSimplePublicObjectBatchInputUpsert =
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

        assertThat(batchInputSimplePublicObjectBatchInputUpsert.inputs())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputSimplePublicObjectBatchInputUpsert =
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

        val roundtrippedBatchInputSimplePublicObjectBatchInputUpsert =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputSimplePublicObjectBatchInputUpsert),
                jacksonTypeRef<BatchInputSimplePublicObjectBatchInputUpsert>(),
            )

        assertThat(roundtrippedBatchInputSimplePublicObjectBatchInputUpsert)
            .isEqualTo(batchInputSimplePublicObjectBatchInputUpsert)
    }
}
