// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import java.util.function.Consumer

interface V4Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service

    fun batch(): BatchService

    fun report(): ReportService

    /** A view of [V4Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun report(): ReportService.WithRawResponse
    }
}
