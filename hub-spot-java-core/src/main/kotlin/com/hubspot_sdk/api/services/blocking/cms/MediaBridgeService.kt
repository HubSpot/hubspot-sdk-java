// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.EventService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.GroupService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.IntegratorSettingService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.PropertyService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.SchemaService
import java.util.function.Consumer

interface MediaBridgeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeService

    fun events(): EventService

    fun groups(): GroupService

    fun integratorSettings(): IntegratorSettingService

    fun properties(): PropertyService

    fun schemas(): SchemaService

    /**
     * A view of [MediaBridgeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun groups(): GroupService.WithRawResponse

        fun integratorSettings(): IntegratorSettingService.WithRawResponse

        fun properties(): PropertyService.WithRawResponse

        fun schemas(): SchemaService.WithRawResponse
    }
}
