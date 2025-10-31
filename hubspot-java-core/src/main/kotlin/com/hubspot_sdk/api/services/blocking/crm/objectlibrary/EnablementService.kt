// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectlibrary

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objectlibrary.ObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.PortalObjectTypeEnablementPublicResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListParams
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

    fun list(): PortalObjectTypeEnablementPublicResponse = list(EnablementListParams.none())

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalObjectTypeEnablementPublicResponse

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none()
    ): PortalObjectTypeEnablementPublicResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PortalObjectTypeEnablementPublicResponse =
        list(EnablementListParams.none(), requestOptions)

    fun get(objectTypeId: String): ObjectTypeEnablementPublicResponse =
        get(objectTypeId, EnablementGetParams.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeEnablementPublicResponse =
        get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
    ): ObjectTypeEnablementPublicResponse = get(objectTypeId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EnablementGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectTypeEnablementPublicResponse

    /** @see get */
    fun get(params: EnablementGetParams): ObjectTypeEnablementPublicResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        requestOptions: RequestOptions,
    ): ObjectTypeEnablementPublicResponse =
        get(objectTypeId, EnablementGetParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /crm/v3/object-library/enablement`, but is otherwise
         * the same as [EnablementService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> =
            list(EnablementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnablementListParams = EnablementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnablementListParams = EnablementListParams.none()
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PortalObjectTypeEnablementPublicResponse> =
            list(EnablementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/object-library/enablement/{objectTypeId}`,
         * but is otherwise the same as [EnablementService.get].
         */
        @MustBeClosed
        fun get(objectTypeId: String): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            get(objectTypeId, EnablementGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            get(objectTypeId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EnablementGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: EnablementGetParams): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectTypeEnablementPublicResponse> =
            get(objectTypeId, EnablementGetParams.none(), requestOptions)
    }
}
