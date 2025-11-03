// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.extensions.CallingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.CallingServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.extensions.CardService
import com.hubspot_sdk.api.services.blocking.crm.extensions.CardServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.extensions.VideoConferencingService
import com.hubspot_sdk.api.services.blocking.crm.extensions.VideoConferencingServiceImpl
import java.util.function.Consumer

class ExtensionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtensionService {

    private val withRawResponse: ExtensionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calling: CallingService by lazy { CallingServiceImpl(clientOptions) }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val videoConferencing: VideoConferencingService by lazy {
        VideoConferencingServiceImpl(clientOptions)
    }

    override fun withRawResponse(): ExtensionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionService =
        ExtensionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calling(): CallingService = calling

    override fun cards(): CardService = cards

    override fun videoConferencing(): VideoConferencingService = videoConferencing

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtensionService.WithRawResponse {

        private val calling: CallingService.WithRawResponse by lazy {
            CallingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardService.WithRawResponse by lazy {
            CardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val videoConferencing: VideoConferencingService.WithRawResponse by lazy {
            VideoConferencingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtensionService.WithRawResponse =
            ExtensionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calling(): CallingService.WithRawResponse = calling

        override fun cards(): CardService.WithRawResponse = cards

        override fun videoConferencing(): VideoConferencingService.WithRawResponse =
            videoConferencing
    }
}
