// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.cms.pages.LandingPageServiceAsync
import com.hubspot.sdk.services.async.cms.pages.LandingPageServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.pages.SitePageServiceAsync
import com.hubspot.sdk.services.async.cms.pages.SitePageServiceAsyncImpl
import java.util.function.Consumer

class PageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PageServiceAsync {

    private val withRawResponse: PageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val landingPages: LandingPageServiceAsync by lazy {
        LandingPageServiceAsyncImpl(clientOptions)
    }

    private val sitePages: SitePageServiceAsync by lazy { SitePageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync =
        PageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun landingPages(): LandingPageServiceAsync = landingPages

    override fun sitePages(): SitePageServiceAsync = sitePages

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PageServiceAsync.WithRawResponse {

        private val landingPages: LandingPageServiceAsync.WithRawResponse by lazy {
            LandingPageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sitePages: SitePageServiceAsync.WithRawResponse by lazy {
            SitePageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PageServiceAsync.WithRawResponse =
            PageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun landingPages(): LandingPageServiceAsync.WithRawResponse = landingPages

        override fun sitePages(): SitePageServiceAsync.WithRawResponse = sitePages
    }
}
