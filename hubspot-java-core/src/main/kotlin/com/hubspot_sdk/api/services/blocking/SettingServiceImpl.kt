// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.settings.CurrencyService
import com.hubspot_sdk.api.services.blocking.settings.CurrencyServiceImpl
import com.hubspot_sdk.api.services.blocking.settings.TaxRateService
import com.hubspot_sdk.api.services.blocking.settings.TaxRateServiceImpl
import java.util.function.Consumer

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val currencies: CurrencyService by lazy { CurrencyServiceImpl(clientOptions) }

    private val taxRates: TaxRateService by lazy { TaxRateServiceImpl(clientOptions) }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun currencies(): CurrencyService = currencies

    override fun taxRates(): TaxRateService = taxRates

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val currencies: CurrencyService.WithRawResponse by lazy {
            CurrencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxRates: TaxRateService.WithRawResponse by lazy {
            TaxRateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun currencies(): CurrencyService.WithRawResponse = currencies

        override fun taxRates(): TaxRateService.WithRawResponse = taxRates
    }
}
