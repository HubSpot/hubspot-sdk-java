// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputStringTest {

    @Test
    fun create() {
        val batchInputString = BatchInputString.builder().addInput("string").build()

        assertThat(batchInputString.inputs()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputString = BatchInputString.builder().addInput("string").build()

        val roundtrippedBatchInputString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputString),
                jacksonTypeRef<BatchInputString>(),
            )

        assertThat(roundtrippedBatchInputString).isEqualTo(batchInputString)
    }
}
