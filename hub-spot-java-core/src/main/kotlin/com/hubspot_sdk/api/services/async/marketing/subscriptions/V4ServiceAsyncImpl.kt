// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.DefinitionServiceAsync
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.DefinitionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.LinkServiceAsync
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.LinkServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.StatusServiceAsync
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.StatusServiceAsyncImpl
import java.util.function.Consumer

class V4ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V4ServiceAsync {

    private val withRawResponse: V4ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val definitions: DefinitionServiceAsync by lazy {
        DefinitionServiceAsyncImpl(clientOptions)
    }

    private val links: LinkServiceAsync by lazy { LinkServiceAsyncImpl(clientOptions) }

    private val statuses: StatusServiceAsync by lazy { StatusServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V4ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync =
        V4ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun definitions(): DefinitionServiceAsync = definitions

    override fun links(): LinkServiceAsync = links

    override fun statuses(): StatusServiceAsync = statuses

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4ServiceAsync.WithRawResponse {

        private val definitions: DefinitionServiceAsync.WithRawResponse by lazy {
            DefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val links: LinkServiceAsync.WithRawResponse by lazy {
            LinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val statuses: StatusServiceAsync.WithRawResponse by lazy {
            StatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4ServiceAsync.WithRawResponse =
            V4ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun definitions(): DefinitionServiceAsync.WithRawResponse = definitions

        override fun links(): LinkServiceAsync.WithRawResponse = links

        override fun statuses(): StatusServiceAsync.WithRawResponse = statuses
    }
}
