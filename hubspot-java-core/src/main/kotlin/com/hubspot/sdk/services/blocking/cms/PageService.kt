// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.cms.pages.LandingPageService
import com.hubspot.sdk.services.blocking.cms.pages.SitePageService
import java.util.function.Consumer

interface PageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService

    fun landingPages(): LandingPageService

    fun sitePages(): SitePageService

    /** A view of [PageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageService.WithRawResponse

        fun landingPages(): LandingPageService.WithRawResponse

        fun sitePages(): SitePageService.WithRawResponse
    }
}
