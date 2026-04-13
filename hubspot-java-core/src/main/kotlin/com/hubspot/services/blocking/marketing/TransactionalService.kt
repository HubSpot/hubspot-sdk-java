// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.marketing.transactional.SingleEmailService
import com.hubspot.services.blocking.marketing.transactional.SmtpTokenService
import java.util.function.Consumer

interface TransactionalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalService

    fun singleEmail(): SingleEmailService

    fun smtpTokens(): SmtpTokenService

    /**
     * A view of [TransactionalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionalService.WithRawResponse

        fun singleEmail(): SingleEmailService.WithRawResponse

        fun smtpTokens(): SmtpTokenService.WithRawResponse
    }
}
