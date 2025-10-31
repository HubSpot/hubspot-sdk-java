// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.cms.pages.LandingPageServiceAsync
import com.hubspot_sdk.api.services.async.cms.pages.SitePageServiceAsync
import java.util.function.Consumer

interface PageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync

    fun landingPages(): LandingPageServiceAsync

    fun sitePages(): SitePageServiceAsync

    /** A view of [PageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PageServiceAsync.WithRawResponse

        fun landingPages(): LandingPageServiceAsync.WithRawResponse

        fun sitePages(): SitePageServiceAsync.WithRawResponse
    }
}
