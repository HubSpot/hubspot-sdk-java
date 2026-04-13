// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.scheduler.MeetingServiceAsync
import com.hubspot.sdk.services.async.scheduler.MeetingServiceAsyncImpl
import java.util.function.Consumer

class SchedulerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SchedulerServiceAsync {

    private val withRawResponse: SchedulerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val meetings: MeetingServiceAsync by lazy { MeetingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SchedulerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchedulerServiceAsync =
        SchedulerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun meetings(): MeetingServiceAsync = meetings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SchedulerServiceAsync.WithRawResponse {

        private val meetings: MeetingServiceAsync.WithRawResponse by lazy {
            MeetingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchedulerServiceAsync.WithRawResponse =
            SchedulerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun meetings(): MeetingServiceAsync.WithRawResponse = meetings
    }
}
