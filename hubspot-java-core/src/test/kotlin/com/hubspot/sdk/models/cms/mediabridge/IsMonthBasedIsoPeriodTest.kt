// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsMonthBasedIsoPeriodTest {

    @Test
    fun create() {
        val isMonthBasedIsoPeriod =
            IsMonthBasedIsoPeriod.builder()
                .operator(IsMonthBasedIsoPeriod.Operator.IS_MONTH_BASED_ISO_PERIOD)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isMonthBasedIsoPeriod.operator())
            .isEqualTo(IsMonthBasedIsoPeriod.Operator.IS_MONTH_BASED_ISO_PERIOD)
        assertThat(isMonthBasedIsoPeriod.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isMonthBasedIsoPeriod.propertyName()).contains("propertyName")
        assertThat(isMonthBasedIsoPeriod.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isMonthBasedIsoPeriod =
            IsMonthBasedIsoPeriod.builder()
                .operator(IsMonthBasedIsoPeriod.Operator.IS_MONTH_BASED_ISO_PERIOD)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsMonthBasedIsoPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isMonthBasedIsoPeriod),
                jacksonTypeRef<IsMonthBasedIsoPeriod>(),
            )

        assertThat(roundtrippedIsMonthBasedIsoPeriod).isEqualTo(isMonthBasedIsoPeriod)
    }
}
