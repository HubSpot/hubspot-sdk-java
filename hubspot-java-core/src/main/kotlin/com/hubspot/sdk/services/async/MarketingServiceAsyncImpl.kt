// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.marketing.CampaignServiceAsync
import com.hubspot.sdk.services.async.marketing.CampaignServiceAsyncImpl
import com.hubspot.sdk.services.async.marketing.EmailServiceAsync
import com.hubspot.sdk.services.async.marketing.EmailServiceAsyncImpl
import com.hubspot.sdk.services.async.marketing.MarketingEventServiceAsync
import com.hubspot.sdk.services.async.marketing.MarketingEventServiceAsyncImpl
import com.hubspot.sdk.services.async.marketing.SingleSendServiceAsync
import com.hubspot.sdk.services.async.marketing.SingleSendServiceAsyncImpl
import com.hubspot.sdk.services.async.marketing.TransactionalServiceAsync
import com.hubspot.sdk.services.async.marketing.TransactionalServiceAsyncImpl
import java.util.function.Consumer

class MarketingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketingServiceAsync {

    private val withRawResponse: MarketingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val campaigns: CampaignServiceAsync by lazy { CampaignServiceAsyncImpl(clientOptions) }

    private val emails: EmailServiceAsync by lazy { EmailServiceAsyncImpl(clientOptions) }

    private val marketingEvents: MarketingEventServiceAsync by lazy {
        MarketingEventServiceAsyncImpl(clientOptions)
    }

    private val singleSend: SingleSendServiceAsync by lazy {
        SingleSendServiceAsyncImpl(clientOptions)
    }

    private val transactional: TransactionalServiceAsync by lazy {
        TransactionalServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MarketingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingServiceAsync =
        MarketingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun campaigns(): CampaignServiceAsync = campaigns

    override fun emails(): EmailServiceAsync = emails

    override fun marketingEvents(): MarketingEventServiceAsync = marketingEvents

    override fun singleSend(): SingleSendServiceAsync = singleSend

    override fun transactional(): TransactionalServiceAsync = transactional

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingServiceAsync.WithRawResponse {

        private val campaigns: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailServiceAsync.WithRawResponse by lazy {
            EmailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketingEvents: MarketingEventServiceAsync.WithRawResponse by lazy {
            MarketingEventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val singleSend: SingleSendServiceAsync.WithRawResponse by lazy {
            SingleSendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactional: TransactionalServiceAsync.WithRawResponse by lazy {
            TransactionalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingServiceAsync.WithRawResponse =
            MarketingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun campaigns(): CampaignServiceAsync.WithRawResponse = campaigns

        override fun emails(): EmailServiceAsync.WithRawResponse = emails

        override fun marketingEvents(): MarketingEventServiceAsync.WithRawResponse = marketingEvents

        override fun singleSend(): SingleSendServiceAsync.WithRawResponse = singleSend

        override fun transactional(): TransactionalServiceAsync.WithRawResponse = transactional
    }
}
