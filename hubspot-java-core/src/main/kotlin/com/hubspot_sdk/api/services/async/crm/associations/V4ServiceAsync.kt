// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.associations.v4.V4MergeParams
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V4ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync

    fun batch(): BatchServiceAsync

    fun report(): ReportServiceAsync

    /** Merge two CRM objects of the specified type into one. */
    fun merge(objectType: String, params: V4MergeParams): CompletableFuture<SimplePublicObject> =
        merge(objectType, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        objectType: String,
        params: V4MergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject> =
        merge(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see merge */
    fun merge(params: V4MergeParams): CompletableFuture<SimplePublicObject> =
        merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: V4MergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimplePublicObject>

    /** A view of [V4ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun report(): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v4/objects/{objectType}/merge`, but is
         * otherwise the same as [V4ServiceAsync.merge].
         */
        fun merge(
            objectType: String,
            params: V4MergeParams,
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(objectType, params, RequestOptions.none())

        /** @see merge */
        fun merge(
            objectType: String,
            params: V4MergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see merge */
        fun merge(params: V4MergeParams): CompletableFuture<HttpResponseFor<SimplePublicObject>> =
            merge(params, RequestOptions.none())

        /** @see merge */
        fun merge(
            params: V4MergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimplePublicObject>>
    }
}
