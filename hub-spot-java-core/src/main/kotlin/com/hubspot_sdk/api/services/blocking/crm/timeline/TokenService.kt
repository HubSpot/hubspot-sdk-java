// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.timeline

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.timeline.TimelineEventTemplateToken
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenCreateParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenDeleteParams
import com.hubspot_sdk.api.models.crm.timeline.tokens.TokenUpdateParams
import java.util.function.Consumer

interface TokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService

    /** Update an existing event type template with new tokens. */
    fun create(eventTemplateId: String, params: TokenCreateParams): TimelineEventTemplateToken =
        create(eventTemplateId, params, RequestOptions.none())

    /** @see create */
    fun create(
        eventTemplateId: String,
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplateToken =
        create(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

    /** @see create */
    fun create(params: TokenCreateParams): TimelineEventTemplateToken =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplateToken

    /** Update an event type template token, specified by token name. */
    fun update(tokenName: String, params: TokenUpdateParams): TimelineEventTemplateToken =
        update(tokenName, params, RequestOptions.none())

    /** @see update */
    fun update(
        tokenName: String,
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplateToken =
        update(params.toBuilder().tokenName(tokenName).build(), requestOptions)

    /** @see update */
    fun update(params: TokenUpdateParams): TimelineEventTemplateToken =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TimelineEventTemplateToken

    /** Delete an existing token from a specific event type template. */
    fun delete(tokenName: String, params: TokenDeleteParams) =
        delete(tokenName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        tokenName: String,
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tokenName(tokenName).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TokenDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [TokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens`, but is
         * otherwise the same as [TokenService.create].
         */
        @MustBeClosed
        fun create(
            eventTemplateId: String,
            params: TokenCreateParams,
        ): HttpResponseFor<TimelineEventTemplateToken> =
            create(eventTemplateId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            eventTemplateId: String,
            params: TokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplateToken> =
            create(params.toBuilder().eventTemplateId(eventTemplateId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TokenCreateParams): HttpResponseFor<TimelineEventTemplateToken> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplateToken>

        /**
         * Returns a raw HTTP response for `put
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens/{tokenName}`,
         * but is otherwise the same as [TokenService.update].
         */
        @MustBeClosed
        fun update(
            tokenName: String,
            params: TokenUpdateParams,
        ): HttpResponseFor<TimelineEventTemplateToken> =
            update(tokenName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tokenName: String,
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplateToken> =
            update(params.toBuilder().tokenName(tokenName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TokenUpdateParams): HttpResponseFor<TimelineEventTemplateToken> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TimelineEventTemplateToken>

        /**
         * Returns a raw HTTP response for `delete
         * /integrators/timeline/v3/{appId}/event-templates/{eventTemplateId}/tokens/{tokenName}`,
         * but is otherwise the same as [TokenService.delete].
         */
        @MustBeClosed
        fun delete(tokenName: String, params: TokenDeleteParams): HttpResponse =
            delete(tokenName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tokenName: String,
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().tokenName(tokenName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TokenDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
