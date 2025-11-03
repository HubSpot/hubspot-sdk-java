// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.extensions.CallingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.CallingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.extensions.CardServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.CardServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.extensions.VideoConferencingServiceAsync
import com.hubspot_sdk.api.services.async.crm.extensions.VideoConferencingServiceAsyncImpl
import java.util.function.Consumer

class ExtensionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtensionServiceAsync {

    private val withRawResponse: ExtensionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calling: CallingServiceAsync by lazy { CallingServiceAsyncImpl(clientOptions) }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    private val videoConferencing: VideoConferencingServiceAsync by lazy {
        VideoConferencingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ExtensionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionServiceAsync =
        ExtensionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calling(): CallingServiceAsync = calling

    override fun cards(): CardServiceAsync = cards

    override fun videoConferencing(): VideoConferencingServiceAsync = videoConferencing

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtensionServiceAsync.WithRawResponse {

        private val calling: CallingServiceAsync.WithRawResponse by lazy {
            CallingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardServiceAsync.WithRawResponse by lazy {
            CardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val videoConferencing: VideoConferencingServiceAsync.WithRawResponse by lazy {
            VideoConferencingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtensionServiceAsync.WithRawResponse =
            ExtensionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calling(): CallingServiceAsync.WithRawResponse = calling

        override fun cards(): CardServiceAsync.WithRawResponse = cards

        override fun videoConferencing(): VideoConferencingServiceAsync.WithRawResponse =
            videoConferencing
    }
}
