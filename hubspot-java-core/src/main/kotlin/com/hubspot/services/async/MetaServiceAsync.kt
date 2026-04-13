// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.meta.OriginServiceAsync
import java.util.function.Consumer

interface MetaServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetaServiceAsync

    fun origins(): OriginServiceAsync

    /** A view of [MetaServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetaServiceAsync.WithRawResponse

        fun origins(): OriginServiceAsync.WithRawResponse
    }
}
