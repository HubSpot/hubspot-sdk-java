// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatedExchangeRateTest {

    @Test
    fun create() {
        val datedExchangeRate =
            DatedExchangeRate.builder()
                .operator(DatedExchangeRate.Operator.DATED_EXCHANGE_RATE)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(datedExchangeRate.operator())
            .isEqualTo(DatedExchangeRate.Operator.DATED_EXCHANGE_RATE)
        assertThat(datedExchangeRate.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(datedExchangeRate.propertyName()).contains("propertyName")
        assertThat(datedExchangeRate.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datedExchangeRate =
            DatedExchangeRate.builder()
                .operator(DatedExchangeRate.Operator.DATED_EXCHANGE_RATE)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedDatedExchangeRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datedExchangeRate),
                jacksonTypeRef<DatedExchangeRate>(),
            )

        assertThat(roundtrippedDatedExchangeRate).isEqualTo(datedExchangeRate)
    }
}
