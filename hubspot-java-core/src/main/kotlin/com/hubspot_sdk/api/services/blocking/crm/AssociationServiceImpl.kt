// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associations.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.BatchServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.SchemaService
import com.hubspot_sdk.api.services.blocking.crm.associations.SchemaServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associations.V4Service
import com.hubspot_sdk.api.services.blocking.crm.associations.V4ServiceImpl
import java.util.function.Consumer

class AssociationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationService {

    private val withRawResponse: AssociationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val schema: SchemaService by lazy { SchemaServiceImpl(clientOptions) }

    private val v4: V4Service by lazy { V4ServiceImpl(clientOptions) }

    override fun withRawResponse(): AssociationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService =
        AssociationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun schema(): SchemaService = schema

    override fun v4(): V4Service = v4

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationService.WithRawResponse {

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val schema: SchemaService.WithRawResponse by lazy {
            SchemaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v4: V4Service.WithRawResponse by lazy {
            V4ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse =
            AssociationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun schema(): SchemaService.WithRawResponse = schema

        override fun v4(): V4Service.WithRawResponse = v4
    }
}
