// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataResponse
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SiteSearchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteSearchServiceAsync

    /**
     * For a given account and document ID (page ID, blog post ID, HubDB row ID, etc.), return all
     * indexed data for that document. This is useful when debugging why a particular document is
     * not returned from a custom search.
     */
    fun getIndexedData(contentId: String): CompletableFuture<SiteSearchGetIndexedDataResponse> =
        getIndexedData(contentId, SiteSearchGetIndexedDataParams.none())

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteSearchGetIndexedDataResponse> =
        getIndexedData(params.toBuilder().contentId(contentId).build(), requestOptions)

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
    ): CompletableFuture<SiteSearchGetIndexedDataResponse> =
        getIndexedData(contentId, params, RequestOptions.none())

    /** @see getIndexedData */
    fun getIndexedData(
        params: SiteSearchGetIndexedDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteSearchGetIndexedDataResponse>

    /** @see getIndexedData */
    fun getIndexedData(
        params: SiteSearchGetIndexedDataParams
    ): CompletableFuture<SiteSearchGetIndexedDataResponse> =
        getIndexedData(params, RequestOptions.none())

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiteSearchGetIndexedDataResponse> =
        getIndexedData(contentId, SiteSearchGetIndexedDataParams.none(), requestOptions)

    /**
     * Returns any website content matching the given search criteria for a given HubSpot account.
     * Searches can be filtered by content type, domain, or URL path.
     */
    fun search(): CompletableFuture<SiteSearchSearchResponse> =
        search(SiteSearchSearchParams.none())

    /** @see search */
    fun search(
        params: SiteSearchSearchParams = SiteSearchSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiteSearchSearchResponse>

    /** @see search */
    fun search(
        params: SiteSearchSearchParams = SiteSearchSearchParams.none()
    ): CompletableFuture<SiteSearchSearchResponse> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<SiteSearchSearchResponse> =
        search(SiteSearchSearchParams.none(), requestOptions)

    /**
     * A view of [SiteSearchServiceAsync] that provides access to raw HTTP responses for each
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
        ): SiteSearchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/site-search/indexed-data/{contentId}`, but
         * is otherwise the same as [SiteSearchServiceAsync.getIndexedData].
         */
        fun getIndexedData(
            contentId: String
        ): CompletableFuture<HttpResponseFor<SiteSearchGetIndexedDataResponse>> =
            getIndexedData(contentId, SiteSearchGetIndexedDataParams.none())

        /** @see getIndexedData */
        fun getIndexedData(
            contentId: String,
            params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteSearchGetIndexedDataResponse>> =
            getIndexedData(params.toBuilder().contentId(contentId).build(), requestOptions)

        /** @see getIndexedData */
        fun getIndexedData(
            contentId: String,
            params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
        ): CompletableFuture<HttpResponseFor<SiteSearchGetIndexedDataResponse>> =
            getIndexedData(contentId, params, RequestOptions.none())

        /** @see getIndexedData */
        fun getIndexedData(
            params: SiteSearchGetIndexedDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteSearchGetIndexedDataResponse>>

        /** @see getIndexedData */
        fun getIndexedData(
            params: SiteSearchGetIndexedDataParams
        ): CompletableFuture<HttpResponseFor<SiteSearchGetIndexedDataResponse>> =
            getIndexedData(params, RequestOptions.none())

        /** @see getIndexedData */
        fun getIndexedData(
            contentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiteSearchGetIndexedDataResponse>> =
            getIndexedData(contentId, SiteSearchGetIndexedDataParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/site-search/search`, but is otherwise the
         * same as [SiteSearchServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<SiteSearchSearchResponse>> =
            search(SiteSearchSearchParams.none())

        /** @see search */
        fun search(
            params: SiteSearchSearchParams = SiteSearchSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiteSearchSearchResponse>>

        /** @see search */
        fun search(
            params: SiteSearchSearchParams = SiteSearchSearchParams.none()
        ): CompletableFuture<HttpResponseFor<SiteSearchSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SiteSearchSearchResponse>> =
            search(SiteSearchSearchParams.none(), requestOptions)
    }
}
