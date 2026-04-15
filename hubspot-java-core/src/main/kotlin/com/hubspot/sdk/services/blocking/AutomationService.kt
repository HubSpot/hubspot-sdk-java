// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.automation.ActionService
import com.hubspot.sdk.services.blocking.automation.SequenceService
import java.util.function.Consumer

interface AutomationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationService

    fun actions(): ActionService

    fun sequences(): SequenceService

    /** A view of [AutomationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        fun sequences(): SequenceService.WithRawResponse
    }
}
