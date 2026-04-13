// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.cms.sitesearch.IndexedData
import com.hubspot.models.cms.sitesearch.PublicSearchResults
import com.hubspot.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot.models.cms.sitesearch.SiteSearchSearchParams
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
     * Return all indexed data for an asset (e.g., page, blog post, HubDB table), specified by ID.
     * This is useful when debugging why a particular asset is not returned from a custom search.
     */
    fun getIndexedData(contentId: String): CompletableFuture<IndexedData> =
        getIndexedData(contentId, SiteSearchGetIndexedDataParams.none())

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexedData> =
        getIndexedData(params.toBuilder().contentId(contentId).build(), requestOptions)

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
    ): CompletableFuture<IndexedData> = getIndexedData(contentId, params, RequestOptions.none())

    /** @see getIndexedData */
    fun getIndexedData(
        params: SiteSearchGetIndexedDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IndexedData>

    /** @see getIndexedData */
    fun getIndexedData(params: SiteSearchGetIndexedDataParams): CompletableFuture<IndexedData> =
        getIndexedData(params, RequestOptions.none())

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IndexedData> =
        getIndexedData(contentId, SiteSearchGetIndexedDataParams.none(), requestOptions)

    /**
     * Returns any website content matching the given search criteria for a given HubSpot account.
     * Searches can be filtered by content type, domain, or URL path. Includes options for weighing
     * results by recency and popularity, along with language support.
     */
    fun search(): CompletableFuture<PublicSearchResults> = search(SiteSearchSearchParams.none())

    /** @see search */
    fun search(
        params: SiteSearchSearchParams = SiteSearchSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicSearchResults>

    /** @see search */
    fun search(
        params: SiteSearchSearchParams = SiteSearchSearchParams.none()
    ): CompletableFuture<PublicSearchResults> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<PublicSearchResults> =
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
         * Returns a raw HTTP response for `get /cms/site-search/2026-03/indexed-data/{contentId}`,
         * but is otherwise the same as [SiteSearchServiceAsync.getIndexedData].
         */
        fun getIndexedData(contentId: String): CompletableFuture<HttpResponseFor<IndexedData>> =
            getIndexedData(contentId, SiteSearchGetIndexedDataParams.none())

        /** @see getIndexedData */
        fun getIndexedData(
            contentId: String,
            params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexedData>> =
            getIndexedData(params.toBuilder().contentId(contentId).build(), requestOptions)

        /** @see getIndexedData */
        fun getIndexedData(
            contentId: String,
            params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
        ): CompletableFuture<HttpResponseFor<IndexedData>> =
            getIndexedData(contentId, params, RequestOptions.none())

        /** @see getIndexedData */
        fun getIndexedData(
            params: SiteSearchGetIndexedDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IndexedData>>

        /** @see getIndexedData */
        fun getIndexedData(
            params: SiteSearchGetIndexedDataParams
        ): CompletableFuture<HttpResponseFor<IndexedData>> =
            getIndexedData(params, RequestOptions.none())

        /** @see getIndexedData */
        fun getIndexedData(
            contentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IndexedData>> =
            getIndexedData(contentId, SiteSearchGetIndexedDataParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/site-search/2026-03/search`, but is otherwise
         * the same as [SiteSearchServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<PublicSearchResults>> =
            search(SiteSearchSearchParams.none())

        /** @see search */
        fun search(
            params: SiteSearchSearchParams = SiteSearchSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicSearchResults>>

        /** @see search */
        fun search(
            params: SiteSearchSearchParams = SiteSearchSearchParams.none()
        ): CompletableFuture<HttpResponseFor<PublicSearchResults>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublicSearchResults>> =
            search(SiteSearchSearchParams.none(), requestOptions)
    }
}
