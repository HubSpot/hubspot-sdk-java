// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.marketing.CampaignServiceAsync
import com.hubspot_sdk.api.services.async.marketing.CampaignServiceAsyncImpl
import java.util.function.Consumer

class MarketingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketingServiceAsync {

    private val withRawResponse: MarketingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val campaigns: CampaignServiceAsync by lazy { CampaignServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MarketingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingServiceAsync =
        MarketingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun campaigns(): CampaignServiceAsync = campaigns

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketingServiceAsync.WithRawResponse {

        private val campaigns: CampaignServiceAsync.WithRawResponse by lazy {
            CampaignServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingServiceAsync.WithRawResponse =
            MarketingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun campaigns(): CampaignServiceAsync.WithRawResponse = campaigns
    }
}
