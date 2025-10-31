// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.marketing.CampaignService
import com.hubspot_sdk.api.services.blocking.marketing.EmailService
import com.hubspot_sdk.api.services.blocking.marketing.EventService
import com.hubspot_sdk.api.services.blocking.marketing.FormService
import com.hubspot_sdk.api.services.blocking.marketing.SingleSendService
import com.hubspot_sdk.api.services.blocking.marketing.SubscriptionService
import com.hubspot_sdk.api.services.blocking.marketing.TransactionalService
import java.util.function.Consumer

interface MarketingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingService

    fun campaigns(): CampaignService

    fun emails(): EmailService

    fun events(): EventService

    fun forms(): FormService

    fun singleSend(): SingleSendService

    fun subscriptions(): SubscriptionService

    fun transactional(): TransactionalService

    /** A view of [MarketingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketingService.WithRawResponse

        fun campaigns(): CampaignService.WithRawResponse

        fun emails(): EmailService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun forms(): FormService.WithRawResponse

        fun singleSend(): SingleSendService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun transactional(): TransactionalService.WithRawResponse
    }
}
