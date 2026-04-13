// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.auth

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.auth.oauth.OAuthCreateTokenParams
import com.hubspot.models.auth.oauth.OAuthIntrospectTokenParams
import com.hubspot.models.auth.oauth.OAuthRevokeTokenParams
import com.hubspot.models.auth.oauth.TokenInfoResponseBaseIf
import java.util.function.Consumer

interface OAuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService

    /** Authenticates a client and returns access and refresh tokens. */
    @MustBeClosed fun createToken(): HttpResponse = createToken(OAuthCreateTokenParams.none())

    /** @see createToken */
    @MustBeClosed
    fun createToken(
        params: OAuthCreateTokenParams = OAuthCreateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createToken */
    @MustBeClosed
    fun createToken(params: OAuthCreateTokenParams = OAuthCreateTokenParams.none()): HttpResponse =
        createToken(params, RequestOptions.none())

    /** @see createToken */
    @MustBeClosed
    fun createToken(requestOptions: RequestOptions): HttpResponse =
        createToken(OAuthCreateTokenParams.none(), requestOptions)

    /** Returns validity and metadata for access and refresh tokens. */
    fun introspectToken(): TokenInfoResponseBaseIf =
        introspectToken(OAuthIntrospectTokenParams.none())

    /** @see introspectToken */
    fun introspectToken(
        params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenInfoResponseBaseIf

    /** @see introspectToken */
    fun introspectToken(
        params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none()
    ): TokenInfoResponseBaseIf = introspectToken(params, RequestOptions.none())

    /** @see introspectToken */
    fun introspectToken(requestOptions: RequestOptions): TokenInfoResponseBaseIf =
        introspectToken(OAuthIntrospectTokenParams.none(), requestOptions)

    /** Deletes/Revokes provided Refresh Token */
    @MustBeClosed fun revokeToken(): HttpResponse = revokeToken(OAuthRevokeTokenParams.none())

    /** @see revokeToken */
    @MustBeClosed
    fun revokeToken(
        params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see revokeToken */
    @MustBeClosed
    fun revokeToken(params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none()): HttpResponse =
        revokeToken(params, RequestOptions.none())

    /** @see revokeToken */
    @MustBeClosed
    fun revokeToken(requestOptions: RequestOptions): HttpResponse =
        revokeToken(OAuthRevokeTokenParams.none(), requestOptions)

    /** A view of [OAuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth/2026-03/token`, but is otherwise the same as
         * [OAuthService.createToken].
         */
        @MustBeClosed fun createToken(): HttpResponse = createToken(OAuthCreateTokenParams.none())

        /** @see createToken */
        @MustBeClosed
        fun createToken(
            params: OAuthCreateTokenParams = OAuthCreateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createToken */
        @MustBeClosed
        fun createToken(
            params: OAuthCreateTokenParams = OAuthCreateTokenParams.none()
        ): HttpResponse = createToken(params, RequestOptions.none())

        /** @see createToken */
        @MustBeClosed
        fun createToken(requestOptions: RequestOptions): HttpResponse =
            createToken(OAuthCreateTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/2026-03/token/introspect`, but is otherwise
         * the same as [OAuthService.introspectToken].
         */
        @MustBeClosed
        fun introspectToken(): HttpResponseFor<TokenInfoResponseBaseIf> =
            introspectToken(OAuthIntrospectTokenParams.none())

        /** @see introspectToken */
        @MustBeClosed
        fun introspectToken(
            params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenInfoResponseBaseIf>

        /** @see introspectToken */
        @MustBeClosed
        fun introspectToken(
            params: OAuthIntrospectTokenParams = OAuthIntrospectTokenParams.none()
        ): HttpResponseFor<TokenInfoResponseBaseIf> = introspectToken(params, RequestOptions.none())

        /** @see introspectToken */
        @MustBeClosed
        fun introspectToken(
            requestOptions: RequestOptions
        ): HttpResponseFor<TokenInfoResponseBaseIf> =
            introspectToken(OAuthIntrospectTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /oauth/2026-03/token/revoke`, but is otherwise the
         * same as [OAuthService.revokeToken].
         */
        @MustBeClosed fun revokeToken(): HttpResponse = revokeToken(OAuthRevokeTokenParams.none())

        /** @see revokeToken */
        @MustBeClosed
        fun revokeToken(
            params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see revokeToken */
        @MustBeClosed
        fun revokeToken(
            params: OAuthRevokeTokenParams = OAuthRevokeTokenParams.none()
        ): HttpResponse = revokeToken(params, RequestOptions.none())

        /** @see revokeToken */
        @MustBeClosed
        fun revokeToken(requestOptions: RequestOptions): HttpResponse =
            revokeToken(OAuthRevokeTokenParams.none(), requestOptions)
    }
}
