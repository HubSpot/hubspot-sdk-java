// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PeriodToMonthsTest {

    @Test
    fun create() {
        val periodToMonths =
            PeriodToMonths.builder()
                .operator(PeriodToMonths.Operator.PERIOD_TO_MONTHS)
                .addInput(
                    PeriodToMonths.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(periodToMonths.operator()).isEqualTo(PeriodToMonths.Operator.PERIOD_TO_MONTHS)
        assertThat(periodToMonths.inputs().getOrNull())
            .containsExactly(
                PeriodToMonths.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(periodToMonths.propertyName()).contains("propertyName")
        assertThat(periodToMonths.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val periodToMonths =
            PeriodToMonths.builder()
                .operator(PeriodToMonths.Operator.PERIOD_TO_MONTHS)
                .addInput(
                    PeriodToMonths.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedPeriodToMonths =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(periodToMonths),
                jacksonTypeRef<PeriodToMonths>(),
            )

        assertThat(roundtrippedPeriodToMonths).isEqualTo(periodToMonths)
    }
}
