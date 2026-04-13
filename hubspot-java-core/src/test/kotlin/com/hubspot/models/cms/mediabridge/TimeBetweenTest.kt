// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeBetweenTest {

    @Test
    fun create() {
        val timeBetween =
            TimeBetween.builder()
                .operator(TimeBetween.Operator.TIME_BETWEEN)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(timeBetween.operator()).isEqualTo(TimeBetween.Operator.TIME_BETWEEN)
        assertThat(timeBetween.inputs().getOrNull())
            .containsExactly(
                TimeBetween.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(timeBetween.propertyName()).contains("propertyName")
        assertThat(timeBetween.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeBetween =
            TimeBetween.builder()
                .operator(TimeBetween.Operator.TIME_BETWEEN)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedTimeBetween =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeBetween),
                jacksonTypeRef<TimeBetween>(),
            )

        assertThat(roundtrippedTimeBetween).isEqualTo(timeBetween)
    }
}
