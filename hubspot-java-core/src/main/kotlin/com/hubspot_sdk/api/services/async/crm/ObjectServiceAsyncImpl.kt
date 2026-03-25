// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.objects.ContactServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ContactServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CustomServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CustomServiceAsyncImpl
import java.util.function.Consumer

class ObjectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectServiceAsync {

    private val withRawResponse: ObjectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contacts: ContactServiceAsync by lazy { ContactServiceAsyncImpl(clientOptions) }

    private val custom: CustomServiceAsync by lazy { CustomServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ObjectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectServiceAsync =
        ObjectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun contacts(): ContactServiceAsync = contacts

    override fun custom(): CustomServiceAsync = custom

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectServiceAsync.WithRawResponse {

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val custom: CustomServiceAsync.WithRawResponse by lazy {
            CustomServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectServiceAsync.WithRawResponse =
            ObjectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        override fun custom(): CustomServiceAsync.WithRawResponse = custom
    }
}
