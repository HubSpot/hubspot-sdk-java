// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.businessunits

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import com.hubspot.sdk.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
import java.util.function.Consumer

interface BusinessUnitEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitEntryService

    /** Retrieve the brands that a specific user can access. */
    fun getByUserId(userId: String): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
    ): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(userId, params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitEntryGetByUserIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicBusinessUnitNoPaging

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitEntryGetByUserIdParams
    ): CollectionResponsePublicBusinessUnitNoPaging = getByUserId(params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicBusinessUnitNoPaging =
        getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none(), requestOptions)

    /**
     * A view of [BusinessUnitEntryService] that provides access to raw HTTP responses for each
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
        ): BusinessUnitEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /business-units/public/2026-03/business-units/user/{userId}`, but is otherwise the same
         * as [BusinessUnitEntryService.getByUserId].
         */
        @MustBeClosed
        fun getByUserId(
            userId: String
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(userId, params, RequestOptions.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            params: BusinessUnitEntryGetByUserIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            params: BusinessUnitEntryGetByUserIdParams
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(params, RequestOptions.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging> =
            getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none(), requestOptions)
    }
}
