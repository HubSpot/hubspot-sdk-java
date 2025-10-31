// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetResponse
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListResponse
import java.util.function.Consumer

interface TaxRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxRateService

    /** Retrieve a paginated list of all tax rates set up in the account tax rate library */
    fun list(): TaxRateListResponse = list(TaxRateListParams.none())

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaxRateListResponse

    /** @see list */
    fun list(params: TaxRateListParams = TaxRateListParams.none()): TaxRateListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TaxRateListResponse =
        list(TaxRateListParams.none(), requestOptions)

    /** Retrieve a specific tax rate by its `taxRateGroupId`. */
    fun get(taxRateGroupId: String): TaxRateGetResponse =
        get(taxRateGroupId, TaxRateGetParams.none())

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaxRateGetResponse =
        get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
    ): TaxRateGetResponse = get(taxRateGroupId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaxRateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaxRateGetResponse

    /** @see get */
    fun get(params: TaxRateGetParams): TaxRateGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(taxRateGroupId: String, requestOptions: RequestOptions): TaxRateGetResponse =
        get(taxRateGroupId, TaxRateGetParams.none(), requestOptions)

    /** A view of [TaxRateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxRateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tax-rates/v1/tax-rates`, but is otherwise the same
         * as [TaxRateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TaxRateListResponse> = list(TaxRateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaxRateListParams = TaxRateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaxRateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaxRateListParams = TaxRateListParams.none()
        ): HttpResponseFor<TaxRateListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TaxRateListResponse> =
            list(TaxRateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tax-rates/v1/tax-rates/{taxRateGroupId}`, but is
         * otherwise the same as [TaxRateService.get].
         */
        @MustBeClosed
        fun get(taxRateGroupId: String): HttpResponseFor<TaxRateGetResponse> =
            get(taxRateGroupId, TaxRateGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaxRateGetResponse> =
            get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
        ): HttpResponseFor<TaxRateGetResponse> = get(taxRateGroupId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TaxRateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaxRateGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: TaxRateGetParams): HttpResponseFor<TaxRateGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taxRateGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaxRateGetResponse> =
            get(taxRateGroupId, TaxRateGetParams.none(), requestOptions)
    }
}
