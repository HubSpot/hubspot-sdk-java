// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.events.DefinitionService
import com.hubspot_sdk.api.services.blocking.events.DefinitionServiceImpl
import com.hubspot_sdk.api.services.blocking.events.OccurrenceService
import com.hubspot_sdk.api.services.blocking.events.OccurrenceServiceImpl
import com.hubspot_sdk.api.services.blocking.events.SendService
import com.hubspot_sdk.api.services.blocking.events.SendServiceImpl
import java.util.function.Consumer

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val definitions: DefinitionService by lazy { DefinitionServiceImpl(clientOptions) }

    private val occurrences: OccurrenceService by lazy { OccurrenceServiceImpl(clientOptions) }

    private val send: SendService by lazy { SendServiceImpl(clientOptions) }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun definitions(): DefinitionService = definitions

    override fun occurrences(): OccurrenceService = occurrences

    override fun send(): SendService = send

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val definitions: DefinitionService.WithRawResponse by lazy {
            DefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val occurrences: OccurrenceService.WithRawResponse by lazy {
            OccurrenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val send: SendService.WithRawResponse by lazy {
            SendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventService.WithRawResponse =
            EventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun definitions(): DefinitionService.WithRawResponse = definitions

        override fun occurrences(): OccurrenceService.WithRawResponse = occurrences

        override fun send(): SendService.WithRawResponse = send
    }
}
