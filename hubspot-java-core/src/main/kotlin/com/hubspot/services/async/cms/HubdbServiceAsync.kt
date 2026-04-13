// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.cms.hubdb.RowServiceAsync
import com.hubspot.services.async.cms.hubdb.TableServiceAsync
import java.util.function.Consumer

interface HubdbServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HubdbServiceAsync

    fun rows(): RowServiceAsync

    fun tables(): TableServiceAsync

    /** A view of [HubdbServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HubdbServiceAsync.WithRawResponse

        fun rows(): RowServiceAsync.WithRawResponse

        fun tables(): TableServiceAsync.WithRawResponse
    }
}
