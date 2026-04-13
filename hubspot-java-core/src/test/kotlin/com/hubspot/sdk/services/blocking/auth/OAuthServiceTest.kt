// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.auth

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.auth.oauth.OAuthCreateTokenParams
import com.hubspot.sdk.models.auth.oauth.OAuthIntrospectTokenParams
import com.hubspot.sdk.models.auth.oauth.OAuthRevokeTokenParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class OAuthServiceTest {

    @Test
    fun createToken(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val oauthService = client.auth().oauth()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            oauthService.createToken(
                OAuthCreateTokenParams.builder()
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .code("code")
                    .codeVerifier("code_verifier")
                    .grantType(OAuthCreateTokenParams.GrantType.AUTHORIZATION_CODE)
                    .redirectUri("redirect_uri")
                    .refreshToken("refresh_token")
                    .scope("scope")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun introspectToken() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val oauthService = client.auth().oauth()

        val tokenInfoResponseBaseIf =
            oauthService.introspectToken(
                OAuthIntrospectTokenParams.builder()
                    .token("token")
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .tokenTypeHint("token_type_hint")
                    .build()
            )

        tokenInfoResponseBaseIf.validate()
    }

    @Test
    fun revokeToken(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val oauthService = client.auth().oauth()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            oauthService.revokeToken(
                OAuthRevokeTokenParams.builder()
                    .token("token")
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .tokenTypeHint("token_type_hint")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
