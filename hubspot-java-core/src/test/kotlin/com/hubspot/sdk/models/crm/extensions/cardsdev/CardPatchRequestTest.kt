// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPatchRequestTest {

    @Test
    fun create() {
        val cardPatchRequest =
            CardPatchRequest.builder()
                .actions(CardActions.builder().addBaseUrl("string").build())
                .display(
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
                )
                .fetch(
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
                )
                .title("title")
                .build()

        assertThat(cardPatchRequest.actions())
            .contains(CardActions.builder().addBaseUrl("string").build())
        assertThat(cardPatchRequest.display())
            .contains(
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
            )
        assertThat(cardPatchRequest.fetch())
            .contains(
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
            )
        assertThat(cardPatchRequest.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPatchRequest =
            CardPatchRequest.builder()
                .actions(CardActions.builder().addBaseUrl("string").build())
                .display(
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
                )
                .fetch(
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
                )
                .title("title")
                .build()

        val roundtrippedCardPatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPatchRequest),
                jacksonTypeRef<CardPatchRequest>(),
            )

        assertThat(roundtrippedCardPatchRequest).isEqualTo(cardPatchRequest)
    }
}
