// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.auth

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.auth.oauth.OAuthCreateAccessTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createAccessToken() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val tokenResponseIfFuture =
            oauthServiceAsync.createAccessToken(
                OAuthCreateAccessTokenParams.builder()
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .code("code")
                    .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
                    .redirectUri("redirect_uri")
                    .refreshToken("refresh_token")
                    .build()
            )

        val tokenResponseIf = tokenResponseIfFuture.get()
        tokenResponseIf.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRefreshToken() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val future = oauthServiceAsync.deleteRefreshToken("token")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAccessToken() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val accessTokenInfoResponseFuture = oauthServiceAsync.getAccessToken("token")

        val accessTokenInfoResponse = accessTokenInfoResponseFuture.get()
        accessTokenInfoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRefreshToken() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val refreshTokenInfoResponseFuture = oauthServiceAsync.getRefreshToken("token")

        val refreshTokenInfoResponse = refreshTokenInfoResponseFuture.get()
        refreshTokenInfoResponse.validate()
    }
}
