// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.dealsplits.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.dealsplits.BatchServiceAsyncImpl
import java.util.function.Consumer

class DealSplitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DealSplitServiceAsync {

    private val withRawResponse: DealSplitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DealSplitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealSplitServiceAsync =
        DealSplitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DealSplitServiceAsync.WithRawResponse {

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DealSplitServiceAsync.WithRawResponse =
            DealSplitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch
    }
}
