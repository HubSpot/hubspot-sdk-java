// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContainsTest {

    @Test
    fun create() {
        val contains =
            Contains.builder()
                .operator(Contains.Operator.CONTAINS)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(contains.operator()).isEqualTo(Contains.Operator.CONTAINS)
        assertThat(contains._stringToCheck()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(contains.inputs().getOrNull())
            .containsExactly(
                Contains.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(contains.propertyName()).contains("propertyName")
        assertThat(contains.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contains =
            Contains.builder()
                .operator(Contains.Operator.CONTAINS)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedContains =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contains),
                jacksonTypeRef<Contains>(),
            )

        assertThat(roundtrippedContains).isEqualTo(contains)
    }
}
