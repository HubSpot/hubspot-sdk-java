// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.businessunits.BusinessUnitEntryService
import com.hubspot_sdk.api.services.blocking.businessunits.BusinessUnitEntryServiceImpl
import java.util.function.Consumer

class BusinessUnitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessUnitService {

    private val withRawResponse: BusinessUnitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val businessUnitEntries: BusinessUnitEntryService by lazy {
        BusinessUnitEntryServiceImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessUnitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitService =
        BusinessUnitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun businessUnitEntries(): BusinessUnitEntryService = businessUnitEntries

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessUnitService.WithRawResponse {

        private val businessUnitEntries: BusinessUnitEntryService.WithRawResponse by lazy {
            BusinessUnitEntryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitService.WithRawResponse =
            BusinessUnitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun businessUnitEntries(): BusinessUnitEntryService.WithRawResponse =
            businessUnitEntries
    }
}
