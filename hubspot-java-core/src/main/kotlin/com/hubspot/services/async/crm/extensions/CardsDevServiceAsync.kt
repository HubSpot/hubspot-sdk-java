// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.extensions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.extensions.cardsdev.CardMigrateViewsResponse
import com.hubspot.models.crm.extensions.cardsdev.CardsDevCreateParams
import com.hubspot.models.crm.extensions.cardsdev.CardsDevDeleteParams
import com.hubspot.models.crm.extensions.cardsdev.CardsDevGetByIdParams
import com.hubspot.models.crm.extensions.cardsdev.CardsDevGetParams
import com.hubspot.models.crm.extensions.cardsdev.CardsDevGetSampleResponseParams
import com.hubspot.models.crm.extensions.cardsdev.CardsDevMigrateViewsParams
import com.hubspot.models.crm.extensions.cardsdev.CardsDevUpdateParams
import com.hubspot.models.crm.extensions.cardsdev.IntegratorCardPayloadResponse
import com.hubspot.models.crm.extensions.cardsdev.PublicCardListResponse
import com.hubspot.models.crm.extensions.cardsdev.PublicCardResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardsDevServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardsDevServiceAsync

    /** Defines a new card that will become active on an account when this app is installed. */
    fun create(appId: Int, params: CardsDevCreateParams): CompletableFuture<PublicCardResponse> =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: CardsDevCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse> =
        create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: CardsDevCreateParams): CompletableFuture<PublicCardResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardsDevCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse>

    /** Update a card definition with new details. */
    fun update(
        cardId: String,
        params: CardsDevUpdateParams,
    ): CompletableFuture<PublicCardResponse> = update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardsDevUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse> =
        update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(params: CardsDevUpdateParams): CompletableFuture<PublicCardResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardsDevUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse>

    /**
     * Permanently deletes a card definition with the given ID. Once deleted, data fetch requests
     * for this card will no longer be sent to your service. This can't be undone.
     */
    fun delete(cardId: String, params: CardsDevDeleteParams): CompletableFuture<Void?> =
        delete(cardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        cardId: String,
        params: CardsDevDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CardsDevDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CardsDevDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns a list of cards for a given app. */
    fun get(appId: Int): CompletableFuture<PublicCardListResponse> =
        get(appId, CardsDevGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: CardsDevGetParams = CardsDevGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardListResponse> =
        get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: CardsDevGetParams = CardsDevGetParams.none(),
    ): CompletableFuture<PublicCardListResponse> = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CardsDevGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardListResponse>

    /** @see get */
    fun get(params: CardsDevGetParams): CompletableFuture<PublicCardListResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): CompletableFuture<PublicCardListResponse> =
        get(appId, CardsDevGetParams.none(), requestOptions)

    /** Returns the definition for a card with the given ID. */
    fun getById(
        cardId: String,
        params: CardsDevGetByIdParams,
    ): CompletableFuture<PublicCardResponse> = getById(cardId, params, RequestOptions.none())

    /** @see getById */
    fun getById(
        cardId: String,
        params: CardsDevGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse> =
        getById(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see getById */
    fun getById(params: CardsDevGetByIdParams): CompletableFuture<PublicCardResponse> =
        getById(params, RequestOptions.none())

    /** @see getById */
    fun getById(
        params: CardsDevGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicCardResponse>

    /**
     * Returns an example card detail response. This is the payload with displayed details for a
     * card that will be shown to a user. An app should send this in response to the data fetch
     * request.
     */
    fun getSampleResponse(): CompletableFuture<IntegratorCardPayloadResponse> =
        getSampleResponse(CardsDevGetSampleResponseParams.none())

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorCardPayloadResponse>

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none()
    ): CompletableFuture<IntegratorCardPayloadResponse> =
        getSampleResponse(params, RequestOptions.none())

    /** @see getSampleResponse */
    fun getSampleResponse(
        requestOptions: RequestOptions
    ): CompletableFuture<IntegratorCardPayloadResponse> =
        getSampleResponse(CardsDevGetSampleResponseParams.none(), requestOptions)

    fun migrateViews(
        appId: Int,
        params: CardsDevMigrateViewsParams,
    ): CompletableFuture<CardMigrateViewsResponse> =
        migrateViews(appId, params, RequestOptions.none())

    /** @see migrateViews */
    fun migrateViews(
        appId: Int,
        params: CardsDevMigrateViewsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardMigrateViewsResponse> =
        migrateViews(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see migrateViews */
    fun migrateViews(
        params: CardsDevMigrateViewsParams
    ): CompletableFuture<CardMigrateViewsResponse> = migrateViews(params, RequestOptions.none())

    /** @see migrateViews */
    fun migrateViews(
        params: CardsDevMigrateViewsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardMigrateViewsResponse>

    /**
     * A view of [CardsDevServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardsDevServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/extensions/cards-dev/2026-03/{appId}`, but is
         * otherwise the same as [CardsDevServiceAsync.create].
         */
        fun create(
            appId: Int,
            params: CardsDevCreateParams,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        fun create(
            appId: Int,
            params: CardsDevCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        fun create(
            params: CardsDevCreateParams
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardsDevCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/cards-dev/2026-03/{appId}/{cardId}`, but is otherwise the same as
         * [CardsDevServiceAsync.update].
         */
        fun update(
            cardId: String,
            params: CardsDevUpdateParams,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            update(cardId, params, RequestOptions.none())

        /** @see update */
        fun update(
            cardId: String,
            params: CardsDevUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CardsDevUpdateParams
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CardsDevUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/cards-dev/2026-03/{appId}/{cardId}`, but is otherwise the same as
         * [CardsDevServiceAsync.delete].
         */
        fun delete(cardId: String, params: CardsDevDeleteParams): CompletableFuture<HttpResponse> =
            delete(cardId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            cardId: String,
            params: CardsDevDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see delete */
        fun delete(params: CardsDevDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CardsDevDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /crm/extensions/cards-dev/2026-03/{appId}`, but is
         * otherwise the same as [CardsDevServiceAsync.get].
         */
        fun get(appId: Int): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            get(appId, CardsDevGetParams.none())

        /** @see get */
        fun get(
            appId: Int,
            params: CardsDevGetParams = CardsDevGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        fun get(
            appId: Int,
            params: CardsDevGetParams = CardsDevGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            get(appId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: CardsDevGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>>

        /** @see get */
        fun get(
            params: CardsDevGetParams
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCardListResponse>> =
            get(appId, CardsDevGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/extensions/cards-dev/2026-03/{appId}/{cardId}`,
         * but is otherwise the same as [CardsDevServiceAsync.getById].
         */
        fun getById(
            cardId: String,
            params: CardsDevGetByIdParams,
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            getById(cardId, params, RequestOptions.none())

        /** @see getById */
        fun getById(
            cardId: String,
            params: CardsDevGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            getById(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see getById */
        fun getById(
            params: CardsDevGetByIdParams
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>> =
            getById(params, RequestOptions.none())

        /** @see getById */
        fun getById(
            params: CardsDevGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicCardResponse>>

        /**
         * Returns a raw HTTP response for `get /crm/extensions/cards-dev/2026-03/sample-response`,
         * but is otherwise the same as [CardsDevServiceAsync.getSampleResponse].
         */
        fun getSampleResponse(): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> =
            getSampleResponse(CardsDevGetSampleResponseParams.none())

        /** @see getSampleResponse */
        fun getSampleResponse(
            params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>>

        /** @see getSampleResponse */
        fun getSampleResponse(
            params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none()
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> =
            getSampleResponse(params, RequestOptions.none())

        /** @see getSampleResponse */
        fun getSampleResponse(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntegratorCardPayloadResponse>> =
            getSampleResponse(CardsDevGetSampleResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/extensions/cards-dev/2026-03/{appId}/views/migrate`, but is otherwise the same as
         * [CardsDevServiceAsync.migrateViews].
         */
        fun migrateViews(
            appId: Int,
            params: CardsDevMigrateViewsParams,
        ): CompletableFuture<HttpResponseFor<CardMigrateViewsResponse>> =
            migrateViews(appId, params, RequestOptions.none())

        /** @see migrateViews */
        fun migrateViews(
            appId: Int,
            params: CardsDevMigrateViewsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardMigrateViewsResponse>> =
            migrateViews(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see migrateViews */
        fun migrateViews(
            params: CardsDevMigrateViewsParams
        ): CompletableFuture<HttpResponseFor<CardMigrateViewsResponse>> =
            migrateViews(params, RequestOptions.none())

        /** @see migrateViews */
        fun migrateViews(
            params: CardsDevMigrateViewsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardMigrateViewsResponse>>
    }
}
