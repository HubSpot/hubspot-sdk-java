// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.scheduler

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.scheduler.meetings.AdvancedServiceAsync
import com.hubspot.sdk.services.async.scheduler.meetings.AdvancedServiceAsyncImpl
import com.hubspot.sdk.services.async.scheduler.meetings.BasicServiceAsync
import com.hubspot.sdk.services.async.scheduler.meetings.BasicServiceAsyncImpl
import java.util.function.Consumer

class MeetingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingServiceAsync {

    private val withRawResponse: MeetingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val advanced: AdvancedServiceAsync by lazy { AdvancedServiceAsyncImpl(clientOptions) }

    private val basic: BasicServiceAsync by lazy { BasicServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MeetingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingServiceAsync =
        MeetingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun advanced(): AdvancedServiceAsync = advanced

    override fun basic(): BasicServiceAsync = basic

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingServiceAsync.WithRawResponse {

        private val advanced: AdvancedServiceAsync.WithRawResponse by lazy {
            AdvancedServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val basic: BasicServiceAsync.WithRawResponse by lazy {
            BasicServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingServiceAsync.WithRawResponse =
            MeetingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun advanced(): AdvancedServiceAsync.WithRawResponse = advanced

        override fun basic(): BasicServiceAsync.WithRawResponse = basic
    }
}
