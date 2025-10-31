// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.account.PortalInformationResponse
import com.hubspot_sdk.api.models.account.details.DetailGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailServiceAsync

    /**
     * Retrieve account details such as the account type, time zone, currencies, and data hosting
     * location.
     */
    fun get(): CompletableFuture<PortalInformationResponse> = get(DetailGetParams.none())

    /** @see get */
    fun get(
        params: DetailGetParams = DetailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalInformationResponse>

    /** @see get */
    fun get(
        params: DetailGetParams = DetailGetParams.none()
    ): CompletableFuture<PortalInformationResponse> = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<PortalInformationResponse> =
        get(DetailGetParams.none(), requestOptions)

    /**
     * A view of [DetailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account-info/v3/details`, but is otherwise the same
         * as [DetailServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponseFor<PortalInformationResponse>> =
            get(DetailGetParams.none())

        /** @see get */
        fun get(
            params: DetailGetParams = DetailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>>

        /** @see get */
        fun get(
            params: DetailGetParams = DetailGetParams.none()
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>> =
            get(DetailGetParams.none(), requestOptions)
    }
}
