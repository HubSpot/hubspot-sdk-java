// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.auth

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.auth.oauth.OAuthCreateTokenParams
import com.hubspot.models.auth.oauth.OAuthIntrospectTokenParams
import com.hubspot.models.auth.oauth.OAuthRevokeTokenParams
import com.hubspot.models.auth.oauth.TokenInfoResponseBaseIf
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthServiceAsync

    /** Authenticates a client and returns access and refresh tokens. */
    fun createToken(): CompletableFuture<HttpResponse> = createToken(OAuthCreateTokenParams.none())

    /** @see createToken */
    fun createToken(
        params: OAuthCreateTokenParams = OAuthCreateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see createToken */
    fun createToken(
        params: OAuthCreateTokenParams = OAuthCreateTokenParams.none()
    ): CompletableFuture<HttpResponse> = createToken(params, RequestOptions.none())

    /** @see createToken */
    fun createToken(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        createToken(OAuthCreateTokenParams.none(), requestOptions)

    /** Returns validity and metadata for access and refresh tokens. */
    fun introspectToken(): CompletableFuture<TokenInfoResponseBaseIf> =
        introspectToken(OAuthIntrospectTokenParams.none())

    /** @see introspectToken */
    fun introspectToken(
        params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenInfoResponseBaseIf>

    /** @see introspectToken */
    fun introspectToken(
        params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none()
    ): CompletableFuture<TokenInfoResponseBaseIf> = introspectToken(params, RequestOptions.none())

    /** @see introspectToken */
    fun introspectToken(
        requestOptions: RequestOptions
    ): CompletableFuture<TokenInfoResponseBaseIf> =
        introspectToken(OAuthIntrospectTokenParams.none(), requestOptions)

    /** Deletes/Revokes provided Refresh Token */
    fun revokeToken(): CompletableFuture<HttpResponse> = revokeToken(OAuthRevokeTokenParams.none())

    /** @see revokeToken */
    fun revokeToken(
        params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see revokeToken */
    fun revokeToken(
        params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none()
    ): CompletableFuture<HttpResponse> = revokeToken(params, RequestOptions.none())

    /** @see revokeToken */
    fun revokeToken(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        revokeToken(OAuthRevokeTokenParams.none(), requestOptions)

    /** A view of [OAuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth/2026-03/token`, but is otherwise the same as
         * [OAuthServiceAsync.createToken].
         */
        fun createToken(): CompletableFuture<HttpResponse> =
            createToken(OAuthCreateTokenParams.none())

        /** @see createToken */
        fun createToken(
            params: OAuthCreateTokenParams = OAuthCreateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createToken */
        fun createToken(
            params: OAuthCreateTokenParams = OAuthCreateTokenParams.none()
        ): CompletableFuture<HttpResponse> = createToken(params, RequestOptions.none())

        /** @see createToken */
        fun createToken(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            createToken(OAuthCreateTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/2026-03/token/introspect`, but is otherwise
         * the same as [OAuthServiceAsync.introspectToken].
         */
        fun introspectToken(): CompletableFuture<HttpResponseFor<TokenInfoResponseBaseIf>> =
            introspectToken(OAuthIntrospectTokenParams.none())

        /** @see introspectToken */
        fun introspectToken(
            params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenInfoResponseBaseIf>>

        /** @see introspectToken */
        fun introspectToken(
            params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none()
        ): CompletableFuture<HttpResponseFor<TokenInfoResponseBaseIf>> =
            introspectToken(params, RequestOptions.none())

        /** @see introspectToken */
        fun introspectToken(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenInfoResponseBaseIf>> =
            introspectToken(OAuthIntrospectTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/2026-03/token/revoke`, but is otherwise the
         * same as [OAuthServiceAsync.revokeToken].
         */
        fun revokeToken(): CompletableFuture<HttpResponse> =
            revokeToken(OAuthRevokeTokenParams.none())

        /** @see revokeToken */
        fun revokeToken(
            params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see revokeToken */
        fun revokeToken(
            params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none()
        ): CompletableFuture<HttpResponse> = revokeToken(params, RequestOptions.none())

        /** @see revokeToken */
        fun revokeToken(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            revokeToken(OAuthRevokeTokenParams.none(), requestOptions)
    }
}
