// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.client

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.getPackageVersion
import com.hubspot_sdk.api.services.blocking.AccountService
import com.hubspot_sdk.api.services.blocking.AccountServiceImpl
import com.hubspot_sdk.api.services.blocking.CrmService
import com.hubspot_sdk.api.services.blocking.CrmServiceImpl
import java.util.function.Consumer

class HubspotClientImpl(private val clientOptions: ClientOptions) : HubspotClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: HubspotClientAsync by lazy { HubspotClientAsyncImpl(clientOptions) }

    private val withRawResponse: HubspotClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val account: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val crm: CrmService by lazy { CrmServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HubspotClientAsync = async

    override fun withRawResponse(): HubspotClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubspotClient =
        HubspotClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun account(): AccountService = account

    override fun crm(): CrmService = crm

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubspotClient.WithRawResponse {

        private val account: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val crm: CrmService.WithRawResponse by lazy {
            CrmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubspotClient.WithRawResponse =
            HubspotClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun account(): AccountService.WithRawResponse = account

        override fun crm(): CrmService.WithRawResponse = crm
    }
}
