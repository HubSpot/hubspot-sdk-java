// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.PortalInformationResponse
import com.hubspot_sdk.api.models.account.details.DetailGetParams
import java.util.function.Consumer

interface DetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailService

    /**
     * Retrieve account details such as the account type, time zone, currencies, and data hosting
     * location.
     */
    fun get(): PortalInformationResponse = get(DetailGetParams.none())

    /** @see get */
    fun get(
        params: DetailGetParams = DetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalInformationResponse

    /** @see get */
    fun get(params: DetailGetParams = DetailGetParams.none()): PortalInformationResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): PortalInformationResponse =
        get(DetailGetParams.none(), requestOptions)

    /** A view of [DetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/v3/details`, but is otherwise the same
         * as [DetailService.get].
         */
        @MustBeClosed
        fun get(): HttpResponseFor<PortalInformationResponse> = get(DetailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: DetailGetParams = DetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalInformationResponse>

        /** @see get */
        @MustBeClosed
        fun get(
            params: DetailGetParams = DetailGetParams.none()
        ): HttpResponseFor<PortalInformationResponse> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponseFor<PortalInformationResponse> =
            get(DetailGetParams.none(), requestOptions)
    }
}
