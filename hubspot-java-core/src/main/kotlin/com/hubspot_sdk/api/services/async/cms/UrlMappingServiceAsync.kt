// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.cms.urlmappings.UrlMappingCreateParams
import com.hubspot_sdk.api.models.cms.urlmappings.UrlMappingDeleteParams
import com.hubspot_sdk.api.models.cms.urlmappings.UrlMappingGetParams
import com.hubspot_sdk.api.models.cms.urlmappings.UrlMappingListParams
import com.hubspot_sdk.api.models.cms.urlredirects.UrlMapping
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UrlMappingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlMappingServiceAsync

    /**
     * Create a new URL mapping in your HubSpot account. This endpoint allows you to define URL
     * redirections and mappings, which can be useful for managing site navigation and SEO. The
     * request body must include all required properties of the UrlMapping schema.
     */
    fun create(params: UrlMappingCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UrlMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        urlMapping: UrlMapping,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(UrlMappingCreateParams.builder().urlMapping(urlMapping).build(), requestOptions)

    /** @see create */
    fun create(urlMapping: UrlMapping): CompletableFuture<HttpResponse> =
        create(urlMapping, RequestOptions.none())

    /**
     * Retrieve a list of URL mappings from the HubSpot account. This endpoint provides access to
     * URL mapping configurations, which can be used to manage and redirect URLs within the HubSpot
     * CMS. It is useful for understanding how URLs are structured and redirected in your content
     * management setup.
     */
    fun list(): CompletableFuture<HttpResponse> = list(UrlMappingListParams.none())

    /** @see list */
    fun list(
        params: UrlMappingListParams = UrlMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see list */
    fun list(
        params: UrlMappingListParams = UrlMappingListParams.none()
    ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        list(UrlMappingListParams.none(), requestOptions)

    /**
     * Delete a specific URL mapping in your HubSpot account using its unique identifier. This
     * operation will remove the URL mapping permanently, and it requires appropriate write and
     * delete permissions.
     */
    fun delete(id: Long): CompletableFuture<Void?> = delete(id, UrlMappingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: Long,
        params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UrlMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: UrlMappingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, UrlMappingDeleteParams.none(), requestOptions)

    /**
     * Retrieve a specific URL mapping by its unique identifier. This endpoint is useful for
     * obtaining details about a particular URL mapping configuration within your HubSpot account.
     * It requires the ID of the URL mapping as a path parameter.
     */
    fun get(id: Long): CompletableFuture<HttpResponse> = get(id, UrlMappingGetParams.none())

    /** @see get */
    fun get(
        id: Long,
        params: UrlMappingGetParams = UrlMappingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: Long,
        params: UrlMappingGetParams = UrlMappingGetParams.none(),
    ): CompletableFuture<HttpResponse> = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: UrlMappingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(params: UrlMappingGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        get(id, UrlMappingGetParams.none(), requestOptions)

    /**
     * A view of [UrlMappingServiceAsync] that provides access to raw HTTP responses for each
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
        ): UrlMappingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /url-mappings/2026-03/url-mappings`, but is
         * otherwise the same as [UrlMappingServiceAsync.create].
         */
        fun create(params: UrlMappingCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UrlMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            urlMapping: UrlMapping,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(UrlMappingCreateParams.builder().urlMapping(urlMapping).build(), requestOptions)

        /** @see create */
        fun create(urlMapping: UrlMapping): CompletableFuture<HttpResponse> =
            create(urlMapping, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /url-mappings/2026-03/url-mappings`, but is
         * otherwise the same as [UrlMappingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(UrlMappingListParams.none())

        /** @see list */
        fun list(
            params: UrlMappingListParams = UrlMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: UrlMappingListParams = UrlMappingListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(UrlMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /url-mappings/2026-03/url-mappings/{id}`, but is
         * otherwise the same as [UrlMappingServiceAsync.delete].
         */
        fun delete(id: Long): CompletableFuture<HttpResponse> =
            delete(id, UrlMappingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: Long,
            params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: Long,
            params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UrlMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: UrlMappingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, UrlMappingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /url-mappings/2026-03/url-mappings/{id}`, but is
         * otherwise the same as [UrlMappingServiceAsync.get].
         */
        fun get(id: Long): CompletableFuture<HttpResponse> = get(id, UrlMappingGetParams.none())

        /** @see get */
        fun get(
            id: Long,
            params: UrlMappingGetParams = UrlMappingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        fun get(
            id: Long,
            params: UrlMappingGetParams = UrlMappingGetParams.none(),
        ): CompletableFuture<HttpResponse> = get(id, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: UrlMappingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: UrlMappingGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(id: Long, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(id, UrlMappingGetParams.none(), requestOptions)
    }
}
