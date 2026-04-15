// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardsDevUpdateParamsTest {

    @Test
    fun create() {
        CardsDevUpdateParams.builder()
            .appId(0)
            .cardId("cardId")
            .cardPatchRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardsDevUpdateParams.builder()
                .appId(0)
                .cardId("cardId")
                .cardPatchRequest(CardPatchRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("cardId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardsDevUpdateParams.builder()
                .appId(0)
                .cardId("cardId")
                .cardPatchRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardsDevUpdateParams.builder()
                .appId(0)
                .cardId("cardId")
                .cardPatchRequest(CardPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CardPatchRequest.builder().build())
    }
}
