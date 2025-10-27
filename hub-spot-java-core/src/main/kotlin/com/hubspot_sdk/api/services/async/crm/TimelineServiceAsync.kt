// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.timeline.EventServiceAsync
import com.hubspot_sdk.api.services.async.crm.timeline.TemplateServiceAsync
import com.hubspot_sdk.api.services.async.crm.timeline.TokenServiceAsync
import java.util.function.Consumer

interface TimelineServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineServiceAsync

    fun events(): EventServiceAsync

    fun templates(): TemplateServiceAsync

    fun tokens(): TokenServiceAsync

    /**
     * A view of [TimelineServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TimelineServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun templates(): TemplateServiceAsync.WithRawResponse

        fun tokens(): TokenServiceAsync.WithRawResponse
    }
}
