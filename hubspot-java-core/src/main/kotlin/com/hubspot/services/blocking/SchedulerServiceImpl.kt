// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.scheduler.MeetingService
import com.hubspot.services.blocking.scheduler.MeetingServiceImpl
import java.util.function.Consumer

class SchedulerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SchedulerService {

    private val withRawResponse: SchedulerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val meetings: MeetingService by lazy { MeetingServiceImpl(clientOptions) }

    override fun withRawResponse(): SchedulerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SchedulerService =
        SchedulerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun meetings(): MeetingService = meetings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SchedulerService.WithRawResponse {

        private val meetings: MeetingService.WithRawResponse by lazy {
            MeetingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SchedulerService.WithRawResponse =
            SchedulerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun meetings(): MeetingService.WithRawResponse = meetings
    }
}
