// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.marketing.CampaignService
import com.hubspot_sdk.api.services.blocking.marketing.CampaignServiceImpl
import java.util.function.Consumer

class MarketingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketingService {

    private val withRawResponse: MarketingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val campaigns: CampaignService by lazy { CampaignServiceImpl(clientOptions) }

    override fun withRawResponse(): MarketingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingService =
        MarketingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun campaigns(): CampaignService = campaigns

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingService.WithRawResponse {

        private val campaigns: CampaignService.WithRawResponse by lazy {
            CampaignServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingService.WithRawResponse =
            MarketingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun campaigns(): CampaignService.WithRawResponse = campaigns
    }
}
