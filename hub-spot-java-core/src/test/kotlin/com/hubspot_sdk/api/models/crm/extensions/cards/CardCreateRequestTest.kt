// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateRequestTest {

    @Test
    fun create() {
        val cardCreateRequest =
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

        assertThat(cardCreateRequest.actions())
            .isEqualTo(CardActions.builder().addBaseUrl("https://www.example.com/hubspot").build())
        assertThat(cardCreateRequest.display())
            .isEqualTo(
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
        assertThat(cardCreateRequest.fetch())
            .isEqualTo(
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
        assertThat(cardCreateRequest.title()).isEqualTo("PetSpot")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCreateRequest =
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

        val roundtrippedCardCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCreateRequest),
                jacksonTypeRef<CardCreateRequest>(),
            )

        assertThat(roundtrippedCardCreateRequest).isEqualTo(cardCreateRequest)
    }
}
