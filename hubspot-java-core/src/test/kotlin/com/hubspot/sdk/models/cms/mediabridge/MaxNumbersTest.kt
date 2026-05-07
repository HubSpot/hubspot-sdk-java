// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MaxNumbersTest {

    @Test
    fun create() {
        val maxNumbers =
            MaxNumbers.builder()
                .operator(MaxNumbers.Operator.MAX_NUMBERS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(maxNumbers.operator()).isEqualTo(MaxNumbers.Operator.MAX_NUMBERS)
        assertThat(maxNumbers.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(maxNumbers.propertyName()).contains("propertyName")
        assertThat(maxNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val maxNumbers =
            MaxNumbers.builder()
                .operator(MaxNumbers.Operator.MAX_NUMBERS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedMaxNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(maxNumbers),
                jacksonTypeRef<MaxNumbers>(),
            )

        assertThat(roundtrippedMaxNumbers).isEqualTo(maxNumbers)
    }
}
