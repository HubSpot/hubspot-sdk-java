// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardMigrateViewsResponseTest {

    @Test
    fun create() {
        val cardMigrateViewsResponse = CardMigrateViewsResponse.builder().message("message").build()

        assertThat(cardMigrateViewsResponse.message()).isEqualTo("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardMigrateViewsResponse = CardMigrateViewsResponse.builder().message("message").build()

        val roundtrippedCardMigrateViewsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardMigrateViewsResponse),
                jacksonTypeRef<CardMigrateViewsResponse>(),
            )

        assertThat(roundtrippedCardMigrateViewsResponse).isEqualTo(cardMigrateViewsResponse)
    }
}
