// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.settings.CurrencyService
import com.hubspot.services.blocking.settings.TaxRateService
import com.hubspot.services.blocking.settings.UserService
import java.util.function.Consumer

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    fun currencies(): CurrencyService

    fun taxRates(): TaxRateService

    fun users(): UserService

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        fun currencies(): CurrencyService.WithRawResponse

        fun taxRates(): TaxRateService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
