// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.settings.CurrencyService
import com.hubspot.sdk.services.blocking.settings.CurrencyServiceImpl
import com.hubspot.sdk.services.blocking.settings.TaxRateService
import com.hubspot.sdk.services.blocking.settings.TaxRateServiceImpl
import com.hubspot.sdk.services.blocking.settings.UserService
import com.hubspot.sdk.services.blocking.settings.UserServiceImpl
import java.util.function.Consumer

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val currencies: CurrencyService by lazy { CurrencyServiceImpl(clientOptions) }

    private val taxRates: TaxRateService by lazy { TaxRateServiceImpl(clientOptions) }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun currencies(): CurrencyService = currencies

    override fun taxRates(): TaxRateService = taxRates

    override fun users(): UserService = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val currencies: CurrencyService.WithRawResponse by lazy {
            CurrencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxRates: TaxRateService.WithRawResponse by lazy {
            TaxRateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun currencies(): CurrencyService.WithRawResponse = currencies

        override fun taxRates(): TaxRateService.WithRawResponse = taxRates

        override fun users(): UserService.WithRawResponse = users
    }
}
