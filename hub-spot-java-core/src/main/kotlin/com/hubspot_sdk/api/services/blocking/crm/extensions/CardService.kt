// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.extensions

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.extensions.cards.CardCreateParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardDeleteParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardGetParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardGetSampleResponseParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardListParams
import com.hubspot_sdk.api.models.crm.extensions.cards.CardUpdateParams
import com.hubspot_sdk.api.models.crm.extensions.cards.IntegratorCardPayloadResponse
import com.hubspot_sdk.api.models.crm.extensions.cards.PublicCardListResponse
import com.hubspot_sdk.api.models.crm.extensions.cards.PublicCardResponse
import java.util.function.Consumer

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService

    /** Defines a new card that will become active on an account when this app is installed. */
    fun create(appId: Int, params: CardCreateParams): PublicCardResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: CardCreateParams): PublicCardResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse

    /** Update a card definition with new details. */
    fun update(cardId: String, params: CardUpdateParams): PublicCardResponse =
        update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(params: CardUpdateParams): PublicCardResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse

    /** Returns a list of cards for a given app. */
    fun list(appId: Int): PublicCardListResponse = list(appId, CardListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardListResponse = list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(appId: Int, params: CardListParams = CardListParams.none()): PublicCardListResponse =
        list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardListResponse

    /** @see list */
    fun list(params: CardListParams): PublicCardListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(appId: Int, requestOptions: RequestOptions): PublicCardListResponse =
        list(appId, CardListParams.none(), requestOptions)

    /**
     * Permanently deletes a card definition with the given ID. Once deleted, data fetch requests
     * for this card will no longer be sent to your service. This can't be undone.
     */
    fun delete(cardId: String, params: CardDeleteParams) =
        delete(cardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        cardId: String,
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CardDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CardDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Returns the definition for a card with the given ID. */
    fun get(cardId: String, params: CardGetParams): PublicCardResponse =
        get(cardId, params, RequestOptions.none())

    /** @see get */
    fun get(
        cardId: String,
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse = get(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see get */
    fun get(params: CardGetParams): PublicCardResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse

    /**
     * Returns an example card detail response. This is the payload with displayed details for a
     * card that will be shown to a user. An app should send this in response to the data fetch
     * request.
     */
    fun getSampleResponse(): IntegratorCardPayloadResponse =
        getSampleResponse(CardGetSampleResponseParams.none())

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardGetSampleResponseParams = CardGetSampleResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorCardPayloadResponse

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardGetSampleResponseParams = CardGetSampleResponseParams.none()
    ): IntegratorCardPayloadResponse = getSampleResponse(params, RequestOptions.none())

    /** @see getSampleResponse */
    fun getSampleResponse(requestOptions: RequestOptions): IntegratorCardPayloadResponse =
        getSampleResponse(CardGetSampleResponseParams.none(), requestOptions)

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/extensions/cards-dev/{appId}`, but is
         * otherwise the same as [CardService.create].
         */
        @MustBeClosed
        fun create(appId: Int, params: CardCreateParams): HttpResponseFor<PublicCardResponse> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CardCreateParams): HttpResponseFor<PublicCardResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse>

        /**
         * Returns a raw HTTP response for `patch /crm/v3/extensions/cards-dev/{appId}/{cardId}`,
         * but is otherwise the same as [CardService.update].
         */
        @MustBeClosed
        fun update(cardId: String, params: CardUpdateParams): HttpResponseFor<PublicCardResponse> =
            update(cardId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CardUpdateParams): HttpResponseFor<PublicCardResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse>

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/cards-dev/{appId}`, but is
         * otherwise the same as [CardService.list].
         */
        @MustBeClosed
        fun list(appId: Int): HttpResponseFor<PublicCardListResponse> =
            list(appId, CardListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardListResponse> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            params: CardListParams = CardListParams.none(),
        ): HttpResponseFor<PublicCardListResponse> = list(appId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: CardListParams): HttpResponseFor<PublicCardListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardListResponse> =
            list(appId, CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/extensions/cards-dev/{appId}/{cardId}`,
         * but is otherwise the same as [CardService.delete].
         */
        @MustBeClosed
        fun delete(cardId: String, params: CardDeleteParams): HttpResponse =
            delete(cardId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            cardId: String,
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: CardDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/cards-dev/{appId}/{cardId}`, but
         * is otherwise the same as [CardService.get].
         */
        @MustBeClosed
        fun get(cardId: String, params: CardGetParams): HttpResponseFor<PublicCardResponse> =
            get(cardId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            cardId: String,
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse> =
            get(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: CardGetParams): HttpResponseFor<PublicCardResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse>

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/cards-dev/sample-response`, but
         * is otherwise the same as [CardService.getSampleResponse].
         */
        @MustBeClosed
        fun getSampleResponse(): HttpResponseFor<IntegratorCardPayloadResponse> =
            getSampleResponse(CardGetSampleResponseParams.none())

        /** @see getSampleResponse */
        @MustBeClosed
        fun getSampleResponse(
            params: CardGetSampleResponseParams = CardGetSampleResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorCardPayloadResponse>

        /** @see getSampleResponse */
        @MustBeClosed
        fun getSampleResponse(
            params: CardGetSampleResponseParams = CardGetSampleResponseParams.none()
        ): HttpResponseFor<IntegratorCardPayloadResponse> =
            getSampleResponse(params, RequestOptions.none())

        /** @see getSampleResponse */
        @MustBeClosed
        fun getSampleResponse(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntegratorCardPayloadResponse> =
            getSampleResponse(CardGetSampleResponseParams.none(), requestOptions)
    }
}
