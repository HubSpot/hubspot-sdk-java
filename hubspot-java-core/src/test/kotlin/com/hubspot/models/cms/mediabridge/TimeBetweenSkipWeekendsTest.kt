// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeBetweenSkipWeekendsTest {

    @Test
    fun create() {
        val timeBetweenSkipWeekends =
            TimeBetweenSkipWeekends.builder()
                .operator(TimeBetweenSkipWeekends.Operator.TIME_BETWEEN_SKIP_WEEKENDS)
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

        assertThat(timeBetweenSkipWeekends.operator())
            .isEqualTo(TimeBetweenSkipWeekends.Operator.TIME_BETWEEN_SKIP_WEEKENDS)
        assertThat(timeBetweenSkipWeekends.inputs().getOrNull())
            .containsExactly(
                TimeBetweenSkipWeekends.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(timeBetweenSkipWeekends.propertyName()).contains("propertyName")
        assertThat(timeBetweenSkipWeekends.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeBetweenSkipWeekends =
            TimeBetweenSkipWeekends.builder()
                .operator(TimeBetweenSkipWeekends.Operator.TIME_BETWEEN_SKIP_WEEKENDS)
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

        val roundtrippedTimeBetweenSkipWeekends =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeBetweenSkipWeekends),
                jacksonTypeRef<TimeBetweenSkipWeekends>(),
            )

        assertThat(roundtrippedTimeBetweenSkipWeekends).isEqualTo(timeBetweenSkipWeekends)
    }
}
