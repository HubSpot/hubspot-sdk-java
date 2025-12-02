// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FetchSingleCurrencyPortalCurrencyTest {

    @Test
    fun create() {
        val fetchSingleCurrencyPortalCurrency =
            FetchSingleCurrencyPortalCurrency.builder()
                .operator(
                    FetchSingleCurrencyPortalCurrency.Operator.FETCH_SINGLE_CURRENCY_PORTAL_CURRENCY
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(fetchSingleCurrencyPortalCurrency.operator())
            .isEqualTo(
                FetchSingleCurrencyPortalCurrency.Operator.FETCH_SINGLE_CURRENCY_PORTAL_CURRENCY
            )
        assertThat(fetchSingleCurrencyPortalCurrency.inputs().getOrNull())
            .containsExactly(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(fetchSingleCurrencyPortalCurrency.propertyName()).contains("propertyName")
        assertThat(fetchSingleCurrencyPortalCurrency.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fetchSingleCurrencyPortalCurrency =
            FetchSingleCurrencyPortalCurrency.builder()
                .operator(
                    FetchSingleCurrencyPortalCurrency.Operator.FETCH_SINGLE_CURRENCY_PORTAL_CURRENCY
                )
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedFetchSingleCurrencyPortalCurrency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fetchSingleCurrencyPortalCurrency),
                jacksonTypeRef<FetchSingleCurrencyPortalCurrency>(),
            )

        assertThat(roundtrippedFetchSingleCurrencyPortalCurrency)
            .isEqualTo(fetchSingleCurrencyPortalCurrency)
    }
}
