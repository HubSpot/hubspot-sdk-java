// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.models.cms.urlmappings.UrlMappingCreateParams
import com.hubspot.sdk.models.cms.urlmappings.UrlMappingDeleteParams
import com.hubspot.sdk.models.cms.urlmappings.UrlMappingGetParams
import com.hubspot.sdk.models.cms.urlmappings.UrlMappingListParams
import com.hubspot.sdk.models.cms.urlmappings.UrlMappingsUrlMapping
import java.util.function.Consumer

interface UrlMappingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UrlMappingService

    /**
     * Create a new URL mapping in your HubSpot account. This endpoint allows you to define URL
     * redirections and mappings, which can be useful for managing site navigation and SEO. The
     * request body must include all required properties of the UrlMapping schema.
     */
    @MustBeClosed
    fun create(params: UrlMappingCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: UrlMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(
        urlMappingsUrlMapping: UrlMappingsUrlMapping,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        create(
            UrlMappingCreateParams.builder().urlMappingsUrlMapping(urlMappingsUrlMapping).build(),
            requestOptions,
        )

    /** @see create */
    @MustBeClosed
    fun create(urlMappingsUrlMapping: UrlMappingsUrlMapping): HttpResponse =
        create(urlMappingsUrlMapping, RequestOptions.none())

    /**
     * Retrieve a list of URL mappings from the HubSpot account. This endpoint provides access to
     * URL mapping configurations, which can be used to manage and redirect URLs within the HubSpot
     * CMS. It is useful for understanding how URLs are structured and redirected in your content
     * management setup.
     */
    @MustBeClosed fun list(): HttpResponse = list(UrlMappingListParams.none())

    /** @see list */
    @MustBeClosed
    fun list(
        params: UrlMappingListParams = UrlMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see list */
    @MustBeClosed
    fun list(params: UrlMappingListParams = UrlMappingListParams.none()): HttpResponse =
        list(params, RequestOptions.none())

    /** @see list */
    @MustBeClosed
    fun list(requestOptions: RequestOptions): HttpResponse =
        list(UrlMappingListParams.none(), requestOptions)

    /**
     * Delete a specific URL mapping in your HubSpot account using its unique identifier. This
     * operation will remove the URL mapping permanently, and it requires appropriate write and
     * delete permissions.
     */
    fun delete(id: Long) = delete(id, UrlMappingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: Long,
        params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: Long, params: UrlMappingDeleteParams = UrlMappingDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UrlMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: UrlMappingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions) =
        delete(id, UrlMappingDeleteParams.none(), requestOptions)

    /**
     * Retrieve a specific URL mapping by its unique identifier. This endpoint is useful for
     * obtaining details about a particular URL mapping configuration within your HubSpot account.
     * It requires the ID of the URL mapping as a path parameter.
     */
    @MustBeClosed fun get(id: Long): HttpResponse = get(id, UrlMappingGetParams.none())

    /** @see get */
    @MustBeClosed
    fun get(
        id: Long,
        params: UrlMappingGetParams = UrlMappingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(id: Long, params: UrlMappingGetParams = UrlMappingGetParams.none()): HttpResponse =
        get(id, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: UrlMappingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed
    fun get(params: UrlMappingGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(id: Long, requestOptions: RequestOptions): HttpResponse =
        get(id, UrlMappingGetParams.none(), requestOptions)

    /** A view of [UrlMappingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UrlMappingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /url-mappings/2026-03/url-mappings`, but is
         * otherwise the same as [UrlMappingService.create].
         */
        @MustBeClosed
        fun create(params: UrlMappingCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UrlMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            urlMappingsUrlMapping: UrlMappingsUrlMapping,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                UrlMappingCreateParams.builder()
                    .urlMappingsUrlMapping(urlMappingsUrlMapping)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(urlMappingsUrlMapping: UrlMappingsUrlMapping): HttpResponse =
            create(urlMappingsUrlMapping, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /url-mappings/2026-03/url-mappings`, but is
         * otherwise the same as [UrlMappingService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(UrlMappingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UrlMappingListParams = UrlMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: UrlMappingListParams = UrlMappingListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(UrlMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /url-mappings/2026-03/url-mappings/{id}`, but is
         * otherwise the same as [UrlMappingService.delete].
         */
        @MustBeClosed fun delete(id: Long): HttpResponse = delete(id, UrlMappingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: Long,
            params: UrlMappingDeleteParams = UrlMappingDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UrlMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: UrlMappingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: Long, requestOptions: RequestOptions): HttpResponse =
            delete(id, UrlMappingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /url-mappings/2026-03/url-mappings/{id}`, but is
         * otherwise the same as [UrlMappingService.get].
         */
        @MustBeClosed fun get(id: Long): HttpResponse = get(id, UrlMappingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: Long,
            params: UrlMappingGetParams = UrlMappingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(id: Long, params: UrlMappingGetParams = UrlMappingGetParams.none()): HttpResponse =
            get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: UrlMappingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: UrlMappingGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(id: Long, requestOptions: RequestOptions): HttpResponse =
            get(id, UrlMappingGetParams.none(), requestOptions)
    }
}
