// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.conversations.CustomChannelService
import com.hubspot.services.blocking.conversations.CustomChannelServiceImpl
import com.hubspot.services.blocking.conversations.VisitorIdentificationService
import com.hubspot.services.blocking.conversations.VisitorIdentificationServiceImpl
import java.util.function.Consumer

class ConversationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConversationService {

    private val withRawResponse: ConversationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val customChannels: CustomChannelService by lazy {
        CustomChannelServiceImpl(clientOptions)
    }

    private val visitorIdentification: VisitorIdentificationService by lazy {
        VisitorIdentificationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ConversationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService =
        ConversationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun customChannels(): CustomChannelService = customChannels

    override fun visitorIdentification(): VisitorIdentificationService = visitorIdentification

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConversationService.WithRawResponse {

        private val customChannels: CustomChannelService.WithRawResponse by lazy {
            CustomChannelServiceImpl.WithRawResponseImpl(clientOptions)
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

        override fun customChannels(): CustomChannelService.WithRawResponse = customChannels

        override fun visitorIdentification(): VisitorIdentificationService.WithRawResponse =
            visitorIdentification
    }
}
