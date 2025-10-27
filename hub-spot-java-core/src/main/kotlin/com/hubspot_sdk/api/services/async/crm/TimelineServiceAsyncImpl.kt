// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.timeline.EventServiceAsync
import com.hubspot_sdk.api.services.async.crm.timeline.EventServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.timeline.TemplateServiceAsync
import com.hubspot_sdk.api.services.async.crm.timeline.TemplateServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.timeline.TokenServiceAsync
import com.hubspot_sdk.api.services.async.crm.timeline.TokenServiceAsyncImpl
import java.util.function.Consumer

class TimelineServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TimelineServiceAsync {

    private val withRawResponse: TimelineServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val templates: TemplateServiceAsync by lazy { TemplateServiceAsyncImpl(clientOptions) }

    private val tokens: TokenServiceAsync by lazy { TokenServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TimelineServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineServiceAsync =
        TimelineServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventServiceAsync = events

    override fun templates(): TemplateServiceAsync = templates

    override fun tokens(): TokenServiceAsync = tokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TimelineServiceAsync.WithRawResponse {

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokens: TokenServiceAsync.WithRawResponse by lazy {
            TokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TimelineServiceAsync.WithRawResponse =
            TimelineServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun templates(): TemplateServiceAsync.WithRawResponse = templates

        override fun tokens(): TokenServiceAsync.WithRawResponse = tokens
    }
}
