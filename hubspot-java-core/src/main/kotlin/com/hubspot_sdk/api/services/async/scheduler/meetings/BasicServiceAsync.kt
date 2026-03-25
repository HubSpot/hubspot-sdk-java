// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingInfo
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkAvailabilityAndBusyTimes
import com.hubspot_sdk.api.models.scheduler.meetings.basic.BasicGetAvailabilityBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.basic.BasicGetBookingInfoBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.basic.BasicListPageAsync
import com.hubspot_sdk.api.models.scheduler.meetings.basic.BasicListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BasicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BasicServiceAsync

    /** Get a paged list meeting scheduling pages */
    fun list(): CompletableFuture<BasicListPageAsync> = list(BasicListParams.none())

    /** @see list */
    fun list(
        params: BasicListParams = BasicListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BasicListPageAsync>

    /** @see list */
    fun list(
        params: BasicListParams = BasicListParams.none()
    ): CompletableFuture<BasicListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BasicListPageAsync> =
        list(BasicListParams.none(), requestOptions)

    /** Get the next availability times for a meeting page. */
    fun getAvailabilityBySlug(
        slug: String,
        params: BasicGetAvailabilityBySlugParams,
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(slug, params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        slug: String,
        params: BasicGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: BasicGetAvailabilityBySlugParams
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: BasicGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes>

    /** Get details about the initial information necessary for a meeting scheduler. */
    fun getBookingInfoBySlug(
        slug: String,
        params: BasicGetBookingInfoBySlugParams,
    ): CompletableFuture<ExternalBookingInfo> =
        getBookingInfoBySlug(slug, params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        slug: String,
        params: BasicGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBookingInfo> =
        getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        params: BasicGetBookingInfoBySlugParams
    ): CompletableFuture<ExternalBookingInfo> = getBookingInfoBySlug(params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        params: BasicGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBookingInfo>

    /** A view of [BasicServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BasicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scheduler/2026-03/meetings/meeting-links`, but is
         * otherwise the same as [BasicServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BasicListPageAsync>> =
            list(BasicListParams.none())

        /** @see list */
        fun list(
            params: BasicListParams = BasicListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BasicListPageAsync>>

        /** @see list */
        fun list(
            params: BasicListParams = BasicListParams.none()
        ): CompletableFuture<HttpResponseFor<BasicListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BasicListPageAsync>> =
            list(BasicListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /scheduler/2026-03/meetings/meeting-links/book/availability-page/{slug}`, but is
         * otherwise the same as [BasicServiceAsync.getAvailabilityBySlug].
         */
        fun getAvailabilityBySlug(
            slug: String,
            params: BasicGetAvailabilityBySlugParams,
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(slug, params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            slug: String,
            params: BasicGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            params: BasicGetAvailabilityBySlugParams
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            params: BasicGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>>

        /**
         * Returns a raw HTTP response for `get
         * /scheduler/2026-03/meetings/meeting-links/book/{slug}`, but is otherwise the same as
         * [BasicServiceAsync.getBookingInfoBySlug].
         */
        fun getBookingInfoBySlug(
            slug: String,
            params: BasicGetBookingInfoBySlugParams,
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(slug, params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            slug: String,
            params: BasicGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            params: BasicGetBookingInfoBySlugParams
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            params: BasicGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>>
    }
}
