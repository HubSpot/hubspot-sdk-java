// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.auth.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthCreateTokenParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.clientId()).contains("client_id")
        assertThat(body.clientSecret()).contains("client_secret")
        assertThat(body.code()).contains("code")
        assertThat(body.codeVerifier()).contains("code_verifier")
        assertThat(body.grantType()).contains(OAuthCreateTokenParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.redirectUri()).contains("redirect_uri")
        assertThat(body.refreshToken()).contains("refresh_token")
        assertThat(body.scope()).contains("scope")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OAuthCreateTokenParams.builder().build()

        val body = params._body()
    }
}
