// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.crm.associationsschema.LabelServiceAsync
import com.hubspot.services.async.crm.associationsschema.LimitServiceAsync
import java.util.function.Consumer

interface AssociationsSchemaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationsSchemaServiceAsync

    fun labels(): LabelServiceAsync

    fun limits(): LimitServiceAsync

    /**
     * A view of [AssociationsSchemaServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationsSchemaServiceAsync.WithRawResponse

        fun labels(): LabelServiceAsync.WithRawResponse

        fun limits(): LimitServiceAsync.WithRawResponse
    }
}
