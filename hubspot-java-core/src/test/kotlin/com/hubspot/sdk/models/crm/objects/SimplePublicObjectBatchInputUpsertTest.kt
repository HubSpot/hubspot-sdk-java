// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimplePublicObjectBatchInputUpsertTest {

    @Test
    fun create() {
        val simplePublicObjectBatchInputUpsert =
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

        assertThat(simplePublicObjectBatchInputUpsert.id()).isEqualTo("id")
        assertThat(simplePublicObjectBatchInputUpsert.properties())
            .isEqualTo(
                SimplePublicObjectBatchInputUpsert.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(simplePublicObjectBatchInputUpsert.idProperty()).contains("idProperty")
        assertThat(simplePublicObjectBatchInputUpsert.objectWriteTraceId())
            .contains("objectWriteTraceId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simplePublicObjectBatchInputUpsert =
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

        val roundtrippedSimplePublicObjectBatchInputUpsert =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simplePublicObjectBatchInputUpsert),
                jacksonTypeRef<SimplePublicObjectBatchInputUpsert>(),
            )

        assertThat(roundtrippedSimplePublicObjectBatchInputUpsert)
            .isEqualTo(simplePublicObjectBatchInputUpsert)
    }
}
