// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.associationsschema.LabelService
import com.hubspot_sdk.api.services.blocking.crm.associationsschema.LimitService
import java.util.function.Consumer

interface AssociationsSchemaService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationsSchemaService

    fun labels(): LabelService

    fun limits(): LimitService

    /**
     * A view of [AssociationsSchemaService] that provides access to raw HTTP responses for each
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
        ): AssociationsSchemaService.WithRawResponse

        fun labels(): LabelService.WithRawResponse

        fun limits(): LimitService.WithRawResponse
    }
}
