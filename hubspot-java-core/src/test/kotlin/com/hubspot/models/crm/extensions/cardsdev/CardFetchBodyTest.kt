// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardFetchBodyTest {

    @Test
    fun create() {
        val cardFetchBody =
            CardFetchBody.builder()
                .cardType(CardFetchBody.CardType.EXTERNAL)
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.COMPANIES)
                        .addPropertiesToSend("string")
                        .build()
                )
                .targetUrl("targetUrl")
                .serverlessFunction("serverlessFunction")
                .build()

        assertThat(cardFetchBody.cardType()).isEqualTo(CardFetchBody.CardType.EXTERNAL)
        assertThat(cardFetchBody.objectTypes())
            .containsExactly(
                CardObjectTypeBody.builder()
                    .name(CardObjectTypeBody.Name.COMPANIES)
                    .addPropertiesToSend("string")
                    .build()
            )
        assertThat(cardFetchBody.targetUrl()).isEqualTo("targetUrl")
        assertThat(cardFetchBody.serverlessFunction()).contains("serverlessFunction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardFetchBody =
            CardFetchBody.builder()
                .cardType(CardFetchBody.CardType.EXTERNAL)
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.COMPANIES)
                        .addPropertiesToSend("string")
                        .build()
                )
                .targetUrl("targetUrl")
                .serverlessFunction("serverlessFunction")
                .build()

        val roundtrippedCardFetchBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardFetchBody),
                jacksonTypeRef<CardFetchBody>(),
            )

        assertThat(roundtrippedCardFetchBody).isEqualTo(cardFetchBody)
    }
}
