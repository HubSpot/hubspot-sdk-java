// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardActions
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardCreateRequest
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardDisplayBody
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardDisplayProperty
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardFetchBody
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardFetchBodyPatch
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardMigrateViewsRequest
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardObjectTypeBody
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardPatchRequest
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevCreateParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevGetByIdParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevMigrateViewsParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.CardsDevUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.cardsdev.DisplayOption
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardsDevServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val publicCardResponseFuture =
            cardsDevServiceAsync.create(
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

        val publicCardResponse = publicCardResponseFuture.get()
        publicCardResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val publicCardResponseFuture =
            cardsDevServiceAsync.update(
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

        val publicCardResponse = publicCardResponseFuture.get()
        publicCardResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val future =
            cardsDevServiceAsync.delete(
                CardsDevDeleteParams.builder().appId(0).cardId("cardId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val publicCardListResponseFuture = cardsDevServiceAsync.get(0)

        val publicCardListResponse = publicCardListResponseFuture.get()
        publicCardListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getById() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val publicCardResponseFuture =
            cardsDevServiceAsync.getById(
                CardsDevGetByIdParams.builder().appId(0).cardId("cardId").build()
            )

        val publicCardResponse = publicCardResponseFuture.get()
        publicCardResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSampleResponse() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val integratorCardPayloadResponseFuture = cardsDevServiceAsync.getSampleResponse()

        val integratorCardPayloadResponse = integratorCardPayloadResponseFuture.get()
        integratorCardPayloadResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun migrateViews() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val cardsDevServiceAsync = client.crm().extensions().cardsDev()

        val cardMigrateViewsResponseFuture =
            cardsDevServiceAsync.migrateViews(
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

        val cardMigrateViewsResponse = cardMigrateViewsResponseFuture.get()
        cardMigrateViewsResponse.validate()
    }
}
