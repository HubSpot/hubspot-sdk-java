// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectBatchInputTest {

    @Test
    fun create() {
        val simplePublicObjectBatchInput =
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

        assertThat(simplePublicObjectBatchInput.id()).isEqualTo("id")
        assertThat(simplePublicObjectBatchInput.properties())
            .isEqualTo(
                SimplePublicObjectBatchInput.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(simplePublicObjectBatchInput.idProperty()).contains("my_unique_property_name")
        assertThat(simplePublicObjectBatchInput.objectWriteTraceId()).contains("objectWriteTraceId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectBatchInput =
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

        val roundtrippedSimplePublicObjectBatchInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectBatchInput),
                jacksonTypeRef<SimplePublicObjectBatchInput>(),
            )

        assertThat(roundtrippedSimplePublicObjectBatchInput).isEqualTo(simplePublicObjectBatchInput)
    }
}
