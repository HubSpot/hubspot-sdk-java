// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.cms.hubdb.RowService
import com.hubspot.sdk.services.blocking.cms.hubdb.TableService
import java.util.function.Consumer

interface HubdbService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubdbService

    fun rows(): RowService

    fun tables(): TableService

    /** A view of [HubdbService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubdbService.WithRawResponse

        fun rows(): RowService.WithRawResponse

        fun tables(): TableService.WithRawResponse
    }
}
