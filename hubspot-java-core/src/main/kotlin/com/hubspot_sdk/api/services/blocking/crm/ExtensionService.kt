// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.CallingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.CardsDevService
import com.hubspot_sdk.api.services.blocking.crm.extensions.VideoConferencingService
import java.util.function.Consumer

interface ExtensionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionService

    fun calling(): CallingService

    fun cardsDev(): CardsDevService

    fun videoConferencing(): VideoConferencingService

    /** A view of [ExtensionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionService.WithRawResponse

        fun calling(): CallingService.WithRawResponse

        fun cardsDev(): CardsDevService.WithRawResponse

        fun videoConferencing(): VideoConferencingService.WithRawResponse
    }
}
