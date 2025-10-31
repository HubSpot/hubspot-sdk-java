// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.extensions.cards.CardActions
import com.hubspot_sdk.api.models.crm.extensions.cards.CardCreateParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardCreateRequest
import com.hubspot_sdk.api.models.crm.extensions.cards.CardDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardDisplayBody
import com.hubspot_sdk.api.models.crm.extensions.cards.CardDisplayProperty
import com.hubspot_sdk.api.models.crm.extensions.cards.CardFetchBody
import com.hubspot_sdk.api.models.crm.extensions.cards.CardFetchBodyPatch
import com.hubspot_sdk.api.models.crm.extensions.cards.CardGetParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardObjectTypeBody
import com.hubspot_sdk.api.models.crm.extensions.cards.CardPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.cards.CardUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.cards.DisplayOption
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val cardService = client.crm().extensions().cards()

        val publicCardResponse =
            cardService.create(
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
            )

        publicCardResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val cardService = client.crm().extensions().cards()

        val publicCardResponse =
            cardService.update(
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
                                                    .type(DisplayOption.Type.DEFAULT)
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
            )

        publicCardResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val cardService = client.crm().extensions().cards()

        val publicCardListResponse = cardService.list(0)

        publicCardListResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val cardService = client.crm().extensions().cards()

        cardService.delete(CardDeleteParams.builder().appId(0).cardId("cardId").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val cardService = client.crm().extensions().cards()

        val publicCardResponse =
            cardService.get(CardGetParams.builder().appId(0).cardId("cardId").build())

        publicCardResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSampleResponse() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val cardService = client.crm().extensions().cards()

        val integratorCardPayloadResponse = cardService.getSampleResponse()

        integratorCardPayloadResponse.validate()
    }
}
