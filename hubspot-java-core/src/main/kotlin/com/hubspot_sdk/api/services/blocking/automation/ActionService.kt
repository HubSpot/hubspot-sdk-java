// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.automation.actions.CallbackService
import com.hubspot_sdk.api.services.blocking.automation.actions.DefinitionService
import com.hubspot_sdk.api.services.blocking.automation.actions.FunctionService
import com.hubspot_sdk.api.services.blocking.automation.actions.RevisionService
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    fun callbacks(): CallbackService

    fun definitions(): DefinitionService

    fun functions(): FunctionService

    fun revisions(): RevisionService

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        fun callbacks(): CallbackService.WithRawResponse

        fun definitions(): DefinitionService.WithRawResponse

        fun functions(): FunctionService.WithRawResponse

        fun revisions(): RevisionService.WithRawResponse
    }
}
