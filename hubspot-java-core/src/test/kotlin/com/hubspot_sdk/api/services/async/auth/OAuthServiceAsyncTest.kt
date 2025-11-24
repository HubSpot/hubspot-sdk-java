// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.auth

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val tokenResponseIfFuture =
            oauthServiceAsync.createAccessToken(
                OAuthCreateAccessTokenParams.builder()
                    .queryClientSecret("client_secret")
                    .queryRefreshToken("refresh_token")
                    .clientId("client_id")
                    .bodyClientSecret("client_secret")
                    .code("code")
                    .codeVerifier("code_verifier")
                    .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
                    .redirectUri("redirect_uri")
                    .bodyRefreshToken("refresh_token")
                    .scope("scope")
                    .build()
            )

        val tokenResponseIf = tokenResponseIfFuture.get()
        tokenResponseIf.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRefreshToken() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val future = oauthServiceAsync.deleteRefreshToken("token")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAccessToken() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
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
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthServiceAsync = client.auth().oauth()

        val refreshTokenInfoResponseFuture = oauthServiceAsync.getRefreshToken("token")

        val refreshTokenInfoResponse = refreshTokenInfoResponseFuture.get()
        refreshTokenInfoResponse.validate()
    }
}
