// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.automation.ActionServiceAsync
import com.hubspot_sdk.api.services.async.automation.SequenceServiceAsync
import com.hubspot_sdk.api.services.async.automation.WorkflowServiceAsync
import java.util.function.Consumer

interface AutomationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationServiceAsync

    fun actions(): ActionServiceAsync

    fun sequences(): SequenceServiceAsync

    fun workflows(): WorkflowServiceAsync

    /**
     * A view of [AutomationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        fun sequences(): SequenceServiceAsync.WithRawResponse

        fun workflows(): WorkflowServiceAsync.WithRawResponse
    }
}
