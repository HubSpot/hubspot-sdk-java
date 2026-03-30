// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectschemas

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objectschemas.CollectionResponseObjectSchemaNoPaging
import com.hubspot_sdk.api.models.crm.objectschemas.ObjectSchemaBatchReadRequest
import com.hubspot_sdk.api.models.crm.objectschemas.batch.BatchGetParams
import java.util.function.Consumer

interface BatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService

    /**
     * Retrieve details of multiple custom object schemas by providing a batch request with
     * specified inputs. This operation allows you to fetch schema information, including properties
     * and associations, for multiple custom objects in a single API call.
     */
    fun get(params: BatchGetParams): CollectionResponseObjectSchemaNoPaging =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging

    /** @see get */
    fun get(
        objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseObjectSchemaNoPaging =
        get(
            BatchGetParams.builder()
                .objectSchemaBatchReadRequest(objectSchemaBatchReadRequest)
                .build(),
            requestOptions,
        )

    /** @see get */
    fun get(
        objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest
    ): CollectionResponseObjectSchemaNoPaging =
        get(objectSchemaBatchReadRequest, RequestOptions.none())

    /** A view of [BatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm-object-schemas/2026-03/schemas/batch/read`,
         * but is otherwise the same as [BatchService.get].
         */
        @MustBeClosed
        fun get(params: BatchGetParams): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging>

        /** @see get */
        @MustBeClosed
        fun get(
            objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            get(
                BatchGetParams.builder()
                    .objectSchemaBatchReadRequest(objectSchemaBatchReadRequest)
                    .build(),
                requestOptions,
            )

        /** @see get */
        @MustBeClosed
        fun get(
            objectSchemaBatchReadRequest: ObjectSchemaBatchReadRequest
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> =
            get(objectSchemaBatchReadRequest, RequestOptions.none())
    }
}
