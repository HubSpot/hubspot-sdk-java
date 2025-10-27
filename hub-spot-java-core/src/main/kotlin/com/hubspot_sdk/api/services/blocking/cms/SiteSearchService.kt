// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.sitesearch.IndexedData
import com.hubspot_sdk.api.models.cms.sitesearch.PublicSearchResults
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchGetIndexedDataParams
import com.hubspot_sdk.api.models.cms.sitesearch.SiteSearchSearchParams
import java.util.function.Consumer

interface SiteSearchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiteSearchService

    /**
     * For a given account and document ID (page ID, blog post ID, HubDB row ID, etc.), return all
     * indexed data for that document. This is useful when debugging why a particular document is
     * not returned from a custom search.
     */
    fun getIndexedData(contentId: String): IndexedData =
        getIndexedData(contentId, SiteSearchGetIndexedDataParams.none())

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexedData = getIndexedData(params.toBuilder().contentId(contentId).build(), requestOptions)

    /** @see getIndexedData */
    fun getIndexedData(
        contentId: String,
        params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
    ): IndexedData = getIndexedData(contentId, params, RequestOptions.none())

    /** @see getIndexedData */
    fun getIndexedData(
        params: SiteSearchGetIndexedDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IndexedData

    /** @see getIndexedData */
    fun getIndexedData(params: SiteSearchGetIndexedDataParams): IndexedData =
        getIndexedData(params, RequestOptions.none())

    /** @see getIndexedData */
    fun getIndexedData(contentId: String, requestOptions: RequestOptions): IndexedData =
        getIndexedData(contentId, SiteSearchGetIndexedDataParams.none(), requestOptions)

    /**
     * Returns any website content matching the given search criteria for a given HubSpot account.
     * Searches can be filtered by content type, domain, or URL path.
     */
    fun search(): PublicSearchResults = search(SiteSearchSearchParams.none())

    /** @see search */
    fun search(
        params: SiteSearchSearchParams = SiteSearchSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicSearchResults

    /** @see search */
    fun search(
        params: SiteSearchSearchParams = SiteSearchSearchParams.none()
    ): PublicSearchResults = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): PublicSearchResults =
        search(SiteSearchSearchParams.none(), requestOptions)

    /** A view of [SiteSearchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiteSearchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/site-search/indexed-data/{contentId}`, but
         * is otherwise the same as [SiteSearchService.getIndexedData].
         */
        @MustBeClosed
        fun getIndexedData(contentId: String): HttpResponseFor<IndexedData> =
            getIndexedData(contentId, SiteSearchGetIndexedDataParams.none())

        /** @see getIndexedData */
        @MustBeClosed
        fun getIndexedData(
            contentId: String,
            params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexedData> =
            getIndexedData(params.toBuilder().contentId(contentId).build(), requestOptions)

        /** @see getIndexedData */
        @MustBeClosed
        fun getIndexedData(
            contentId: String,
            params: SiteSearchGetIndexedDataParams = SiteSearchGetIndexedDataParams.none(),
        ): HttpResponseFor<IndexedData> = getIndexedData(contentId, params, RequestOptions.none())

        /** @see getIndexedData */
        @MustBeClosed
        fun getIndexedData(
            params: SiteSearchGetIndexedDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IndexedData>

        /** @see getIndexedData */
        @MustBeClosed
        fun getIndexedData(params: SiteSearchGetIndexedDataParams): HttpResponseFor<IndexedData> =
            getIndexedData(params, RequestOptions.none())

        /** @see getIndexedData */
        @MustBeClosed
        fun getIndexedData(
            contentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IndexedData> =
            getIndexedData(contentId, SiteSearchGetIndexedDataParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/site-search/search`, but is otherwise the
         * same as [SiteSearchService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<PublicSearchResults> = search(SiteSearchSearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: SiteSearchSearchParams = SiteSearchSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicSearchResults>

        /** @see search */
        @MustBeClosed
        fun search(
            params: SiteSearchSearchParams = SiteSearchSearchParams.none()
        ): HttpResponseFor<PublicSearchResults> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<PublicSearchResults> =
            search(SiteSearchSearchParams.none(), requestOptions)
    }
}
