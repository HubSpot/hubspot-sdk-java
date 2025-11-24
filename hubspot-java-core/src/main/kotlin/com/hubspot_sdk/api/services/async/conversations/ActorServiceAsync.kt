// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.conversations.BatchResponsePublicActor
import com.hubspot_sdk.api.models.conversations.PublicActor
import com.hubspot_sdk.api.models.conversations.actors.ActorBatchReadParams
import com.hubspot_sdk.api.models.conversations.actors.ActorGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActorServiceAsync

    fun batchRead(params: ActorBatchReadParams): CompletableFuture<BatchResponsePublicActor> =
        batchRead(params, RequestOptions.none())

    /** @see batchRead */
    fun batchRead(
        params: ActorBatchReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicActor>

    /** @see batchRead */
    fun batchRead(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicActor> =
        batchRead(
            ActorBatchReadParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see batchRead */
    fun batchRead(batchInputString: BatchInputString): CompletableFuture<BatchResponsePublicActor> =
        batchRead(batchInputString, RequestOptions.none())

    fun get(actorId: String): CompletableFuture<PublicActor> = get(actorId, ActorGetParams.none())

    /** @see get */
    fun get(
        actorId: String,
        params: ActorGetParams = ActorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActor> =
        get(params.toBuilder().actorId(actorId).build(), requestOptions)

    /** @see get */
    fun get(
        actorId: String,
        params: ActorGetParams = ActorGetParams.none(),
    ): CompletableFuture<PublicActor> = get(actorId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ActorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicActor>

    /** @see get */
    fun get(params: ActorGetParams): CompletableFuture<PublicActor> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(actorId: String, requestOptions: RequestOptions): CompletableFuture<PublicActor> =
        get(actorId, ActorGetParams.none(), requestOptions)

    /** A view of [ActorServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conversations/v3/conversations/actors/batch/read`,
         * but is otherwise the same as [ActorServiceAsync.batchRead].
         */
        fun batchRead(
            params: ActorBatchReadParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicActor>> =
            batchRead(params, RequestOptions.none())

        /** @see batchRead */
        fun batchRead(
            params: ActorBatchReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicActor>>

        /** @see batchRead */
        fun batchRead(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicActor>> =
            batchRead(
                ActorBatchReadParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see batchRead */
        fun batchRead(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicActor>> =
            batchRead(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /conversations/v3/conversations/actors/{actorId}`,
         * but is otherwise the same as [ActorServiceAsync.get].
         */
        fun get(actorId: String): CompletableFuture<HttpResponseFor<PublicActor>> =
            get(actorId, ActorGetParams.none())

        /** @see get */
        fun get(
            actorId: String,
            params: ActorGetParams = ActorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActor>> =
            get(params.toBuilder().actorId(actorId).build(), requestOptions)

        /** @see get */
        fun get(
            actorId: String,
            params: ActorGetParams = ActorGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicActor>> =
            get(actorId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ActorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicActor>>

        /** @see get */
        fun get(params: ActorGetParams): CompletableFuture<HttpResponseFor<PublicActor>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            actorId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicActor>> =
            get(actorId, ActorGetParams.none(), requestOptions)
    }
}
