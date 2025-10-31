// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.LinkGenerationResponse
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.links.LinkCreateParams
import java.util.function.Consumer

interface LinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkService

    fun create(params: LinkCreateParams): LinkGenerationResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LinkGenerationResponse

    /** A view of [LinkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LinkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /communication-preferences/v4/links/generate`, but
         * is otherwise the same as [LinkService.create].
         */
        @MustBeClosed
        fun create(params: LinkCreateParams): HttpResponseFor<LinkGenerationResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LinkGenerationResponse>
    }
}
