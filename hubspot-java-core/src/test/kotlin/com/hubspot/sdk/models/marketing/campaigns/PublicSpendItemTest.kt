// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSpendItemTest {

    @Test
    fun create() {
        val publicSpendItem =
            PublicSpendItem.builder()
                .id("id")
                .amount(0.0)
                .createdAt(0L)
                .name("name")
                .order(0)
                .updatedAt(0L)
                .description("description")
                .build()

        assertThat(publicSpendItem.id()).isEqualTo("id")
        assertThat(publicSpendItem.amount()).isEqualTo(0.0)
        assertThat(publicSpendItem.createdAt()).isEqualTo(0L)
        assertThat(publicSpendItem.name()).isEqualTo("name")
        assertThat(publicSpendItem.order()).isEqualTo(0)
        assertThat(publicSpendItem.updatedAt()).isEqualTo(0L)
        assertThat(publicSpendItem.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSpendItem =
            PublicSpendItem.builder()
                .id("id")
                .amount(0.0)
                .createdAt(0L)
                .name("name")
                .order(0)
                .updatedAt(0L)
                .description("description")
                .build()

        val roundtrippedPublicSpendItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSpendItem),
                jacksonTypeRef<PublicSpendItem>(),
            )

        assertThat(roundtrippedPublicSpendItem).isEqualTo(publicSpendItem)
    }
}
