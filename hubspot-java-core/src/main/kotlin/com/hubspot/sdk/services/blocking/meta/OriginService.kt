// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.meta

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.blocking.meta.origins.IpRangeService
import java.util.function.Consumer

interface OriginService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OriginService

    fun ipRanges(): IpRangeService

    /** A view of [OriginService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OriginService.WithRawResponse

        fun ipRanges(): IpRangeService.WithRawResponse
    }
}
