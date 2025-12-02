// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContainsTest {

    @Test
    fun create() {
        val contains =
            Contains.builder()
                .operator(Contains.Operator.CONTAINS)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(contains.operator()).isEqualTo(Contains.Operator.CONTAINS)
        assertThat(contains.stringToCheck())
            .isEqualTo(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(contains.inputs().getOrNull()).containsExactly()
        assertThat(contains.propertyName()).contains("propertyName")
        assertThat(contains.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contains =
            Contains.builder()
                .operator(Contains.Operator.CONTAINS)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
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
