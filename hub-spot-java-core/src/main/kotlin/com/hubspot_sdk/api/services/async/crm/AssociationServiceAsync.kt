// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.associations.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.V4ServiceAsync
import java.util.function.Consumer

interface AssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync

    fun batch(): BatchServiceAsync

    fun schema(): SchemaServiceAsync

    fun v4(): V4ServiceAsync

    /**
     * A view of [AssociationServiceAsync] that provides access to raw HTTP responses for each
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
        ): AssociationServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        fun schema(): SchemaServiceAsync.WithRawResponse

        fun v4(): V4ServiceAsync.WithRawResponse
    }
}
