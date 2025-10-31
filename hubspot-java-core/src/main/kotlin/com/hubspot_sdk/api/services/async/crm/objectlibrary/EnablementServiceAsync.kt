// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objectlibrary

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EnablementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnablementServiceAsync

    /** Returns all objects in the object library and their enablement status */
    fun list(): CompletableFuture<EnablementListResponse> = list(EnablementListParams.none())

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnablementListResponse>

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none()
    ): CompletableFuture<EnablementListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EnablementListResponse> =
        list(EnablementListParams.none(), requestOptions)

    /** Returns an object and its enablement status */
    fun get(objectTypeId: String): CompletableFuture<EnablementGetResponse> =
        get(objectTypeId, EnablementGetParams.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnablementGetResponse> =
        get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
    ): CompletableFuture<EnablementGetResponse> = get(objectTypeId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EnablementGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnablementGetResponse>

    /** @see get */
    fun get(params: EnablementGetParams): CompletableFuture<EnablementGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnablementGetResponse> =
        get(objectTypeId, EnablementGetParams.none(), requestOptions)

    /**
     * A view of [EnablementServiceAsync] that provides access to raw HTTP responses for each
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
        ): EnablementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/v3/object-library/enablement`, but is otherwise
         * the same as [EnablementServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EnablementListResponse>> =
            list(EnablementListParams.none())

        /** @see list */
        fun list(
            params: EnablementListParams = EnablementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnablementListResponse>>

        /** @see list */
        fun list(
            params: EnablementListParams = EnablementListParams.none()
        ): CompletableFuture<HttpResponseFor<EnablementListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EnablementListResponse>> =
            list(EnablementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/object-library/enablement/{objectTypeId}`,
         * but is otherwise the same as [EnablementServiceAsync.get].
         */
        fun get(objectTypeId: String): CompletableFuture<HttpResponseFor<EnablementGetResponse>> =
            get(objectTypeId, EnablementGetParams.none())

        /** @see get */
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnablementGetResponse>> =
            get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see get */
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
        ): CompletableFuture<HttpResponseFor<EnablementGetResponse>> =
            get(objectTypeId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: EnablementGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnablementGetResponse>>

        /** @see get */
        fun get(
            params: EnablementGetParams
        ): CompletableFuture<HttpResponseFor<EnablementGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnablementGetResponse>> =
            get(objectTypeId, EnablementGetParams.none(), requestOptions)
    }
}
