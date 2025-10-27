// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.extensions

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync

    /** Defines a new card that will become active on an account when this app is installed. */
    fun create(appId: Int, params: CardCreateParams): CompletableFuture<PublicCardResponse> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: CardCreateParams): CompletableFuture<PublicCardResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse>

    /** Update a card definition with new details. */
    fun update(cardId: String, params: CardUpdateParams): CompletableFuture<PublicCardResponse> =
        update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse> =
        update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(params: CardUpdateParams): CompletableFuture<PublicCardResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse>

    /** Returns a list of cards for a given app. */
    fun list(appId: Int): CompletableFuture<PublicCardListResponse> =
        list(appId, CardListParams.none())

    /** @see list */
    fun list(
        appId: Int,
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardListResponse> =
        list(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see list */
    fun list(
        appId: Int,
        params: CardListParams = CardListParams.none(),
    ): CompletableFuture<PublicCardListResponse> = list(appId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardListResponse>

    /** @see list */
    fun list(params: CardListParams): CompletableFuture<PublicCardListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCardListResponse> =
        list(appId, CardListParams.none(), requestOptions)

    /**
     * Permanently deletes a card definition with the given ID. Once deleted, data fetch requests
     * for this card will no longer be sent to your service. This can't be undone.
     */
    fun delete(cardId: String, params: CardDeleteParams): CompletableFuture<Void?> =
        delete(cardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        cardId: String,
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CardDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CardDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns the definition for a card with the given ID. */
    fun get(cardId: String, params: CardGetParams): CompletableFuture<PublicCardResponse> =
        get(cardId, params, RequestOptions.none())

    /** @see get */
    fun get(
        cardId: String,
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse> =
        get(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see get */
    fun get(params: CardGetParams): CompletableFuture<PublicCardResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CardGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse>

    /**
     * Returns an example card detail response. This is the payload with displayed details for a
     * card that will be shown to a user. An app should send this in response to the data fetch
     * request.
     */
    fun getSampleResponse(): CompletableFuture<IntegratorCardPayloadResponse> =
        getSampleResponse(CardGetSampleResponseParams.none())

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardGetSampleResponseParams = CardGetSampleResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorCardPayloadResponse>

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardGetSampleResponseParams = CardGetSampleResponseParams.none()
    ): CompletableFuture<IntegratorCardPayloadResponse> =
        getSampleResponse(params, RequestOptions.none())

    /** @see getSampleResponse */
    fun getSampleResponse(
        requestOptions: RequestOptions
    ): CompletableFuture<IntegratorCardPayloadResponse> =
        getSampleResponse(CardGetSampleResponseParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v3/extensions/cards-dev/{appId}`, but is
         * otherwise the same as [CardServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: CardCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CardCreateParams
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>>

        /**
         * Returns a raw HTTP response for `patch /crm/v3/extensions/cards-dev/{appId}/{cardId}`,
         * but is otherwise the same as [CardServiceAsync.update].
         */
        fun update(
            cardId: String,
            params: CardUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            update(cardId, params, RequestOptions.none())

        /** @see update */
        fun update(
            cardId: String,
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CardUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/cards-dev/{appId}`, but is
         * otherwise the same as [CardServiceAsync.list].
         */
        fun list(appId: Int): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            list(appId, CardListParams.none())

        /** @see list */
        fun list(
            appId: Int,
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            list(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see list */
        fun list(
            appId: Int,
            params: CardListParams = CardListParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            list(appId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CardListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>>

        /** @see list */
        fun list(
            params: CardListParams
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            list(appId, CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/v3/extensions/cards-dev/{appId}/{cardId}`,
         * but is otherwise the same as [CardServiceAsync.delete].
         */
        fun delete(cardId: String, params: CardDeleteParams): CompletableFuture<HttpResponse> =
            delete(cardId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            cardId: String,
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see delete */
        fun delete(params: CardDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CardDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/cards-dev/{appId}/{cardId}`, but
         * is otherwise the same as [CardServiceAsync.get].
         */
        fun get(
            cardId: String,
            params: CardGetParams,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            get(cardId, params, RequestOptions.none())

        /** @see get */
        fun get(
            cardId: String,
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            get(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see get */
        fun get(params: CardGetParams): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CardGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>>

        /**
         * Returns a raw HTTP response for `get /crm/v3/extensions/cards-dev/sample-response`, but
         * is otherwise the same as [CardServiceAsync.getSampleResponse].
         */
        fun getSampleResponse(): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> =
            getSampleResponse(CardGetSampleResponseParams.none())

        /** @see getSampleResponse */
        fun getSampleResponse(
            params: CardGetSampleResponseParams = CardGetSampleResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>>

        /** @see getSampleResponse */
        fun getSampleResponse(
            params: CardGetSampleResponseParams = CardGetSampleResponseParams.none()
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> =
            getSampleResponse(params, RequestOptions.none())

        /** @see getSampleResponse */
        fun getSampleResponse(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> =
            getSampleResponse(CardGetSampleResponseParams.none(), requestOptions)
    }
}
