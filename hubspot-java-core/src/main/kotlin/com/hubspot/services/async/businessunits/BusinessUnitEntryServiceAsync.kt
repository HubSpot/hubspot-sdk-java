// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.businessunits

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import com.hubspot.models.businessunits.businessunitentries.BusinessUnitEntryGetByUserIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BusinessUnitEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitEntryServiceAsync

    /** Retrieve the brands that a specific user can access. */
    fun getByUserId(
        userId: String
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(userId, params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitEntryGetByUserIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging>

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitEntryGetByUserIdParams
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none(), requestOptions)

    /**
     * A view of [BusinessUnitEntryServiceAsync] that provides access to raw HTTP responses for each
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
        ): BusinessUnitEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /business-units/public/2026-03/business-units/user/{userId}`, but is otherwise the same
         * as [BusinessUnitEntryServiceAsync.getByUserId].
         */
        fun getByUserId(
            userId: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none())

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            params: BusinessUnitEntryGetByUserIdParams = BusinessUnitEntryGetByUserIdParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(userId, params, RequestOptions.none())

        /** @see getByUserId */
        fun getByUserId(
            params: BusinessUnitEntryGetByUserIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>>

        /** @see getByUserId */
        fun getByUserId(
            params: BusinessUnitEntryGetByUserIdParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(params, RequestOptions.none())

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(userId, BusinessUnitEntryGetByUserIdParams.none(), requestOptions)
    }
}
