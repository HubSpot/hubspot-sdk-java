// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.webhooks.WebhookSubscriptionServiceAsync
import com.hubspot_sdk.api.services.async.webhooks.WebhookSubscriptionServiceAsyncImpl
import java.util.function.Consumer

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhookSubscriptions: WebhookSubscriptionServiceAsync by lazy {
        WebhookSubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun webhookSubscriptions(): WebhookSubscriptionServiceAsync = webhookSubscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        private val webhookSubscriptions: WebhookSubscriptionServiceAsync.WithRawResponse by lazy {
            WebhookSubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun webhookSubscriptions(): WebhookSubscriptionServiceAsync.WithRawResponse =
            webhookSubscriptions
    }
}
