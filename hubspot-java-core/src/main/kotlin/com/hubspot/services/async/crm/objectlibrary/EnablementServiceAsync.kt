// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objectlibrary

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.crm.objectlibrary.enablement.EnablementGetAllParams
import com.hubspot.models.crm.objectlibrary.enablement.EnablementGetByObjectTypeIdParams
import com.hubspot.models.crm.objectlibrary.enablement.ObjectTypeEnablementPublicResponse
import com.hubspot.models.crm.objectlibrary.enablement.PortalObjectTypeEnablementPublicResponse
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

    fun getAll(): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        getAll(EnablementGetAllParams.none())

    /** @see getAll */
    fun getAll(
        params: EnablementGetAllParams = EnablementGetAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse>

    /** @see getAll */
    fun getAll(
        params: EnablementGetAllParams = EnablementGetAllParams.none()
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        getAll(params, RequestOptions.none())

    /** @see getAll */
    fun getAll(
        requestOptions: RequestOptions
    ): CompletableFuture<PortalObjectTypeEnablementPublicResponse> =
        getAll(EnablementGetAllParams.none(), requestOptions)

    fun getByObjectTypeId(
        objectTypeId: String
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        getByObjectTypeId(objectTypeId, EnablementGetByObjectTypeIdParams.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        getByObjectTypeId(objectTypeId, params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: EnablementGetByObjectTypeIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectTypeEnablementPublicResponse>

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: EnablementGetByObjectTypeIdParams
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        getByObjectTypeId(params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectTypeEnablementPublicResponse> =
        getByObjectTypeId(objectTypeId, EnablementGetByObjectTypeIdParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /crm/object-library/2026-03/enablement`, but is
         * otherwise the same as [EnablementServiceAsync.getAll].
         */
        fun getAll(): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> =
            getAll(EnablementGetAllParams.none())

        /** @see getAll */
        fun getAll(
            params: EnablementGetAllParams = EnablementGetAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>>

        /** @see getAll */
        fun getAll(
            params: EnablementGetAllParams = EnablementGetAllParams.none()
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> =
            getAll(params, RequestOptions.none())

        /** @see getAll */
        fun getAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortalObjectTypeEnablementPublicResponse>> =
            getAll(EnablementGetAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/object-library/2026-03/enablement/{objectTypeId}`, but is otherwise the same as
         * [EnablementServiceAsync.getByObjectTypeId].
         */
        fun getByObjectTypeId(
            objectTypeId: String
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            getByObjectTypeId(objectTypeId, EnablementGetByObjectTypeIdParams.none())

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            objectTypeId: String,
            params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            objectTypeId: String,
            params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            getByObjectTypeId(objectTypeId, params, RequestOptions.none())

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            params: EnablementGetByObjectTypeIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>>

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            params: EnablementGetByObjectTypeIdParams
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            getByObjectTypeId(params, RequestOptions.none())

        /** @see getByObjectTypeId */
        fun getByObjectTypeId(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectTypeEnablementPublicResponse>> =
            getByObjectTypeId(
                objectTypeId,
                EnablementGetByObjectTypeIdParams.none(),
                requestOptions,
            )
    }
}
