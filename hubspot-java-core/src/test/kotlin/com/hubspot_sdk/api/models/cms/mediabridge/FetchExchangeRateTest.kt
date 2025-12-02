// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FetchExchangeRateTest {

    @Test
    fun create() {
        val fetchExchangeRate =
            FetchExchangeRate.builder()
                .operator(FetchExchangeRate.Operator.FETCH_EXCHANGE_RATE)
                .addInput(
                    FetchExchangeRate.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(fetchExchangeRate.operator())
            .isEqualTo(FetchExchangeRate.Operator.FETCH_EXCHANGE_RATE)
        assertThat(fetchExchangeRate.inputs().getOrNull())
            .containsExactly(
                FetchExchangeRate.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(fetchExchangeRate.propertyName()).contains("propertyName")
        assertThat(fetchExchangeRate.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fetchExchangeRate =
            FetchExchangeRate.builder()
                .operator(FetchExchangeRate.Operator.FETCH_EXCHANGE_RATE)
                .addInput(
                    FetchExchangeRate.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedFetchExchangeRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fetchExchangeRate),
                jacksonTypeRef<FetchExchangeRate>(),
            )

        assertThat(roundtrippedFetchExchangeRate).isEqualTo(fetchExchangeRate)
    }
}
