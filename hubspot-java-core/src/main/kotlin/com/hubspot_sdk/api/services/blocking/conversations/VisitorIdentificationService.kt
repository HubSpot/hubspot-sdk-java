// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenParams
import com.hubspot_sdk.api.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenResponse
import java.util.function.Consumer

interface VisitorIdentificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VisitorIdentificationService

    /**
     * Generates a new visitor identification token. This token will be unique every time this
     * endpoint is called, even if called with the same email address. This token is temporary and
     * will expire after 12 hours
     */
    fun generateToken(
        params: VisitorIdentificationGenerateTokenParams
    ): VisitorIdentificationGenerateTokenResponse = generateToken(params, RequestOptions.none())

    /** @see generateToken */
    fun generateToken(
        params: VisitorIdentificationGenerateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VisitorIdentificationGenerateTokenResponse

    /**
     * A view of [VisitorIdentificationService] that provides access to raw HTTP responses for each
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
        ): VisitorIdentificationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /visitor-identification/v3/tokens/create`, but is
         * otherwise the same as [VisitorIdentificationService.generateToken].
         */
        @MustBeClosed
        fun generateToken(
            params: VisitorIdentificationGenerateTokenParams
        ): HttpResponseFor<VisitorIdentificationGenerateTokenResponse> =
            generateToken(params, RequestOptions.none())

        /** @see generateToken */
        @MustBeClosed
        fun generateToken(
            params: VisitorIdentificationGenerateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VisitorIdentificationGenerateTokenResponse>
    }
}
