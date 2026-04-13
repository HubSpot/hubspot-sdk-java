// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.marketing.CampaignServiceAsync
import com.hubspot.sdk.services.async.marketing.EmailServiceAsync
import com.hubspot.sdk.services.async.marketing.MarketingEventServiceAsync
import com.hubspot.sdk.services.async.marketing.SingleSendServiceAsync
import com.hubspot.sdk.services.async.marketing.TransactionalServiceAsync
import java.util.function.Consumer

interface MarketingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingServiceAsync

    fun campaigns(): CampaignServiceAsync

    fun emails(): EmailServiceAsync

    fun marketingEvents(): MarketingEventServiceAsync

    fun singleSend(): SingleSendServiceAsync

    fun transactional(): TransactionalServiceAsync

    /**
     * A view of [MarketingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketingServiceAsync.WithRawResponse

        fun campaigns(): CampaignServiceAsync.WithRawResponse

        fun emails(): EmailServiceAsync.WithRawResponse

        fun marketingEvents(): MarketingEventServiceAsync.WithRawResponse

        fun singleSend(): SingleSendServiceAsync.WithRawResponse

        fun transactional(): TransactionalServiceAsync.WithRawResponse
    }
}
