// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.marketing.transactional.SingleEmailServiceAsync
import com.hubspot.sdk.services.async.marketing.transactional.SmtpTokenServiceAsync
import java.util.function.Consumer

interface TransactionalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalServiceAsync

    fun singleEmail(): SingleEmailServiceAsync

    fun smtpTokens(): SmtpTokenServiceAsync

    /**
     * A view of [TransactionalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionalServiceAsync.WithRawResponse

        fun singleEmail(): SingleEmailServiceAsync.WithRawResponse

        fun smtpTokens(): SmtpTokenServiceAsync.WithRawResponse
    }
}
