// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.marketingevents

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByEmailParams
import com.hubspot.sdk.models.marketing.marketingevents.subscriberstate.SubscriberStateRecordByIdParams
import java.util.function.Consumer

interface SubscriberStateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriberStateService

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * contact email addresses. Note that the contact must already exist in HubSpot; a contact will
     * not be created. The contactProperties field is used only when creating a new contact. These
     * properties will not update existing contacts.
     */
    @MustBeClosed
    fun recordByEmail(
        subscriberState: String,
        params: SubscriberStateRecordByEmailParams,
    ): HttpResponse = recordByEmail(subscriberState, params, RequestOptions.none())

    /** @see recordByEmail */
    @MustBeClosed
    fun recordByEmail(
        subscriberState: String,
        params: SubscriberStateRecordByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        recordByEmail(params.toBuilder().subscriberState(subscriberState).build(), requestOptions)

    /** @see recordByEmail */
    @MustBeClosed
    fun recordByEmail(params: SubscriberStateRecordByEmailParams): HttpResponse =
        recordByEmail(params, RequestOptions.none())

    /** @see recordByEmail */
    @MustBeClosed
    fun recordByEmail(
        params: SubscriberStateRecordByEmailParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Record a subscriber state between multiple HubSpot contacts and a marketing event, using
     * HubSpot contact IDs. Note that the contact must already exist in HubSpot; a contact will not
     * be created.
     */
    @MustBeClosed
    fun recordById(subscriberState: String, params: SubscriberStateRecordByIdParams): HttpResponse =
        recordById(subscriberState, params, RequestOptions.none())

    /** @see recordById */
    @MustBeClosed
    fun recordById(
        subscriberState: String,
        params: SubscriberStateRecordByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        recordById(params.toBuilder().subscriberState(subscriberState).build(), requestOptions)

    /** @see recordById */
    @MustBeClosed
    fun recordById(params: SubscriberStateRecordByIdParams): HttpResponse =
        recordById(params, RequestOptions.none())

    /** @see recordById */
    @MustBeClosed
    fun recordById(
        params: SubscriberStateRecordByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * A view of [SubscriberStateService] that provides access to raw HTTP responses for each
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
        ): SubscriberStateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/email-upsert`,
         * but is otherwise the same as [SubscriberStateService.recordByEmail].
         */
        @MustBeClosed
        fun recordByEmail(
            subscriberState: String,
            params: SubscriberStateRecordByEmailParams,
        ): HttpResponse = recordByEmail(subscriberState, params, RequestOptions.none())

        /** @see recordByEmail */
        @MustBeClosed
        fun recordByEmail(
            subscriberState: String,
            params: SubscriberStateRecordByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            recordByEmail(
                params.toBuilder().subscriberState(subscriberState).build(),
                requestOptions,
            )

        /** @see recordByEmail */
        @MustBeClosed
        fun recordByEmail(params: SubscriberStateRecordByEmailParams): HttpResponse =
            recordByEmail(params, RequestOptions.none())

        /** @see recordByEmail */
        @MustBeClosed
        fun recordByEmail(
            params: SubscriberStateRecordByEmailParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /marketing/marketing-events/2026-03/events/{externalEventId}/{subscriberState}/upsert`,
         * but is otherwise the same as [SubscriberStateService.recordById].
         */
        @MustBeClosed
        fun recordById(
            subscriberState: String,
            params: SubscriberStateRecordByIdParams,
        ): HttpResponse = recordById(subscriberState, params, RequestOptions.none())

        /** @see recordById */
        @MustBeClosed
        fun recordById(
            subscriberState: String,
            params: SubscriberStateRecordByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            recordById(params.toBuilder().subscriberState(subscriberState).build(), requestOptions)

        /** @see recordById */
        @MustBeClosed
        fun recordById(params: SubscriberStateRecordByIdParams): HttpResponse =
            recordById(params, RequestOptions.none())

        /** @see recordById */
        @MustBeClosed
        fun recordById(
            params: SubscriberStateRecordByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
