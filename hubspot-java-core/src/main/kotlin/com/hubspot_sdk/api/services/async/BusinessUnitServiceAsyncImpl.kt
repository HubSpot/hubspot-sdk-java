// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.businessunits.BusinessUnitEntryServiceAsync
import com.hubspot_sdk.api.services.async.businessunits.BusinessUnitEntryServiceAsyncImpl
import java.util.function.Consumer

class BusinessUnitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessUnitServiceAsync {

    private val withRawResponse: BusinessUnitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val businessUnitEntries: BusinessUnitEntryServiceAsync by lazy {
        BusinessUnitEntryServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessUnitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitServiceAsync =
        BusinessUnitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun businessUnitEntries(): BusinessUnitEntryServiceAsync = businessUnitEntries

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessUnitServiceAsync.WithRawResponse {

        private val businessUnitEntries: BusinessUnitEntryServiceAsync.WithRawResponse by lazy {
            BusinessUnitEntryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitServiceAsync.WithRawResponse =
            BusinessUnitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun businessUnitEntries(): BusinessUnitEntryServiceAsync.WithRawResponse =
            businessUnitEntries
    }
}
