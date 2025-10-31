// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.objectlibrary.EnablementServiceAsync
import com.hubspot_sdk.api.services.async.crm.objectlibrary.EnablementServiceAsyncImpl
import java.util.function.Consumer

class ObjectLibraryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectLibraryServiceAsync {

    private val withRawResponse: ObjectLibraryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enablement: EnablementServiceAsync by lazy {
        EnablementServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ObjectLibraryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectLibraryServiceAsync =
        ObjectLibraryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun enablement(): EnablementServiceAsync = enablement

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectLibraryServiceAsync.WithRawResponse {

        private val enablement: EnablementServiceAsync.WithRawResponse by lazy {
            EnablementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectLibraryServiceAsync.WithRawResponse =
            ObjectLibraryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun enablement(): EnablementServiceAsync.WithRawResponse = enablement
    }
}
