// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.conversations.CustomChannelServiceAsync
import com.hubspot.services.async.conversations.CustomChannelServiceAsyncImpl
import com.hubspot.services.async.conversations.VisitorIdentificationServiceAsync
import com.hubspot.services.async.conversations.VisitorIdentificationServiceAsyncImpl
import java.util.function.Consumer

class ConversationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationServiceAsync {

    private val withRawResponse: ConversationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customChannels: CustomChannelServiceAsync by lazy {
        CustomChannelServiceAsyncImpl(clientOptions)
    }

    private val visitorIdentification: VisitorIdentificationServiceAsync by lazy {
        VisitorIdentificationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync =
        ConversationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customChannels(): CustomChannelServiceAsync = customChannels

    override fun visitorIdentification(): VisitorIdentificationServiceAsync = visitorIdentification

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationServiceAsync.WithRawResponse {

        private val customChannels: CustomChannelServiceAsync.WithRawResponse by lazy {
            CustomChannelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun customChannels(): CustomChannelServiceAsync.WithRawResponse = customChannels

        override fun visitorIdentification(): VisitorIdentificationServiceAsync.WithRawResponse =
            visitorIdentification
    }
}
