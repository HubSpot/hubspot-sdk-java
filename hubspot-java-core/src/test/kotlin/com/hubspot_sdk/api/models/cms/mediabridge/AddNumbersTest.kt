// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddNumbersTest {

    @Test
    fun create() {
        val addNumbers =
            AddNumbers.builder()
                .enclosedInParentheses(true)
                .operator(AddNumbers.Operator.ADD_NUMBERS)
                .addInput(
                    AddNumbers.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(addNumbers.enclosedInParentheses()).isEqualTo(true)
        assertThat(addNumbers.operator()).isEqualTo(AddNumbers.Operator.ADD_NUMBERS)
        assertThat(addNumbers.inputs().getOrNull())
            .containsExactly(
                AddNumbers.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(addNumbers.propertyName()).contains("propertyName")
        assertThat(addNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addNumbers =
            AddNumbers.builder()
                .enclosedInParentheses(true)
                .operator(AddNumbers.Operator.ADD_NUMBERS)
                .addInput(
                    AddNumbers.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedAddNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addNumbers),
                jacksonTypeRef<AddNumbers>(),
            )

        assertThat(roundtrippedAddNumbers).isEqualTo(addNumbers)
    }
}
