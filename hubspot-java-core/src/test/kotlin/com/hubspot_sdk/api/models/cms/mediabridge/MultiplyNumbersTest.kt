// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiplyNumbersTest {

    @Test
    fun create() {
        val multiplyNumbers =
            MultiplyNumbers.builder()
                .enclosedInParentheses(true)
                .operator(MultiplyNumbers.Operator.MULTIPLY_NUMBERS)
                .addInput(
                    MultiplyNumbers.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(multiplyNumbers.enclosedInParentheses()).isEqualTo(true)
        assertThat(multiplyNumbers.operator()).isEqualTo(MultiplyNumbers.Operator.MULTIPLY_NUMBERS)
        assertThat(multiplyNumbers.inputs().getOrNull())
            .containsExactly(
                MultiplyNumbers.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(multiplyNumbers.propertyName()).contains("propertyName")
        assertThat(multiplyNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multiplyNumbers =
            MultiplyNumbers.builder()
                .enclosedInParentheses(true)
                .operator(MultiplyNumbers.Operator.MULTIPLY_NUMBERS)
                .addInput(
                    MultiplyNumbers.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedMultiplyNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multiplyNumbers),
                jacksonTypeRef<MultiplyNumbers>(),
            )

        assertThat(roundtrippedMultiplyNumbers).isEqualTo(multiplyNumbers)
    }
}
