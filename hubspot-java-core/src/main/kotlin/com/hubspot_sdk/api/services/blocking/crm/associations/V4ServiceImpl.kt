// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportServiceImpl
import java.util.function.Consumer

class V4ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V4Service {

    private val withRawResponse: V4Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val report: ReportService by lazy { ReportServiceImpl(clientOptions) }

    override fun withRawResponse(): V4Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service =
        V4ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun report(): ReportService = report

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4Service.WithRawResponse {

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4Service.WithRawResponse =
            V4ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun report(): ReportService.WithRawResponse = report
    }
}
