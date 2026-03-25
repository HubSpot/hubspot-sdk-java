// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.BusinessUnitServiceAsync
import com.hubspot_sdk.api.services.async.BusinessUnitServiceAsyncImpl
import com.hubspot_sdk.api.services.async.businessunits.BusinessUnitServiceAsync
import com.hubspot_sdk.api.services.async.businessunits.BusinessUnitServiceAsyncImpl
import java.util.function.Consumer

class BusinessUnitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessUnitServiceAsync {

    private val withRawResponse: BusinessUnitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val businessUnits: BusinessUnitServiceAsync by lazy {
        BusinessUnitServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessUnitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitServiceAsync =
        BusinessUnitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun businessUnits(): BusinessUnitServiceAsync = businessUnits

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessUnitServiceAsync.WithRawResponse {

        private val businessUnits: BusinessUnitServiceAsync.WithRawResponse by lazy {
            BusinessUnitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitServiceAsync.WithRawResponse =
            BusinessUnitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun businessUnits(): BusinessUnitServiceAsync.WithRawResponse = businessUnits
    }
}
