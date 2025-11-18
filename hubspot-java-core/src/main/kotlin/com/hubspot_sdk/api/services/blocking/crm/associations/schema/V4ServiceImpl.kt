// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4.ConfigurationService
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4.ConfigurationServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4.DefinitionService
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4.DefinitionServiceImpl
import java.util.function.Consumer

class V4ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V4Service {

    private val withRawResponse: V4Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val configurations: ConfigurationService by lazy {
        ConfigurationServiceImpl(clientOptions)
    }

    private val definitions: DefinitionService by lazy { DefinitionServiceImpl(clientOptions) }

    override fun withRawResponse(): V4Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service =
        V4ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun configurations(): ConfigurationService = configurations

    override fun definitions(): DefinitionService = definitions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4Service.WithRawResponse {

        private val configurations: ConfigurationService.WithRawResponse by lazy {
            ConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val definitions: DefinitionService.WithRawResponse by lazy {
            DefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4Service.WithRawResponse =
            V4ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun configurations(): ConfigurationService.WithRawResponse = configurations

        override fun definitions(): DefinitionService.WithRawResponse = definitions
    }
}
