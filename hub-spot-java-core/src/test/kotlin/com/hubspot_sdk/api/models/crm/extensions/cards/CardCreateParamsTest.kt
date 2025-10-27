// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateParamsTest {

    @Test
    fun create() {
        CardCreateParams.builder()
            .appId(0)
            .cardCreateRequest(
                CardCreateRequest.builder()
                    .actions(
                        CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build()
                    )
                    .display(
                        CardDisplayBody.builder()
                            .addProperty(
                                CardDisplayProperty.builder()
                                    .dataType(CardDisplayProperty.DataType.STRING)
                                    .label("Pets Name")
                                    .name("pet_name")
                                    .addOption(
                                        DisplayOption.builder()
                                            .label("label")
                                            .name("name")
                                            .type(DisplayOption.Type.DEFAULT)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .fetch(
                        CardFetchBody.builder()
                            .addObjectType(
                                CardObjectTypeBody.builder()
                                    .name(CardObjectTypeBody.Name.CONTACTS)
                                    .addPropertiesToSend("email")
                                    .addPropertiesToSend("firstname")
                                    .build()
                            )
                            .targetUrl("https://www.example.com/hubspot/target")
                            .cardType(CardFetchBody.CardType.EXTERNAL)
                            .serverlessFunction("serverlessFunction")
                            .build()
                    )
                    .title("PetSpot")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardCreateParams.builder()
                .appId(0)
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .actions(
                            CardActions.builder()
                                .addBaseUrl("https://www.example.com/hubspot")
                                .build()
                        )
                        .display(
                            CardDisplayBody.builder()
                                .addProperty(
                                    CardDisplayProperty.builder()
                                        .dataType(CardDisplayProperty.DataType.STRING)
                                        .label("Pets Name")
                                        .name("pet_name")
                                        .addOption(
                                            DisplayOption.builder()
                                                .label("label")
                                                .name("name")
                                                .type(DisplayOption.Type.DEFAULT)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .fetch(
                            CardFetchBody.builder()
                                .addObjectType(
                                    CardObjectTypeBody.builder()
                                        .name(CardObjectTypeBody.Name.CONTACTS)
                                        .addPropertiesToSend("email")
                                        .addPropertiesToSend("firstname")
                                        .build()
                                )
                                .targetUrl("https://www.example.com/hubspot/target")
                                .build()
                        )
                        .title("PetSpot")
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
            CardCreateParams.builder()
                .appId(0)
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .actions(
                            CardActions.builder()
                                .addBaseUrl("https://www.example.com/hubspot")
                                .build()
                        )
                        .display(
                            CardDisplayBody.builder()
                                .addProperty(
                                    CardDisplayProperty.builder()
                                        .dataType(CardDisplayProperty.DataType.STRING)
                                        .label("Pets Name")
                                        .name("pet_name")
                                        .addOption(
                                            DisplayOption.builder()
                                                .label("label")
                                                .name("name")
                                                .type(DisplayOption.Type.DEFAULT)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .fetch(
                            CardFetchBody.builder()
                                .addObjectType(
                                    CardObjectTypeBody.builder()
                                        .name(CardObjectTypeBody.Name.CONTACTS)
                                        .addPropertiesToSend("email")
                                        .addPropertiesToSend("firstname")
                                        .build()
                                )
                                .targetUrl("https://www.example.com/hubspot/target")
                                .cardType(CardFetchBody.CardType.EXTERNAL)
                                .serverlessFunction("serverlessFunction")
                                .build()
                        )
                        .title("PetSpot")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardCreateRequest.builder()
                    .actions(
                        CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build()
                    )
                    .display(
                        CardDisplayBody.builder()
                            .addProperty(
                                CardDisplayProperty.builder()
                                    .dataType(CardDisplayProperty.DataType.STRING)
                                    .label("Pets Name")
                                    .name("pet_name")
                                    .addOption(
                                        DisplayOption.builder()
                                            .label("label")
                                            .name("name")
                                            .type(DisplayOption.Type.DEFAULT)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .fetch(
                        CardFetchBody.builder()
                            .addObjectType(
                                CardObjectTypeBody.builder()
                                    .name(CardObjectTypeBody.Name.CONTACTS)
                                    .addPropertiesToSend("email")
                                    .addPropertiesToSend("firstname")
                                    .build()
                            )
                            .targetUrl("https://www.example.com/hubspot/target")
                            .cardType(CardFetchBody.CardType.EXTERNAL)
                            .serverlessFunction("serverlessFunction")
                            .build()
                    )
                    .title("PetSpot")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardCreateParams.builder()
                .appId(0)
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .actions(
                            CardActions.builder()
                                .addBaseUrl("https://www.example.com/hubspot")
                                .build()
                        )
                        .display(
                            CardDisplayBody.builder()
                                .addProperty(
                                    CardDisplayProperty.builder()
                                        .dataType(CardDisplayProperty.DataType.STRING)
                                        .label("Pets Name")
                                        .name("pet_name")
                                        .addOption(
                                            DisplayOption.builder()
                                                .label("label")
                                                .name("name")
                                                .type(DisplayOption.Type.DEFAULT)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .fetch(
                            CardFetchBody.builder()
                                .addObjectType(
                                    CardObjectTypeBody.builder()
                                        .name(CardObjectTypeBody.Name.CONTACTS)
                                        .addPropertiesToSend("email")
                                        .addPropertiesToSend("firstname")
                                        .build()
                                )
                                .targetUrl("https://www.example.com/hubspot/target")
                                .build()
                        )
                        .title("PetSpot")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardCreateRequest.builder()
                    .actions(
                        CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build()
                    )
                    .display(
                        CardDisplayBody.builder()
                            .addProperty(
                                CardDisplayProperty.builder()
                                    .dataType(CardDisplayProperty.DataType.STRING)
                                    .label("Pets Name")
                                    .name("pet_name")
                                    .addOption(
                                        DisplayOption.builder()
                                            .label("label")
                                            .name("name")
                                            .type(DisplayOption.Type.DEFAULT)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .fetch(
                        CardFetchBody.builder()
                            .addObjectType(
                                CardObjectTypeBody.builder()
                                    .name(CardObjectTypeBody.Name.CONTACTS)
                                    .addPropertiesToSend("email")
                                    .addPropertiesToSend("firstname")
                                    .build()
                            )
                            .targetUrl("https://www.example.com/hubspot/target")
                            .build()
                    )
                    .title("PetSpot")
                    .build()
            )
    }
}
