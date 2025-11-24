// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPatchRequestTest {

    @Test
    fun create() {
        val cardPatchRequest =
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

        assertThat(cardPatchRequest.actions())
            .contains(CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build())
        assertThat(cardPatchRequest.display())
            .contains(
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
        assertThat(cardPatchRequest.fetch())
            .contains(
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
        assertThat(cardPatchRequest.title()).contains("PetSpot")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPatchRequest =
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

        val roundtrippedCardPatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPatchRequest),
                jacksonTypeRef<CardPatchRequest>(),
            )

        assertThat(roundtrippedCardPatchRequest).isEqualTo(cardPatchRequest)
    }
}
