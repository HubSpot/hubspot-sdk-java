// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.datastudio.DatasourceService
import com.hubspot_sdk.api.services.blocking.datastudio.DatasourceServiceImpl
import java.util.function.Consumer

class DataStudioServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DataStudioService {

    private val withRawResponse: DataStudioService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val datasource: DatasourceService by lazy { DatasourceServiceImpl(clientOptions) }

    override fun withRawResponse(): DataStudioService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataStudioService =
        DataStudioServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun datasource(): DatasourceService = datasource

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataStudioService.WithRawResponse {

        private val datasource: DatasourceService.WithRawResponse by lazy {
            DatasourceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataStudioService.WithRawResponse =
            DataStudioServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun datasource(): DatasourceService.WithRawResponse = datasource
    }
}
