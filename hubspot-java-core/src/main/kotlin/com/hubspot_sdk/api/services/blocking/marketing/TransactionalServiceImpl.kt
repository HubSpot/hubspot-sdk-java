// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.marketing.transactional.SingleEmailService
import com.hubspot_sdk.api.services.blocking.marketing.transactional.SingleEmailServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.transactional.SmtpTokenService
import com.hubspot_sdk.api.services.blocking.marketing.transactional.SmtpTokenServiceImpl
import java.util.function.Consumer

class TransactionalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionalService {

    private val withRawResponse: TransactionalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val singleEmail: SingleEmailService by lazy { SingleEmailServiceImpl(clientOptions) }

    private val smtpTokens: SmtpTokenService by lazy { SmtpTokenServiceImpl(clientOptions) }

    override fun withRawResponse(): TransactionalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalService =
        TransactionalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun singleEmail(): SingleEmailService = singleEmail

    override fun smtpTokens(): SmtpTokenService = smtpTokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionalService.WithRawResponse {

        private val singleEmail: SingleEmailService.WithRawResponse by lazy {
            SingleEmailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val smtpTokens: SmtpTokenService.WithRawResponse by lazy {
            SmtpTokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionalService.WithRawResponse =
            TransactionalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun singleEmail(): SingleEmailService.WithRawResponse = singleEmail

        override fun smtpTokens(): SmtpTokenService.WithRawResponse = smtpTokens
    }
}
