// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.account.ActivityServiceAsync
import com.hubspot_sdk.api.services.async.account.ActivityServiceAsyncImpl
import com.hubspot_sdk.api.services.async.account.DetailServiceAsync
import com.hubspot_sdk.api.services.async.account.DetailServiceAsyncImpl
import com.hubspot_sdk.api.services.async.account.UsageServiceAsync
import com.hubspot_sdk.api.services.async.account.UsageServiceAsyncImpl
import java.util.function.Consumer

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val activity: ActivityServiceAsync by lazy { ActivityServiceAsyncImpl(clientOptions) }

    private val details: DetailServiceAsync by lazy { DetailServiceAsyncImpl(clientOptions) }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun activity(): ActivityServiceAsync = activity

    override fun details(): DetailServiceAsync = details

    override fun usage(): UsageServiceAsync = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val activity: ActivityServiceAsync.WithRawResponse by lazy {
            ActivityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val details: DetailServiceAsync.WithRawResponse by lazy {
            DetailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun activity(): ActivityServiceAsync.WithRawResponse = activity

        override fun details(): DetailServiceAsync.WithRawResponse = details

        override fun usage(): UsageServiceAsync.WithRawResponse = usage
    }
}
