// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoundDownNumbersTest {

    @Test
    fun create() {
        val roundDownNumbers =
            RoundDownNumbers.builder()
                .operator(RoundDownNumbers.Operator.ROUND_DOWN)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(roundDownNumbers.operator()).isEqualTo(RoundDownNumbers.Operator.ROUND_DOWN)
        assertThat(roundDownNumbers.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(roundDownNumbers.propertyName()).contains("propertyName")
        assertThat(roundDownNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roundDownNumbers =
            RoundDownNumbers.builder()
                .operator(RoundDownNumbers.Operator.ROUND_DOWN)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedRoundDownNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roundDownNumbers),
                jacksonTypeRef<RoundDownNumbers>(),
            )

        assertThat(roundtrippedRoundDownNumbers).isEqualTo(roundDownNumbers)
    }
}
