// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.crm.extensions.CallingServiceAsync
import com.hubspot.services.async.crm.extensions.CallingServiceAsyncImpl
import com.hubspot.services.async.crm.extensions.CardsDevServiceAsync
import com.hubspot.services.async.crm.extensions.CardsDevServiceAsyncImpl
import com.hubspot.services.async.crm.extensions.VideoConferencingServiceAsync
import com.hubspot.services.async.crm.extensions.VideoConferencingServiceAsyncImpl
import java.util.function.Consumer

class ExtensionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtensionServiceAsync {

    private val withRawResponse: ExtensionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calling: CallingServiceAsync by lazy { CallingServiceAsyncImpl(clientOptions) }

    private val cardsDev: CardsDevServiceAsync by lazy { CardsDevServiceAsyncImpl(clientOptions) }

    private val videoConferencing: VideoConferencingServiceAsync by lazy {
        VideoConferencingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ExtensionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionServiceAsync =
        ExtensionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calling(): CallingServiceAsync = calling

    override fun cardsDev(): CardsDevServiceAsync = cardsDev

    override fun videoConferencing(): VideoConferencingServiceAsync = videoConferencing

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtensionServiceAsync.WithRawResponse {

        private val calling: CallingServiceAsync.WithRawResponse by lazy {
            CallingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardsDev: CardsDevServiceAsync.WithRawResponse by lazy {
            CardsDevServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun cardsDev(): CardsDevServiceAsync.WithRawResponse = cardsDev

        override fun videoConferencing(): VideoConferencingServiceAsync.WithRawResponse =
            videoConferencing
    }
}
