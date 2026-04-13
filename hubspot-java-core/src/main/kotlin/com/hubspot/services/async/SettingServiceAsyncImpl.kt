// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.settings.CurrencyServiceAsync
import com.hubspot.services.async.settings.CurrencyServiceAsyncImpl
import com.hubspot.services.async.settings.TaxRateServiceAsync
import com.hubspot.services.async.settings.TaxRateServiceAsyncImpl
import com.hubspot.services.async.settings.UserServiceAsync
import com.hubspot.services.async.settings.UserServiceAsyncImpl
import java.util.function.Consumer

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val withRawResponse: SettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val currencies: CurrencyServiceAsync by lazy { CurrencyServiceAsyncImpl(clientOptions) }

    private val taxRates: TaxRateServiceAsync by lazy { TaxRateServiceAsyncImpl(clientOptions) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync =
        SettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun currencies(): CurrencyServiceAsync = currencies

    override fun taxRates(): TaxRateServiceAsync = taxRates

    override fun users(): UserServiceAsync = users

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingServiceAsync.WithRawResponse {

        private val currencies: CurrencyServiceAsync.WithRawResponse by lazy {
            CurrencyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxRates: TaxRateServiceAsync.WithRawResponse by lazy {
            TaxRateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse =
            SettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun currencies(): CurrencyServiceAsync.WithRawResponse = currencies

        override fun taxRates(): TaxRateServiceAsync.WithRawResponse = taxRates

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
