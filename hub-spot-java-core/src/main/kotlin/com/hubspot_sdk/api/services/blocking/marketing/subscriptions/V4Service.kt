// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.DefinitionService
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.LinkService
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.StatusService
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

    fun definitions(): DefinitionService

    fun links(): LinkService

    fun statuses(): StatusService

    /** A view of [V4Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service.WithRawResponse

        fun definitions(): DefinitionService.WithRawResponse

        fun links(): LinkService.WithRawResponse

        fun statuses(): StatusService.WithRawResponse
    }
}
