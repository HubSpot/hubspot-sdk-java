// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputSimplePublicObjectBatchInputTest {

    @Test
    fun create() {
        val batchInputSimplePublicObjectBatchInput =
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

        assertThat(batchInputSimplePublicObjectBatchInput.inputs())
            .containsExactly(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputSimplePublicObjectBatchInput =
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

        val roundtrippedBatchInputSimplePublicObjectBatchInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputSimplePublicObjectBatchInput),
                jacksonTypeRef<BatchInputSimplePublicObjectBatchInput>(),
            )

        assertThat(roundtrippedBatchInputSimplePublicObjectBatchInput)
            .isEqualTo(batchInputSimplePublicObjectBatchInput)
    }
}
