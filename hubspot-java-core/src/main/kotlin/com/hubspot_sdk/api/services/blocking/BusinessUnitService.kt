// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.businessunits.BusinessUnitGetByUserIdParams
import com.hubspot_sdk.api.models.businessunits.BusinessUnitGetByUserIdResponse
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

    /** Get Business Units identified by `userId`. The `userId` refers to the user’s ID. */
    fun getByUserId(userId: String): BusinessUnitGetByUserIdResponse =
        getByUserId(userId, BusinessUnitGetByUserIdParams.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessUnitGetByUserIdResponse =
        getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
    ): BusinessUnitGetByUserIdResponse = getByUserId(userId, params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        params: BusinessUnitGetByUserIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessUnitGetByUserIdResponse

    /** @see getByUserId */
    fun getByUserId(params: BusinessUnitGetByUserIdParams): BusinessUnitGetByUserIdResponse =
        getByUserId(params, RequestOptions.none())

    /** @see getByUserId */
    fun getByUserId(
        userId: String,
        requestOptions: RequestOptions,
    ): BusinessUnitGetByUserIdResponse =
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
         * Returns a raw HTTP response for `get /business-units/v3/business-units/user/{userId}`,
         * but is otherwise the same as [BusinessUnitService.getByUserId].
         */
        @MustBeClosed
        fun getByUserId(userId: String): HttpResponseFor<BusinessUnitGetByUserIdResponse> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessUnitGetByUserIdResponse> =
            getByUserId(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            params: BusinessUnitGetByUserIdParams = BusinessUnitGetByUserIdParams.none(),
        ): HttpResponseFor<BusinessUnitGetByUserIdResponse> =
            getByUserId(userId, params, RequestOptions.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessUnitGetByUserIdResponse>

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            params: BusinessUnitGetByUserIdParams
        ): HttpResponseFor<BusinessUnitGetByUserIdResponse> =
            getByUserId(params, RequestOptions.none())

        /** @see getByUserId */
        @MustBeClosed
        fun getByUserId(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusinessUnitGetByUserIdResponse> =
            getByUserId(userId, BusinessUnitGetByUserIdParams.none(), requestOptions)
    }
}
