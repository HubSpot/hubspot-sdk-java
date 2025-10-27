// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.featureflags.AppService
import com.hubspot_sdk.api.services.blocking.crm.featureflags.PortalService
import java.util.function.Consumer

interface FeatureFlagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagService

    fun apps(): AppService

    fun portals(): PortalService

    /**
     * A view of [FeatureFlagService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureFlagService.WithRawResponse

        fun apps(): AppService.WithRawResponse

        fun portals(): PortalService.WithRawResponse
    }
}
