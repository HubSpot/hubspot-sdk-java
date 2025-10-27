// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.hubdb.RowService
import com.hubspot_sdk.api.services.blocking.cms.hubdb.RowServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.hubdb.TableService
import com.hubspot_sdk.api.services.blocking.cms.hubdb.TableServiceImpl
import java.util.function.Consumer

class HubdbServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HubdbService {

    private val withRawResponse: HubdbService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rows: RowService by lazy { RowServiceImpl(clientOptions) }

    private val tables: TableService by lazy { TableServiceImpl(clientOptions) }

    override fun withRawResponse(): HubdbService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubdbService =
        HubdbServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rows(): RowService = rows

    override fun tables(): TableService = tables

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubdbService.WithRawResponse {

        private val rows: RowService.WithRawResponse by lazy {
            RowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tables: TableService.WithRawResponse by lazy {
            TableServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubdbService.WithRawResponse =
            HubdbServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rows(): RowService.WithRawResponse = rows

        override fun tables(): TableService.WithRawResponse = tables
    }
}
