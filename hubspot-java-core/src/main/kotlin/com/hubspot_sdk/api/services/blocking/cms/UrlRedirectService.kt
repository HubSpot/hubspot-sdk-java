// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectCreateParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectCreateResponse
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectDeleteParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectGetParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectGetResponse
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectListPage
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectListParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectUpdateParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectUpdateResponse
import java.util.function.Consumer

interface UrlRedirectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlRedirectService

    /** Creates and configures a new URL redirect. */
    fun create(params: UrlRedirectCreateParams): UrlRedirectCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UrlRedirectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRedirectCreateResponse

    /** Updates the settings for an existing URL redirect. */
    fun update(urlRedirectId: String, params: UrlRedirectUpdateParams): UrlRedirectUpdateResponse =
        update(urlRedirectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        urlRedirectId: String,
        params: UrlRedirectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRedirectUpdateResponse =
        update(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

    /** @see update */
    fun update(params: UrlRedirectUpdateParams): UrlRedirectUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UrlRedirectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRedirectUpdateResponse

    /**
     * Returns all existing URL redirects. Results can be limited and filtered by creation or
     * updated date.
     */
    fun list(): UrlRedirectListPage = list(UrlRedirectListParams.none())

    /** @see list */
    fun list(
        params: UrlRedirectListParams = UrlRedirectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRedirectListPage

    /** @see list */
    fun list(params: UrlRedirectListParams = UrlRedirectListParams.none()): UrlRedirectListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UrlRedirectListPage =
        list(UrlRedirectListParams.none(), requestOptions)

    /** Delete one existing redirect, so it is no longer mapped. */
    fun delete(urlRedirectId: String) = delete(urlRedirectId, UrlRedirectDeleteParams.none())

    /** @see delete */
    fun delete(
        urlRedirectId: String,
        params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        urlRedirectId: String,
        params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
    ) = delete(urlRedirectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UrlRedirectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: UrlRedirectDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(urlRedirectId: String, requestOptions: RequestOptions) =
        delete(urlRedirectId, UrlRedirectDeleteParams.none(), requestOptions)

    /** Returns the details for a single existing URL redirect by ID. */
    fun get(urlRedirectId: String): UrlRedirectGetResponse =
        get(urlRedirectId, UrlRedirectGetParams.none())

    /** @see get */
    fun get(
        urlRedirectId: String,
        params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRedirectGetResponse =
        get(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

    /** @see get */
    fun get(
        urlRedirectId: String,
        params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
    ): UrlRedirectGetResponse = get(urlRedirectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: UrlRedirectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UrlRedirectGetResponse

    /** @see get */
    fun get(params: UrlRedirectGetParams): UrlRedirectGetResponse =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(urlRedirectId: String, requestOptions: RequestOptions): UrlRedirectGetResponse =
        get(urlRedirectId, UrlRedirectGetParams.none(), requestOptions)

    /**
     * A view of [UrlRedirectService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlRedirectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/url-redirects/`, but is otherwise the same
         * as [UrlRedirectService.create].
         */
        @MustBeClosed
        fun create(params: UrlRedirectCreateParams): HttpResponseFor<UrlRedirectCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UrlRedirectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRedirectCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /cms/v3/url-redirects/{urlRedirectId}`, but is
         * otherwise the same as [UrlRedirectService.update].
         */
        @MustBeClosed
        fun update(
            urlRedirectId: String,
            params: UrlRedirectUpdateParams,
        ): HttpResponseFor<UrlRedirectUpdateResponse> =
            update(urlRedirectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            urlRedirectId: String,
            params: UrlRedirectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRedirectUpdateResponse> =
            update(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: UrlRedirectUpdateParams): HttpResponseFor<UrlRedirectUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: UrlRedirectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRedirectUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /cms/v3/url-redirects/`, but is otherwise the same
         * as [UrlRedirectService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UrlRedirectListPage> = list(UrlRedirectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UrlRedirectListParams = UrlRedirectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRedirectListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UrlRedirectListParams = UrlRedirectListParams.none()
        ): HttpResponseFor<UrlRedirectListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UrlRedirectListPage> =
            list(UrlRedirectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/url-redirects/{urlRedirectId}`, but is
         * otherwise the same as [UrlRedirectService.delete].
         */
        @MustBeClosed
        fun delete(urlRedirectId: String): HttpResponse =
            delete(urlRedirectId, UrlRedirectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            urlRedirectId: String,
            params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            urlRedirectId: String,
            params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
        ): HttpResponse = delete(urlRedirectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UrlRedirectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: UrlRedirectDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(urlRedirectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(urlRedirectId, UrlRedirectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/url-redirects/{urlRedirectId}`, but is
         * otherwise the same as [UrlRedirectService.get].
         */
        @MustBeClosed
        fun get(urlRedirectId: String): HttpResponseFor<UrlRedirectGetResponse> =
            get(urlRedirectId, UrlRedirectGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            urlRedirectId: String,
            params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRedirectGetResponse> =
            get(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            urlRedirectId: String,
            params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
        ): HttpResponseFor<UrlRedirectGetResponse> =
            get(urlRedirectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: UrlRedirectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UrlRedirectGetResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: UrlRedirectGetParams): HttpResponseFor<UrlRedirectGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            urlRedirectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UrlRedirectGetResponse> =
            get(urlRedirectId, UrlRedirectGetParams.none(), requestOptions)
    }
}
