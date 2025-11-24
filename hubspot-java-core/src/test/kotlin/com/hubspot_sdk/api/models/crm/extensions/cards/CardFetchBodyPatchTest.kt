// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardFetchBodyPatchTest {

    @Test
    fun create() {
        val cardFetchBodyPatch =
            CardFetchBodyPatch.builder()
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.COMPANIES)
                        .addPropertiesToSend("string")
                        .build()
                )
                .cardType(CardFetchBodyPatch.CardType.EXTERNAL)
                .serverlessFunction("serverlessFunction")
                .targetUrl("targetUrl")
                .build()

        assertThat(cardFetchBodyPatch.objectTypes())
            .containsExactly(
                CardObjectTypeBody.builder()
                    .name(CardObjectTypeBody.Name.COMPANIES)
                    .addPropertiesToSend("string")
                    .build()
            )
        assertThat(cardFetchBodyPatch.cardType()).contains(CardFetchBodyPatch.CardType.EXTERNAL)
        assertThat(cardFetchBodyPatch.serverlessFunction()).contains("serverlessFunction")
        assertThat(cardFetchBodyPatch.targetUrl()).contains("targetUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardFetchBodyPatch =
            CardFetchBodyPatch.builder()
                .addObjectType(
                    CardObjectTypeBody.builder()
                        .name(CardObjectTypeBody.Name.COMPANIES)
                        .addPropertiesToSend("string")
                        .build()
                )
                .cardType(CardFetchBodyPatch.CardType.EXTERNAL)
                .serverlessFunction("serverlessFunction")
                .targetUrl("targetUrl")
                .build()

        val roundtrippedCardFetchBodyPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardFetchBodyPatch),
                jacksonTypeRef<CardFetchBodyPatch>(),
            )

        assertThat(roundtrippedCardFetchBodyPatch).isEqualTo(cardFetchBodyPatch)
    }
}
