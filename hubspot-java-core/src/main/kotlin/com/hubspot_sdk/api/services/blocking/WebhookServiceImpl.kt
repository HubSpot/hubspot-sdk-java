// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.webhooks.WebhookSubscriptionService
import com.hubspot_sdk.api.services.blocking.webhooks.WebhookSubscriptionServiceImpl
import java.util.function.Consumer

class WebhookServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookService {

    private val withRawResponse: WebhookService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhookSubscriptions: WebhookSubscriptionService by lazy {
        WebhookSubscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService =
        WebhookServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun webhookSubscriptions(): WebhookSubscriptionService = webhookSubscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookService.WithRawResponse {

        private val webhookSubscriptions: WebhookSubscriptionService.WithRawResponse by lazy {
            WebhookSubscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookService.WithRawResponse =
            WebhookServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun webhookSubscriptions(): WebhookSubscriptionService.WithRawResponse =
            webhookSubscriptions
    }
}
