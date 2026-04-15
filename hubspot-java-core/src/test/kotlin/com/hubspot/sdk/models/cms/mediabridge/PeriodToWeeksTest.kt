// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PeriodToWeeksTest {

    @Test
    fun create() {
        val periodToWeeks =
            PeriodToWeeks.builder()
                .operator(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
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

        assertThat(periodToWeeks.operator()).isEqualTo(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
        assertThat(periodToWeeks.inputs().getOrNull())
            .containsExactly(
                PeriodToWeeks.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(periodToWeeks.propertyName()).contains("propertyName")
        assertThat(periodToWeeks.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val periodToWeeks =
            PeriodToWeeks.builder()
                .operator(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
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

        val roundtrippedPeriodToWeeks =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(periodToWeeks),
                jacksonTypeRef<PeriodToWeeks>(),
            )

        assertThat(roundtrippedPeriodToWeeks).isEqualTo(periodToWeeks)
    }
}
