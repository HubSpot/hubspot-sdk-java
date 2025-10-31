// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.auth

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.auth.oauth.OAuthCreateAccessTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createAccessToken() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthService = client.auth().oauth()

        val tokenResponseIf =
            oauthService.createAccessToken(
                OAuthCreateAccessTokenParams.builder()
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .code("code")
                    .grantType(OAuthCreateAccessTokenParams.GrantType.AUTHORIZATION_CODE)
                    .redirectUri("redirect_uri")
                    .refreshToken("refresh_token")
                    .build()
            )

        tokenResponseIf.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteRefreshToken() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthService = client.auth().oauth()

        oauthService.deleteRefreshToken("token")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getAccessToken() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthService = client.auth().oauth()

        val accessTokenInfoResponse = oauthService.getAccessToken("token")

        accessTokenInfoResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRefreshToken() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val oauthService = client.auth().oauth()

        val refreshTokenInfoResponse = oauthService.getRefreshToken("token")

        refreshTokenInfoResponse.validate()
    }
}
