// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.conversations.visitoridentification.IdentificationTokenGenerationRequest
import com.hubspot_sdk.api.models.conversations.visitoridentification.IdentificationTokenResponse
import com.hubspot_sdk.api.models.conversations.visitoridentification.VisitorIdentificationGenerateTokenParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VisitorIdentificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VisitorIdentificationServiceAsync

    fun generateToken(
        params: VisitorIdentificationGenerateTokenParams
    ): CompletableFuture<IdentificationTokenResponse> = generateToken(params, RequestOptions.none())

    /** @see generateToken */
    fun generateToken(
        params: VisitorIdentificationGenerateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IdentificationTokenResponse>

    /** @see generateToken */
    fun generateToken(
        identificationTokenGenerationRequest: IdentificationTokenGenerationRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IdentificationTokenResponse> =
        generateToken(
            VisitorIdentificationGenerateTokenParams.builder()
                .identificationTokenGenerationRequest(identificationTokenGenerationRequest)
                .build(),
            requestOptions,
        )

    /** @see generateToken */
    fun generateToken(
        identificationTokenGenerationRequest: IdentificationTokenGenerationRequest
    ): CompletableFuture<IdentificationTokenResponse> =
        generateToken(identificationTokenGenerationRequest, RequestOptions.none())

    /**
     * A view of [VisitorIdentificationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VisitorIdentificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /visitor-identification/v3/tokens/create`, but is
         * otherwise the same as [VisitorIdentificationServiceAsync.generateToken].
         */
        fun generateToken(
            params: VisitorIdentificationGenerateTokenParams
        ): CompletableFuture<HttpResponseFor<IdentificationTokenResponse>> =
            generateToken(params, RequestOptions.none())

        /** @see generateToken */
        fun generateToken(
            params: VisitorIdentificationGenerateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IdentificationTokenResponse>>

        /** @see generateToken */
        fun generateToken(
            identificationTokenGenerationRequest: IdentificationTokenGenerationRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IdentificationTokenResponse>> =
            generateToken(
                VisitorIdentificationGenerateTokenParams.builder()
                    .identificationTokenGenerationRequest(identificationTokenGenerationRequest)
                    .build(),
                requestOptions,
            )

        /** @see generateToken */
        fun generateToken(
            identificationTokenGenerationRequest: IdentificationTokenGenerationRequest
        ): CompletableFuture<HttpResponseFor<IdentificationTokenResponse>> =
            generateToken(identificationTokenGenerationRequest, RequestOptions.none())
    }
}
