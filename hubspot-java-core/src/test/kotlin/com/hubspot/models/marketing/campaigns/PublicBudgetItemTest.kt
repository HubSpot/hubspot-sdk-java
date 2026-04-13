// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBudgetItemTest {

    @Test
    fun create() {
        val publicBudgetItem =
            PublicBudgetItem.builder()
                .id("id")
                .amount(0.0)
                .createdAt(0L)
                .name("name")
                .order(0)
                .updatedAt(0L)
                .description("description")
                .build()

        assertThat(publicBudgetItem.id()).isEqualTo("id")
        assertThat(publicBudgetItem.amount()).isEqualTo(0.0)
        assertThat(publicBudgetItem.createdAt()).isEqualTo(0L)
        assertThat(publicBudgetItem.name()).isEqualTo("name")
        assertThat(publicBudgetItem.order()).isEqualTo(0)
        assertThat(publicBudgetItem.updatedAt()).isEqualTo(0L)
        assertThat(publicBudgetItem.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBudgetItem =
            PublicBudgetItem.builder()
                .id("id")
                .amount(0.0)
                .createdAt(0L)
                .name("name")
                .order(0)
                .updatedAt(0L)
                .description("description")
                .build()

        val roundtrippedPublicBudgetItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBudgetItem),
                jacksonTypeRef<PublicBudgetItem>(),
            )

        assertThat(roundtrippedPublicBudgetItem).isEqualTo(publicBudgetItem)
    }
}
