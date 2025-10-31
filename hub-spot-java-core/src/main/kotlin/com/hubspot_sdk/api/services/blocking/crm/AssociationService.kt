// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associations.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.SchemaService
import com.hubspot_sdk.api.services.blocking.crm.associations.V4Service
import java.util.function.Consumer

interface AssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService

    fun batch(): BatchService

    fun schema(): SchemaService

    fun v4(): V4Service

    /**
     * A view of [AssociationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun schema(): SchemaService.WithRawResponse

        fun v4(): V4Service.WithRawResponse
    }
}
