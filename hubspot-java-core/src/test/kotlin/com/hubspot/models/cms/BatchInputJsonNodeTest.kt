// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputJsonNodeTest {

    @Test
    fun create() {
        val batchInputJsonNode =
            BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(batchInputJsonNode.inputs())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputJsonNode =
            BatchInputJsonNode.builder().addInput(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedBatchInputJsonNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputJsonNode),
                jacksonTypeRef<BatchInputJsonNode>(),
            )

        assertThat(roundtrippedBatchInputJsonNode).isEqualTo(batchInputJsonNode)
    }
}
