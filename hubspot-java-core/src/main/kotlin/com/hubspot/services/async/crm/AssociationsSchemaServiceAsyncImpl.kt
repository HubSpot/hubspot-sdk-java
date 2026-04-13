// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.crm.associationsschema.LabelServiceAsync
import com.hubspot.services.async.crm.associationsschema.LabelServiceAsyncImpl
import com.hubspot.services.async.crm.associationsschema.LimitServiceAsync
import com.hubspot.services.async.crm.associationsschema.LimitServiceAsyncImpl
import java.util.function.Consumer

class AssociationsSchemaServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AssociationsSchemaServiceAsync {

    private val withRawResponse: AssociationsSchemaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val labels: LabelServiceAsync by lazy { LabelServiceAsyncImpl(clientOptions) }

    private val limits: LimitServiceAsync by lazy { LimitServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AssociationsSchemaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AssociationsSchemaServiceAsync =
        AssociationsSchemaServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun labels(): LabelServiceAsync = labels

    override fun limits(): LimitServiceAsync = limits

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationsSchemaServiceAsync.WithRawResponse {

        private val labels: LabelServiceAsync.WithRawResponse by lazy {
            LabelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val limits: LimitServiceAsync.WithRawResponse by lazy {
            LimitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationsSchemaServiceAsync.WithRawResponse =
            AssociationsSchemaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun labels(): LabelServiceAsync.WithRawResponse = labels

        override fun limits(): LimitServiceAsync.WithRawResponse = limits
    }
}
