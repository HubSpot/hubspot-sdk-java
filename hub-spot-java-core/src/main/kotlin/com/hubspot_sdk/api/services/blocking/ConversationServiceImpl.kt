// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.conversations.ActorService
import com.hubspot_sdk.api.services.blocking.conversations.ActorServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.ChannelAccountService
import com.hubspot_sdk.api.services.blocking.conversations.ChannelAccountServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.ChannelService
import com.hubspot_sdk.api.services.blocking.conversations.ChannelServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.CustomChannelService
import com.hubspot_sdk.api.services.blocking.conversations.CustomChannelServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.InboxService
import com.hubspot_sdk.api.services.blocking.conversations.InboxServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.MessageService
import com.hubspot_sdk.api.services.blocking.conversations.MessageServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.ThreadService
import com.hubspot_sdk.api.services.blocking.conversations.ThreadServiceImpl
import com.hubspot_sdk.api.services.blocking.conversations.VisitorIdentificationService
import com.hubspot_sdk.api.services.blocking.conversations.VisitorIdentificationServiceImpl
import java.util.function.Consumer

class ConversationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationService {

    private val withRawResponse: ConversationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actors: ActorService by lazy { ActorServiceImpl(clientOptions) }

    private val channelAccounts: ChannelAccountService by lazy {
        ChannelAccountServiceImpl(clientOptions)
    }

    private val channels: ChannelService by lazy { ChannelServiceImpl(clientOptions) }

    private val customChannels: CustomChannelService by lazy {
        CustomChannelServiceImpl(clientOptions)
    }

    private val inboxes: InboxService by lazy { InboxServiceImpl(clientOptions) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptions) }

    private val visitorIdentification: VisitorIdentificationService by lazy {
        VisitorIdentificationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService =
        ConversationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actors(): ActorService = actors

    override fun channelAccounts(): ChannelAccountService = channelAccounts

    override fun channels(): ChannelService = channels

    override fun customChannels(): CustomChannelService = customChannels

    override fun inboxes(): InboxService = inboxes

    override fun messages(): MessageService = messages

    override fun threads(): ThreadService = threads

    override fun visitorIdentification(): VisitorIdentificationService = visitorIdentification

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationService.WithRawResponse {

        private val actors: ActorService.WithRawResponse by lazy {
            ActorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val channelAccounts: ChannelAccountService.WithRawResponse by lazy {
            ChannelAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val channels: ChannelService.WithRawResponse by lazy {
            ChannelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val customChannels: CustomChannelService.WithRawResponse by lazy {
            CustomChannelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboxes: InboxService.WithRawResponse by lazy {
            InboxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadService.WithRawResponse by lazy {
            ThreadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val visitorIdentification: VisitorIdentificationService.WithRawResponse by lazy {
            VisitorIdentificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationService.WithRawResponse =
            ConversationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actors(): ActorService.WithRawResponse = actors

        override fun channelAccounts(): ChannelAccountService.WithRawResponse = channelAccounts

        override fun channels(): ChannelService.WithRawResponse = channels

        override fun customChannels(): CustomChannelService.WithRawResponse = customChannels

        override fun inboxes(): InboxService.WithRawResponse = inboxes

        override fun messages(): MessageService.WithRawResponse = messages

        override fun threads(): ThreadService.WithRawResponse = threads

        override fun visitorIdentification(): VisitorIdentificationService.WithRawResponse =
            visitorIdentification
    }
}
