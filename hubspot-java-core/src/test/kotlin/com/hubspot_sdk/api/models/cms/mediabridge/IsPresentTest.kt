// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsPresentTest {

    @Test
    fun create() {
        val isPresent =
            IsPresent.builder()
                .expressionToEvaluate(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IsPresent.Operator.IS_PRESENT)
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isPresent.expressionToEvaluate())
            .isEqualTo(
                IsPresent.ExpressionToEvaluate.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(isPresent.operator()).isEqualTo(IsPresent.Operator.IS_PRESENT)
        assertThat(isPresent.propertyName()).contains("propertyName")
        assertThat(isPresent.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isPresent =
            IsPresent.builder()
                .expressionToEvaluate(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .operator(IsPresent.Operator.IS_PRESENT)
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsPresent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isPresent),
                jacksonTypeRef<IsPresent>(),
            )

        assertThat(roundtrippedIsPresent).isEqualTo(isPresent)
    }
}
