// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler.meetings

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalendarMeetingEventCreateRequest
import com.hubspot_sdk.api.models.scheduler.meetings.ExternalCalenderMeetingEventResponse
import com.hubspot_sdk.api.models.scheduler.meetings.calendar.CalendarCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CalendarServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync

    fun create(
        params: CalendarCreateParams
    ): CompletableFuture<ExternalCalenderMeetingEventResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CalendarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalCalenderMeetingEventResponse>

    /** @see create */
    fun create(
        externalCalendarMeetingEventCreateRequest: ExternalCalendarMeetingEventCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalCalenderMeetingEventResponse> =
        create(
            CalendarCreateParams.builder()
                .externalCalendarMeetingEventCreateRequest(
                    externalCalendarMeetingEventCreateRequest
                )
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        externalCalendarMeetingEventCreateRequest: ExternalCalendarMeetingEventCreateRequest
    ): CompletableFuture<ExternalCalenderMeetingEventResponse> =
        create(externalCalendarMeetingEventCreateRequest, RequestOptions.none())

    /**
     * A view of [CalendarServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scheduler/v3/meetings/calendar`, but is otherwise
         * the same as [CalendarServiceAsync.create].
         */
        fun create(
            params: CalendarCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CalendarCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>>

        /** @see create */
        fun create(
            externalCalendarMeetingEventCreateRequest: ExternalCalendarMeetingEventCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>> =
            create(
                CalendarCreateParams.builder()
                    .externalCalendarMeetingEventCreateRequest(
                        externalCalendarMeetingEventCreateRequest
                    )
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            externalCalendarMeetingEventCreateRequest: ExternalCalendarMeetingEventCreateRequest
        ): CompletableFuture<HttpResponseFor<ExternalCalenderMeetingEventResponse>> =
            create(externalCalendarMeetingEventCreateRequest, RequestOptions.none())
    }
}
