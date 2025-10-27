// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.businessunits.BusinessUnitGetByUserIdParams
import com.hubspot_sdk.api.models.businessunits.CollectionResponsePublicBusinessUnitNoPaging
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BusinessUnitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitServiceAsync

    /** Get Business Units identified by `userId`. The `userId` refers to the user’s ID. */
    fun getByUserId(
        userId: String
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(userId, BusinessUnitGetByUserIdParams.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(userId, params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging>

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicBusinessUnitNoPaging> =
        getByUserId(userId, BusinessUnitGetByUserIdParams.none(), requestOptions)

    /**
     * A view of [BusinessUnitServiceAsync] that provides access to raw HTTP responses for each
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
        ): BusinessUnitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /business-units/v3/business-units/user/{userId}`,
         * but is otherwise the same as [BusinessUnitServiceAsync.getByUserId].
         */
        fun getByUserId(
            userId: String
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none())

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(userId, params, RequestOptions.none())

        /** @see getByUserId */
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>>

        /** @see getByUserId */
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(params, RequestOptions.none())

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicBusinessUnitNoPaging>> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none(), requestOptions)
    }
}
