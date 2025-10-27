// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardFetchBodyTest {

    @Test
    fun create() {
        val cardFetchBody =
            CardFetchBody.builder()
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.CONTACTS)
                        .addPropertiesToSend("string")
                        .build()
                )
                .targetUrl("targetUrl")
                .cardType(CardFetchBody.CardType.EXTERNAL)
                .serverlessFunction("serverlessFunction")
                .build()

        assertThat(cardFetchBody.objectTypes())
            .containsExactly(
                CardObjectTypeBody.builder()
                    .name(CardObjectTypeBody.Name.CONTACTS)
                    .addPropertiesToSend("string")
                    .build()
            )
        assertThat(cardFetchBody.targetUrl()).isEqualTo("targetUrl")
        assertThat(cardFetchBody.cardType()).contains(CardFetchBody.CardType.EXTERNAL)
        assertThat(cardFetchBody.serverlessFunction()).contains("serverlessFunction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardFetchBody =
            CardFetchBody.builder()
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.CONTACTS)
                        .addPropertiesToSend("string")
                        .build()
                )
                .targetUrl("targetUrl")
                .cardType(CardFetchBody.CardType.EXTERNAL)
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
