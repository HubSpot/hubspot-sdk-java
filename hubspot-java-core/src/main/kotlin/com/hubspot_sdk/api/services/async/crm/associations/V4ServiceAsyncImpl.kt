// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsyncImpl
import java.util.function.Consumer

class V4ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V4ServiceAsync {

    private val withRawResponse: V4ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val report: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V4ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync =
        V4ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun report(): ReportServiceAsync = report

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4ServiceAsync.WithRawResponse {

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4ServiceAsync.WithRawResponse =
            V4ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun report(): ReportServiceAsync.WithRawResponse = report
    }
}
