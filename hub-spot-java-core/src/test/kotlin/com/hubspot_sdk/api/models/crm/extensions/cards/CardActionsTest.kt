// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardActionsTest {

    @Test
    fun create() {
        val cardActions =
            CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build()

        assertThat(cardActions.baseUrls()).containsExactly("https://www.example.com/hubspot")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardActions =
            CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build()

        val roundtrippedCardActions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardActions),
                jacksonTypeRef<CardActions>(),
            )

        assertThat(roundtrippedCardActions).isEqualTo(cardActions)
    }
}
