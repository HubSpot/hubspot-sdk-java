// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
        CardUpdateParams.builder()
            .appId(0)
            .cardId("cardId")
            .cardPatchRequest(
                CardPatchRequest.builder()
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
                                    .name(CardObjectTypeBody.Name.CONTACTS)
                                    .addPropertiesToSend("email")
                                    .addPropertiesToSend("firstname")
                                    .build()
                            )
                            .cardType(CardFetchBodyPatch.CardType.EXTERNAL)
                            .serverlessFunction("serverlessFunction")
                            .targetUrl("https://www.example.com/hubspot/target")
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
            CardUpdateParams.builder()
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
            CardUpdateParams.builder()
                .appId(0)
                .cardId("cardId")
                .cardPatchRequest(
                    CardPatchRequest.builder()
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
                                        .name(CardObjectTypeBody.Name.CONTACTS)
                                        .addPropertiesToSend("email")
                                        .addPropertiesToSend("firstname")
                                        .build()
                                )
                                .cardType(CardFetchBodyPatch.CardType.EXTERNAL)
                                .serverlessFunction("serverlessFunction")
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
                CardPatchRequest.builder()
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
                                    .name(CardObjectTypeBody.Name.CONTACTS)
                                    .addPropertiesToSend("email")
                                    .addPropertiesToSend("firstname")
                                    .build()
                            )
                            .cardType(CardFetchBodyPatch.CardType.EXTERNAL)
                            .serverlessFunction("serverlessFunction")
                            .targetUrl("https://www.example.com/hubspot/target")
                            .build()
                    )
                    .title("PetSpot")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardUpdateParams.builder()
                .appId(0)
                .cardId("cardId")
                .cardPatchRequest(CardPatchRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CardPatchRequest.builder().build())
    }
}
