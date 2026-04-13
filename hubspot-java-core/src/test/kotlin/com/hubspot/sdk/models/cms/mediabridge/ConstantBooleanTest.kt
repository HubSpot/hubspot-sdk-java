// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConstantBooleanTest {

    @Test
    fun create() {
        val constantBoolean =
            ConstantBoolean.builder()
                .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(constantBoolean.operator()).isEqualTo(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
        assertThat(constantBoolean.propertyName()).contains("propertyName")
        assertThat(constantBoolean.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val constantBoolean =
            ConstantBoolean.builder()
                .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedConstantBoolean =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(constantBoolean),
                jacksonTypeRef<ConstantBoolean>(),
            )

        assertThat(roundtrippedConstantBoolean).isEqualTo(constantBoolean)
    }
}
