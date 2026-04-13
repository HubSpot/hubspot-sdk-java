// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm.objectschemas

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.objectschemas.CollectionResponseObjectSchemaNoPaging
import com.hubspot.sdk.models.crm.objectschemas.ObjectSchemaBatchReadRequest
import com.hubspot.sdk.models.crm.objectschemas.batch.BatchGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /**
     * Retrieve details of multiple custom object schemas by providing a batch request with
     * specified inputs. This operation allows you to fetch schema information, including properties
     * and associations, for multiple custom objects in a single API call.
     */
    fun get(params: BatchGetParams): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging>

    /** @see get */
    fun get(
        objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        get(
            BatchGetParams.builder()
                .objectSchemaBatchReadRequest(objectSchemaBatchReadRequest)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        get(objectSchemaBatchReadRequest, RequestOptions.none())

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm-object-schemas/2026-03/schemas/batch/read`,
         * but is otherwise the same as [BatchServiceAsync.get].
         */
        fun get(
            params: BatchGetParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>>

        /** @see get */
        fun get(
            objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            get(
                BatchGetParams.builder()
                    .objectSchemaBatchReadRequest(objectSchemaBatchReadRequest)
                    .build(),
                requestOptions,
            )

        /** @see get */
        fun get(
            objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> =
            get(objectSchemaBatchReadRequest, RequestOptions.none())
    }
}
