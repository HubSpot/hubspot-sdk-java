// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.featureflags.AppServiceAsync
import com.hubspot_sdk.api.services.async.crm.featureflags.PortalServiceAsync
import java.util.function.Consumer

interface FeatureFlagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagServiceAsync

    fun apps(): AppServiceAsync

    fun portals(): PortalServiceAsync

    /**
     * A view of [FeatureFlagServiceAsync] that provides access to raw HTTP responses for each
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
        ): FeatureFlagServiceAsync.WithRawResponse

        fun apps(): AppServiceAsync.WithRawResponse

        fun portals(): PortalServiceAsync.WithRawResponse
    }
}
