// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateRequestTest {

    @Test
    fun create() {
        val cardCreateRequest =
            CardCreateRequest.builder()
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
                )
                .title("title")
                .build()

        assertThat(cardCreateRequest.actions())
            .isEqualTo(CardActions.builder().addBaseUrl("string").build())
        assertThat(cardCreateRequest.display())
            .isEqualTo(
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
        assertThat(cardCreateRequest.fetch())
            .isEqualTo(
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
            )
        assertThat(cardCreateRequest.title()).isEqualTo("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCreateRequest =
            CardCreateRequest.builder()
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
                )
                .title("title")
                .build()

        val roundtrippedCardCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCreateRequest),
                jacksonTypeRef<CardCreateRequest>(),
            )

        assertThat(roundtrippedCardCreateRequest).isEqualTo(cardCreateRequest)
    }
}
