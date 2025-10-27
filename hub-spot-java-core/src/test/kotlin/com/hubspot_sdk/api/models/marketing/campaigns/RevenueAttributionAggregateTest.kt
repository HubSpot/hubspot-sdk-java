// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RevenueAttributionAggregateTest {

    @Test
    fun create() {
        val revenueAttributionAggregate =
            RevenueAttributionAggregate.builder()
                .contactsNumber(0)
                .currencyCode(RevenueAttributionAggregate.CurrencyCode.AED)
                .dealAmount(0.0)
                .dealsNumber(0)
                .revenueAmount(0.0)
                .build()

        assertThat(revenueAttributionAggregate.contactsNumber()).contains(0)
        assertThat(revenueAttributionAggregate.currencyCode())
            .contains(RevenueAttributionAggregate.CurrencyCode.AED)
        assertThat(revenueAttributionAggregate.dealAmount()).contains(0.0)
        assertThat(revenueAttributionAggregate.dealsNumber()).contains(0)
        assertThat(revenueAttributionAggregate.revenueAmount()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val revenueAttributionAggregate =
            RevenueAttributionAggregate.builder()
                .contactsNumber(0)
                .currencyCode(RevenueAttributionAggregate.CurrencyCode.AED)
                .dealAmount(0.0)
                .dealsNumber(0)
                .revenueAmount(0.0)
                .build()

        val roundtrippedRevenueAttributionAggregate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(revenueAttributionAggregate),
                jacksonTypeRef<RevenueAttributionAggregate>(),
            )

        assertThat(roundtrippedRevenueAttributionAggregate).isEqualTo(revenueAttributionAggregate)
    }
}
