// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.communicationpreferences

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.communicationpreferences.statuses.BatchServiceAsync
import java.util.function.Consumer

interface StatusServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * A view of [StatusServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse
    }
}
