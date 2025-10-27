// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.scheduler

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.scheduler.meetings.CalendarServiceAsync
import com.hubspot_sdk.api.services.async.scheduler.meetings.CalendarServiceAsyncImpl
import com.hubspot_sdk.api.services.async.scheduler.meetings.MeetingsLinkServiceAsync
import com.hubspot_sdk.api.services.async.scheduler.meetings.MeetingsLinkServiceAsyncImpl
import java.util.function.Consumer

class MeetingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingServiceAsync {

    private val withRawResponse: MeetingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calendar: CalendarServiceAsync by lazy { CalendarServiceAsyncImpl(clientOptions) }

    private val meetingsLinks: MeetingsLinkServiceAsync by lazy {
        MeetingsLinkServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MeetingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingServiceAsync =
        MeetingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calendar(): CalendarServiceAsync = calendar

    override fun meetingsLinks(): MeetingsLinkServiceAsync = meetingsLinks

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingServiceAsync.WithRawResponse {

        private val calendar: CalendarServiceAsync.WithRawResponse by lazy {
            CalendarServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val meetingsLinks: MeetingsLinkServiceAsync.WithRawResponse by lazy {
            MeetingsLinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingServiceAsync.WithRawResponse =
            MeetingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calendar(): CalendarServiceAsync.WithRawResponse = calendar

        override fun meetingsLinks(): MeetingsLinkServiceAsync.WithRawResponse = meetingsLinks
    }
}
