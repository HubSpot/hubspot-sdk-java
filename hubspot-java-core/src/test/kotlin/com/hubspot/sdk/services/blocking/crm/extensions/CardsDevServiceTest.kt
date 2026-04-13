// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.extensions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardActions
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardCreateRequest
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardDisplayBody
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardDisplayProperty
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardFetchBody
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardFetchBodyPatch
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardMigrateViewsRequest
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardObjectTypeBody
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardPatchRequest
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevCreateParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevDeleteParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevGetByIdParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevMigrateViewsParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.CardsDevUpdateParams
import com.hubspot.sdk.models.crm.extensions.cardsdev.DisplayOption
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardsDevServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        val publicCardResponse =
            cardsDevService.create(
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
            )

        publicCardResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        val publicCardResponse =
            cardsDevService.update(
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
            )

        publicCardResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        cardsDevService.delete(CardsDevDeleteParams.builder().appId(0).cardId("cardId").build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        val publicCardListResponse = cardsDevService.get(0)

        publicCardListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        val publicCardResponse =
            cardsDevService.getById(
                CardsDevGetByIdParams.builder().appId(0).cardId("cardId").build()
            )

        publicCardResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSampleResponse() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        val integratorCardPayloadResponse = cardsDevService.getSampleResponse()

        integratorCardPayloadResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun migrateViews() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val cardsDevService = client.crm().extensions().cardsDev()

        val cardMigrateViewsResponse =
            cardsDevService.migrateViews(
                CardsDevMigrateViewsParams.builder()
                    .appId(0)
                    .cardMigrateViewsRequest(
                        CardMigrateViewsRequest.builder()
                            .appCardId(0L)
                            .legacyCrmCardId(0L)
                            .helpdeskAppCardId(0L)
                            .build()
                    )
                    .build()
            )

        cardMigrateViewsResponse.validate()
    }
}
