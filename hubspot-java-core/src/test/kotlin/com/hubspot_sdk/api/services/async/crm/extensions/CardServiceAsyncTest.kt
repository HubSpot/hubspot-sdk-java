// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class CardServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val cardServiceAsync = client.crm().extensions().cards()

        val publicCardResponseFuture =
            cardServiceAsync.create(
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
                                                    .type(DisplayOption.Type.DANGER)
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

        val publicCardResponse = publicCardResponseFuture.get()
        publicCardResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val cardServiceAsync = client.crm().extensions().cards()

        val publicCardResponseFuture =
            cardServiceAsync.update(
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
            )

        val publicCardResponse = publicCardResponseFuture.get()
        publicCardResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val cardServiceAsync = client.crm().extensions().cards()

        val publicCardListResponseFuture = cardServiceAsync.list(0)

        val publicCardListResponse = publicCardListResponseFuture.get()
        publicCardListResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val cardServiceAsync = client.crm().extensions().cards()

        val future =
            cardServiceAsync.delete(CardDeleteParams.builder().appId(0).cardId("cardId").build())

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val cardServiceAsync = client.crm().extensions().cards()

        val publicCardResponseFuture =
            cardServiceAsync.get(CardGetParams.builder().appId(0).cardId("cardId").build())

        val publicCardResponse = publicCardResponseFuture.get()
        publicCardResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSampleResponse() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val cardServiceAsync = client.crm().extensions().cards()

        val integratorCardPayloadResponseFuture = cardServiceAsync.getSampleResponse()

        val integratorCardPayloadResponse = integratorCardPayloadResponseFuture.get()
        integratorCardPayloadResponse.validate()
    }
}
