// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.timeline

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenCreateParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenServiceAsync

    /** Update an existing event type template with new tokens. */
    fun create(
        eventTemplateId: String,
        params: TokenCreateParams,
    ): CompletableFuture<TimelineEventTemplateToken> =
        create(eventTemplateId, params, RequestOptions.none())

    /** @see create */
    fun create(
        eventTemplateId: String,
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplateToken> =
        create(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see create */
    fun create(params: TokenCreateParams): CompletableFuture<TimelineEventTemplateToken> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplateToken>

    /** Update an event type template token, specified by token name. */
    fun update(
        tokenName: String,
        params: TokenUpdateParams,
    ): CompletableFuture<TimelineEventTemplateToken> =
        update(tokenName, params, RequestOptions.none())

    /** @see update */
    fun update(
        tokenName: String,
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplateToken> =
        update(params.toBuilder().tokenName(tokenName).build(), requestOptions)

    /** @see update */
    fun update(params: TokenUpdateParams): CompletableFuture<TimelineEventTemplateToken> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TimelineEventTemplateToken>

    /** Delete an existing token from a specific event type template. */
    fun delete(tokenName: String, params: TokenDeleteParams): CompletableFuture<Void?> =
        delete(tokenName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tokenName: String,
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().tokenName(tokenName).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens`, but is
         * otherwise the same as [TokenServiceAsync.create].
         */
        fun create(
            eventTemplateId: String,
            params: TokenCreateParams,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> =
            create(eventTemplateId, params, RequestOptions.none())

        /** @see create */
        fun create(
            eventTemplateId: String,
            params: TokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> =
            create(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TokenCreateParams
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>>

        /**
         * Returns a raw HTTP response for `put
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens/{tokenName}`,
         * but is otherwise the same as [TokenServiceAsync.update].
         */
        fun update(
            tokenName: String,
            params: TokenUpdateParams,
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> =
            update(tokenName, params, RequestOptions.none())

        /** @see update */
        fun update(
            tokenName: String,
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> =
            update(params.toBuilder().tokenName(tokenName).build(), requestOptions)

        /** @see update */
        fun update(
            params: TokenUpdateParams
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TimelineEventTemplateToken>>

        /**
         * Returns a raw HTTP response for `delete
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens/{tokenName}`,
         * but is otherwise the same as [TokenServiceAsync.delete].
         */
        fun delete(tokenName: String, params: TokenDeleteParams): CompletableFuture<HttpResponse> =
            delete(tokenName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tokenName: String,
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().tokenName(tokenName).build(), requestOptions)

        /** @see delete */
        fun delete(params: TokenDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
