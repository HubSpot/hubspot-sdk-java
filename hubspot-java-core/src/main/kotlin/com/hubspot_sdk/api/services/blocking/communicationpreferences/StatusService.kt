// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.communicationpreferences

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.communicationpreferences.statuses.BatchService
import java.util.function.Consumer

interface StatusService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService

    fun batch(): BatchService

    /** A view of [StatusService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService.WithRawResponse

        fun batch(): BatchService.WithRawResponse
    }
}
