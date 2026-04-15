// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardActionsTest {

    @Test
    fun create() {
        val cardActions = CardActions.builder().addBaseUrl("string").build()

        assertThat(cardActions.baseUrls()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardActions = CardActions.builder().addBaseUrl("string").build()

        val roundtrippedCardActions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardActions),
                jacksonTypeRef<CardActions>(),
            )

        assertThat(roundtrippedCardActions).isEqualTo(cardActions)
    }
}
