// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.marketing.CampaignServiceAsync
import com.hubspot_sdk.api.services.async.marketing.EmailServiceAsync
import com.hubspot_sdk.api.services.async.marketing.EventServiceAsync
import com.hubspot_sdk.api.services.async.marketing.FormServiceAsync
import com.hubspot_sdk.api.services.async.marketing.SingleSendServiceAsync
import com.hubspot_sdk.api.services.async.marketing.SubscriptionServiceAsync
import com.hubspot_sdk.api.services.async.marketing.TransactionalServiceAsync
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

    fun events(): EventServiceAsync

    fun forms(): FormServiceAsync

    fun singleSend(): SingleSendServiceAsync

    fun subscriptions(): SubscriptionServiceAsync

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

        fun events(): EventServiceAsync.WithRawResponse

        fun forms(): FormServiceAsync.WithRawResponse

        fun singleSend(): SingleSendServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        fun transactional(): TransactionalServiceAsync.WithRawResponse
    }
}
