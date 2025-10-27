// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.settings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.settings.taxrates.CollectionResponsePublicTaxRateGroupForwardPaging
import com.hubspot_sdk.api.models.settings.taxrates.PublicTaxRateGroup
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListParams
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
    fun list(): CompletableFuture<CollectionResponsePublicTaxRateGroupForwardPaging> =
        list(TaxRateListParams.none())

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponsePublicTaxRateGroupForwardPaging>

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none()
    ): CompletableFuture<CollectionResponsePublicTaxRateGroupForwardPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponsePublicTaxRateGroupForwardPaging> =
        list(TaxRateListParams.none(), requestOptions)

    /** Retrieve a specific tax rate by its `taxRateGroupId`. */
    fun get(taxRateGroupId: String): CompletableFuture<PublicTaxRateGroup> =
        get(taxRateGroupId, TaxRateGetParams.none())

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicTaxRateGroup> =
        get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
    ): CompletableFuture<PublicTaxRateGroup> = get(taxRateGroupId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaxRateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicTaxRateGroup>

    /** @see get */
    fun get(params: TaxRateGetParams): CompletableFuture<PublicTaxRateGroup> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        taxRateGroupId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicTaxRateGroup> =
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
        fun list():
            CompletableFuture<HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging>> =
            list(TaxRateListParams.none())

        /** @see list */
        fun list(
            params: TaxRateListParams = TaxRateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging>>

        /** @see list */
        fun list(
            params: TaxRateListParams = TaxRateListParams.none()
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging>> =
            list(TaxRateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tax-rates/v1/tax-rates/{taxRateGroupId}`, but is
         * otherwise the same as [TaxRateServiceAsync.get].
         */
        fun get(taxRateGroupId: String): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>> =
            get(taxRateGroupId, TaxRateGetParams.none())

        /** @see get */
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>> =
            get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

        /** @see get */
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>> =
            get(taxRateGroupId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TaxRateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>>

        /** @see get */
        fun get(params: TaxRateGetParams): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            taxRateGroupId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicTaxRateGroup>> =
            get(taxRateGroupId, TaxRateGetParams.none(), requestOptions)
    }
}
