// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.cms.mediabridge.EventServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.GroupServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.IntegratorSettingServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.PropertyServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.SchemaServiceAsync
import java.util.function.Consumer

interface MediaBridgeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeServiceAsync

    fun events(): EventServiceAsync

    fun groups(): GroupServiceAsync

    fun integratorSettings(): IntegratorSettingServiceAsync

    fun properties(): PropertyServiceAsync

    fun schemas(): SchemaServiceAsync

    /**
     * A view of [MediaBridgeServiceAsync] that provides access to raw HTTP responses for each
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
        ): MediaBridgeServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        fun integratorSettings(): IntegratorSettingServiceAsync.WithRawResponse

        fun properties(): PropertyServiceAsync.WithRawResponse

        fun schemas(): SchemaServiceAsync.WithRawResponse
    }
}
