// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.core.ClientOptions
import com.hubspot.services.blocking.automation.ActionService
import com.hubspot.services.blocking.automation.ActionServiceImpl
import com.hubspot.services.blocking.automation.SequenceService
import com.hubspot.services.blocking.automation.SequenceServiceImpl
import java.util.function.Consumer

class AutomationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AutomationService {

    private val withRawResponse: AutomationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    private val sequences: SequenceService by lazy { SequenceServiceImpl(clientOptions) }

    override fun withRawResponse(): AutomationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationService =
        AutomationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun sequences(): SequenceService = sequences

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutomationService.WithRawResponse {

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sequences: SequenceService.WithRawResponse by lazy {
            SequenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationService.WithRawResponse =
            AutomationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        override fun sequences(): SequenceService.WithRawResponse = sequences
    }
}
