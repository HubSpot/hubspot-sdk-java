// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.marketing.CampaignService
import com.hubspot.sdk.services.blocking.marketing.EmailService
import com.hubspot.sdk.services.blocking.marketing.MarketingEventService
import com.hubspot.sdk.services.blocking.marketing.SingleSendService
import com.hubspot.sdk.services.blocking.marketing.TransactionalService
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

    fun marketingEvents(): MarketingEventService

    fun singleSend(): SingleSendService

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

        fun marketingEvents(): MarketingEventService.WithRawResponse

        fun singleSend(): SingleSendService.WithRawResponse

        fun transactional(): TransactionalService.WithRawResponse
    }
}
