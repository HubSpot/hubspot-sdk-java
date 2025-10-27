// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.LinkGenerationResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.links.LinkCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkServiceAsync

    fun create(params: LinkCreateParams): CompletableFuture<LinkGenerationResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LinkGenerationResponse>

    /** A view of [LinkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v4/links/generate`, but
         * is otherwise the same as [LinkServiceAsync.create].
         */
        fun create(
            params: LinkCreateParams
        ): CompletableFuture<HttpResponseFor<LinkGenerationResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LinkGenerationResponse>>
    }
}
