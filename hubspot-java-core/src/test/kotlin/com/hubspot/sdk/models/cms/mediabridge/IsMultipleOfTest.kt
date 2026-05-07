// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsMultipleOfTest {

    @Test
    fun create() {
        val isMultipleOf =
            IsMultipleOf.builder()
                .operator(IsMultipleOf.Operator.IS_MULTIPLE_OF)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isMultipleOf.operator()).isEqualTo(IsMultipleOf.Operator.IS_MULTIPLE_OF)
        assertThat(isMultipleOf.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isMultipleOf.propertyName()).contains("propertyName")
        assertThat(isMultipleOf.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isMultipleOf =
            IsMultipleOf.builder()
                .operator(IsMultipleOf.Operator.IS_MULTIPLE_OF)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsMultipleOf =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isMultipleOf),
                jacksonTypeRef<IsMultipleOf>(),
            )

        assertThat(roundtrippedIsMultipleOf).isEqualTo(isMultipleOf)
    }
}
