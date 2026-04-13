// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBudgetTotalsTest {

    @Test
    fun create() {
        val publicBudgetTotals =
            PublicBudgetTotals.builder()
                .addBudgetItem(
                    PublicBudgetItem.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(0L)
                        .name("name")
                        .order(0)
                        .updatedAt(0L)
                        .description("description")
                        .build()
                )
                .currencyCode(PublicBudgetTotals.CurrencyCode.AED)
                .addSpendItem(
                    PublicSpendItem.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(0L)
                        .name("name")
                        .order(0)
                        .updatedAt(0L)
                        .description("description")
                        .build()
                )
                .budgetTotal(0.0)
                .remainingBudget(0.0)
                .spendTotal(0.0)
                .build()

        assertThat(publicBudgetTotals.budgetItems())
            .containsExactly(
                PublicBudgetItem.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(0L)
                    .name("name")
                    .order(0)
                    .updatedAt(0L)
                    .description("description")
                    .build()
            )
        assertThat(publicBudgetTotals.currencyCode()).isEqualTo(PublicBudgetTotals.CurrencyCode.AED)
        assertThat(publicBudgetTotals.spendItems())
            .containsExactly(
                PublicSpendItem.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(0L)
                    .name("name")
                    .order(0)
                    .updatedAt(0L)
                    .description("description")
                    .build()
            )
        assertThat(publicBudgetTotals.budgetTotal()).contains(0.0)
        assertThat(publicBudgetTotals.remainingBudget()).contains(0.0)
        assertThat(publicBudgetTotals.spendTotal()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBudgetTotals =
            PublicBudgetTotals.builder()
                .addBudgetItem(
                    PublicBudgetItem.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(0L)
                        .name("name")
                        .order(0)
                        .updatedAt(0L)
                        .description("description")
                        .build()
                )
                .currencyCode(PublicBudgetTotals.CurrencyCode.AED)
                .addSpendItem(
                    PublicSpendItem.builder()
                        .id("id")
                        .amount(0.0)
                        .createdAt(0L)
                        .name("name")
                        .order(0)
                        .updatedAt(0L)
                        .description("description")
                        .build()
                )
                .budgetTotal(0.0)
                .remainingBudget(0.0)
                .spendTotal(0.0)
                .build()

        val roundtrippedPublicBudgetTotals =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBudgetTotals),
                jacksonTypeRef<PublicBudgetTotals>(),
            )

        assertThat(roundtrippedPublicBudgetTotals).isEqualTo(publicBudgetTotals)
    }
}
