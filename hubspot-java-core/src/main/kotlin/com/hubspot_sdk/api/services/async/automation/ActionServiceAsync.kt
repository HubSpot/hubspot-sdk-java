// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.automation.actions.CallbackServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.DefinitionServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.FunctionServiceAsync
import com.hubspot_sdk.api.services.async.automation.actions.RevisionServiceAsync
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    fun callbacks(): CallbackServiceAsync

    fun definitions(): DefinitionServiceAsync

    fun functions(): FunctionServiceAsync

    fun revisions(): RevisionServiceAsync

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        fun callbacks(): CallbackServiceAsync.WithRawResponse

        fun definitions(): DefinitionServiceAsync.WithRawResponse

        fun functions(): FunctionServiceAsync.WithRawResponse

        fun revisions(): RevisionServiceAsync.WithRawResponse
    }
}
