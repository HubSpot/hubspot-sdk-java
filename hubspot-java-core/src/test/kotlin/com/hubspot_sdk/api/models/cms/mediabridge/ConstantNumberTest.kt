// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConstantNumberTest {

    @Test
    fun create() {
        val constantNumber =
            ConstantNumber.builder()
                .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(constantNumber.operator()).isEqualTo(ConstantNumber.Operator.CONSTANT_NUMBER)
        assertThat(constantNumber.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(constantNumber.propertyName()).contains("propertyName")
        assertThat(constantNumber.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val constantNumber =
            ConstantNumber.builder()
                .operator(ConstantNumber.Operator.CONSTANT_NUMBER)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedConstantNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(constantNumber),
                jacksonTypeRef<ConstantNumber>(),
            )

        assertThat(roundtrippedConstantNumber).isEqualTo(constantNumber)
    }
}
