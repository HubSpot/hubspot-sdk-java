// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.marketing.transactional.SingleEmailServiceAsync
import com.hubspot_sdk.api.services.async.marketing.transactional.SingleEmailServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.transactional.SmtpTokenServiceAsync
import com.hubspot_sdk.api.services.async.marketing.transactional.SmtpTokenServiceAsyncImpl
import java.util.function.Consumer

class TransactionalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionalServiceAsync {

    private val withRawResponse: TransactionalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val singleEmail: SingleEmailServiceAsync by lazy {
        SingleEmailServiceAsyncImpl(clientOptions)
    }

    private val smtpTokens: SmtpTokenServiceAsync by lazy {
        SmtpTokenServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalServiceAsync =
        TransactionalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun singleEmail(): SingleEmailServiceAsync = singleEmail

    override fun smtpTokens(): SmtpTokenServiceAsync = smtpTokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionalServiceAsync.WithRawResponse {

        private val singleEmail: SingleEmailServiceAsync.WithRawResponse by lazy {
            SingleEmailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val smtpTokens: SmtpTokenServiceAsync.WithRawResponse by lazy {
            SmtpTokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionalServiceAsync.WithRawResponse =
            TransactionalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun singleEmail(): SingleEmailServiceAsync.WithRawResponse = singleEmail

        override fun smtpTokens(): SmtpTokenServiceAsync.WithRawResponse = smtpTokens
    }
}
