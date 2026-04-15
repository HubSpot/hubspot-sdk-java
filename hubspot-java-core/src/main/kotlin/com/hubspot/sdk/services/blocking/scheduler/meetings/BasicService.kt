// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.scheduler.meetings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.scheduler.meetings.ExternalBookingInfo
import com.hubspot.sdk.models.scheduler.meetings.ExternalLinkAvailabilityAndBusyTimes
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicGetAvailabilityBySlugParams
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicGetBookingInfoBySlugParams
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicListPage
import com.hubspot.sdk.models.scheduler.meetings.basic.BasicListParams
import java.util.function.Consumer

interface BasicService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BasicService

    /** Get a paged list meeting scheduling pages */
    fun list(): BasicListPage = list(BasicListParams.none())

    /** @see list */
    fun list(
        params: BasicListParams = BasicListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BasicListPage

    /** @see list */
    fun list(params: BasicListParams = BasicListParams.none()): BasicListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BasicListPage =
        list(BasicListParams.none(), requestOptions)

    /** Get the next availability times for a meeting page. */
    fun getAvailabilityBySlug(
        slug: String,
        params: BasicGetAvailabilityBySlugParams,
    ): ExternalLinkAvailabilityAndBusyTimes =
        getAvailabilityBySlug(slug, params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        slug: String,
        params: BasicGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalLinkAvailabilityAndBusyTimes =
        getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: BasicGetAvailabilityBySlugParams
    ): ExternalLinkAvailabilityAndBusyTimes = getAvailabilityBySlug(params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: BasicGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalLinkAvailabilityAndBusyTimes

    /** Get details about the initial information necessary for a meeting scheduler. */
    fun getBookingInfoBySlug(
        slug: String,
        params: BasicGetBookingInfoBySlugParams,
    ): ExternalBookingInfo = getBookingInfoBySlug(slug, params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        slug: String,
        params: BasicGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBookingInfo =
        getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(params: BasicGetBookingInfoBySlugParams): ExternalBookingInfo =
        getBookingInfoBySlug(params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        params: BasicGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBookingInfo

    /** A view of [BasicService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BasicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scheduler/2026-03/meetings/meeting-links`, but is
         * otherwise the same as [BasicService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BasicListPage> = list(BasicListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BasicListParams = BasicListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BasicListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: BasicListParams = BasicListParams.none()): HttpResponseFor<BasicListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BasicListPage> =
            list(BasicListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /scheduler/2026-03/meetings/meeting-links/book/availability-page/{slug}`, but is
         * otherwise the same as [BasicService.getAvailabilityBySlug].
         */
        @MustBeClosed
        fun getAvailabilityBySlug(
            slug: String,
            params: BasicGetAvailabilityBySlugParams,
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> =
            getAvailabilityBySlug(slug, params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        @MustBeClosed
        fun getAvailabilityBySlug(
            slug: String,
            params: BasicGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> =
            getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getAvailabilityBySlug */
        @MustBeClosed
        fun getAvailabilityBySlug(
            params: BasicGetAvailabilityBySlugParams
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> =
            getAvailabilityBySlug(params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        @MustBeClosed
        fun getAvailabilityBySlug(
            params: BasicGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>

        /**
         * Returns a raw HTTP response for `get
         * /scheduler/2026-03/meetings/meeting-links/book/{slug}`, but is otherwise the same as
         * [BasicService.getBookingInfoBySlug].
         */
        @MustBeClosed
        fun getBookingInfoBySlug(
            slug: String,
            params: BasicGetBookingInfoBySlugParams,
        ): HttpResponseFor<ExternalBookingInfo> =
            getBookingInfoBySlug(slug, params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        @MustBeClosed
        fun getBookingInfoBySlug(
            slug: String,
            params: BasicGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBookingInfo> =
            getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getBookingInfoBySlug */
        @MustBeClosed
        fun getBookingInfoBySlug(
            params: BasicGetBookingInfoBySlugParams
        ): HttpResponseFor<ExternalBookingInfo> =
            getBookingInfoBySlug(params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        @MustBeClosed
        fun getBookingInfoBySlug(
            params: BasicGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBookingInfo>
    }
}
