// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.scheduler.meetings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot.sdk.models.scheduler.meetings.ExternalMeetingBooking
import com.hubspot.sdk.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot.sdk.models.scheduler.meetings.advanced.AdvancedBookParams
import com.hubspot.sdk.models.scheduler.meetings.advanced.AdvancedCreateParams
import java.util.function.Consumer

interface AdvancedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedService

    /**
     * Create a new calendar event and meeting object by providing the necessary details such as
     * associations, email reminders, meeting object properties, and timezone.
     */
    fun create(params: AdvancedCreateParams): ExternalCalenderMeetingEventResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AdvancedCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalCalenderMeetingEventResponse

    /** Book a meeting for a specified meeting page. */
    fun book(params: AdvancedBookParams): ExternalMeetingBookingResponse =
        book(params, RequestOptions.none())

    /** @see book */
    fun book(
        params: AdvancedBookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMeetingBookingResponse

    /** @see book */
    fun book(
        externalMeetingBooking: ExternalMeetingBooking,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMeetingBookingResponse =
        book(
            AdvancedBookParams.builder().externalMeetingBooking(externalMeetingBooking).build(),
            requestOptions,
        )

    /** @see book */
    fun book(externalMeetingBooking: ExternalMeetingBooking): ExternalMeetingBookingResponse =
        book(externalMeetingBooking, RequestOptions.none())

    /** A view of [AdvancedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scheduler/2026-03/meetings/calendar`, but is
         * otherwise the same as [AdvancedService.create].
         */
        @MustBeClosed
        fun create(
            params: AdvancedCreateParams
        ): HttpResponseFor<ExternalCalenderMeetingEventResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AdvancedCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalCalenderMeetingEventResponse>

        /**
         * Returns a raw HTTP response for `post /scheduler/2026-03/meetings/meeting-links/book`,
         * but is otherwise the same as [AdvancedService.book].
         */
        @MustBeClosed
        fun book(params: AdvancedBookParams): HttpResponseFor<ExternalMeetingBookingResponse> =
            book(params, RequestOptions.none())

        /** @see book */
        @MustBeClosed
        fun book(
            params: AdvancedBookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMeetingBookingResponse>

        /** @see book */
        @MustBeClosed
        fun book(
            externalMeetingBooking: ExternalMeetingBooking,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMeetingBookingResponse> =
            book(
                AdvancedBookParams.builder().externalMeetingBooking(externalMeetingBooking).build(),
                requestOptions,
            )

        /** @see book */
        @MustBeClosed
        fun book(
            externalMeetingBooking: ExternalMeetingBooking
        ): HttpResponseFor<ExternalMeetingBookingResponse> =
            book(externalMeetingBooking, RequestOptions.none())
    }
}
