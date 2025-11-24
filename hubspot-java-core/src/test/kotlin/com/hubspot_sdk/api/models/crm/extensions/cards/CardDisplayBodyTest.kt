// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisplayBodyTest {

    @Test
    fun create() {
        val cardDisplayBody =
            CardDisplayBody.builder()
                .addProperty(
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
                )
                .build()

        assertThat(cardDisplayBody.properties())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardDisplayBody =
            CardDisplayBody.builder()
                .addProperty(
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
                )
                .build()

        val roundtrippedCardDisplayBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardDisplayBody),
                jacksonTypeRef<CardDisplayBody>(),
            )

        assertThat(roundtrippedCardDisplayBody).isEqualTo(cardDisplayBody)
    }
}
