// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.client

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.getPackageVersion
import com.hubspot_sdk.api.services.async.AccountServiceAsync
import com.hubspot_sdk.api.services.async.AccountServiceAsyncImpl
import com.hubspot_sdk.api.services.async.CrmServiceAsync
import com.hubspot_sdk.api.services.async.CrmServiceAsyncImpl
import java.util.function.Consumer

class HubspotClientAsyncImpl(private val clientOptions: ClientOptions) : HubspotClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: HubspotClient by lazy { HubspotClientImpl(clientOptions) }

    private val withRawResponse: HubspotClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val crm: CrmServiceAsync by lazy { CrmServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): HubspotClient = sync

    override fun withRawResponse(): HubspotClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubspotClientAsync =
        HubspotClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountServiceAsync = account

    override fun crm(): CrmServiceAsync = crm

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubspotClientAsync.WithRawResponse {

        private val account: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val crm: CrmServiceAsync.WithRawResponse by lazy {
            CrmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubspotClientAsync.WithRawResponse =
            HubspotClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountServiceAsync.WithRawResponse = account

        override fun crm(): CrmServiceAsync.WithRawResponse = crm
    }
}
