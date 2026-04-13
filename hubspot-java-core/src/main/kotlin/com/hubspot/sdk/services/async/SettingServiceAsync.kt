// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.settings.CurrencyServiceAsync
import com.hubspot.sdk.services.async.settings.TaxRateServiceAsync
import com.hubspot.sdk.services.async.settings.UserServiceAsync
import java.util.function.Consumer

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    fun currencies(): CurrencyServiceAsync

    fun taxRates(): TaxRateServiceAsync

    fun users(): UserServiceAsync

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        fun currencies(): CurrencyServiceAsync.WithRawResponse

        fun taxRates(): TaxRateServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse
    }
}
