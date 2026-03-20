// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsyncImpl
import java.util.function.Consumer

class CrmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CrmServiceAsync {

    private val withRawResponse: CrmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val objects: ObjectServiceAsync by lazy { ObjectServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CrmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmServiceAsync =
        CrmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun objects(): ObjectServiceAsync = objects

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrmServiceAsync.WithRawResponse {

        private val objects: ObjectServiceAsync.WithRawResponse by lazy {
            ObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrmServiceAsync.WithRawResponse =
            CrmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun objects(): ObjectServiceAsync.WithRawResponse = objects
    }
}
