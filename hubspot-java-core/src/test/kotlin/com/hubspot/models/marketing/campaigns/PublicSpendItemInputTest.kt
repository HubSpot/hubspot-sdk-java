// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSpendItemInputTest {

    @Test
    fun create() {
        val publicSpendItemInput =
            PublicSpendItemInput.builder()
                .amount(0.0)
                .name("name")
                .order(0)
                .description("description")
                .build()

        assertThat(publicSpendItemInput.amount()).isEqualTo(0.0)
        assertThat(publicSpendItemInput.name()).isEqualTo("name")
        assertThat(publicSpendItemInput.order()).isEqualTo(0)
        assertThat(publicSpendItemInput.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSpendItemInput =
            PublicSpendItemInput.builder()
                .amount(0.0)
                .name("name")
                .order(0)
                .description("description")
                .build()

        val roundtrippedPublicSpendItemInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSpendItemInput),
                jacksonTypeRef<PublicSpendItemInput>(),
            )

        assertThat(roundtrippedPublicSpendItemInput).isEqualTo(publicSpendItemInput)
    }
}
