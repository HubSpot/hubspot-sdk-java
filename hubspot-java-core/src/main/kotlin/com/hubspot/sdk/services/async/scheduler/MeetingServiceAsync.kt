// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.scheduler

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.scheduler.meetings.AdvancedServiceAsync
import com.hubspot.sdk.services.async.scheduler.meetings.BasicServiceAsync
import java.util.function.Consumer

interface MeetingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingServiceAsync

    fun advanced(): AdvancedServiceAsync

    fun basic(): BasicServiceAsync

    /**
     * A view of [MeetingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingServiceAsync.WithRawResponse

        fun advanced(): AdvancedServiceAsync.WithRawResponse

        fun basic(): BasicServiceAsync.WithRawResponse
    }
}
