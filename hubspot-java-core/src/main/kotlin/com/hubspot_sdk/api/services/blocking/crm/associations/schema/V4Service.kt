// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.schema

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4.ConfigurationService
import com.hubspot_sdk.api.services.blocking.crm.associations.schema.v4.DefinitionService
import java.util.function.Consumer

interface V4Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service

    fun configurations(): ConfigurationService

    fun definitions(): DefinitionService

    /** A view of [V4Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service.WithRawResponse

        fun configurations(): ConfigurationService.WithRawResponse

        fun definitions(): DefinitionService.WithRawResponse
    }
}
