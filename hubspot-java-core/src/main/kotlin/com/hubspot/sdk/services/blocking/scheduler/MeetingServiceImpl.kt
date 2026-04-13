// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.scheduler

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.scheduler.meetings.AdvancedService
import com.hubspot.sdk.services.blocking.scheduler.meetings.AdvancedServiceImpl
import com.hubspot.sdk.services.blocking.scheduler.meetings.BasicService
import com.hubspot.sdk.services.blocking.scheduler.meetings.BasicServiceImpl
import java.util.function.Consumer

class MeetingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingService {

    private val withRawResponse: MeetingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val advanced: AdvancedService by lazy { AdvancedServiceImpl(clientOptions) }

    private val basic: BasicService by lazy { BasicServiceImpl(clientOptions) }

    override fun withRawResponse(): MeetingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService =
        MeetingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun advanced(): AdvancedService = advanced

    override fun basic(): BasicService = basic

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingService.WithRawResponse {

        private val advanced: AdvancedService.WithRawResponse by lazy {
            AdvancedServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val basic: BasicService.WithRawResponse by lazy {
            BasicServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingService.WithRawResponse =
            MeetingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun advanced(): AdvancedService.WithRawResponse = advanced

        override fun basic(): BasicService.WithRawResponse = basic
    }
}
