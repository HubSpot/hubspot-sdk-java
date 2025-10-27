// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.timeline.EventService
import com.hubspot_sdk.api.services.blocking.crm.timeline.EventServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.timeline.TemplateService
import com.hubspot_sdk.api.services.blocking.crm.timeline.TemplateServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.timeline.TokenService
import com.hubspot_sdk.api.services.blocking.crm.timeline.TokenServiceImpl
import java.util.function.Consumer

class TimelineServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TimelineService {

    private val withRawResponse: TimelineService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val templates: TemplateService by lazy { TemplateServiceImpl(clientOptions) }

    private val tokens: TokenService by lazy { TokenServiceImpl(clientOptions) }

    override fun withRawResponse(): TimelineService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TimelineService =
        TimelineServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventService = events

    override fun templates(): TemplateService = templates

    override fun tokens(): TokenService = tokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TimelineService.WithRawResponse {

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokens: TokenService.WithRawResponse by lazy {
            TokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TimelineService.WithRawResponse =
            TimelineServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventService.WithRawResponse = events

        override fun templates(): TemplateService.WithRawResponse = templates

        override fun tokens(): TokenService.WithRawResponse = tokens
    }
}
