// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.scheduler.meetings

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot.models.scheduler.meetings.ExternalMeetingBooking
import com.hubspot.models.scheduler.meetings.ExternalMeetingBookingResponse
import com.hubspot.models.scheduler.meetings.advanced.AdvancedBookParams
import com.hubspot.models.scheduler.meetings.advanced.AdvancedCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AdvancedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedServiceAsync

    /**
     * Create a new calendar event and meeting object by providing the necessary details such as
     * associations, email reminders, meeting object properties, and timezone.
     */
    fun create(
        params: AdvancedCreateParams
    ): CompletableFuture<ExternalCalenderMeetingEventResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AdvancedCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalCalenderMeetingEventResponse>

    /** Book a meeting for a specified meeting page. */
    fun book(params: AdvancedBookParams): CompletableFuture<ExternalMeetingBookingResponse> =
        book(params, RequestOptions.none())

    /** @see book */
    fun book(
        params: AdvancedBookParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMeetingBookingResponse>

    /** @see book */
    fun book(
        externalMeetingBooking: ExternalMeetingBooking,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMeetingBookingResponse> =
        book(
            AdvancedBookParams.builder().externalMeetingBooking(externalMeetingBooking).build(),
            requestOptions,
        )

    /** @see book */
    fun book(
        externalMeetingBooking: ExternalMeetingBooking
    ): CompletableFuture<ExternalMeetingBookingResponse> =
        book(externalMeetingBooking, RequestOptions.none())

    /**
     * A view of [AdvancedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scheduler/2026-03/meetings/calendar`, but is
         * otherwise the same as [AdvancedServiceAsync.create].
         */
        fun create(
            params: AdvancedCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AdvancedCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>>

        /**
         * Returns a raw HTTP response for `post /scheduler/2026-03/meetings/meeting-links/book`,
         * but is otherwise the same as [AdvancedServiceAsync.book].
         */
        fun book(
            params: AdvancedBookParams
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> =
            book(params, RequestOptions.none())

        /** @see book */
        fun book(
            params: AdvancedBookParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>>

        /** @see book */
        fun book(
            externalMeetingBooking: ExternalMeetingBooking,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> =
            book(
                AdvancedBookParams.builder().externalMeetingBooking(externalMeetingBooking).build(),
                requestOptions,
            )

        /** @see book */
        fun book(
            externalMeetingBooking: ExternalMeetingBooking
        ): CompletableFuture<HttpResponseFor<ExternalMeetingBookingResponse>> =
            book(externalMeetingBooking, RequestOptions.none())
    }
}
