// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBudgetItemInputTest {

    @Test
    fun create() {
        val publicBudgetItemInput =
            PublicBudgetItemInput.builder()
                .amount(0.0)
                .name("name")
                .order(0)
                .description("description")
                .build()

        assertThat(publicBudgetItemInput.amount()).isEqualTo(0.0)
        assertThat(publicBudgetItemInput.name()).isEqualTo("name")
        assertThat(publicBudgetItemInput.order()).isEqualTo(0)
        assertThat(publicBudgetItemInput.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBudgetItemInput =
            PublicBudgetItemInput.builder()
                .amount(0.0)
                .name("name")
                .order(0)
                .description("description")
                .build()

        val roundtrippedPublicBudgetItemInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBudgetItemInput),
                jacksonTypeRef<PublicBudgetItemInput>(),
            )

        assertThat(roundtrippedPublicBudgetItemInput).isEqualTo(publicBudgetItemInput)
    }
}
