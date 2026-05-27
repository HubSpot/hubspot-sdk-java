// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal.subscriptions

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.FilterCreateRequest
import com.hubspot.sdk.models.FilterCreateResponse
import com.hubspot.sdk.models.FilterResponse
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterCreateParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterDeleteParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterGetParams
import com.hubspot.sdk.models.webhooksjournal.subscriptions.filters.FilterListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FilterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FilterServiceAsync

    /**
     * Create a new filter for a specific webhook subscription in the HubSpot account. This endpoint
     * allows you to define conditions that determine when a webhook should be triggered. The filter
     * is associated with a subscription identified by its ID, and the request must include the
     * filter details.
     */
    fun create(params: FilterCreateParams): CompletableFuture<FilterCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FilterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse>

    /** @see create */
    fun create(
        filterCreateRequest: FilterCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterCreateResponse> =
        create(
            FilterCreateParams.builder().filterCreateRequest(filterCreateRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(filterCreateRequest: FilterCreateRequest): CompletableFuture<FilterCreateResponse> =
        create(filterCreateRequest, RequestOptions.none())

    /**
     * Retrieve the filters associated with a specific webhook subscription. This endpoint allows
     * you to view the filters applied to a subscription, which can help in managing and
     * understanding the conditions set for webhook events.
     */
    fun list(subscriptionId: Long): CompletableFuture<List<FilterResponse>> =
        list(subscriptionId, FilterListParams.none())

    /** @see list */
    fun list(
        subscriptionId: Long,
        params: FilterListParams = FilterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>> =
        list(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see list */
    fun list(
        subscriptionId: Long,
        params: FilterListParams = FilterListParams.none(),
    ): CompletableFuture<List<FilterResponse>> = list(subscriptionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FilterListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterResponse>>

    /** @see list */
    fun list(params: FilterListParams): CompletableFuture<List<FilterResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        subscriptionId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterResponse>> =
        list(subscriptionId, FilterListParams.none(), requestOptions)

    /**
     * Remove a specific filter from the webhooks journal subscriptions. This operation is useful
     * for managing and cleaning up filters that are no longer needed. Once deleted, the filter
     * cannot be recovered.
     */
    fun delete(filterId: Long): CompletableFuture<Void?> =
        delete(filterId, FilterDeleteParams.none())

    /** @see delete */
    fun delete(
        filterId: Long,
        params: FilterDeleteParams = FilterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see delete */
    fun delete(
        filterId: Long,
        params: FilterDeleteParams = FilterDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(filterId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FilterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FilterDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(filterId: Long, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(filterId, FilterDeleteParams.none(), requestOptions)

    /**
     * Retrieve a specific filter associated with a webhook journal subscription. This endpoint
     * allows you to access the details of the filter identified by the filterId, which is useful
     * for managing and understanding the conditions applied to webhook events.
     */
    fun get(filterId: Long): CompletableFuture<FilterResponse> =
        get(filterId, FilterGetParams.none())

    /** @see get */
    fun get(
        filterId: Long,
        params: FilterGetParams = FilterGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse> =
        get(params.toBuilder().filterId(filterId).build(), requestOptions)

    /** @see get */
    fun get(
        filterId: Long,
        params: FilterGetParams = FilterGetParams.none(),
    ): CompletableFuture<FilterResponse> = get(filterId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FilterGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterResponse>

    /** @see get */
    fun get(params: FilterGetParams): CompletableFuture<FilterResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(filterId: Long, requestOptions: RequestOptions): CompletableFuture<FilterResponse> =
        get(filterId, FilterGetParams.none(), requestOptions)

    /**
     * A view of [FilterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FilterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks-journal/subscriptions/2026-03/filters`,
         * but is otherwise the same as [FilterServiceAsync.create].
         */
        fun create(
            params: FilterCreateParams
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FilterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>>

        /** @see create */
        fun create(
            filterCreateRequest: FilterCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            create(
                FilterCreateParams.builder().filterCreateRequest(filterCreateRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            filterCreateRequest: FilterCreateRequest
        ): CompletableFuture<HttpResponseFor<FilterCreateResponse>> =
            create(filterCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/subscription/{subscriptionId}`, but is
         * otherwise the same as [FilterServiceAsync.list].
         */
        fun list(subscriptionId: Long): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            list(subscriptionId, FilterListParams.none())

        /** @see list */
        fun list(
            subscriptionId: Long,
            params: FilterListParams = FilterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            list(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see list */
        fun list(
            subscriptionId: Long,
            params: FilterListParams = FilterListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            list(subscriptionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FilterListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>>

        /** @see list */
        fun list(
            params: FilterListParams
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            subscriptionId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterResponse>>> =
            list(subscriptionId, FilterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [FilterServiceAsync.delete].
         */
        fun delete(filterId: Long): CompletableFuture<HttpResponse> =
            delete(filterId, FilterDeleteParams.none())

        /** @see delete */
        fun delete(
            filterId: Long,
            params: FilterDeleteParams = FilterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see delete */
        fun delete(
            filterId: Long,
            params: FilterDeleteParams = FilterDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(filterId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FilterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FilterDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(filterId, FilterDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /webhooks-journal/subscriptions/2026-03/filters/{filterId}`, but is otherwise the same as
         * [FilterServiceAsync.get].
         */
        fun get(filterId: Long): CompletableFuture<HttpResponseFor<FilterResponse>> =
            get(filterId, FilterGetParams.none())

        /** @see get */
        fun get(
            filterId: Long,
            params: FilterGetParams = FilterGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            get(params.toBuilder().filterId(filterId).build(), requestOptions)

        /** @see get */
        fun get(
            filterId: Long,
            params: FilterGetParams = FilterGetParams.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            get(filterId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FilterGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterResponse>>

        /** @see get */
        fun get(params: FilterGetParams): CompletableFuture<HttpResponseFor<FilterResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            filterId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterResponse>> =
            get(filterId, FilterGetParams.none(), requestOptions)
    }
}
