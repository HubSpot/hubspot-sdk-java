// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.conversations.ActorServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ActorServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.ChannelAccountServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ChannelAccountServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.ChannelServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ChannelServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.CustomChannelServiceAsync
import com.hubspot_sdk.api.services.async.conversations.CustomChannelServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.InboxServiceAsync
import com.hubspot_sdk.api.services.async.conversations.InboxServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.MessageServiceAsync
import com.hubspot_sdk.api.services.async.conversations.MessageServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.ThreadServiceAsync
import com.hubspot_sdk.api.services.async.conversations.ThreadServiceAsyncImpl
import com.hubspot_sdk.api.services.async.conversations.VisitorIdentificationServiceAsync
import com.hubspot_sdk.api.services.async.conversations.VisitorIdentificationServiceAsyncImpl
import java.util.function.Consumer

class ConversationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationServiceAsync {

    private val withRawResponse: ConversationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actors: ActorServiceAsync by lazy { ActorServiceAsyncImpl(clientOptions) }

    private val channelAccounts: ChannelAccountServiceAsync by lazy {
        ChannelAccountServiceAsyncImpl(clientOptions)
    }

    private val channels: ChannelServiceAsync by lazy { ChannelServiceAsyncImpl(clientOptions) }

    private val customChannels: CustomChannelServiceAsync by lazy {
        CustomChannelServiceAsyncImpl(clientOptions)
    }

    private val inboxes: InboxServiceAsync by lazy { InboxServiceAsyncImpl(clientOptions) }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    private val threads: ThreadServiceAsync by lazy { ThreadServiceAsyncImpl(clientOptions) }

    private val visitorIdentification: VisitorIdentificationServiceAsync by lazy {
        VisitorIdentificationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync =
        ConversationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actors(): ActorServiceAsync = actors

    override fun channelAccounts(): ChannelAccountServiceAsync = channelAccounts

    override fun channels(): ChannelServiceAsync = channels

    override fun customChannels(): CustomChannelServiceAsync = customChannels

    override fun inboxes(): InboxServiceAsync = inboxes

    override fun messages(): MessageServiceAsync = messages

    override fun threads(): ThreadServiceAsync = threads

    override fun visitorIdentification(): VisitorIdentificationServiceAsync = visitorIdentification

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationServiceAsync.WithRawResponse {

        private val actors: ActorServiceAsync.WithRawResponse by lazy {
            ActorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val channelAccounts: ChannelAccountServiceAsync.WithRawResponse by lazy {
            ChannelAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val channels: ChannelServiceAsync.WithRawResponse by lazy {
            ChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val customChannels: CustomChannelServiceAsync.WithRawResponse by lazy {
            CustomChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inboxes: InboxServiceAsync.WithRawResponse by lazy {
            InboxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadServiceAsync.WithRawResponse by lazy {
            ThreadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val visitorIdentification:
            VisitorIdentificationServiceAsync.WithRawResponse by lazy {
            VisitorIdentificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationServiceAsync.WithRawResponse =
            ConversationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actors(): ActorServiceAsync.WithRawResponse = actors

        override fun channelAccounts(): ChannelAccountServiceAsync.WithRawResponse = channelAccounts

        override fun channels(): ChannelServiceAsync.WithRawResponse = channels

        override fun customChannels(): CustomChannelServiceAsync.WithRawResponse = customChannels

        override fun inboxes(): InboxServiceAsync.WithRawResponse = inboxes

        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        override fun threads(): ThreadServiceAsync.WithRawResponse = threads

        override fun visitorIdentification(): VisitorIdentificationServiceAsync.WithRawResponse =
            visitorIdentification
    }
}
