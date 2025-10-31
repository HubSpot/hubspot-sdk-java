// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.conversations.BatchResponsePublicActor
import com.hubspot_sdk.api.models.conversations.PublicActor
import com.hubspot_sdk.api.models.conversations.actors.ActorBatchReadParams
import com.hubspot_sdk.api.models.conversations.actors.ActorGetParams
import java.util.function.Consumer

interface ActorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActorService

    /** Resolve a set of `ActorId`s to the underlying actors/participants. */
    fun batchRead(params: ActorBatchReadParams): BatchResponsePublicActor =
        batchRead(params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        params: ActorBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicActor

    /** @see batchRead */
    fun batchRead(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicActor =
        batchRead(
            ActorBatchReadParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see batchRead */
    fun batchRead(batchInputString: BatchInputString): BatchResponsePublicActor =
        batchRead(batchInputString, RequestOptions.none())

    /** Retrieve details of a single actor using the actor ID. */
    fun get(actorId: String): PublicActor = get(actorId, ActorGetParams.none())

    /** @see get */
    fun get(
        actorId: String,
        params: ActorGetParams = ActorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActor = get(params.toBuilder().actorId(actorId).build(), requestOptions)

    /** @see get */
    fun get(actorId: String, params: ActorGetParams = ActorGetParams.none()): PublicActor =
        get(actorId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ActorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicActor

    /** @see get */
    fun get(params: ActorGetParams): PublicActor = get(params, RequestOptions.none())

    /** @see get */
    fun get(actorId: String, requestOptions: RequestOptions): PublicActor =
        get(actorId, ActorGetParams.none(), requestOptions)

    /** A view of [ActorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conversations/v3/conversations/actors/batch/read`,
         * but is otherwise the same as [ActorService.batchRead].
         */
        @MustBeClosed
        fun batchRead(params: ActorBatchReadParams): HttpResponseFor<BatchResponsePublicActor> =
            batchRead(params, RequestOptions.none())

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            params: ActorBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicActor>

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicActor> =
            batchRead(
                ActorBatchReadParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see batchRead */
        @MustBeClosed
        fun batchRead(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponsePublicActor> =
            batchRead(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/actors/{actorId}`,
         * but is otherwise the same as [ActorService.get].
         */
        @MustBeClosed
        fun get(actorId: String): HttpResponseFor<PublicActor> = get(actorId, ActorGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            actorId: String,
            params: ActorGetParams = ActorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActor> =
            get(params.toBuilder().actorId(actorId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            actorId: String,
            params: ActorGetParams = ActorGetParams.none(),
        ): HttpResponseFor<PublicActor> = get(actorId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ActorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicActor>

        /** @see get */
        @MustBeClosed
        fun get(params: ActorGetParams): HttpResponseFor<PublicActor> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(actorId: String, requestOptions: RequestOptions): HttpResponseFor<PublicActor> =
            get(actorId, ActorGetParams.none(), requestOptions)
    }
}
