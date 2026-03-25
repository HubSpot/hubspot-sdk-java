// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associationsschema.LabelService
import com.hubspot_sdk.api.services.blocking.crm.associationsschema.LabelServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.associationsschema.LimitService
import com.hubspot_sdk.api.services.blocking.crm.associationsschema.LimitServiceImpl
import java.util.function.Consumer

class AssociationsSchemaServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationsSchemaService {

    private val withRawResponse: AssociationsSchemaService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val labels: LabelService by lazy { LabelServiceImpl(clientOptions) }

    private val limits: LimitService by lazy { LimitServiceImpl(clientOptions) }

    override fun withRawResponse(): AssociationsSchemaService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationsSchemaService =
        AssociationsSchemaServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun labels(): LabelService = labels

    override fun limits(): LimitService = limits

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationsSchemaService.WithRawResponse {

        private val labels: LabelService.WithRawResponse by lazy {
            LabelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val limits: LimitService.WithRawResponse by lazy {
            LimitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationsSchemaService.WithRawResponse =
            AssociationsSchemaServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun labels(): LabelService.WithRawResponse = labels

        override fun limits(): LimitService.WithRawResponse = limits
    }
}
