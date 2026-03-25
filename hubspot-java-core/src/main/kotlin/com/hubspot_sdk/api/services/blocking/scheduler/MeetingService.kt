// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.AdvancedService
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.BasicService
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

    fun advanced(): AdvancedService

    fun basic(): BasicService

    /** A view of [MeetingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService.WithRawResponse

        fun advanced(): AdvancedService.WithRawResponse

        fun basic(): BasicService.WithRawResponse
    }
}
