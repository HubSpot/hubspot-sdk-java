// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.automation.actions.CallbackService
import com.hubspot_sdk.api.services.blocking.automation.actions.CallbackServiceImpl
import com.hubspot_sdk.api.services.blocking.automation.actions.DefinitionService
import com.hubspot_sdk.api.services.blocking.automation.actions.DefinitionServiceImpl
import com.hubspot_sdk.api.services.blocking.automation.actions.FunctionService
import com.hubspot_sdk.api.services.blocking.automation.actions.FunctionServiceImpl
import com.hubspot_sdk.api.services.blocking.automation.actions.RevisionService
import com.hubspot_sdk.api.services.blocking.automation.actions.RevisionServiceImpl
import java.util.function.Consumer

class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val callbacks: CallbackService by lazy { CallbackServiceImpl(clientOptions) }

    private val definitions: DefinitionService by lazy { DefinitionServiceImpl(clientOptions) }

    private val functions: FunctionService by lazy { FunctionServiceImpl(clientOptions) }

    private val revisions: RevisionService by lazy { RevisionServiceImpl(clientOptions) }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun callbacks(): CallbackService = callbacks

    override fun definitions(): DefinitionService = definitions

    override fun functions(): FunctionService = functions

    override fun revisions(): RevisionService = revisions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val callbacks: CallbackService.WithRawResponse by lazy {
            CallbackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val definitions: DefinitionService.WithRawResponse by lazy {
            DefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionService.WithRawResponse by lazy {
            FunctionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionService.WithRawResponse by lazy {
            RevisionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun callbacks(): CallbackService.WithRawResponse = callbacks

        override fun definitions(): DefinitionService.WithRawResponse = definitions

        override fun functions(): FunctionService.WithRawResponse = functions

        override fun revisions(): RevisionService.WithRawResponse = revisions
    }
}
