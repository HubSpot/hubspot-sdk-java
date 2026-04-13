// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardObjectTypeBodyTest {

    @Test
    fun create() {
        val cardObjectTypeBody =
            CardObjectTypeBody.builder()
                .name(CardObjectTypeBody.Name.COMPANIES)
                .addPropertiesToSend("string")
                .build()

        assertThat(cardObjectTypeBody.name()).isEqualTo(CardObjectTypeBody.Name.COMPANIES)
        assertThat(cardObjectTypeBody.propertiesToSend()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardObjectTypeBody =
            CardObjectTypeBody.builder()
                .name(CardObjectTypeBody.Name.COMPANIES)
                .addPropertiesToSend("string")
                .build()

        val roundtrippedCardObjectTypeBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardObjectTypeBody),
                jacksonTypeRef<CardObjectTypeBody>(),
            )

        assertThat(roundtrippedCardObjectTypeBody).isEqualTo(cardObjectTypeBody)
    }
}
