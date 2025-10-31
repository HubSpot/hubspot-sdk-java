// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.DefinitionServiceAsync
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.LinkServiceAsync
import com.hubspot_sdk.api.services.async.marketing.subscriptions.v4.StatusServiceAsync
import java.util.function.Consumer

interface V4ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync

    fun definitions(): DefinitionServiceAsync

    fun links(): LinkServiceAsync

    fun statuses(): StatusServiceAsync

    /** A view of [V4ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync.WithRawResponse

        fun definitions(): DefinitionServiceAsync.WithRawResponse

        fun links(): LinkServiceAsync.WithRawResponse

        fun statuses(): StatusServiceAsync.WithRawResponse
    }
}
