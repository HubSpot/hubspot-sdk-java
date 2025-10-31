// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.scheduler

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.CalendarService
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.CalendarServiceImpl
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.MeetingsLinkService
import com.hubspot_sdk.api.services.blocking.scheduler.meetings.MeetingsLinkServiceImpl
import java.util.function.Consumer

class MeetingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingService {

    private val withRawResponse: MeetingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calendar: CalendarService by lazy { CalendarServiceImpl(clientOptions) }

    private val meetingsLinks: MeetingsLinkService by lazy {
        MeetingsLinkServiceImpl(clientOptions)
    }

    override fun withRawResponse(): MeetingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService =
        MeetingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calendar(): CalendarService = calendar

    override fun meetingsLinks(): MeetingsLinkService = meetingsLinks

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingService.WithRawResponse {

        private val calendar: CalendarService.WithRawResponse by lazy {
            CalendarServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val meetingsLinks: MeetingsLinkService.WithRawResponse by lazy {
            MeetingsLinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingService.WithRawResponse =
            MeetingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calendar(): CalendarService.WithRawResponse = calendar

        override fun meetingsLinks(): MeetingsLinkService.WithRawResponse = meetingsLinks
    }
}
