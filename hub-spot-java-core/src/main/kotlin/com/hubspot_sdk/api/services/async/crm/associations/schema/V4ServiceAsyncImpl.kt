// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.schema

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.associations.schema.v4.ConfigurationServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.schema.v4.ConfigurationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.associations.schema.v4.DefinitionServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.schema.v4.DefinitionServiceAsyncImpl
import java.util.function.Consumer

class V4ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V4ServiceAsync {

    private val withRawResponse: V4ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val configurations: ConfigurationServiceAsync by lazy {
        ConfigurationServiceAsyncImpl(clientOptions)
    }

    private val definitions: DefinitionServiceAsync by lazy {
        DefinitionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V4ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync =
        V4ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun configurations(): ConfigurationServiceAsync = configurations

    override fun definitions(): DefinitionServiceAsync = definitions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4ServiceAsync.WithRawResponse {

        private val configurations: ConfigurationServiceAsync.WithRawResponse by lazy {
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val definitions: DefinitionServiceAsync.WithRawResponse by lazy {
            DefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4ServiceAsync.WithRawResponse =
            V4ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun configurations(): ConfigurationServiceAsync.WithRawResponse = configurations

        override fun definitions(): DefinitionServiceAsync.WithRawResponse = definitions
    }
}
