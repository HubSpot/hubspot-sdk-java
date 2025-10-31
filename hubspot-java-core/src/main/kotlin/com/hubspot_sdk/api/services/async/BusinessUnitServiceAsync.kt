// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.businessunits.BusinessUnitGetByUserIdParams
import com.hubspot_sdk.api.models.businessunits.BusinessUnitGetByUserIdResponse
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
    fun getByUserId(userId: String): CompletableFuture<BusinessUnitGetByUserIdResponse> =
        getByUserId(userId, BusinessUnitGetByUserIdParams.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessUnitGetByUserIdResponse> =
        getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
    ): CompletableFuture<BusinessUnitGetByUserIdResponse> =
        getByUserId(userId, params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessUnitGetByUserIdResponse>

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams
    ): CompletableFuture<BusinessUnitGetByUserIdResponse> =
        getByUserId(params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BusinessUnitGetByUserIdResponse> =
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
        ): CompletableFuture<HttpResponseFor<BusinessUnitGetByUserIdResponse>> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none())

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessUnitGetByUserIdResponse>> =
            getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        ): CompletableFuture<HttpResponseFor<BusinessUnitGetByUserIdResponse>> =
            getByUserId(userId, params, RequestOptions.none())

        /** @see getByUserId */
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessUnitGetByUserIdResponse>>

        /** @see getByUserId */
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams
        ): CompletableFuture<HttpResponseFor<BusinessUnitGetByUserIdResponse>> =
            getByUserId(params, RequestOptions.none())

        /** @see getByUserId */
        fun getByUserId(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusinessUnitGetByUserIdResponse>> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none(), requestOptions)
    }
}
