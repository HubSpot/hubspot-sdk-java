// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.events.DefinitionServiceAsync
import com.hubspot.sdk.services.async.events.OccurrenceServiceAsync
import com.hubspot.sdk.services.async.events.SendServiceAsync
import java.util.function.Consumer

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync

    fun definitions(): DefinitionServiceAsync

    fun occurrences(): OccurrenceServiceAsync

    fun send(): SendServiceAsync

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse

        fun definitions(): DefinitionServiceAsync.WithRawResponse

        fun occurrences(): OccurrenceServiceAsync.WithRawResponse

        fun send(): SendServiceAsync.WithRawResponse
    }
}
