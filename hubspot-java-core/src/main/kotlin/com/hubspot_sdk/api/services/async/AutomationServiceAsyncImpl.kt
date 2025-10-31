// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.automation.ActionServiceAsync
import com.hubspot_sdk.api.services.async.automation.ActionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.automation.SequenceServiceAsync
import com.hubspot_sdk.api.services.async.automation.SequenceServiceAsyncImpl
import com.hubspot_sdk.api.services.async.automation.WorkflowServiceAsync
import com.hubspot_sdk.api.services.async.automation.WorkflowServiceAsyncImpl
import java.util.function.Consumer

class AutomationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomationServiceAsync {

    private val withRawResponse: AutomationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    private val sequences: SequenceServiceAsync by lazy { SequenceServiceAsyncImpl(clientOptions) }

    private val workflows: WorkflowServiceAsync by lazy { WorkflowServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AutomationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationServiceAsync =
        AutomationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun sequences(): SequenceServiceAsync = sequences

    override fun workflows(): WorkflowServiceAsync = workflows

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomationServiceAsync.WithRawResponse {

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sequences: SequenceServiceAsync.WithRawResponse by lazy {
            SequenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val workflows: WorkflowServiceAsync.WithRawResponse by lazy {
            WorkflowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationServiceAsync.WithRawResponse =
            AutomationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        override fun sequences(): SequenceServiceAsync.WithRawResponse = sequences

        override fun workflows(): WorkflowServiceAsync.WithRawResponse = workflows
    }
}
