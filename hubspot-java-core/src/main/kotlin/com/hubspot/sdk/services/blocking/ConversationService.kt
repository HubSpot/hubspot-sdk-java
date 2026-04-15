// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.conversations.CustomChannelService
import com.hubspot.sdk.services.blocking.conversations.VisitorIdentificationService
import java.util.function.Consumer

interface ConversationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService

    fun customChannels(): CustomChannelService

    fun visitorIdentification(): VisitorIdentificationService

    /**
     * A view of [ConversationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationService.WithRawResponse

        fun customChannels(): CustomChannelService.WithRawResponse

        fun visitorIdentification(): VisitorIdentificationService.WithRawResponse
    }
}
