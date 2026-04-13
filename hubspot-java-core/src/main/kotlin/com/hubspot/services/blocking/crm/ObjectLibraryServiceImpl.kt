// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.crm.objectlibrary.EnablementService
import com.hubspot.services.blocking.crm.objectlibrary.EnablementServiceImpl
import java.util.function.Consumer

class ObjectLibraryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectLibraryService {

    private val withRawResponse: ObjectLibraryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enablement: EnablementService by lazy { EnablementServiceImpl(clientOptions) }

    override fun withRawResponse(): ObjectLibraryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectLibraryService =
        ObjectLibraryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun enablement(): EnablementService = enablement

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectLibraryService.WithRawResponse {

        private val enablement: EnablementService.WithRawResponse by lazy {
            EnablementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectLibraryService.WithRawResponse =
            ObjectLibraryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun enablement(): EnablementService.WithRawResponse = enablement
    }
}
