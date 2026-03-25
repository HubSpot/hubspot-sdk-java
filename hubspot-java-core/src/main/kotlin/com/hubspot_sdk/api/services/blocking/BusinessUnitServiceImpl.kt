// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.BusinessUnitService
import com.hubspot_sdk.api.services.blocking.BusinessUnitServiceImpl
import com.hubspot_sdk.api.services.blocking.businessunits.BusinessUnitService
import com.hubspot_sdk.api.services.blocking.businessunits.BusinessUnitServiceImpl
import java.util.function.Consumer

class BusinessUnitServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BusinessUnitService {

    private val withRawResponse: BusinessUnitService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val businessUnits: BusinessUnitService by lazy {
        BusinessUnitServiceImpl(clientOptions)
    }

    override fun withRawResponse(): BusinessUnitService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitService =
        BusinessUnitServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun businessUnits(): BusinessUnitService = businessUnits

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BusinessUnitService.WithRawResponse {

        private val businessUnits: BusinessUnitService.WithRawResponse by lazy {
            BusinessUnitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitService.WithRawResponse =
            BusinessUnitServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun businessUnits(): BusinessUnitService.WithRawResponse = businessUnits
    }
}
