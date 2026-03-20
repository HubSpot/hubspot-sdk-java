// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.ObjectServiceImpl
import java.util.function.Consumer

class CrmServiceImpl internal constructor(private val clientOptions: ClientOptions) : CrmService {

    private val withRawResponse: CrmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val objects: ObjectService by lazy { ObjectServiceImpl(clientOptions) }

    override fun withRawResponse(): CrmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CrmService =
        CrmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun objects(): ObjectService = objects

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CrmService.WithRawResponse {

        private val objects: ObjectService.WithRawResponse by lazy {
            ObjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CrmService.WithRawResponse =
            CrmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun objects(): ObjectService.WithRawResponse = objects
    }
}
