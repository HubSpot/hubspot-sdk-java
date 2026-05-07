// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FetchCurrencyDecimalPlacesTest {

    @Test
    fun create() {
        val fetchCurrencyDecimalPlaces =
            FetchCurrencyDecimalPlaces.builder()
                .operator(FetchCurrencyDecimalPlaces.Operator.FETCH_CURRENCY_DECIMAL_PLACES)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(fetchCurrencyDecimalPlaces.operator())
            .isEqualTo(FetchCurrencyDecimalPlaces.Operator.FETCH_CURRENCY_DECIMAL_PLACES)
        assertThat(fetchCurrencyDecimalPlaces.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(fetchCurrencyDecimalPlaces.propertyName()).contains("propertyName")
        assertThat(fetchCurrencyDecimalPlaces.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fetchCurrencyDecimalPlaces =
            FetchCurrencyDecimalPlaces.builder()
                .operator(FetchCurrencyDecimalPlaces.Operator.FETCH_CURRENCY_DECIMAL_PLACES)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedFetchCurrencyDecimalPlaces =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fetchCurrencyDecimalPlaces),
                jacksonTypeRef<FetchCurrencyDecimalPlaces>(),
            )

        assertThat(roundtrippedFetchCurrencyDecimalPlaces).isEqualTo(fetchCurrencyDecimalPlaces)
    }
}
