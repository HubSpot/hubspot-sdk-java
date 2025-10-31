// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.automation.actions.CallbackServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.CallbackServiceAsyncImpl
import com.hubspot_sdk.api.services.async.automation.actions.DefinitionServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.DefinitionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.automation.actions.FunctionServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.FunctionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.automation.actions.RevisionServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.RevisionServiceAsyncImpl
import java.util.function.Consumer

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val callbacks: CallbackServiceAsync by lazy { CallbackServiceAsyncImpl(clientOptions) }

    private val definitions: DefinitionServiceAsync by lazy {
        DefinitionServiceAsyncImpl(clientOptions)
    }

    private val functions: FunctionServiceAsync by lazy { FunctionServiceAsyncImpl(clientOptions) }

    private val revisions: RevisionServiceAsync by lazy { RevisionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun callbacks(): CallbackServiceAsync = callbacks

    override fun definitions(): DefinitionServiceAsync = definitions

    override fun functions(): FunctionServiceAsync = functions

    override fun revisions(): RevisionServiceAsync = revisions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val callbacks: CallbackServiceAsync.WithRawResponse by lazy {
            CallbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val definitions: DefinitionServiceAsync.WithRawResponse by lazy {
            DefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionServiceAsync.WithRawResponse by lazy {
            FunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionServiceAsync.WithRawResponse by lazy {
            RevisionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun callbacks(): CallbackServiceAsync.WithRawResponse = callbacks

        override fun definitions(): DefinitionServiceAsync.WithRawResponse = definitions

        override fun functions(): FunctionServiceAsync.WithRawResponse = functions

        override fun revisions(): RevisionServiceAsync.WithRawResponse = revisions
    }
}
