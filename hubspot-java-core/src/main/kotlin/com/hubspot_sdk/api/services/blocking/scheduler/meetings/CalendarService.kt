// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler.meetings

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot_sdk.api.models.scheduler.meetings.calendar.CalendarCreateParams
import java.util.function.Consumer

interface CalendarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService

    fun create(params: CalendarCreateParams): ExternalCalenderMeetingEventResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CalendarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalCalenderMeetingEventResponse

    /** A view of [CalendarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scheduler/v3/meetings/calendar`, but is otherwise
         * the same as [CalendarService.create].
         */
        @MustBeClosed
        fun create(
            params: CalendarCreateParams
        ): HttpResponseFor<ExternalCalenderMeetingEventResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CalendarCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalCalenderMeetingEventResponse>
    }
}
