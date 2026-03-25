// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectlibrary

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetAllParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetByObjectTypeIdParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.ObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.PortalObjectTypeEnablementPublicResponse
import java.util.function.Consumer

interface EnablementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnablementService

    fun getAll(): PortalObjectTypeEnablementPublicResponse = getAll(EnablementGetAllParams.none())

    /** @see getAll */
    fun getAll(
        params: EnablementGetAllParams = EnablementGetAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalObjectTypeEnablementPublicResponse

    /** @see getAll */
    fun getAll(
        params: EnablementGetAllParams = EnablementGetAllParams.none()
    ): PortalObjectTypeEnablementPublicResponse = getAll(params, RequestOptions.none())

    /** @see getAll */
    fun getAll(requestOptions: RequestOptions): PortalObjectTypeEnablementPublicResponse =
        getAll(EnablementGetAllParams.none(), requestOptions)

    fun getByObjectTypeId(objectTypeId: String): ObjectTypeEnablementPublicResponse =
        getByObjectTypeId(objectTypeId, EnablementGetByObjectTypeIdParams.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeEnablementPublicResponse =
        getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
    ): ObjectTypeEnablementPublicResponse =
        getByObjectTypeId(objectTypeId, params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: EnablementGetByObjectTypeIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeEnablementPublicResponse

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        params: EnablementGetByObjectTypeIdParams
    ): ObjectTypeEnablementPublicResponse = getByObjectTypeId(params, RequestOptions.none())

    /** @see getByObjectTypeId */
    fun getByObjectTypeId(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): ObjectTypeEnablementPublicResponse =
        getByObjectTypeId(objectTypeId, EnablementGetByObjectTypeIdParams.none(), requestOptions)

    /** A view of [EnablementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnablementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /crm/object-library/2026-03/enablement`, but is
         * otherwise the same as [EnablementService.getAll].
         */
        @MustBeClosed
        fun getAll(): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> =
            getAll(EnablementGetAllParams.none())

        /** @see getAll */
        @MustBeClosed
        fun getAll(
            params: EnablementGetAllParams = EnablementGetAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse>

        /** @see getAll */
        @MustBeClosed
        fun getAll(
            params: EnablementGetAllParams = EnablementGetAllParams.none()
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> =
            getAll(params, RequestOptions.none())

        /** @see getAll */
        @MustBeClosed
        fun getAll(
            requestOptions: RequestOptions
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> =
            getAll(EnablementGetAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/object-library/2026-03/enablement/{objectTypeId}`, but is otherwise the same as
         * [EnablementService.getByObjectTypeId].
         */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            getByObjectTypeId(objectTypeId, EnablementGetByObjectTypeIdParams.none())

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String,
            params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            getByObjectTypeId(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String,
            params: EnablementGetByObjectTypeIdParams = EnablementGetByObjectTypeIdParams.none(),
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            getByObjectTypeId(objectTypeId, params, RequestOptions.none())

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            params: EnablementGetByObjectTypeIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse>

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            params: EnablementGetByObjectTypeIdParams
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            getByObjectTypeId(params, RequestOptions.none())

        /** @see getByObjectTypeId */
        @MustBeClosed
        fun getByObjectTypeId(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            getByObjectTypeId(
                objectTypeId,
                EnablementGetByObjectTypeIdParams.none(),
                requestOptions,
            )
    }
}
