// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.scheduler.meetings.CollectionResponseWithTotalExternalLinkMetadataForwardPaging
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalBookingInfo
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalLinkAvailabilityAndBusyTimes
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBooking
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkBookParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetAvailabilityBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkGetBookingInfoBySlugParams
import com.hubspot_sdk.api.models.scheduler.meetings.meetingslinks.MeetingsLinkListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MeetingsLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingsLinkServiceAsync

    /** Get a paged list meeting scheduling pages */
    fun list(): CompletableFuture<CollectionResponseWithTotalExternalLinkMetadataForwardPaging> =
        list(MeetingsLinkListParams.none())

    /** @see list */
    fun list(
        params: MeetingsLinkListParams = MeetingsLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>

    /** @see list */
    fun list(
        params: MeetingsLinkListParams = MeetingsLinkListParams.none()
    ): CompletableFuture<CollectionResponseWithTotalExternalLinkMetadataForwardPaging> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CollectionResponseWithTotalExternalLinkMetadataForwardPaging> =
        list(MeetingsLinkListParams.none(), requestOptions)

    /** Book a meeting for a specified meeting page. */
    fun book(params: MeetingsLinkBookParams): CompletableFuture<ExternalMeetingBookingResponse> =
        book(params, RequestOptions.none())

    /** @see book */
    fun book(
        params: MeetingsLinkBookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMeetingBookingResponse>

    /** @see book */
    fun book(
        externalMeetingBooking: ExternalMeetingBooking,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMeetingBookingResponse> =
        book(
            MeetingsLinkBookParams.builder().externalMeetingBooking(externalMeetingBooking).build(),
            requestOptions,
        )

    /** @see book */
    fun book(
        externalMeetingBooking: ExternalMeetingBooking
    ): CompletableFuture<ExternalMeetingBookingResponse> =
        book(externalMeetingBooking, RequestOptions.none())

    /** Get the next availability times for a meeting page. */
    fun getAvailabilityBySlug(
        slug: String
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(slug, MeetingsLinkGetAvailabilityBySlugParams.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        slug: String,
        params: MeetingsLinkGetAvailabilityBySlugParams =
            MeetingsLinkGetAvailabilityBySlugParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        slug: String,
        params: MeetingsLinkGetAvailabilityBySlugParams =
            MeetingsLinkGetAvailabilityBySlugParams.none(),
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(slug, params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: MeetingsLinkGetAvailabilityBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes>

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        params: MeetingsLinkGetAvailabilityBySlugParams
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(params, RequestOptions.none())

    /** @see getAvailabilityBySlug */
    fun getAvailabilityBySlug(
        slug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalLinkAvailabilityAndBusyTimes> =
        getAvailabilityBySlug(slug, MeetingsLinkGetAvailabilityBySlugParams.none(), requestOptions)

    /** Get details about the initial information necessary for a meeting scheduler. */
    fun getBookingInfoBySlug(slug: String): CompletableFuture<ExternalBookingInfo> =
        getBookingInfoBySlug(slug, MeetingsLinkGetBookingInfoBySlugParams.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        slug: String,
        params: MeetingsLinkGetBookingInfoBySlugParams =
            MeetingsLinkGetBookingInfoBySlugParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBookingInfo> =
        getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        slug: String,
        params: MeetingsLinkGetBookingInfoBySlugParams =
            MeetingsLinkGetBookingInfoBySlugParams.none(),
    ): CompletableFuture<ExternalBookingInfo> =
        getBookingInfoBySlug(slug, params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        params: MeetingsLinkGetBookingInfoBySlugParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBookingInfo>

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        params: MeetingsLinkGetBookingInfoBySlugParams
    ): CompletableFuture<ExternalBookingInfo> = getBookingInfoBySlug(params, RequestOptions.none())

    /** @see getBookingInfoBySlug */
    fun getBookingInfoBySlug(
        slug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBookingInfo> =
        getBookingInfoBySlug(slug, MeetingsLinkGetBookingInfoBySlugParams.none(), requestOptions)

    /**
     * A view of [MeetingsLinkServiceAsync] that provides access to raw HTTP responses for each
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
        ): MeetingsLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scheduler/v3/meetings/meeting-links`, but is
         * otherwise the same as [MeetingsLinkServiceAsync.list].
         */
        fun list():
            CompletableFuture<
                HttpResponseFor<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>
            > = list(MeetingsLinkListParams.none())

        /** @see list */
        fun list(
            params: MeetingsLinkListParams = MeetingsLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>
        >

        /** @see list */
        fun list(
            params: MeetingsLinkListParams = MeetingsLinkListParams.none()
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>
        > = list(MeetingsLinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scheduler/v3/meetings/meeting-links/book`, but is
         * otherwise the same as [MeetingsLinkServiceAsync.book].
         */
        fun book(
            params: MeetingsLinkBookParams
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> =
            book(params, RequestOptions.none())

        /** @see book */
        fun book(
            params: MeetingsLinkBookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>>

        /** @see book */
        fun book(
            externalMeetingBooking: ExternalMeetingBooking,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> =
            book(
                MeetingsLinkBookParams.builder()
                    .externalMeetingBooking(externalMeetingBooking)
                    .build(),
                requestOptions,
            )

        /** @see book */
        fun book(
            externalMeetingBooking: ExternalMeetingBooking
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> =
            book(externalMeetingBooking, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /scheduler/v3/meetings/meeting-links/book/availability-page/{slug}`, but is otherwise the
         * same as [MeetingsLinkServiceAsync.getAvailabilityBySlug].
         */
        fun getAvailabilityBySlug(
            slug: String
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(slug, MeetingsLinkGetAvailabilityBySlugParams.none())

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            slug: String,
            params: MeetingsLinkGetAvailabilityBySlugParams =
                MeetingsLinkGetAvailabilityBySlugParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            slug: String,
            params: MeetingsLinkGetAvailabilityBySlugParams =
                MeetingsLinkGetAvailabilityBySlugParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(slug, params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            params: MeetingsLinkGetAvailabilityBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>>

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            params: MeetingsLinkGetAvailabilityBySlugParams
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(params, RequestOptions.none())

        /** @see getAvailabilityBySlug */
        fun getAvailabilityBySlug(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalLinkAvailabilityAndBusyTimes>> =
            getAvailabilityBySlug(
                slug,
                MeetingsLinkGetAvailabilityBySlugParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /scheduler/v3/meetings/meeting-links/book/{slug}`,
         * but is otherwise the same as [MeetingsLinkServiceAsync.getBookingInfoBySlug].
         */
        fun getBookingInfoBySlug(
            slug: String
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(slug, MeetingsLinkGetBookingInfoBySlugParams.none())

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            slug: String,
            params: MeetingsLinkGetBookingInfoBySlugParams =
                MeetingsLinkGetBookingInfoBySlugParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            slug: String,
            params: MeetingsLinkGetBookingInfoBySlugParams =
                MeetingsLinkGetBookingInfoBySlugParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(slug, params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            params: MeetingsLinkGetBookingInfoBySlugParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>>

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            params: MeetingsLinkGetBookingInfoBySlugParams
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(params, RequestOptions.none())

        /** @see getBookingInfoBySlug */
        fun getBookingInfoBySlug(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBookingInfo>> =
            getBookingInfoBySlug(
                slug,
                MeetingsLinkGetBookingInfoBySlugParams.none(),
                requestOptions,
            )
    }
}
