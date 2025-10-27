// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.CalendarService
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.MeetingsLinkService
import java.util.function.Consumer

interface MeetingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService

    fun calendar(): CalendarService

    fun meetingsLinks(): MeetingsLinkService

    /** A view of [MeetingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService.WithRawResponse

        fun calendar(): CalendarService.WithRawResponse

        fun meetingsLinks(): MeetingsLinkService.WithRawResponse
    }
}
