// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PeriodToWeeksTest {

    @Test
    fun create() {
        val periodToWeeks =
            PeriodToWeeks.builder()
                .operator(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(periodToWeeks.operator()).isEqualTo(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
        assertThat(periodToWeeks.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(periodToWeeks.propertyName()).contains("propertyName")
        assertThat(periodToWeeks.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val periodToWeeks =
            PeriodToWeeks.builder()
                .operator(PeriodToWeeks.Operator.PERIOD_TO_WEEKS)
                .addInput(JsonValue.from(mapOf<String, Any>()))
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
