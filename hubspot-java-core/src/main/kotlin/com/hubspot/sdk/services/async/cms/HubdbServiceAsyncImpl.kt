// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.cms.hubdb.RowServiceAsync
import com.hubspot.sdk.services.async.cms.hubdb.RowServiceAsyncImpl
import com.hubspot.sdk.services.async.cms.hubdb.TableServiceAsync
import com.hubspot.sdk.services.async.cms.hubdb.TableServiceAsyncImpl
import java.util.function.Consumer

class HubdbServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HubdbServiceAsync {

    private val withRawResponse: HubdbServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rows: RowServiceAsync by lazy { RowServiceAsyncImpl(clientOptions) }

    private val tables: TableServiceAsync by lazy { TableServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): HubdbServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubdbServiceAsync =
        HubdbServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rows(): RowServiceAsync = rows

    override fun tables(): TableServiceAsync = tables

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HubdbServiceAsync.WithRawResponse {

        private val rows: RowServiceAsync.WithRawResponse by lazy {
            RowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tables: TableServiceAsync.WithRawResponse by lazy {
            TableServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubdbServiceAsync.WithRawResponse =
            HubdbServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rows(): RowServiceAsync.WithRawResponse = rows

        override fun tables(): TableServiceAsync.WithRawResponse = tables
    }
}
