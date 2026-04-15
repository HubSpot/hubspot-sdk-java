// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.meta

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.services.async.meta.origins.IpRangeServiceAsync
import java.util.function.Consumer

interface OriginServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OriginServiceAsync

    fun ipRanges(): IpRangeServiceAsync

    /**
     * A view of [OriginServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OriginServiceAsync.WithRawResponse

        fun ipRanges(): IpRangeServiceAsync.WithRawResponse
    }
}
