// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.marketingevents

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByEmailParams
import com.hubspot_sdk.api.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriberStateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriberStateServiceAsync

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * contact email addresses. Note that the contact must already exist in HubSpot; a contact will
     * not be created. The contactProperties field is used only when creating a new contact. These
     * properties will not update existing contacts.
     */
    fun recordByEmail(
        subscriberState: String,
        params: SubscriberStateRecordByEmailParams,
    ): CompletableFuture<HttpResponse> =
        recordByEmail(subscriberState, params, RequestOptions.none())

    /** @see recordByEmail */
    fun recordByEmail(
        subscriberState: String,
        params: SubscriberStateRecordByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        recordByEmail(params.toBuilder().subscriberState(subscriberState).build(), requestOptions)

    /** @see recordByEmail */
    fun recordByEmail(params: SubscriberStateRecordByEmailParams): CompletableFuture<HttpResponse> =
        recordByEmail(params, RequestOptions.none())

    /** @see recordByEmail */
    fun recordByEmail(
        params: SubscriberStateRecordByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * HubSpot contact IDs. Note that the contact must already exist in HubSpot; a contact will not
     * be created.
     */
    fun recordById(
        subscriberState: String,
        params: SubscriberStateRecordByIdParams,
    ): CompletableFuture<HttpResponse> = recordById(subscriberState, params, RequestOptions.none())

    /** @see recordById */
    fun recordById(
        subscriberState: String,
        params: SubscriberStateRecordByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        recordById(params.toBuilder().subscriberState(subscriberState).build(), requestOptions)

    /** @see recordById */
    fun recordById(params: SubscriberStateRecordByIdParams): CompletableFuture<HttpResponse> =
        recordById(params, RequestOptions.none())

    /** @see recordById */
    fun recordById(
        params: SubscriberStateRecordByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * A view of [SubscriberStateServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriberStateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/email-upsert`,
         * but is otherwise the same as [SubscriberStateServiceAsync.recordByEmail].
         */
        fun recordByEmail(
            subscriberState: String,
            params: SubscriberStateRecordByEmailParams,
        ): CompletableFuture<HttpResponse> =
            recordByEmail(subscriberState, params, RequestOptions.none())

        /** @see recordByEmail */
        fun recordByEmail(
            subscriberState: String,
            params: SubscriberStateRecordByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            recordByEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see recordByEmail */
        fun recordByEmail(
            params: SubscriberStateRecordByEmailParams
        ): CompletableFuture<HttpResponse> = recordByEmail(params, RequestOptions.none())

        /** @see recordByEmail */
        fun recordByEmail(
            params: SubscriberStateRecordByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/upsert`,
         * but is otherwise the same as [SubscriberStateServiceAsync.recordById].
         */
        fun recordById(
            subscriberState: String,
            params: SubscriberStateRecordByIdParams,
        ): CompletableFuture<HttpResponse> =
            recordById(subscriberState, params, RequestOptions.none())

        /** @see recordById */
        fun recordById(
            subscriberState: String,
            params: SubscriberStateRecordByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            recordById(params.toBuilder().subscriberState(subscriberState).build(), requestOptions)

        /** @see recordById */
        fun recordById(params: SubscriberStateRecordByIdParams): CompletableFuture<HttpResponse> =
            recordById(params, RequestOptions.none())

        /** @see recordById */
        fun recordById(
            params: SubscriberStateRecordByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
