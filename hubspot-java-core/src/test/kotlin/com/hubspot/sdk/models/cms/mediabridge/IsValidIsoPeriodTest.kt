// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsValidIsoPeriodTest {

    @Test
    fun create() {
        val isValidIsoPeriod =
            IsValidIsoPeriod.builder()
                .operator(IsValidIsoPeriod.Operator.IS_VALID_ISO_PERIOD)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isValidIsoPeriod.operator())
            .isEqualTo(IsValidIsoPeriod.Operator.IS_VALID_ISO_PERIOD)
        assertThat(isValidIsoPeriod.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isValidIsoPeriod.propertyName()).contains("propertyName")
        assertThat(isValidIsoPeriod.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isValidIsoPeriod =
            IsValidIsoPeriod.builder()
                .operator(IsValidIsoPeriod.Operator.IS_VALID_ISO_PERIOD)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsValidIsoPeriod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isValidIsoPeriod),
                jacksonTypeRef<IsValidIsoPeriod>(),
            )

        assertThat(roundtrippedIsValidIsoPeriod).isEqualTo(isValidIsoPeriod)
    }
}
