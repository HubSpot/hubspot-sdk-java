// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.businessunits

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import com.hubspot_sdk.api.models.businessunits.businessunits.BusinessUnitGetByUserIdParams
import java.util.function.Consumer

interface BusinessUnitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitService

    fun getByUserId(userId: String): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(userId, BusinessUnitGetByUserIdParams.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
    ): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(userId, params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicBusinessUnitNoPaging

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams
    ): CollectionResponsePublicBusinessUnitNoPaging = getByUserId(params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(userId, BusinessUnitGetByUserIdParams.none(), requestOptions)

    /**
     * A view of [BusinessUnitService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /business-units/public/2026-03/business-units/user/{userId}`, but is otherwise the same
         * as [BusinessUnitService.getByUserId].
         */
        @MustBeClosed
        fun getByUserId(
            userId: String
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(userId, params, RequestOptions.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(params, RequestOptions.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none(), requestOptions)
    }
}
