// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoundNearestNumbersTest {

    @Test
    fun create() {
        val roundNearestNumbers =
            RoundNearestNumbers.builder()
                .operator(RoundNearestNumbers.Operator.ROUND_NEAREST)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(roundNearestNumbers.operator())
            .isEqualTo(RoundNearestNumbers.Operator.ROUND_NEAREST)
        assertThat(roundNearestNumbers.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(roundNearestNumbers.propertyName()).contains("propertyName")
        assertThat(roundNearestNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roundNearestNumbers =
            RoundNearestNumbers.builder()
                .operator(RoundNearestNumbers.Operator.ROUND_NEAREST)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedRoundNearestNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roundNearestNumbers),
                jacksonTypeRef<RoundNearestNumbers>(),
            )

        assertThat(roundtrippedRoundNearestNumbers).isEqualTo(roundNearestNumbers)
    }
}
