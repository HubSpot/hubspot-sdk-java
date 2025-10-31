// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.marketing.CampaignServiceAsync
import com.hubspot_sdk.api.services.async.marketing.CampaignServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.EmailServiceAsync
import com.hubspot_sdk.api.services.async.marketing.EmailServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.EventServiceAsync
import com.hubspot_sdk.api.services.async.marketing.EventServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.FormServiceAsync
import com.hubspot_sdk.api.services.async.marketing.FormServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.SingleSendServiceAsync
import com.hubspot_sdk.api.services.async.marketing.SingleSendServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.SubscriptionServiceAsync
import com.hubspot_sdk.api.services.async.marketing.SubscriptionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.TransactionalServiceAsync
import com.hubspot_sdk.api.services.async.marketing.TransactionalServiceAsyncImpl
import java.util.function.Consumer

class MarketingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketingServiceAsync {

    private val withRawResponse: MarketingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val campaigns: CampaignServiceAsync by lazy { CampaignServiceAsyncImpl(clientOptions) }

    private val emails: EmailServiceAsync by lazy { EmailServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val forms: FormServiceAsync by lazy { FormServiceAsyncImpl(clientOptions) }

    private val singleSend: SingleSendServiceAsync by lazy {
        SingleSendServiceAsyncImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    private val transactional: TransactionalServiceAsync by lazy {
        TransactionalServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): MarketingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingServiceAsync =
        MarketingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun campaigns(): CampaignServiceAsync = campaigns

    override fun emails(): EmailServiceAsync = emails

    override fun events(): EventServiceAsync = events

    override fun forms(): FormServiceAsync = forms

    override fun singleSend(): SingleSendServiceAsync = singleSend

    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    override fun transactional(): TransactionalServiceAsync = transactional

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingServiceAsync.WithRawResponse {

        private val campaigns: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailServiceAsync.WithRawResponse by lazy {
            EmailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val forms: FormServiceAsync.WithRawResponse by lazy {
            FormServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val singleSend: SingleSendServiceAsync.WithRawResponse by lazy {
            SingleSendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun forms(): FormServiceAsync.WithRawResponse = forms

        override fun singleSend(): SingleSendServiceAsync.WithRawResponse = singleSend

        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions

        override fun transactional(): TransactionalServiceAsync.WithRawResponse = transactional
    }
}
