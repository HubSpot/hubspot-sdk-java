// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardMigrateViewsResponseTest {

    @Test
    fun create() {
        val cardMigrateViewsResponse =
            CardMigrateViewsResponse.builder()
                .message("message")
                .endedAt(0L)
                .remainingPortalCount(0L)
                .startedAt(0L)
                .totalPortalCount(0L)
                .build()

        assertThat(cardMigrateViewsResponse.message()).isEqualTo("message")
        assertThat(cardMigrateViewsResponse.endedAt()).contains(0L)
        assertThat(cardMigrateViewsResponse.remainingPortalCount()).contains(0L)
        assertThat(cardMigrateViewsResponse.startedAt()).contains(0L)
        assertThat(cardMigrateViewsResponse.totalPortalCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardMigrateViewsResponse =
            CardMigrateViewsResponse.builder()
                .message("message")
                .endedAt(0L)
                .remainingPortalCount(0L)
                .startedAt(0L)
                .totalPortalCount(0L)
                .build()

        val roundtrippedCardMigrateViewsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardMigrateViewsResponse),
                jacksonTypeRef<CardMigrateViewsResponse>(),
            )

        assertThat(roundtrippedCardMigrateViewsResponse).isEqualTo(cardMigrateViewsResponse)
    }
}
