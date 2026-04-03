// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.marketing.CampaignService
import com.hubspot_sdk.api.services.blocking.marketing.CampaignServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.EmailService
import com.hubspot_sdk.api.services.blocking.marketing.EmailServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.MarketingEventService
import com.hubspot_sdk.api.services.blocking.marketing.MarketingEventServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.SingleSendService
import com.hubspot_sdk.api.services.blocking.marketing.SingleSendServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.TransactionalService
import com.hubspot_sdk.api.services.blocking.marketing.TransactionalServiceImpl
import java.util.function.Consumer

class MarketingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketingService {

    private val withRawResponse: MarketingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val campaigns: CampaignService by lazy { CampaignServiceImpl(clientOptions) }

    private val emails: EmailService by lazy { EmailServiceImpl(clientOptions) }

    private val marketingEvents: MarketingEventService by lazy {
        MarketingEventServiceImpl(clientOptions)
    }

    private val singleSend: SingleSendService by lazy { SingleSendServiceImpl(clientOptions) }

    private val transactional: TransactionalService by lazy {
        TransactionalServiceImpl(clientOptions)
    }

    override fun withRawResponse(): MarketingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingService =
        MarketingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun campaigns(): CampaignService = campaigns

    override fun emails(): EmailService = emails

    override fun marketingEvents(): MarketingEventService = marketingEvents

    override fun singleSend(): SingleSendService = singleSend

    override fun transactional(): TransactionalService = transactional

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingService.WithRawResponse {

        private val campaigns: CampaignService.WithRawResponse by lazy {
            CampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailService.WithRawResponse by lazy {
            EmailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketingEvents: MarketingEventService.WithRawResponse by lazy {
            MarketingEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val singleSend: SingleSendService.WithRawResponse by lazy {
            SingleSendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactional: TransactionalService.WithRawResponse by lazy {
            TransactionalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingService.WithRawResponse =
            MarketingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun campaigns(): CampaignService.WithRawResponse = campaigns

        override fun emails(): EmailService.WithRawResponse = emails

        override fun marketingEvents(): MarketingEventService.WithRawResponse = marketingEvents

        override fun singleSend(): SingleSendService.WithRawResponse = singleSend

        override fun transactional(): TransactionalService.WithRawResponse = transactional
    }
}
