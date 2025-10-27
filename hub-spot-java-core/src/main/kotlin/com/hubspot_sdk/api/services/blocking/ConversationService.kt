// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.conversations.ActorService
import com.hubspot_sdk.api.services.blocking.conversations.ChannelAccountService
import com.hubspot_sdk.api.services.blocking.conversations.ChannelService
import com.hubspot_sdk.api.services.blocking.conversations.CustomChannelService
import com.hubspot_sdk.api.services.blocking.conversations.InboxService
import com.hubspot_sdk.api.services.blocking.conversations.MessageService
import com.hubspot_sdk.api.services.blocking.conversations.ThreadService
import com.hubspot_sdk.api.services.blocking.conversations.VisitorIdentificationService
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

    fun actors(): ActorService

    fun channelAccounts(): ChannelAccountService

    fun channels(): ChannelService

    fun customChannels(): CustomChannelService

    fun inboxes(): InboxService

    fun messages(): MessageService

    fun threads(): ThreadService

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

        fun actors(): ActorService.WithRawResponse

        fun channelAccounts(): ChannelAccountService.WithRawResponse

        fun channels(): ChannelService.WithRawResponse

        fun customChannels(): CustomChannelService.WithRawResponse

        fun inboxes(): InboxService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        fun threads(): ThreadService.WithRawResponse

        fun visitorIdentification(): VisitorIdentificationService.WithRawResponse
    }
}
