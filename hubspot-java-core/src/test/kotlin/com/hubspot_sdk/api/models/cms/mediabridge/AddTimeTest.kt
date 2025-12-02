// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddTimeTest {

    @Test
    fun create() {
        val addTime =
            AddTime.builder()
                .operator(AddTime.Operator.ADD_TIME)
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
                .value(0.0)
                .build()

        assertThat(addTime.operator()).isEqualTo(AddTime.Operator.ADD_TIME)
        assertThat(addTime.stringToCheck())
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
        assertThat(addTime.inputs().getOrNull()).containsExactly()
        assertThat(addTime.propertyName()).contains("propertyName")
        assertThat(addTime.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addTime =
            AddTime.builder()
                .operator(AddTime.Operator.ADD_TIME)
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
                .value(0.0)
                .build()

        val roundtrippedAddTime =
            jsonMapper.readValue(jsonMapper.writeValueAsString(addTime), jacksonTypeRef<AddTime>())

        assertThat(roundtrippedAddTime).isEqualTo(addTime)
    }
}
