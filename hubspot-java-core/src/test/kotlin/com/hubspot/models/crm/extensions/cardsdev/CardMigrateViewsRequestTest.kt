// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardMigrateViewsRequestTest {

    @Test
    fun create() {
        val cardMigrateViewsRequest =
            CardMigrateViewsRequest.builder()
                .appCardId(0L)
                .legacyCrmCardId(0L)
                .helpdeskAppCardId(0L)
                .build()

        assertThat(cardMigrateViewsRequest.appCardId()).isEqualTo(0L)
        assertThat(cardMigrateViewsRequest.legacyCrmCardId()).isEqualTo(0L)
        assertThat(cardMigrateViewsRequest.helpdeskAppCardId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardMigrateViewsRequest =
            CardMigrateViewsRequest.builder()
                .appCardId(0L)
                .legacyCrmCardId(0L)
                .helpdeskAppCardId(0L)
                .build()

        val roundtrippedCardMigrateViewsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardMigrateViewsRequest),
                jacksonTypeRef<CardMigrateViewsRequest>(),
            )

        assertThat(roundtrippedCardMigrateViewsRequest).isEqualTo(cardMigrateViewsRequest)
    }
}
