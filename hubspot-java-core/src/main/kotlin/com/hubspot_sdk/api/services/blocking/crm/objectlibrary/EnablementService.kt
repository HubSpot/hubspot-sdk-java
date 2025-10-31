// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objectlibrary

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementGetResponse
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListParams
import com.hubspot_sdk.api.models.crm.objectlibrary.enablement.EnablementListResponse
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

    /** Returns all objects in the object library and their enablement status */
    fun list(): EnablementListResponse = list(EnablementListParams.none())

    /** @see list */
    fun list(
        params: EnablementListParams = EnablementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnablementListResponse

    /** @see list */
    fun list(params: EnablementListParams = EnablementListParams.none()): EnablementListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EnablementListResponse =
        list(EnablementListParams.none(), requestOptions)

    /** Returns an object and its enablement status */
    fun get(objectTypeId: String): EnablementGetResponse =
        get(objectTypeId, EnablementGetParams.none())

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnablementGetResponse =
        get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

    /** @see get */
    fun get(
        objectTypeId: String,
        params: EnablementGetParams = EnablementGetParams.none(),
    ): EnablementGetResponse = get(objectTypeId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EnablementGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnablementGetResponse

    /** @see get */
    fun get(params: EnablementGetParams): EnablementGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectTypeId: String, requestOptions: RequestOptions): EnablementGetResponse =
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
        fun list(): HttpResponseFor<EnablementListResponse> = list(EnablementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnablementListParams = EnablementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnablementListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnablementListParams = EnablementListParams.none()
        ): HttpResponseFor<EnablementListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EnablementListResponse> =
            list(EnablementListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/v3/object-library/enablement/{objectTypeId}`,
         * but is otherwise the same as [EnablementService.get].
         */
        @MustBeClosed
        fun get(objectTypeId: String): HttpResponseFor<EnablementGetResponse> =
            get(objectTypeId, EnablementGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnablementGetResponse> =
            get(params.toBuilder().objectTypeId(objectTypeId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectTypeId: String,
            params: EnablementGetParams = EnablementGetParams.none(),
        ): HttpResponseFor<EnablementGetResponse> = get(objectTypeId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EnablementGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnablementGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: EnablementGetParams): HttpResponseFor<EnablementGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectTypeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnablementGetResponse> =
            get(objectTypeId, EnablementGetParams.none(), requestOptions)
    }
}
