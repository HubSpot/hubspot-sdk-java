// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.datastudio.DatasourceServiceAsync
import com.hubspot_sdk.api.services.async.datastudio.DatasourceServiceAsyncImpl
import java.util.function.Consumer

class DataStudioServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataStudioServiceAsync {

    private val withRawResponse: DataStudioServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasource: DatasourceServiceAsync by lazy {
        DatasourceServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DataStudioServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataStudioServiceAsync =
        DataStudioServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasource(): DatasourceServiceAsync = datasource

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataStudioServiceAsync.WithRawResponse {

        private val datasource: DatasourceServiceAsync.WithRawResponse by lazy {
            DatasourceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataStudioServiceAsync.WithRawResponse =
            DataStudioServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasource(): DatasourceServiceAsync.WithRawResponse = datasource
    }
}
