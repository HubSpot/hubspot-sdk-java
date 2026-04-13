// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.urlredirects.UrlMapping
import com.hubspot.sdk.models.cms.urlredirects.UrlMappingCreateRequestBody
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectCreateParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectDeleteParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectGetParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectListPageAsync
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectListParams
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UrlRedirectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlRedirectServiceAsync

    /**
     * Create a new URL redirect in your HubSpot account. This endpoint allows you to define a new
     * URL mapping that redirects traffic from a specified route to a destination URL. This is
     * useful for managing URL changes, handling outdated links, or creating short links.
     */
    fun create(params: UrlRedirectCreateParams): CompletableFuture<UrlMapping> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UrlRedirectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlMapping>

    /** @see create */
    fun create(
        urlMappingCreateRequestBody: UrlMappingCreateRequestBody,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlMapping> =
        create(
            UrlRedirectCreateParams.builder()
                .urlMappingCreateRequestBody(urlMappingCreateRequestBody)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        urlMappingCreateRequestBody: UrlMappingCreateRequestBody
    ): CompletableFuture<UrlMapping> = create(urlMappingCreateRequestBody, RequestOptions.none())

    /** Updates the settings for an existing URL redirect. */
    fun update(
        urlRedirectId: String,
        params: UrlRedirectUpdateParams,
    ): CompletableFuture<UrlMapping> = update(urlRedirectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        urlRedirectId: String,
        params: UrlRedirectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlMapping> =
        update(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

    /** @see update */
    fun update(params: UrlRedirectUpdateParams): CompletableFuture<UrlMapping> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UrlRedirectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlMapping>

    /**
     * Retrieve a list of URL redirects configured in your HubSpot account. This endpoint allows you
     * to filter redirects based on their creation or update timestamps, and sort the results. It
     * supports pagination and can include archived redirects if specified.
     */
    fun list(): CompletableFuture<UrlRedirectListPageAsync> = list(UrlRedirectListParams.none())

    /** @see list */
    fun list(
        params: UrlRedirectListParams = UrlRedirectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlRedirectListPageAsync>

    /** @see list */
    fun list(
        params: UrlRedirectListParams = UrlRedirectListParams.none()
    ): CompletableFuture<UrlRedirectListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UrlRedirectListPageAsync> =
        list(UrlRedirectListParams.none(), requestOptions)

    /** Delete one existing redirect, so it is no longer mapped. */
    fun delete(urlRedirectId: String): CompletableFuture<Void?> =
        delete(urlRedirectId, UrlRedirectDeleteParams.none())

    /** @see delete */
    fun delete(
        urlRedirectId: String,
        params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        urlRedirectId: String,
        params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(urlRedirectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UrlRedirectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: UrlRedirectDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(urlRedirectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(urlRedirectId, UrlRedirectDeleteParams.none(), requestOptions)

    /** Returns the details for a single existing URL redirect by ID. */
    fun get(urlRedirectId: String): CompletableFuture<UrlMapping> =
        get(urlRedirectId, UrlRedirectGetParams.none())

    /** @see get */
    fun get(
        urlRedirectId: String,
        params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlMapping> =
        get(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

    /** @see get */
    fun get(
        urlRedirectId: String,
        params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
    ): CompletableFuture<UrlMapping> = get(urlRedirectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: UrlRedirectGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UrlMapping>

    /** @see get */
    fun get(params: UrlRedirectGetParams): CompletableFuture<UrlMapping> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(urlRedirectId: String, requestOptions: RequestOptions): CompletableFuture<UrlMapping> =
        get(urlRedirectId, UrlRedirectGetParams.none(), requestOptions)

    /**
     * A view of [UrlRedirectServiceAsync] that provides access to raw HTTP responses for each
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
        ): UrlRedirectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/url-redirects/2026-03`, but is otherwise the
         * same as [UrlRedirectServiceAsync.create].
         */
        fun create(
            params: UrlRedirectCreateParams
        ): CompletableFuture<HttpResponseFor<UrlMapping>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UrlRedirectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>>

        /** @see create */
        fun create(
            urlMappingCreateRequestBody: UrlMappingCreateRequestBody,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            create(
                UrlRedirectCreateParams.builder()
                    .urlMappingCreateRequestBody(urlMappingCreateRequestBody)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            urlMappingCreateRequestBody: UrlMappingCreateRequestBody
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            create(urlMappingCreateRequestBody, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/url-redirects/2026-03/{urlRedirectId}`, but
         * is otherwise the same as [UrlRedirectServiceAsync.update].
         */
        fun update(
            urlRedirectId: String,
            params: UrlRedirectUpdateParams,
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            update(urlRedirectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            urlRedirectId: String,
            params: UrlRedirectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            update(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: UrlRedirectUpdateParams
        ): CompletableFuture<HttpResponseFor<UrlMapping>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: UrlRedirectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>>

        /**
         * Returns a raw HTTP response for `get /cms/url-redirects/2026-03`, but is otherwise the
         * same as [UrlRedirectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UrlRedirectListPageAsync>> =
            list(UrlRedirectListParams.none())

        /** @see list */
        fun list(
            params: UrlRedirectListParams = UrlRedirectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlRedirectListPageAsync>>

        /** @see list */
        fun list(
            params: UrlRedirectListParams = UrlRedirectListParams.none()
        ): CompletableFuture<HttpResponseFor<UrlRedirectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UrlRedirectListPageAsync>> =
            list(UrlRedirectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/url-redirects/2026-03/{urlRedirectId}`, but
         * is otherwise the same as [UrlRedirectServiceAsync.delete].
         */
        fun delete(urlRedirectId: String): CompletableFuture<HttpResponse> =
            delete(urlRedirectId, UrlRedirectDeleteParams.none())

        /** @see delete */
        fun delete(
            urlRedirectId: String,
            params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            urlRedirectId: String,
            params: UrlRedirectDeleteParams = UrlRedirectDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(urlRedirectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UrlRedirectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: UrlRedirectDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            urlRedirectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(urlRedirectId, UrlRedirectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/url-redirects/2026-03/{urlRedirectId}`, but is
         * otherwise the same as [UrlRedirectServiceAsync.get].
         */
        fun get(urlRedirectId: String): CompletableFuture<HttpResponseFor<UrlMapping>> =
            get(urlRedirectId, UrlRedirectGetParams.none())

        /** @see get */
        fun get(
            urlRedirectId: String,
            params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            get(params.toBuilder().urlRedirectId(urlRedirectId).build(), requestOptions)

        /** @see get */
        fun get(
            urlRedirectId: String,
            params: UrlRedirectGetParams = UrlRedirectGetParams.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            get(urlRedirectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: UrlRedirectGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UrlMapping>>

        /** @see get */
        fun get(params: UrlRedirectGetParams): CompletableFuture<HttpResponseFor<UrlMapping>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            urlRedirectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UrlMapping>> =
            get(urlRedirectId, UrlRedirectGetParams.none(), requestOptions)
    }
}
