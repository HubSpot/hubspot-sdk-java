// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardsDevCreateParamsTest {

    @Test
    fun create() {
        CardsDevCreateParams.builder()
            .appId(0)
            .cardCreateRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardsDevCreateParams.builder()
                .appId(0)
                .cardCreateRequest(
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
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardsDevCreateParams.builder()
                .appId(0)
                .cardCreateRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardsDevCreateParams.builder()
                .appId(0)
                .cardCreateRequest(
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
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                            .build()
                    )
                    .title("title")
                    .build()
            )
    }
}
