// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageService
import com.hubspot_sdk.api.services.blocking.cms.pages.LandingPageServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.pages.SitePageService
import com.hubspot_sdk.api.services.blocking.cms.pages.SitePageServiceImpl
import java.util.function.Consumer

class PageServiceImpl internal constructor(private val clientOptions: ClientOptions) : PageService {

    private val withRawResponse: PageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val landingPages: LandingPageService by lazy { LandingPageServiceImpl(clientOptions) }

    private val sitePages: SitePageService by lazy { SitePageServiceImpl(clientOptions) }

    override fun withRawResponse(): PageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService =
        PageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun landingPages(): LandingPageService = landingPages

    override fun sitePages(): SitePageService = sitePages

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PageService.WithRawResponse {

        private val landingPages: LandingPageService.WithRawResponse by lazy {
            LandingPageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sitePages: SitePageService.WithRawResponse by lazy {
            SitePageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PageService.WithRawResponse =
            PageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun landingPages(): LandingPageService.WithRawResponse = landingPages

        override fun sitePages(): SitePageService.WithRawResponse = sitePages
    }
}
