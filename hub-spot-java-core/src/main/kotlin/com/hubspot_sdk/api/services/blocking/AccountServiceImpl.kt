// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.account.ActivityService
import com.hubspot_sdk.api.services.blocking.account.ActivityServiceImpl
import com.hubspot_sdk.api.services.blocking.account.DetailService
import com.hubspot_sdk.api.services.blocking.account.DetailServiceImpl
import com.hubspot_sdk.api.services.blocking.account.UsageService
import com.hubspot_sdk.api.services.blocking.account.UsageServiceImpl
import java.util.function.Consumer

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val activity: ActivityService by lazy { ActivityServiceImpl(clientOptions) }

    private val details: DetailService by lazy { DetailServiceImpl(clientOptions) }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun activity(): ActivityService = activity

    override fun details(): DetailService = details

    override fun usage(): UsageService = usage

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val activity: ActivityService.WithRawResponse by lazy {
            ActivityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val details: DetailService.WithRawResponse by lazy {
            DetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun activity(): ActivityService.WithRawResponse = activity

        override fun details(): DetailService.WithRawResponse = details

        override fun usage(): UsageService.WithRawResponse = usage
    }
}
