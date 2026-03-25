// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.conversations.CustomChannelServiceAsync
import com.hubspot_sdk.api.services.async.conversations.VisitorIdentificationServiceAsync
import java.util.function.Consumer

interface ConversationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync

    fun customChannels(): CustomChannelServiceAsync

    fun visitorIdentification(): VisitorIdentificationServiceAsync

    /**
     * A view of [ConversationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationServiceAsync.WithRawResponse

        fun customChannels(): CustomChannelServiceAsync.WithRawResponse

        fun visitorIdentification(): VisitorIdentificationServiceAsync.WithRawResponse
    }
}
