// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.events.DefinitionServiceAsync
import com.hubspot_sdk.api.services.async.events.DefinitionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.events.OccurrenceServiceAsync
import com.hubspot_sdk.api.services.async.events.OccurrenceServiceAsyncImpl
import com.hubspot_sdk.api.services.async.events.SendServiceAsync
import com.hubspot_sdk.api.services.async.events.SendServiceAsyncImpl
import java.util.function.Consumer

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val definitions: DefinitionServiceAsync by lazy {
        DefinitionServiceAsyncImpl(clientOptions)
    }

    private val occurrences: OccurrenceServiceAsync by lazy {
        OccurrenceServiceAsyncImpl(clientOptions)
    }

    private val send: SendServiceAsync by lazy { SendServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync =
        EventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun definitions(): DefinitionServiceAsync = definitions

    override fun occurrences(): OccurrenceServiceAsync = occurrences

    override fun send(): SendServiceAsync = send

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val definitions: DefinitionServiceAsync.WithRawResponse by lazy {
            DefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val occurrences: OccurrenceServiceAsync.WithRawResponse by lazy {
            OccurrenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val send: SendServiceAsync.WithRawResponse by lazy {
            SendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse =
            EventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun definitions(): DefinitionServiceAsync.WithRawResponse = definitions

        override fun occurrences(): OccurrenceServiceAsync.WithRawResponse = occurrences

        override fun send(): SendServiceAsync.WithRawResponse = send
    }
}
