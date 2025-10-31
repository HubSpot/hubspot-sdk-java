// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetResponse
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TaxRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxRateServiceAsync

    /** Retrieve a paginated list of all tax rates set up in the account tax rate library */
    fun list(): CompletableFuture<TaxRateListResponse> = list(TaxRateListParams.none())

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaxRateListResponse>

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none()
    ): CompletableFuture<TaxRateListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TaxRateListResponse> =
        list(TaxRateListParams.none(), requestOptions)

    /** Retrieve a specific tax rate by its `taxRateGroupId`. */
    fun get(taxRateGroupId: String): CompletableFuture<TaxRateGetResponse> =
        get(taxRateGroupId, TaxRateGetParams.none())

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaxRateGetResponse> =
        get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
    ): CompletableFuture<TaxRateGetResponse> = get(taxRateGroupId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaxRateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaxRateGetResponse>

    /** @see get */
    fun get(params: TaxRateGetParams): CompletableFuture<TaxRateGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        taxRateGroupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TaxRateGetResponse> =
        get(taxRateGroupId, TaxRateGetParams.none(), requestOptions)

    /**
     * A view of [TaxRateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TaxRateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tax-rates/v1/tax-rates`, but is otherwise the same
         * as [TaxRateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TaxRateListResponse>> =
            list(TaxRateListParams.none())

        /** @see list */
        fun list(
            params: TaxRateListParams = TaxRateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaxRateListResponse>>

        /** @see list */
        fun list(
            params: TaxRateListParams = TaxRateListParams.none()
        ): CompletableFuture<HttpResponseFor<TaxRateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TaxRateListResponse>> =
            list(TaxRateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tax-rates/v1/tax-rates/{taxRateGroupId}`, but is
         * otherwise the same as [TaxRateServiceAsync.get].
         */
        fun get(taxRateGroupId: String): CompletableFuture<HttpResponseFor<TaxRateGetResponse>> =
            get(taxRateGroupId, TaxRateGetParams.none())

        /** @see get */
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaxRateGetResponse>> =
            get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

        /** @see get */
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
        ): CompletableFuture<HttpResponseFor<TaxRateGetResponse>> =
            get(taxRateGroupId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TaxRateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaxRateGetResponse>>

        /** @see get */
        fun get(params: TaxRateGetParams): CompletableFuture<HttpResponseFor<TaxRateGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            taxRateGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TaxRateGetResponse>> =
            get(taxRateGroupId, TaxRateGetParams.none(), requestOptions)
    }
}
