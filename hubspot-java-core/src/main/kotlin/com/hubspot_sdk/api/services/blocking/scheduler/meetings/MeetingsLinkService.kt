// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler.meetings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingInfo
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkAvailabilityAndBusyTimes
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkBookParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetAvailabilityBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetBookingInfoBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkListPage
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkListParams
import java.util.function.Consumer

interface MeetingsLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingsLinkService

    /** Get a paged list meeting scheduling pages */
    fun list(): MeetingsLinkListPage = list(MeetingsLinkListParams.none())

    /** @see list */
    fun list(
        params: MeetingsLinkListParams = MeetingsLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeetingsLinkListPage

    /** @see list */
    fun list(params: MeetingsLinkListParams = MeetingsLinkListParams.none()): MeetingsLinkListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MeetingsLinkListPage =
        list(MeetingsLinkListParams.none(), requestOptions)

    /** Book a meeting for a specified meeting page. */
    fun book(params: MeetingsLinkBookParams): ExternalMeetingBookingResponse =
        book(params, RequestOptions.none())

    /** @see book */
    fun book(
        params: MeetingsLinkBookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMeetingBookingResponse

    /** @see book */
    fun book(
        externalMeetingBooking: ExternalMeetingBooking,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMeetingBookingResponse =
        book(
            MeetingsLinkBookParams.builder().externalMeetingBooking(externalMeetingBooking).build(),
            requestOptions,
        )

    /** @see book */
    fun book(externalMeetingBooking: ExternalMeetingBooking): ExternalMeetingBookingResponse =
        book(externalMeetingBooking, RequestOptions.none())

    /** Get the next availability times for a meeting page. */
    fun getAvailabilityBySlug(
        slug: String,
        params: MeetingsLinkGetAvailabilityBySlugParams,
    ): ExternalLinkAvailabilityAndBusyTimes =
        getAvailabilityBySlug(slug, params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        slug: String,
        params: MeetingsLinkGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalLinkAvailabilityAndBusyTimes =
        getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: MeetingsLinkGetAvailabilityBySlugParams
    ): ExternalLinkAvailabilityAndBusyTimes = getAvailabilityBySlug(params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: MeetingsLinkGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalLinkAvailabilityAndBusyTimes

    /** Get details about the initial information necessary for a meeting scheduler. */
    fun getBookingInfoBySlug(
        slug: String,
        params: MeetingsLinkGetBookingInfoBySlugParams,
    ): ExternalBookingInfo = getBookingInfoBySlug(slug, params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        slug: String,
        params: MeetingsLinkGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBookingInfo =
        getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(params: MeetingsLinkGetBookingInfoBySlugParams): ExternalBookingInfo =
        getBookingInfoBySlug(params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        params: MeetingsLinkGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBookingInfo

    /**
     * A view of [MeetingsLinkService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingsLinkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scheduler/v3/meetings/meeting-links`, but is
         * otherwise the same as [MeetingsLinkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MeetingsLinkListPage> = list(MeetingsLinkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeetingsLinkListParams = MeetingsLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeetingsLinkListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MeetingsLinkListParams = MeetingsLinkListParams.none()
        ): HttpResponseFor<MeetingsLinkListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MeetingsLinkListPage> =
            list(MeetingsLinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scheduler/v3/meetings/meeting-links/book`, but is
         * otherwise the same as [MeetingsLinkService.book].
         */
        @MustBeClosed
        fun book(params: MeetingsLinkBookParams): HttpResponseFor<ExternalMeetingBookingResponse> =
            book(params, RequestOptions.none())

        /** @see book */
        @MustBeClosed
        fun book(
            params: MeetingsLinkBookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMeetingBookingResponse>

        /** @see book */
        @MustBeClosed
        fun book(
            externalMeetingBooking: ExternalMeetingBooking,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMeetingBookingResponse> =
            book(
                MeetingsLinkBookParams.builder()
                    .externalMeetingBooking(externalMeetingBooking)
                    .build(),
                requestOptions,
            )

        /** @see book */
        @MustBeClosed
        fun book(
            externalMeetingBooking: ExternalMeetingBooking
        ): HttpResponseFor<ExternalMeetingBookingResponse> =
            book(externalMeetingBooking, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /scheduler/v3/meetings/meeting-links/book/availability-page/{slug}`, but is otherwise the
         * same as [MeetingsLinkService.getAvailabilityBySlug].
         */
        @MustBeClosed
        fun getAvailabilityBySlug(
            slug: String,
            params: MeetingsLinkGetAvailabilityBySlugParams,
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> =
            getAvailabilityBySlug(slug, params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        @MustBeClosed
        fun getAvailabilityBySlug(
            slug: String,
            params: MeetingsLinkGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> =
            getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getAvailabilityBySlug */
        @MustBeClosed
        fun getAvailabilityBySlug(
            params: MeetingsLinkGetAvailabilityBySlugParams
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes> =
            getAvailabilityBySlug(params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        @MustBeClosed
        fun getAvailabilityBySlug(
            params: MeetingsLinkGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>

        /**
         * Returns a raw HTTP response for `get /scheduler/v3/meetings/meeting-links/book/{slug}`,
         * but is otherwise the same as [MeetingsLinkService.getBookingInfoBySlug].
         */
        @MustBeClosed
        fun getBookingInfoBySlug(
            slug: String,
            params: MeetingsLinkGetBookingInfoBySlugParams,
        ): HttpResponseFor<ExternalBookingInfo> =
            getBookingInfoBySlug(slug, params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        @MustBeClosed
        fun getBookingInfoBySlug(
            slug: String,
            params: MeetingsLinkGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBookingInfo> =
            getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getBookingInfoBySlug */
        @MustBeClosed
        fun getBookingInfoBySlug(
            params: MeetingsLinkGetBookingInfoBySlugParams
        ): HttpResponseFor<ExternalBookingInfo> =
            getBookingInfoBySlug(params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        @MustBeClosed
        fun getBookingInfoBySlug(
            params: MeetingsLinkGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBookingInfo>
    }
}
