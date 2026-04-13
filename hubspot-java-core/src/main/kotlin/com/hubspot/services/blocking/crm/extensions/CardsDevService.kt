// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.extensions

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface CardsDevService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardsDevService

    /** Defines a new card that will become active on an account when this app is installed. */
    fun create(appId: Int, params: CardsDevCreateParams): PublicCardResponse =
        create(appId, params, RequestOptions.none())

    /** @see create */
    fun create(
        appId: Int,
        params: CardsDevCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse = create(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see create */
    fun create(params: CardsDevCreateParams): PublicCardResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardsDevCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse

    /** Update a card definition with new details. */
    fun update(cardId: String, params: CardsDevUpdateParams): PublicCardResponse =
        update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardsDevUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(params: CardsDevUpdateParams): PublicCardResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardsDevUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse

    /**
     * Permanently deletes a card definition with the given ID. Once deleted, data fetch requests
     * for this card will no longer be sent to your service. This can't be undone.
     */
    fun delete(cardId: String, params: CardsDevDeleteParams) =
        delete(cardId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        cardId: String,
        params: CardsDevDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CardsDevDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CardsDevDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Returns a list of cards for a given app. */
    fun get(appId: Int): PublicCardListResponse = get(appId, CardsDevGetParams.none())

    /** @see get */
    fun get(
        appId: Int,
        params: CardsDevGetParams = CardsDevGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardListResponse = get(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see get */
    fun get(
        appId: Int,
        params: CardsDevGetParams = CardsDevGetParams.none(),
    ): PublicCardListResponse = get(appId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CardsDevGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardListResponse

    /** @see get */
    fun get(params: CardsDevGetParams): PublicCardListResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(appId: Int, requestOptions: RequestOptions): PublicCardListResponse =
        get(appId, CardsDevGetParams.none(), requestOptions)

    /** Returns the definition for a card with the given ID. */
    fun getById(cardId: String, params: CardsDevGetByIdParams): PublicCardResponse =
        getById(cardId, params, RequestOptions.none())

    /** @see getById */
    fun getById(
        cardId: String,
        params: CardsDevGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse = getById(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see getById */
    fun getById(params: CardsDevGetByIdParams): PublicCardResponse =
        getById(params, RequestOptions.none())

    /** @see getById */
    fun getById(
        params: CardsDevGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicCardResponse

    /**
     * Returns an example card detail response. This is the payload with displayed details for a
     * card that will be shown to a user. An app should send this in response to the data fetch
     * request.
     */
    fun getSampleResponse(): IntegratorCardPayloadResponse =
        getSampleResponse(CardsDevGetSampleResponseParams.none())

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegratorCardPayloadResponse

    /** @see getSampleResponse */
    fun getSampleResponse(
        params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none()
    ): IntegratorCardPayloadResponse = getSampleResponse(params, RequestOptions.none())

    /** @see getSampleResponse */
    fun getSampleResponse(requestOptions: RequestOptions): IntegratorCardPayloadResponse =
        getSampleResponse(CardsDevGetSampleResponseParams.none(), requestOptions)

    fun migrateViews(appId: Int, params: CardsDevMigrateViewsParams): CardMigrateViewsResponse =
        migrateViews(appId, params, RequestOptions.none())

    /** @see migrateViews */
    fun migrateViews(
        appId: Int,
        params: CardsDevMigrateViewsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardMigrateViewsResponse =
        migrateViews(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see migrateViews */
    fun migrateViews(params: CardsDevMigrateViewsParams): CardMigrateViewsResponse =
        migrateViews(params, RequestOptions.none())

    /** @see migrateViews */
    fun migrateViews(
        params: CardsDevMigrateViewsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardMigrateViewsResponse

    /** A view of [CardsDevService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardsDevService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/extensions/cards-dev/2026-03/{appId}`, but is
         * otherwise the same as [CardsDevService.create].
         */
        @MustBeClosed
        fun create(appId: Int, params: CardsDevCreateParams): HttpResponseFor<PublicCardResponse> =
            create(appId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            appId: Int,
            params: CardsDevCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse> =
            create(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CardsDevCreateParams): HttpResponseFor<PublicCardResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardsDevCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /crm/extensions/cards-dev/2026-03/{appId}/{cardId}`, but is otherwise the same as
         * [CardsDevService.update].
         */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardsDevUpdateParams,
        ): HttpResponseFor<PublicCardResponse> = update(cardId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardsDevUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CardsDevUpdateParams): HttpResponseFor<PublicCardResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CardsDevUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/extensions/cards-dev/2026-03/{appId}/{cardId}`, but is otherwise the same as
         * [CardsDevService.delete].
         */
        @MustBeClosed
        fun delete(cardId: String, params: CardsDevDeleteParams): HttpResponse =
            delete(cardId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            cardId: String,
            params: CardsDevDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: CardsDevDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CardsDevDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /crm/extensions/cards-dev/2026-03/{appId}`, but is
         * otherwise the same as [CardsDevService.get].
         */
        @MustBeClosed
        fun get(appId: Int): HttpResponseFor<PublicCardListResponse> =
            get(appId, CardsDevGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: CardsDevGetParams = CardsDevGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardListResponse> =
            get(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            params: CardsDevGetParams = CardsDevGetParams.none(),
        ): HttpResponseFor<PublicCardListResponse> = get(appId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CardsDevGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardListResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: CardsDevGetParams): HttpResponseFor<PublicCardListResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCardListResponse> =
            get(appId, CardsDevGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/extensions/cards-dev/2026-03/{appId}/{cardId}`,
         * but is otherwise the same as [CardsDevService.getById].
         */
        @MustBeClosed
        fun getById(
            cardId: String,
            params: CardsDevGetByIdParams,
        ): HttpResponseFor<PublicCardResponse> = getById(cardId, params, RequestOptions.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            cardId: String,
            params: CardsDevGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse> =
            getById(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see getById */
        @MustBeClosed
        fun getById(params: CardsDevGetByIdParams): HttpResponseFor<PublicCardResponse> =
            getById(params, RequestOptions.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            params: CardsDevGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicCardResponse>

        /**
         * Returns a raw HTTP response for `get /crm/extensions/cards-dev/2026-03/sample-response`,
         * but is otherwise the same as [CardsDevService.getSampleResponse].
         */
        @MustBeClosed
        fun getSampleResponse(): HttpResponseFor<IntegratorCardPayloadResponse> =
            getSampleResponse(CardsDevGetSampleResponseParams.none())

        /** @see getSampleResponse */
        @MustBeClosed
        fun getSampleResponse(
            params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegratorCardPayloadResponse>

        /** @see getSampleResponse */
        @MustBeClosed
        fun getSampleResponse(
            params: CardsDevGetSampleResponseParams = CardsDevGetSampleResponseParams.none()
        ): HttpResponseFor<IntegratorCardPayloadResponse> =
            getSampleResponse(params, RequestOptions.none())

        /** @see getSampleResponse */
        @MustBeClosed
        fun getSampleResponse(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntegratorCardPayloadResponse> =
            getSampleResponse(CardsDevGetSampleResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /crm/extensions/cards-dev/2026-03/{appId}/views/migrate`, but is otherwise the same as
         * [CardsDevService.migrateViews].
         */
        @MustBeClosed
        fun migrateViews(
            appId: Int,
            params: CardsDevMigrateViewsParams,
        ): HttpResponseFor<CardMigrateViewsResponse> =
            migrateViews(appId, params, RequestOptions.none())

        /** @see migrateViews */
        @MustBeClosed
        fun migrateViews(
            appId: Int,
            params: CardsDevMigrateViewsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardMigrateViewsResponse> =
            migrateViews(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see migrateViews */
        @MustBeClosed
        fun migrateViews(
            params: CardsDevMigrateViewsParams
        ): HttpResponseFor<CardMigrateViewsResponse> = migrateViews(params, RequestOptions.none())

        /** @see migrateViews */
        @MustBeClosed
        fun migrateViews(
            params: CardsDevMigrateViewsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardMigrateViewsResponse>
    }
}
