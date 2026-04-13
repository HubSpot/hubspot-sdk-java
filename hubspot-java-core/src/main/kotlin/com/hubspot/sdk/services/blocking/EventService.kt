// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.events.DefinitionService
import com.hubspot.sdk.services.blocking.events.OccurrenceService
import com.hubspot.sdk.services.blocking.events.SendService
import java.util.function.Consumer

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService

    fun definitions(): DefinitionService

    fun occurrences(): OccurrenceService

    fun send(): SendService

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService.WithRawResponse

        fun definitions(): DefinitionService.WithRawResponse

        fun occurrences(): OccurrenceService.WithRawResponse

        fun send(): SendService.WithRawResponse
    }
}
