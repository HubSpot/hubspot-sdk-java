// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.services.async.crm.extensions.CallingServiceAsync
import com.hubspot.services.async.crm.extensions.CardsDevServiceAsync
import com.hubspot.services.async.crm.extensions.VideoConferencingServiceAsync
import java.util.function.Consumer

interface ExtensionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtensionServiceAsync

    fun calling(): CallingServiceAsync

    fun cardsDev(): CardsDevServiceAsync

    fun videoConferencing(): VideoConferencingServiceAsync

    /**
     * A view of [ExtensionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtensionServiceAsync.WithRawResponse

        fun calling(): CallingServiceAsync.WithRawResponse

        fun cardsDev(): CardsDevServiceAsync.WithRawResponse

        fun videoConferencing(): VideoConferencingServiceAsync.WithRawResponse
    }
}
