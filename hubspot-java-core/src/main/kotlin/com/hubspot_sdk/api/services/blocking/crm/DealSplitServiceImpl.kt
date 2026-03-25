// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.dealsplits.BatchService
import com.hubspot_sdk.api.services.blocking.crm.dealsplits.BatchServiceImpl
import java.util.function.Consumer

class DealSplitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DealSplitService {

    private val withRawResponse: DealSplitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): DealSplitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DealSplitService =
        DealSplitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DealSplitService.WithRawResponse {

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DealSplitService.WithRawResponse =
            DealSplitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch
    }
}
