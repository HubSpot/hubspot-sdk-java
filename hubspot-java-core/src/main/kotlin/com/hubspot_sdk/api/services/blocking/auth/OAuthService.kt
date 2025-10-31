// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.auth

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.auth.oauth.AccessTokenInfoResponse
import com.hubspot_sdk.api.models.auth.oauth.OAuthCreateAccessTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthDeleteRefreshTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthGetAccessTokenParams
import com.hubspot_sdk.api.models.auth.oauth.OAuthGetRefreshTokenParams
import com.hubspot_sdk.api.models.auth.oauth.RefreshTokenInfoResponse
import com.hubspot_sdk.api.models.auth.oauth.TokenResponseIf
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

    /**
     * Use a [previously obtained refresh token](#get-oauth-2.0-access-and-refresh-tokens) to
     * generate a new access token.
     *
     * Access tokens are short lived. You can check the `expires_in` parameter when generating an
     * access token to determine its lifetime (in seconds). If you need offline access to HubSpot
     * data, store the refresh token you get when
     * [initiating your OAuth integration](https://developers.hubspot.com/docs/guides/api/app-management/oauth-tokens#initiating-oauth-access)
     * and use it to generate a new access token once the initial one expires.
     *
     * Note: HubSpot access tokens will fluctuate in size as the information that's encoded in them
     * changes over time. It's recommended to allow for tokens to be up to 300 characters to account
     * for any potential changes.
     */
    fun createAccessToken(): TokenResponseIf =
        createAccessToken(OAuthCreateAccessTokenParams.none())

    /** @see createAccessToken */
    fun createAccessToken(
        params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenResponseIf

    /** @see createAccessToken */
    fun createAccessToken(
        params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none()
    ): TokenResponseIf = createAccessToken(params, RequestOptions.none())

    /** @see createAccessToken */
    fun createAccessToken(requestOptions: RequestOptions): TokenResponseIf =
        createAccessToken(OAuthCreateAccessTokenParams.none(), requestOptions)

    /**
     * Delete a refresh token, typically after a user uninstalls your app. Access tokens generated
     * with the refresh token will not be affected.
     *
     * This will not uninstall the application from HubSpot or inhibit data syncing between an
     * account and the app.
     */
    fun deleteRefreshToken(token: String) =
        deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none())

    /** @see deleteRefreshToken */
    fun deleteRefreshToken(
        token: String,
        params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteRefreshToken(params.toBuilder().token(token).build(), requestOptions)

    /** @see deleteRefreshToken */
    fun deleteRefreshToken(
        token: String,
        params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
    ) = deleteRefreshToken(token, params, RequestOptions.none())

    /** @see deleteRefreshToken */
    fun deleteRefreshToken(
        params: OAuthDeleteRefreshTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteRefreshToken */
    fun deleteRefreshToken(params: OAuthDeleteRefreshTokenParams) =
        deleteRefreshToken(params, RequestOptions.none())

    /** @see deleteRefreshToken */
    fun deleteRefreshToken(token: String, requestOptions: RequestOptions) =
        deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none(), requestOptions)

    /**
     * Retrieve a token's metadata, including the email address of the user that the token was
     * created for and the ID of the account it's associated with.
     *
     * Note: HubSpot access tokens will fluctuate in size as the information that's encoded in them
     * changes over time. It's recommended to allow for tokens to be up to 300 characters to account
     * for any potential changes.
     */
    fun getAccessToken(token: String): AccessTokenInfoResponse =
        getAccessToken(token, OAuthGetAccessTokenParams.none())

    /** @see getAccessToken */
    fun getAccessToken(
        token: String,
        params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessTokenInfoResponse =
        getAccessToken(params.toBuilder().token(token).build(), requestOptions)

    /** @see getAccessToken */
    fun getAccessToken(
        token: String,
        params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
    ): AccessTokenInfoResponse = getAccessToken(token, params, RequestOptions.none())

    /** @see getAccessToken */
    fun getAccessToken(
        params: OAuthGetAccessTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccessTokenInfoResponse

    /** @see getAccessToken */
    fun getAccessToken(params: OAuthGetAccessTokenParams): AccessTokenInfoResponse =
        getAccessToken(params, RequestOptions.none())

    /** @see getAccessToken */
    fun getAccessToken(token: String, requestOptions: RequestOptions): AccessTokenInfoResponse =
        getAccessToken(token, OAuthGetAccessTokenParams.none(), requestOptions)

    /**
     * Retrieve a refresh token's metadata, including the email address of the user that the token
     * was created for and the ID of the account it's associated with. Learn more about
     * [refresh tokens](https://developers.hubspot.com/docs/guides/api/app-management/oauth-tokens#generate-initial-access-and-refresh-tokens).
     */
    fun getRefreshToken(token: String): RefreshTokenInfoResponse =
        getRefreshToken(token, OAuthGetRefreshTokenParams.none())

    /** @see getRefreshToken */
    fun getRefreshToken(
        token: String,
        params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RefreshTokenInfoResponse =
        getRefreshToken(params.toBuilder().token(token).build(), requestOptions)

    /** @see getRefreshToken */
    fun getRefreshToken(
        token: String,
        params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
    ): RefreshTokenInfoResponse = getRefreshToken(token, params, RequestOptions.none())

    /** @see getRefreshToken */
    fun getRefreshToken(
        params: OAuthGetRefreshTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RefreshTokenInfoResponse

    /** @see getRefreshToken */
    fun getRefreshToken(params: OAuthGetRefreshTokenParams): RefreshTokenInfoResponse =
        getRefreshToken(params, RequestOptions.none())

    /** @see getRefreshToken */
    fun getRefreshToken(token: String, requestOptions: RequestOptions): RefreshTokenInfoResponse =
        getRefreshToken(token, OAuthGetRefreshTokenParams.none(), requestOptions)

    /** A view of [OAuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth/v1/token`, but is otherwise the same as
         * [OAuthService.createAccessToken].
         */
        @MustBeClosed
        fun createAccessToken(): HttpResponseFor<TokenResponseIf> =
            createAccessToken(OAuthCreateAccessTokenParams.none())

        /** @see createAccessToken */
        @MustBeClosed
        fun createAccessToken(
            params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenResponseIf>

        /** @see createAccessToken */
        @MustBeClosed
        fun createAccessToken(
            params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none()
        ): HttpResponseFor<TokenResponseIf> = createAccessToken(params, RequestOptions.none())

        /** @see createAccessToken */
        @MustBeClosed
        fun createAccessToken(requestOptions: RequestOptions): HttpResponseFor<TokenResponseIf> =
            createAccessToken(OAuthCreateAccessTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /oauth/v1/refresh-tokens/{token}`, but is
         * otherwise the same as [OAuthService.deleteRefreshToken].
         */
        @MustBeClosed
        fun deleteRefreshToken(token: String): HttpResponse =
            deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none())

        /** @see deleteRefreshToken */
        @MustBeClosed
        fun deleteRefreshToken(
            token: String,
            params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteRefreshToken(params.toBuilder().token(token).build(), requestOptions)

        /** @see deleteRefreshToken */
        @MustBeClosed
        fun deleteRefreshToken(
            token: String,
            params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
        ): HttpResponse = deleteRefreshToken(token, params, RequestOptions.none())

        /** @see deleteRefreshToken */
        @MustBeClosed
        fun deleteRefreshToken(
            params: OAuthDeleteRefreshTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteRefreshToken */
        @MustBeClosed
        fun deleteRefreshToken(params: OAuthDeleteRefreshTokenParams): HttpResponse =
            deleteRefreshToken(params, RequestOptions.none())

        /** @see deleteRefreshToken */
        @MustBeClosed
        fun deleteRefreshToken(token: String, requestOptions: RequestOptions): HttpResponse =
            deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth/v1/access-tokens/{token}`, but is otherwise
         * the same as [OAuthService.getAccessToken].
         */
        @MustBeClosed
        fun getAccessToken(token: String): HttpResponseFor<AccessTokenInfoResponse> =
            getAccessToken(token, OAuthGetAccessTokenParams.none())

        /** @see getAccessToken */
        @MustBeClosed
        fun getAccessToken(
            token: String,
            params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessTokenInfoResponse> =
            getAccessToken(params.toBuilder().token(token).build(), requestOptions)

        /** @see getAccessToken */
        @MustBeClosed
        fun getAccessToken(
            token: String,
            params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
        ): HttpResponseFor<AccessTokenInfoResponse> =
            getAccessToken(token, params, RequestOptions.none())

        /** @see getAccessToken */
        @MustBeClosed
        fun getAccessToken(
            params: OAuthGetAccessTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccessTokenInfoResponse>

        /** @see getAccessToken */
        @MustBeClosed
        fun getAccessToken(
            params: OAuthGetAccessTokenParams
        ): HttpResponseFor<AccessTokenInfoResponse> = getAccessToken(params, RequestOptions.none())

        /** @see getAccessToken */
        @MustBeClosed
        fun getAccessToken(
            token: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessTokenInfoResponse> =
            getAccessToken(token, OAuthGetAccessTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth/v1/refresh-tokens/{token}`, but is otherwise
         * the same as [OAuthService.getRefreshToken].
         */
        @MustBeClosed
        fun getRefreshToken(token: String): HttpResponseFor<RefreshTokenInfoResponse> =
            getRefreshToken(token, OAuthGetRefreshTokenParams.none())

        /** @see getRefreshToken */
        @MustBeClosed
        fun getRefreshToken(
            token: String,
            params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RefreshTokenInfoResponse> =
            getRefreshToken(params.toBuilder().token(token).build(), requestOptions)

        /** @see getRefreshToken */
        @MustBeClosed
        fun getRefreshToken(
            token: String,
            params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
        ): HttpResponseFor<RefreshTokenInfoResponse> =
            getRefreshToken(token, params, RequestOptions.none())

        /** @see getRefreshToken */
        @MustBeClosed
        fun getRefreshToken(
            params: OAuthGetRefreshTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RefreshTokenInfoResponse>

        /** @see getRefreshToken */
        @MustBeClosed
        fun getRefreshToken(
            params: OAuthGetRefreshTokenParams
        ): HttpResponseFor<RefreshTokenInfoResponse> =
            getRefreshToken(params, RequestOptions.none())

        /** @see getRefreshToken */
        @MustBeClosed
        fun getRefreshToken(
            token: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RefreshTokenInfoResponse> =
            getRefreshToken(token, OAuthGetRefreshTokenParams.none(), requestOptions)
    }
}
