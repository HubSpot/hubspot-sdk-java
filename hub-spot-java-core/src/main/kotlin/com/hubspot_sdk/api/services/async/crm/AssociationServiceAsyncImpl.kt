// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.associations.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.BatchServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.associations.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.SchemaServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsyncImpl
import java.util.function.Consumer

class AssociationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationServiceAsync {

    private val withRawResponse: AssociationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val schema: SchemaServiceAsync by lazy { SchemaServiceAsyncImpl(clientOptions) }

    private val v4: V4ServiceAsync by lazy { V4ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AssociationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync =
        AssociationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun schema(): SchemaServiceAsync = schema

    override fun v4(): V4ServiceAsync = v4

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationServiceAsync.WithRawResponse {

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val schema: SchemaServiceAsync.WithRawResponse by lazy {
            SchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v4: V4ServiceAsync.WithRawResponse by lazy {
            V4ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse =
            AssociationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun schema(): SchemaServiceAsync.WithRawResponse = schema

        override fun v4(): V4ServiceAsync.WithRawResponse = v4
    }
}
