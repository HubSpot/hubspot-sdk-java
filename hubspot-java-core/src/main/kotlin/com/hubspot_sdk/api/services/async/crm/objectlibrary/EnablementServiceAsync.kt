// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objectlibrary

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objectlibrary.ObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.PortalObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListParams
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

    /** For all object types supporting enablement, returns whether they're enabled or disabled */
    fun list(): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        list(EnablementListParams.none())

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse>

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none()
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        list(EnablementListParams.none(), requestOptions)

    /** Fetch whether object type is enabled */
    fun get(objectTypeId: String): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        get(objectTypeId, EnablementGetParams.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        get(objectTypeId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EnablementGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeEnablementPublicResponse>

    /** @see get */
    fun get(params: EnablementGetParams): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
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
        fun list(): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> =
            list(EnablementListParams.none())

        /** @see list */
        fun list(
            params: EnablementListParams = EnablementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>>

        /** @see list */
        fun list(
            params: EnablementListParams = EnablementListParams.none()
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> =
            list(EnablementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/object-library/enablement/{objectTypeId}`,
         * but is otherwise the same as [EnablementServiceAsync.get].
         */
        fun get(
            objectTypeId: String
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            get(objectTypeId, EnablementGetParams.none())

        /** @see get */
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see get */
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            get(objectTypeId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: EnablementGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>>

        /** @see get */
        fun get(
            params: EnablementGetParams
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            get(objectTypeId, EnablementGetParams.none(), requestOptions)
    }
}
