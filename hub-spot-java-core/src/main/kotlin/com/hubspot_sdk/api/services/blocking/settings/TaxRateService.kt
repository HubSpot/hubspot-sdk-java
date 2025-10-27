// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.settings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.settings.taxrates.CollectionResponsePublicTaxRateGroupForwardPaging
import com.hubspot_sdk.api.models.settings.taxrates.PublicTaxRateGroup
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateGetParams
import com.hubspot_sdk.api.models.settings.taxrates.TaxRateListParams
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
    fun list(): CollectionResponsePublicTaxRateGroupForwardPaging = list(TaxRateListParams.none())

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponsePublicTaxRateGroupForwardPaging

    /** @see list */
    fun list(
        params: TaxRateListParams = TaxRateListParams.none()
    ): CollectionResponsePublicTaxRateGroupForwardPaging = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CollectionResponsePublicTaxRateGroupForwardPaging =
        list(TaxRateListParams.none(), requestOptions)

    /** Retrieve a specific tax rate by its `taxRateGroupId`. */
    fun get(taxRateGroupId: String): PublicTaxRateGroup =
        get(taxRateGroupId, TaxRateGetParams.none())

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicTaxRateGroup =
        get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

    /** @see get */
    fun get(
        taxRateGroupId: String,
        params: TaxRateGetParams = TaxRateGetParams.none(),
    ): PublicTaxRateGroup = get(taxRateGroupId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TaxRateGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicTaxRateGroup

    /** @see get */
    fun get(params: TaxRateGetParams): PublicTaxRateGroup = get(params, RequestOptions.none())

    /** @see get */
    fun get(taxRateGroupId: String, requestOptions: RequestOptions): PublicTaxRateGroup =
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
        fun list(): HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging> =
            list(TaxRateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaxRateListParams = TaxRateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TaxRateListParams = TaxRateListParams.none()
        ): HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponsePublicTaxRateGroupForwardPaging> =
            list(TaxRateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tax-rates/v1/tax-rates/{taxRateGroupId}`, but is
         * otherwise the same as [TaxRateService.get].
         */
        @MustBeClosed
        fun get(taxRateGroupId: String): HttpResponseFor<PublicTaxRateGroup> =
            get(taxRateGroupId, TaxRateGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicTaxRateGroup> =
            get(params.toBuilder().taxRateGroupId(taxRateGroupId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            taxRateGroupId: String,
            params: TaxRateGetParams = TaxRateGetParams.none(),
        ): HttpResponseFor<PublicTaxRateGroup> = get(taxRateGroupId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TaxRateGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicTaxRateGroup>

        /** @see get */
        @MustBeClosed
        fun get(params: TaxRateGetParams): HttpResponseFor<PublicTaxRateGroup> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            taxRateGroupId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicTaxRateGroup> =
            get(taxRateGroupId, TaxRateGetParams.none(), requestOptions)
    }
}
