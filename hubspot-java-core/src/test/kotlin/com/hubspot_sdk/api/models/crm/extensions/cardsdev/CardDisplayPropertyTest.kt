// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisplayPropertyTest {

    @Test
    fun create() {
        val cardDisplayProperty =
            CardDisplayProperty.builder()
                .dataType(CardDisplayProperty.DataType.BOOLEAN)
                .label("label")
                .name("name")
                .addOption(
                    DisplayOption.builder()
                        .label("label")
                        .name("name")
                        .type(DisplayOption.Type.DANGER)
                        .build()
                )
                .build()

        assertThat(cardDisplayProperty.dataType()).isEqualTo(CardDisplayProperty.DataType.BOOLEAN)
        assertThat(cardDisplayProperty.label()).isEqualTo("label")
        assertThat(cardDisplayProperty.name()).isEqualTo("name")
        assertThat(cardDisplayProperty.options())
            .containsExactly(
                DisplayOption.builder()
                    .label("label")
                    .name("name")
                    .type(DisplayOption.Type.DANGER)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDisplayProperty =
            CardDisplayProperty.builder()
                .dataType(CardDisplayProperty.DataType.BOOLEAN)
                .label("label")
                .name("name")
                .addOption(
                    DisplayOption.builder()
                        .label("label")
                        .name("name")
                        .type(DisplayOption.Type.DANGER)
                        .build()
                )
                .build()

        val roundtrippedCardDisplayProperty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDisplayProperty),
                jacksonTypeRef<CardDisplayProperty>(),
            )

        assertThat(roundtrippedCardDisplayProperty).isEqualTo(cardDisplayProperty)
    }
}
