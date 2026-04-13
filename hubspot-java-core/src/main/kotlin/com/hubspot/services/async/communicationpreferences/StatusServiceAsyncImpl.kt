// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.communicationpreferences

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.communicationpreferences.statuses.BatchServiceAsync
import com.hubspot.services.async.communicationpreferences.statuses.BatchServiceAsyncImpl
import java.util.function.Consumer

class StatusServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatusServiceAsync {

    private val withRawResponse: StatusServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): StatusServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusServiceAsync =
        StatusServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatusServiceAsync.WithRawResponse {

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusServiceAsync.WithRawResponse =
            StatusServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch
    }
}
