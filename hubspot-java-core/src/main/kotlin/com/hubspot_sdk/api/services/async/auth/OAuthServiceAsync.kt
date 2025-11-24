// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.auth

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
    fun createAccessToken(): CompletableFuture<TokenResponseIf> =
        createAccessToken(OAuthCreateAccessTokenParams.none())

    /** @see createAccessToken */
    fun createAccessToken(
        params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenResponseIf>

    /** @see createAccessToken */
    fun createAccessToken(
        params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none()
    ): CompletableFuture<TokenResponseIf> = createAccessToken(params, RequestOptions.none())

    /** @see createAccessToken */
    fun createAccessToken(requestOptions: RequestOptions): CompletableFuture<TokenResponseIf> =
        createAccessToken(OAuthCreateAccessTokenParams.none(), requestOptions)

    /**
     * Delete a refresh token, typically after a user uninstalls your app. Access tokens generated
     * with the refresh token will not be affected.
     *
     * This will not uninstall the application from HubSpot or inhibit data syncing between an
     * account and the app.
     */
    @Deprecated("deprecated")
    fun deleteRefreshToken(token: String): CompletableFuture<Void?> =
        deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none())

    /** @see deleteRefreshToken */
    @Deprecated("deprecated")
    fun deleteRefreshToken(
        token: String,
        params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteRefreshToken(params.toBuilder().token(token).build(), requestOptions)

    /** @see deleteRefreshToken */
    @Deprecated("deprecated")
    fun deleteRefreshToken(
        token: String,
        params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
    ): CompletableFuture<Void?> = deleteRefreshToken(token, params, RequestOptions.none())

    /** @see deleteRefreshToken */
    @Deprecated("deprecated")
    fun deleteRefreshToken(
        params: OAuthDeleteRefreshTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteRefreshToken */
    @Deprecated("deprecated")
    fun deleteRefreshToken(params: OAuthDeleteRefreshTokenParams): CompletableFuture<Void?> =
        deleteRefreshToken(params, RequestOptions.none())

    /** @see deleteRefreshToken */
    @Deprecated("deprecated")
    fun deleteRefreshToken(
        token: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none(), requestOptions)

    /**
     * Retrieve a token's metadata, including the email address of the user that the token was
     * created for and the ID of the account it's associated with.
     *
     * Note: HubSpot access tokens will fluctuate in size as the information that's encoded in them
     * changes over time. It's recommended to allow for tokens to be up to 300 characters to account
     * for any potential changes.
     */
    @Deprecated("deprecated")
    fun getAccessToken(token: String): CompletableFuture<AccessTokenInfoResponse> =
        getAccessToken(token, OAuthGetAccessTokenParams.none())

    /** @see getAccessToken */
    @Deprecated("deprecated")
    fun getAccessToken(
        token: String,
        params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessTokenInfoResponse> =
        getAccessToken(params.toBuilder().token(token).build(), requestOptions)

    /** @see getAccessToken */
    @Deprecated("deprecated")
    fun getAccessToken(
        token: String,
        params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
    ): CompletableFuture<AccessTokenInfoResponse> =
        getAccessToken(token, params, RequestOptions.none())

    /** @see getAccessToken */
    @Deprecated("deprecated")
    fun getAccessToken(
        params: OAuthGetAccessTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccessTokenInfoResponse>

    /** @see getAccessToken */
    @Deprecated("deprecated")
    fun getAccessToken(
        params: OAuthGetAccessTokenParams
    ): CompletableFuture<AccessTokenInfoResponse> = getAccessToken(params, RequestOptions.none())

    /** @see getAccessToken */
    @Deprecated("deprecated")
    fun getAccessToken(
        token: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessTokenInfoResponse> =
        getAccessToken(token, OAuthGetAccessTokenParams.none(), requestOptions)

    /**
     * Retrieve a refresh token's metadata, including the email address of the user that the token
     * was created for and the ID of the account it's associated with. Learn more about
     * [refresh tokens](https://developers.hubspot.com/docs/guides/api/app-management/oauth-tokens#generate-initial-access-and-refresh-tokens).
     */
    @Deprecated("deprecated")
    fun getRefreshToken(token: String): CompletableFuture<RefreshTokenInfoResponse> =
        getRefreshToken(token, OAuthGetRefreshTokenParams.none())

    /** @see getRefreshToken */
    @Deprecated("deprecated")
    fun getRefreshToken(
        token: String,
        params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RefreshTokenInfoResponse> =
        getRefreshToken(params.toBuilder().token(token).build(), requestOptions)

    /** @see getRefreshToken */
    @Deprecated("deprecated")
    fun getRefreshToken(
        token: String,
        params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
    ): CompletableFuture<RefreshTokenInfoResponse> =
        getRefreshToken(token, params, RequestOptions.none())

    /** @see getRefreshToken */
    @Deprecated("deprecated")
    fun getRefreshToken(
        params: OAuthGetRefreshTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RefreshTokenInfoResponse>

    /** @see getRefreshToken */
    @Deprecated("deprecated")
    fun getRefreshToken(
        params: OAuthGetRefreshTokenParams
    ): CompletableFuture<RefreshTokenInfoResponse> = getRefreshToken(params, RequestOptions.none())

    /** @see getRefreshToken */
    @Deprecated("deprecated")
    fun getRefreshToken(
        token: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RefreshTokenInfoResponse> =
        getRefreshToken(token, OAuthGetRefreshTokenParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /oauth/v1/token`, but is otherwise the same as
         * [OAuthServiceAsync.createAccessToken].
         */
        fun createAccessToken(): CompletableFuture<HttpResponseFor<TokenResponseIf>> =
            createAccessToken(OAuthCreateAccessTokenParams.none())

        /** @see createAccessToken */
        fun createAccessToken(
            params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenResponseIf>>

        /** @see createAccessToken */
        fun createAccessToken(
            params: OAuthCreateAccessTokenParams = OAuthCreateAccessTokenParams.none()
        ): CompletableFuture<HttpResponseFor<TokenResponseIf>> =
            createAccessToken(params, RequestOptions.none())

        /** @see createAccessToken */
        fun createAccessToken(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenResponseIf>> =
            createAccessToken(OAuthCreateAccessTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /oauth/v1/refresh-tokens/{token}`, but is
         * otherwise the same as [OAuthServiceAsync.deleteRefreshToken].
         */
        @Deprecated("deprecated")
        fun deleteRefreshToken(token: String): CompletableFuture<HttpResponse> =
            deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none())

        /** @see deleteRefreshToken */
        @Deprecated("deprecated")
        fun deleteRefreshToken(
            token: String,
            params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteRefreshToken(params.toBuilder().token(token).build(), requestOptions)

        /** @see deleteRefreshToken */
        @Deprecated("deprecated")
        fun deleteRefreshToken(
            token: String,
            params: OAuthDeleteRefreshTokenParams = OAuthDeleteRefreshTokenParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteRefreshToken(token, params, RequestOptions.none())

        /** @see deleteRefreshToken */
        @Deprecated("deprecated")
        fun deleteRefreshToken(
            params: OAuthDeleteRefreshTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteRefreshToken */
        @Deprecated("deprecated")
        fun deleteRefreshToken(
            params: OAuthDeleteRefreshTokenParams
        ): CompletableFuture<HttpResponse> = deleteRefreshToken(params, RequestOptions.none())

        /** @see deleteRefreshToken */
        @Deprecated("deprecated")
        fun deleteRefreshToken(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteRefreshToken(token, OAuthDeleteRefreshTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth/v1/access-tokens/{token}`, but is otherwise
         * the same as [OAuthServiceAsync.getAccessToken].
         */
        @Deprecated("deprecated")
        fun getAccessToken(
            token: String
        ): CompletableFuture<HttpResponseFor<AccessTokenInfoResponse>> =
            getAccessToken(token, OAuthGetAccessTokenParams.none())

        /** @see getAccessToken */
        @Deprecated("deprecated")
        fun getAccessToken(
            token: String,
            params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessTokenInfoResponse>> =
            getAccessToken(params.toBuilder().token(token).build(), requestOptions)

        /** @see getAccessToken */
        @Deprecated("deprecated")
        fun getAccessToken(
            token: String,
            params: OAuthGetAccessTokenParams = OAuthGetAccessTokenParams.none(),
        ): CompletableFuture<HttpResponseFor<AccessTokenInfoResponse>> =
            getAccessToken(token, params, RequestOptions.none())

        /** @see getAccessToken */
        @Deprecated("deprecated")
        fun getAccessToken(
            params: OAuthGetAccessTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccessTokenInfoResponse>>

        /** @see getAccessToken */
        @Deprecated("deprecated")
        fun getAccessToken(
            params: OAuthGetAccessTokenParams
        ): CompletableFuture<HttpResponseFor<AccessTokenInfoResponse>> =
            getAccessToken(params, RequestOptions.none())

        /** @see getAccessToken */
        @Deprecated("deprecated")
        fun getAccessToken(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessTokenInfoResponse>> =
            getAccessToken(token, OAuthGetAccessTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth/v1/refresh-tokens/{token}`, but is otherwise
         * the same as [OAuthServiceAsync.getRefreshToken].
         */
        @Deprecated("deprecated")
        fun getRefreshToken(
            token: String
        ): CompletableFuture<HttpResponseFor<RefreshTokenInfoResponse>> =
            getRefreshToken(token, OAuthGetRefreshTokenParams.none())

        /** @see getRefreshToken */
        @Deprecated("deprecated")
        fun getRefreshToken(
            token: String,
            params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RefreshTokenInfoResponse>> =
            getRefreshToken(params.toBuilder().token(token).build(), requestOptions)

        /** @see getRefreshToken */
        @Deprecated("deprecated")
        fun getRefreshToken(
            token: String,
            params: OAuthGetRefreshTokenParams = OAuthGetRefreshTokenParams.none(),
        ): CompletableFuture<HttpResponseFor<RefreshTokenInfoResponse>> =
            getRefreshToken(token, params, RequestOptions.none())

        /** @see getRefreshToken */
        @Deprecated("deprecated")
        fun getRefreshToken(
            params: OAuthGetRefreshTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RefreshTokenInfoResponse>>

        /** @see getRefreshToken */
        @Deprecated("deprecated")
        fun getRefreshToken(
            params: OAuthGetRefreshTokenParams
        ): CompletableFuture<HttpResponseFor<RefreshTokenInfoResponse>> =
            getRefreshToken(params, RequestOptions.none())

        /** @see getRefreshToken */
        @Deprecated("deprecated")
        fun getRefreshToken(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RefreshTokenInfoResponse>> =
            getRefreshToken(token, OAuthGetRefreshTokenParams.none(), requestOptions)
    }
}
