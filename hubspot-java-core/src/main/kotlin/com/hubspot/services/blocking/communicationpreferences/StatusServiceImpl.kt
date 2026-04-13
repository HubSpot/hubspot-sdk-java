// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.communicationpreferences

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.communicationpreferences.statuses.BatchService
import com.hubspot.services.blocking.communicationpreferences.statuses.BatchServiceImpl
import java.util.function.Consumer

class StatusServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatusService {

    private val withRawResponse: StatusService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): StatusService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatusService =
        StatusServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatusService.WithRawResponse {

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatusService.WithRawResponse =
            StatusServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch
    }
}
