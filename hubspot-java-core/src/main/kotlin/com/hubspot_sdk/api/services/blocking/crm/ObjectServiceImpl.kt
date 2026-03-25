// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.objects.ContactService
import com.hubspot_sdk.api.services.blocking.crm.objects.ContactServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.objects.CustomService
import com.hubspot_sdk.api.services.blocking.crm.objects.CustomServiceImpl
import java.util.function.Consumer

class ObjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectService {

    private val withRawResponse: ObjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contacts: ContactService by lazy { ContactServiceImpl(clientOptions) }

    private val custom: CustomService by lazy { CustomServiceImpl(clientOptions) }

    override fun withRawResponse(): ObjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService =
        ObjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun contacts(): ContactService = contacts

    override fun custom(): CustomService = custom

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectService.WithRawResponse {

        private val contacts: ContactService.WithRawResponse by lazy {
            ContactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val custom: CustomService.WithRawResponse by lazy {
            CustomServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectService.WithRawResponse =
            ObjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun contacts(): ContactService.WithRawResponse = contacts

        override fun custom(): CustomService.WithRawResponse = custom
    }
}
