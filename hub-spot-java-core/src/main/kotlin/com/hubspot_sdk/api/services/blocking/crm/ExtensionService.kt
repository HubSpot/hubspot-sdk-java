// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.CallingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.CardService
import com.hubspot_sdk.api.services.blocking.crm.extensions.VideoConferencingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.VideoconferencingService
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

    fun cards(): CardService

    fun videoConferencing(): VideoConferencingService

    fun videoconferencing(): VideoconferencingService

    /** A view of [ExtensionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionService.WithRawResponse

        fun calling(): CallingService.WithRawResponse

        fun cards(): CardService.WithRawResponse

        fun videoConferencing(): VideoConferencingService.WithRawResponse

        fun videoconferencing(): VideoconferencingService.WithRawResponse
    }
}
