// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.conversations.ActorServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ChannelAccountServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ChannelServiceAsync
import com.hubspot_sdk.api.services.async.conversations.CustomChannelServiceAsync
import com.hubspot_sdk.api.services.async.conversations.InboxServiceAsync
import com.hubspot_sdk.api.services.async.conversations.MessageServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ThreadServiceAsync
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

    fun actors(): ActorServiceAsync

    fun channelAccounts(): ChannelAccountServiceAsync

    fun channels(): ChannelServiceAsync

    fun customChannels(): CustomChannelServiceAsync

    fun inboxes(): InboxServiceAsync

    fun messages(): MessageServiceAsync

    fun threads(): ThreadServiceAsync

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

        fun actors(): ActorServiceAsync.WithRawResponse

        fun channelAccounts(): ChannelAccountServiceAsync.WithRawResponse

        fun channels(): ChannelServiceAsync.WithRawResponse

        fun customChannels(): CustomChannelServiceAsync.WithRawResponse

        fun inboxes(): InboxServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        fun threads(): ThreadServiceAsync.WithRawResponse

        fun visitorIdentification(): VisitorIdentificationServiceAsync.WithRawResponse
    }
}
