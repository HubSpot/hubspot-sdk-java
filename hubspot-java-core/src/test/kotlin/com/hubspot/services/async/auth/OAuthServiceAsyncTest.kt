// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.auth

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.auth.oauth.OAuthCreateTokenParams
import com.hubspot.models.auth.oauth.OAuthIntrospectTokenParams
import com.hubspot.models.auth.oauth.OAuthRevokeTokenParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class OAuthServiceAsyncTest {

    @Test
    fun createToken(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val oauthServiceAsync = client.auth().oauth()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            oauthServiceAsync.createToken(
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

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun introspectToken() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val oauthServiceAsync = client.auth().oauth()

        val tokenInfoResponseBaseIfFuture =
            oauthServiceAsync.introspectToken(
                OAuthIntrospectTokenParams.builder()
                    .token("token")
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .tokenTypeHint("token_type_hint")
                    .build()
            )

        val tokenInfoResponseBaseIf = tokenInfoResponseBaseIfFuture.get()
        tokenInfoResponseBaseIf.validate()
    }

    @Test
    fun revokeToken(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val oauthServiceAsync = client.auth().oauth()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            oauthServiceAsync.revokeToken(
                OAuthRevokeTokenParams.builder()
                    .token("token")
                    .clientId("client_id")
                    .clientSecret("client_secret")
                    .tokenTypeHint("token_type_hint")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
