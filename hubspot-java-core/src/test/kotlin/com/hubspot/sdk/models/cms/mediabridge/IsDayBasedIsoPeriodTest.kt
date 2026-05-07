// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsDayBasedIsoPeriodTest {

    @Test
    fun create() {
        val isDayBasedIsoPeriod =
            IsDayBasedIsoPeriod.builder()
                .operator(IsDayBasedIsoPeriod.Operator.IS_DAY_BASED_ISO_PERIOD)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isDayBasedIsoPeriod.operator())
            .isEqualTo(IsDayBasedIsoPeriod.Operator.IS_DAY_BASED_ISO_PERIOD)
        assertThat(isDayBasedIsoPeriod.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isDayBasedIsoPeriod.propertyName()).contains("propertyName")
        assertThat(isDayBasedIsoPeriod.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isDayBasedIsoPeriod =
            IsDayBasedIsoPeriod.builder()
                .operator(IsDayBasedIsoPeriod.Operator.IS_DAY_BASED_ISO_PERIOD)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsDayBasedIsoPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isDayBasedIsoPeriod),
                jacksonTypeRef<IsDayBasedIsoPeriod>(),
            )

        assertThat(roundtrippedIsDayBasedIsoPeriod).isEqualTo(isDayBasedIsoPeriod)
    }
}
