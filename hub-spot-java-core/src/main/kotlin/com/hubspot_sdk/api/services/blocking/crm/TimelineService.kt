// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.timeline.EventService
import com.hubspot_sdk.api.services.blocking.crm.timeline.TemplateService
import com.hubspot_sdk.api.services.blocking.crm.timeline.TokenService
import java.util.function.Consumer

interface TimelineService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineService

    fun events(): EventService

    fun templates(): TemplateService

    fun tokens(): TokenService

    /** A view of [TimelineService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun templates(): TemplateService.WithRawResponse

        fun tokens(): TokenService.WithRawResponse
    }
}
